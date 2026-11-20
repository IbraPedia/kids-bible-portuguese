package com.example.ui.components

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.data.CompletionReward
import com.example.ui.theme.HoneyGoldLight
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.SepiaMuted
import com.example.ui.theme.StreakFlameOrange
import com.example.ui.theme.WarmPaper

@Composable
fun StreakCelebrationDialog(
  reward: CompletionReward,
  childName: String,
  onDismiss: () -> Unit,
) {
  var appeared by remember { mutableStateOf(false) }
  LaunchedEffect(Unit) { appeared = true }

  val popScale by animateFloatAsState(
    targetValue = if (appeared) 1f else 0.72f,
    animationSpec = spring(dampingRatio = 0.5f, stiffness = 260f),
    label = "streak_pop",
  )

  val inf = rememberInfiniteTransition(label = "confetti")
  val floatY by inf.animateFloat(
    initialValue = -6f,
    targetValue = 6f,
    animationSpec = infiniteRepeatable(tween(750), RepeatMode.Reverse),
    label = "confetti_y",
  )

  Dialog(onDismissRequest = onDismiss) {
    Surface(
      modifier = Modifier
        .fillMaxWidth()
        .scale(popScale),
      shape = RoundedCornerShape(30.dp),
      color = WarmPaper,
      border = BorderStroke(2.dp, StreakFlameOrange.copy(alpha = 0.45f)),
      shadowElevation = 10.dp,
    ) {
      Column(
        modifier = Modifier.padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
      ) {
        Row(
          horizontalArrangement = Arrangement.spacedBy(12.dp),
          modifier = Modifier.offset(y = floatY.dp),
        ) {
          Text("🎉", fontSize = 26.sp)
          Text("🔥", fontSize = 54.sp)
          Text("✨", fontSize = 26.sp)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
          text = "Ofensiva de ${reward.newStreak} ${if (reward.newStreak == 1) "Dia" else "Dias"}!",
          style = MaterialTheme.typography.headlineMedium,
          color = StreakFlameOrange,
          fontWeight = FontWeight.Bold,
          textAlign = TextAlign.Center,
        )
        Text(
          text = "Parabéns, $childName! Voltar todos os dias para ler a Bíblia deixa seu coração cheio de luz!",
          style = MaterialTheme.typography.bodyMedium,
          color = SepiaMuted,
          textAlign = TextAlign.Center,
          modifier = Modifier.padding(top = 6.dp),
        )
        Surface(
          modifier = Modifier.padding(top = 14.dp),
          shape = RoundedCornerShape(18.dp),
          color = HoneyGoldLight,
        ) {
          Text(
            text = "⭐ +${reward.streakBonusXp} XP Bônus Diário!",
            style = MaterialTheme.typography.titleMedium,
            color = InkCharcoal,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
          )
        }
        Spacer(modifier = Modifier.height(18.dp))
        Button(
          onClick = onDismiss,
          modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .testTag("streak_dismiss_button"),
          shape = RoundedCornerShape(18.dp),
          colors = ButtonDefaults.buttonColors(containerColor = MeadowGreen, contentColor = Color.White),
        ) {
          Text("Continuar Aventura! 🚀", style = MaterialTheme.typography.titleMedium)
        }
      }
    }
  }
}
