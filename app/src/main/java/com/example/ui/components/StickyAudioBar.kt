package com.example.ui.components

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Pause
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.SkipNext
import androidx.compose.material.icons.rounded.SkipPrevious
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.example.audio.TtsUiState
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.SepiaMuted
import com.example.ui.theme.SkyWatercolor
import com.example.ui.theme.WarmPaper
import com.example.ui.theme.WatercolorBorder

@Composable
fun StickyAudioBar(
  ttsState: TtsUiState,
  totalParagraphs: Int,
  onTogglePlayPause: () -> Unit,
  onPrev: () -> Unit,
  onNext: () -> Unit,
  onCycleSpeed: () -> Unit,
  modifier: Modifier = Modifier,
) {
  val inf = rememberInfiniteTransition(label = "tts_wave")
  val wave by inf.animateFloat(
    initialValue = 0.3f,
    targetValue = 1f,
    animationSpec = infiniteRepeatable(tween(420), RepeatMode.Reverse),
    label = "bar",
  )

  Surface(
    modifier = modifier
      .fillMaxWidth()
      .navigationBarsPadding()
      .padding(horizontal = 14.dp, vertical = 8.dp),
    shape = RoundedCornerShape(24.dp),
    color = WarmPaper.copy(alpha = 0.97f),
    border = BorderStroke(1.5.dp, WatercolorBorder),
    shadowElevation = 8.dp,
  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp, vertical = 8.dp),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.SpaceBetween,
    ) {
      Column(modifier = Modifier.weight(1f)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
          Text(
            text = if (ttsState.isAvailable) "🔊 Ouvir História" else "🔇 Voz indisponível",
            style = MaterialTheme.typography.labelLarge,
            color = InkCharcoal,
          )
          if (ttsState.isPlaying) {
            Row(
              modifier = Modifier.padding(start = 8.dp),
              horizontalArrangement = Arrangement.spacedBy(3.dp),
              verticalAlignment = Alignment.CenterVertically,
            ) {
              listOf(10f, 16f, 12f).forEachIndexed { idx, base ->
                Box(
                  modifier = Modifier
                    .width(3.dp)
                    .height((base * if (idx % 2 == 0) wave else (1.3f - wave)).dp)
                    .clip(RoundedCornerShape(50))
                    .background(MeadowGreen),
                )
              }
            }
          }
        }
        Text(
          text = "Parágrafo ${ttsState.currentParagraphIndex + 1} de $totalParagraphs",
          style = MaterialTheme.typography.labelSmall,
          color = SepiaMuted,
        )
      }

      Row(verticalAlignment = Alignment.CenterVertically) {
        Surface(
          modifier = Modifier
            .padding(end = 4.dp)
            .testTag("tts_speed_button")
            .clickable(onClick = onCycleSpeed),
          shape = RoundedCornerShape(50),
          color = SkyWatercolor.copy(alpha = 0.14f),
        ) {
          val speedLabel = when {
            ttsState.speechRate < 0.85f -> "0.8x"
            ttsState.speechRate > 1.1f -> "1.2x"
            else -> "1.0x"
          }
          Text(
            text = speedLabel,
            style = MaterialTheme.typography.labelSmall,
            color = SkyWatercolor,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
          )
        }

        IconButton(onClick = onPrev, enabled = ttsState.currentParagraphIndex > 0) {
          Icon(Icons.Rounded.SkipPrevious, contentDescription = "Parágrafo anterior", tint = InkCharcoal)
        }

        Surface(
          modifier = Modifier
            .size(48.dp)
            .testTag("tts_play_pause_button"),
          shape = CircleShape,
          color = if (ttsState.isPlaying) MeadowGreen else SkyWatercolor,
          onClick = onTogglePlayPause,
        ) {
          Box(contentAlignment = Alignment.Center) {
            Icon(
              imageVector = if (ttsState.isPlaying) Icons.Rounded.Pause else Icons.Rounded.PlayArrow,
              contentDescription = if (ttsState.isPlaying) "Pausar leitura" else "Ouvir história",
              tint = Color.White,
            )
          }
        }

        IconButton(onClick = onNext, enabled = ttsState.currentParagraphIndex + 1 < totalParagraphs) {
          Icon(Icons.Rounded.SkipNext, contentDescription = "Próximo parágrafo", tint = InkCharcoal)
        }
      }
    }
  }
}
