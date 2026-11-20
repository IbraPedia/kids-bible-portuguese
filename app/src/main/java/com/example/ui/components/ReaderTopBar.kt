package com.example.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.data.UserPrefsState
import com.example.model.BibleStory
import com.example.ui.theme.HoneyGoldLight
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.MeadowGreenLight
import com.example.ui.theme.SepiaMuted
import com.example.ui.theme.WarmPaper

@Composable
fun ReaderTopBar(
  story: BibleStory,
  prefs: UserPrefsState,
  scrollProgress: Float,
  onBack: () -> Unit,
  onUpdateAccessibility: (Float, Boolean, Float) -> Unit,
) {
  Surface(color = WarmPaper.copy(alpha = 0.96f), shadowElevation = 3.dp) {
    Column(modifier = Modifier.fillMaxWidth().statusBarsPadding().padding(bottom = 8.dp)) {
      Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
      ) {
        IconButton(onClick = onBack, modifier = Modifier.testTag("reader_back_button")) {
          Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Voltar")
        }
        Column(modifier = Modifier.weight(1f)) {
          Text(
            text = "${story.emoji} ${story.title}",
            style = MaterialTheme.typography.titleMedium,
            color = InkCharcoal,
            fontWeight = FontWeight.Bold,
          )
          Text(
            text = "${story.reference} • ${(scrollProgress * 100).toInt()}% lido",
            style = MaterialTheme.typography.labelSmall,
            color = SepiaMuted,
          )
        }
        Surface(
          shape = RoundedCornerShape(50),
          color = if (prefs.dyslexiaFontEnabled) MeadowGreenLight else Color(0xFFEEE8DC),
          modifier = Modifier
            .padding(end = 6.dp)
            .testTag("reader_dyslexia_toggle")
            .clickable {
              onUpdateAccessibility(prefs.fontScaleLevel, !prefs.dyslexiaFontEnabled, prefs.ttsSpeechRate)
            },
        ) {
          Text(
            text = if (prefs.dyslexiaFontEnabled) "Dislexia ON" else "Dislexia",
            style = MaterialTheme.typography.labelSmall,
            color = if (prefs.dyslexiaFontEnabled) MeadowGreen else InkCharcoal,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
          )
        }
        Surface(
          shape = RoundedCornerShape(50),
          color = HoneyGoldLight,
          modifier = Modifier
            .padding(end = 8.dp)
            .testTag("reader_font_size_button")
            .clickable {
              val nextScale = if (prefs.fontScaleLevel >= 1.25f) 0.95f else prefs.fontScaleLevel + 0.15f
              onUpdateAccessibility(nextScale, prefs.dyslexiaFontEnabled, prefs.ttsSpeechRate)
            },
        ) {
          Text(
            text = "A+",
            style = MaterialTheme.typography.labelLarge,
            color = InkCharcoal,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
          )
        }
      }
      LinearProgressIndicator(
        progress = { scrollProgress },
        modifier = Modifier
          .fillMaxWidth()
          .padding(horizontal = 16.dp)
          .height(8.dp)
          .clip(RoundedCornerShape(50))
          .testTag("reader_progress_bar"),
        color = MeadowGreen,
        trackColor = Color(0xFFEAE1D0),
      )
    }
  }
}
