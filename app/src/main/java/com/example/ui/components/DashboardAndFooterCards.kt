package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.HoneyGold
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.MeadowGreenLight
import com.example.ui.theme.WarmPaper

@Composable
fun StoryMoralFooter(
  moral: String,
  quizCount: Int,
  onOpenQuiz: () -> Unit,
) {
  Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
    Surface(
      shape = RoundedCornerShape(22.dp),
      color = MeadowGreenLight,
      border = BorderStroke(1.5.dp, MeadowGreen.copy(alpha = 0.4f)),
    ) {
      Column(modifier = Modifier.fillMaxWidth().padding(18.dp)) {
        Text("💡 Lição da História", style = MaterialTheme.typography.titleMedium, color = MeadowGreen, fontWeight = FontWeight.Bold)
        Text(moral, style = MaterialTheme.typography.bodyLarge, color = InkCharcoal, modifier = Modifier.padding(top = 4.dp))
      }
    }

    Button(
      onClick = onOpenQuiz,
      modifier = Modifier.fillMaxWidth().height(58.dp).testTag("start_quiz_button"),
      shape = RoundedCornerShape(22.dp),
      colors = ButtonDefaults.buttonColors(containerColor = HoneyGold, contentColor = InkCharcoal),
    ) {
      Text("Responder Perguntas ($quizCount) 🎯", style = MaterialTheme.typography.titleLarge, fontSize = 18.sp)
    }
    Spacer(modifier = Modifier.height(12.dp))
  }
}

@Composable
fun MetricBox(title: String, value: String, accent: Color, modifier: Modifier = Modifier) {
  Surface(
    modifier = modifier,
    shape = RoundedCornerShape(20.dp),
    color = WarmPaper,
    border = BorderStroke(1.5.dp, accent.copy(alpha = 0.45f)),
  ) {
    Column(modifier = Modifier.padding(12.dp)) {
      Text(title, style = MaterialTheme.typography.labelSmall, color = accent, fontWeight = FontWeight.Bold)
      Text(value, style = MaterialTheme.typography.bodyMedium, color = InkCharcoal, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(top = 4.dp))
    }
  }
}

@Composable
fun ProgressRow(label: String, done: Int, total: Int, color: Color) {
  Column {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
      Text(label, style = MaterialTheme.typography.bodyMedium, color = InkCharcoal)
      Text("$done / $total", style = MaterialTheme.typography.labelLarge, color = color)
    }
    LinearProgressIndicator(
      progress = { done.toFloat() / total.coerceAtLeast(1) },
      modifier = Modifier.fillMaxWidth().padding(top = 4.dp).height(10.dp).clip(RoundedCornerShape(50)),
      color = color,
      trackColor = MeadowGreenLight.copy(alpha = 0.4f),
    )
  }
}
