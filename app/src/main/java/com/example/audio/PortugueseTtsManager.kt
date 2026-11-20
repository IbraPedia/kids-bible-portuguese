package com.example.audio

import android.content.Context
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.Locale

data class TtsUiState(
  val isReady: Boolean = false,
  val isPlaying: Boolean = false,
  val isAvailable: Boolean = true,
  val currentParagraphIndex: Int = 0,
  val speechRate: Float = 0.95f,
)

class PortugueseTtsManager(context: Context) : TextToSpeech.OnInitListener {
  private var tts: TextToSpeech? = TextToSpeech(context.applicationContext, this)
  private val _state = MutableStateFlow(TtsUiState())
  val state: StateFlow<TtsUiState> = _state.asStateFlow()

  private var paragraphs: List<String> = emptyList()
  private var autoAdvance: Boolean = true

  override fun onInit(status: Int) {
    if (status == TextToSpeech.SUCCESS) {
      val engine = tts ?: return
      val ptBr = Locale("pt", "BR")
      val res = engine.setLanguage(ptBr)
      val fallbackOk = if (res == TextToSpeech.LANG_MISSING_DATA || res == TextToSpeech.LANG_NOT_SUPPORTED) {
        val pt = Locale("pt")
        val resPt = engine.setLanguage(pt)
        resPt != TextToSpeech.LANG_MISSING_DATA && resPt != TextToSpeech.LANG_NOT_SUPPORTED
      } else {
        true
      }
      engine.setSpeechRate(_state.value.speechRate)
      engine.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
        override fun onStart(utteranceId: String?) {}
        override fun onError(utteranceId: String?) {
          _state.value = _state.value.copy(isPlaying = false)
        }
        override fun onDone(utteranceId: String?) {
          val idx = utteranceId?.removePrefix("para_")?.toIntOrNull() ?: return
          if (autoAdvance && _state.value.isPlaying && idx + 1 < paragraphs.size) {
            speakParagraph(idx + 1)
          } else {
            _state.value = _state.value.copy(isPlaying = false)
          }
        }
      })
      _state.value = _state.value.copy(isReady = true, isAvailable = fallbackOk)
    } else {
      _state.value = _state.value.copy(isReady = false, isAvailable = false)
    }
  }

  fun loadStory(storyParagraphs: List<String>) {
    stop()
    paragraphs = storyParagraphs
    _state.value = _state.value.copy(currentParagraphIndex = 0, isPlaying = false)
  }

  fun setSpeechRate(rate: Float) {
    val clamped = rate.coerceIn(0.65f, 1.35f)
    tts?.setSpeechRate(clamped)
    _state.value = _state.value.copy(speechRate = clamped)
  }

  fun togglePlayPause() {
    if (_state.value.isPlaying) {
      pause()
    } else {
      autoAdvance = true
      speakParagraph(_state.value.currentParagraphIndex)
    }
  }

  fun speakParagraph(index: Int, continuous: Boolean = true) {
    if (!_state.value.isReady || paragraphs.isEmpty()) return
    val safeIndex = index.coerceIn(0, paragraphs.lastIndex)
    autoAdvance = continuous
    val cleanText = cleanEmojisForSpeech(paragraphs[safeIndex])
    _state.value = _state.value.copy(currentParagraphIndex = safeIndex, isPlaying = true)
    val params = Bundle()
    tts?.speak(cleanText, TextToSpeech.QUEUE_FLUSH, params, "para_$safeIndex")
  }

  fun nextParagraph() {
    if (_state.value.currentParagraphIndex + 1 < paragraphs.size) {
      speakParagraph(_state.value.currentParagraphIndex + 1, autoAdvance)
    }
  }

  fun previousParagraph() {
    if (_state.value.currentParagraphIndex > 0) {
      speakParagraph(_state.value.currentParagraphIndex - 1, autoAdvance)
    }
  }

  fun pause() {
    tts?.stop()
    _state.value = _state.value.copy(isPlaying = false)
  }

  fun stop() {
    tts?.stop()
    _state.value = _state.value.copy(isPlaying = false)
  }

  fun shutdown() {
    tts?.stop()
    tts?.shutdown()
    tts = null
  }

  private fun cleanEmojisForSpeech(text: String): String {
    return text.replace(Regex("[\\p{So}\\p{Cn}]"), " ").replace(Regex("\\s+"), " ").trim()
  }
}
