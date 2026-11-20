package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.audio.PortugueseTtsManager
import com.example.data.UserPrefsState
import com.example.model.BibleStory
import com.example.ui.components.AnimatedWatercolorScene
import com.example.ui.components.ReaderTopBar
import com.example.ui.components.StickyAudioBar
import com.example.ui.components.StoryMoralFooter
import com.example.ui.components.WatercolorPaperBackground
import com.example.ui.theme.HoneyGold
import com.example.ui.theme.HoneyGoldLight
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.SkyWatercolor
import com.example.ui.theme.WarmPaper
import com.example.ui.theme.WatercolorBorder

@Composable
fun StoryReaderScreen(
  story: BibleStory,
  prefs: UserPrefsState,
  ttsManager: PortugueseTtsManager,
  onBack: () -> Unit,
  onOpenQuiz: () -> Unit,
  onUpdateAccessibility: (Float, Boolean, Float) -> Unit,
) {
  val listState = rememberLazyListState()
  val ttsState by ttsManager.state.collectAsStateWithLifecycle()

  LaunchedEffect(story.id) {
    ttsManager.loadStory(story.paragraphs)
    ttsManager.setSpeechRate(prefs.ttsSpeechRate)
  }
  DisposableEffect(story.id) { onDispose { ttsManager.stop() } }

  LaunchedEffect(ttsState.currentParagraphIndex, ttsState.isPlaying) {
    if (ttsState.isPlaying) {
      val targetItem = ttsState.currentParagraphIndex.coerceAtMost(story.paragraphs.lastIndex)
      listState.animateScrollToItem(targetItem)
    }
  }

  val scrollProgress by remember(story.paragraphs.size) {
    derivedStateOf {
      val total = listState.layoutInfo.totalItemsCount.coerceAtLeast(1)
      val lastVisible = listState.layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
      ((lastVisible + 1).toFloat() / total.toFloat()).coerceIn(0.08f, 1f)
    }
  }

  WatercolorPaperBackground {
    Scaffold(
      containerColor = Color.Transparent,
      topBar = { ReaderTopBar(story, prefs, scrollProgress, onBack, onUpdateAccessibility) },
      bottomBar = {
        StickyAudioBar(
          ttsState = ttsState,
          totalParagraphs = story.paragraphs.size,
          onTogglePlayPause = { ttsManager.togglePlayPause() },
          onPrev = { ttsManager.previousParagraph() },
          onNext = { ttsManager.nextParagraph() },
          onCycleSpeed = {
            val nextRate = when {
              prefs.ttsSpeechRate < 0.85f -> 1.0f
              prefs.ttsSpeechRate < 1.1f -> 1.25f
              else -> 0.78f
            }
            ttsManager.setSpeechRate(nextRate)
            onUpdateAccessibility(prefs.fontScaleLevel, prefs.dyslexiaFontEnabled, nextRate)
          },
        )
      },
    ) { innerPadding ->
      Box(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
        LazyColumn(
          state = listState,
          contentPadding = PaddingValues(horizontal = 16.dp, vertical = 14.dp),
          verticalArrangement = Arrangement.spacedBy(14.dp),
          modifier = Modifier.fillMaxSize().widthIn(max = 680.dp).align(Alignment.TopCenter),
        ) {
          story.paragraphs.forEachIndexed { idx, paragraph ->
            val scenesHere = story.scenes.filter { it.paragraphIndex == idx }
            item(key = "p_block_$idx") {
              Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                scenesHere.forEach { scene ->
                  val parallax = (listState.firstVisibleItemScrollOffset * 0.07f).coerceAtMost(16f)
                  AnimatedWatercolorScene(scene = scene, modifier = Modifier.graphicsLayer { translationY = -parallax })
                }
                val isSpeakingThis = ttsState.isPlaying && ttsState.currentParagraphIndex == idx
                Surface(
                  modifier = Modifier.fillMaxWidth().clickable { ttsManager.speakParagraph(idx, continuous = true) },
                  shape = RoundedCornerShape(22.dp),
                  color = if (isSpeakingThis) HoneyGoldLight else WarmPaper,
                  border = BorderStroke(1.5.dp, if (isSpeakingThis) HoneyGold else WatercolorBorder),
                  shadowElevation = 2.dp,
                ) {
                  Column(modifier = Modifier.padding(18.dp)) {
                    Text(
                      text = "Parte ${idx + 1} de ${story.paragraphs.size} • toque para ouvir",
                      style = MaterialTheme.typography.labelSmall,
                      color = if (isSpeakingThis) InkCharcoal else SkyWatercolor,
                    )
                    Text(paragraph, style = MaterialTheme.typography.bodyLarge, color = InkCharcoal, modifier = Modifier.padding(top = 6.dp))
                  }
                }
              }
            }
          }
          item(key = "moral_and_quiz") {
            StoryMoralFooter(story.moral, story.quiz.size, onOpenQuiz)
          }
        }
      }
    }
  }
}
