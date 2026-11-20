package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CompletionReward
import com.example.model.BibleStory
import com.example.ui.theme.HoneyGold
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.WarmPaper

@Composable
fun QuizResultCard(
  story: BibleStory,
  score: Int,
  total: Int,
  reward: CompletionReward,
  onFinishToHome: () -> Unit,
) {
  Surface(
    shape = RoundedCornerShape(28.dp),
    color = WarmPaper,
    border = BorderStroke(2.dp, HoneyGold),
    shadowElevation = 5.dp,
    modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
  ) {
    Column(
      modifier = Modifier.padding(24.dp),
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      Text(text = if (score >= 4) "🎉🌟🏆" else "👏📖💛", fontSize = 44.sp)
      Text(
        text = "Parabéns! Você acertou $score de $total!",
        style = MaterialTheme.typography.headlineMedium,
        color = InkCharcoal,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(top = 8.dp),
      )
      Text(
        text = "Você ganhou +${reward.xpEarned} XP e desbloqueou seu selo em aquarela!",
        style = MaterialTheme.typography.bodyMedium,
        color = MeadowGreen,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(top = 6.dp),
      )
      Spacer(modifier = Modifier.height(16.dp))
      BadgeStickerCard(
        emoji = story.badgeEmoji,
        title = story.badgeTitle,
        subtitle = "História ${story.id} concluída!",
        accentColor = HoneyGold,
        unlocked = true,
        modifier = Modifier.widthIn(max = 210.dp),
      )
      Spacer(modifier = Modifier.height(20.dp))
      Button(
        onClick = onFinishToHome,
        modifier = Modifier.fillMaxWidth().height(54.dp).testTag("quiz_finish_button"),
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(containerColor = MeadowGreen, contentColor = Color.White),
      ) {
        Text("Voltar à Trilha 🗺️", style = MaterialTheme.typography.titleMedium)
      }
    }
  }
}
