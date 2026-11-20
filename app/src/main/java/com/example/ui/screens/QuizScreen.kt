package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CompletionReward
import com.example.model.BibleStory
import com.example.model.DifficultyLevel
import com.example.ui.components.QuizResultCard
import com.example.ui.components.WatercolorPaperBackground
import com.example.ui.theme.CoralLight
import com.example.ui.theme.CoralTerracotta
import com.example.ui.theme.HoneyGold
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.MeadowGreenLight
import com.example.ui.theme.SepiaMuted
import com.example.ui.theme.SkyWatercolor
import com.example.ui.theme.WarmPaper
import com.example.ui.theme.WatercolorBorder

@Composable
fun QuizScreen(
  story: BibleStory,
  difficultyMode: DifficultyLevel,
  onBack: () -> Unit,
  onCompleteQuiz: (score: Int, total: Int, onResult: (CompletionReward) -> Unit) -> Unit,
  onFinishToHome: () -> Unit,
) {
  var qIndex by remember { mutableIntStateOf(0) }
  var selectedOption by remember { mutableStateOf<Int?>(null) }
  var score by remember { mutableIntStateOf(0) }
  var reward by remember { mutableStateOf<CompletionReward?>(null) }
  val questions = story.quiz
  val currentQ = questions.getOrNull(qIndex)

  WatercolorPaperBackground {
    Column(
      modifier = Modifier
        .fillMaxSize()
        .safeDrawingPadding()
        .padding(16.dp)
        .widthIn(max = 640.dp)
        .align(Alignment.TopCenter)
        .verticalScroll(rememberScrollState()),
    ) {
      Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
        IconButton(onClick = onBack, modifier = Modifier.testTag("quiz_back_button")) {
          Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Voltar")
        }
        Column(modifier = Modifier.weight(1f)) {
          Text("Quiz: ${story.title}", style = MaterialTheme.typography.titleMedium, color = InkCharcoal, fontWeight = FontWeight.Bold)
          Text("Pergunta ${minOf(qIndex + 1, questions.size)} de ${questions.size}", style = MaterialTheme.typography.labelSmall, color = SepiaMuted)
        }
      }

      LinearProgressIndicator(
        progress = { if (reward != null) 1f else (qIndex + 1).toFloat() / questions.size.coerceAtLeast(1) },
        modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp).height(10.dp).clip(RoundedCornerShape(50)),
        color = HoneyGold,
        trackColor = Color(0xFFEAE1D0),
      )

      if (reward != null) {
        QuizResultCard(story, score, questions.size, reward!!, onFinishToHome)
      } else if (currentQ != null) {
        Surface(
          shape = RoundedCornerShape(24.dp),
          color = WarmPaper,
          border = BorderStroke(1.5.dp, WatercolorBorder),
          modifier = Modifier.fillMaxWidth().padding(top = 6.dp),
        ) {
          Column(modifier = Modifier.padding(20.dp)) {
            Text(text = story.emoji, fontSize = 32.sp)
            Text(currentQ.question, style = MaterialTheme.typography.titleLarge, color = InkCharcoal, modifier = Modifier.padding(top = 8.dp))
            if (difficultyMode == DifficultyLevel.FACIL && selectedOption == null) {
              Text(
                text = "💡 Dica: lembre-se do que vimos nas ilustrações da história!",
                style = MaterialTheme.typography.labelSmall,
                color = SkyWatercolor,
                modifier = Modifier.padding(top = 6.dp),
              )
            }
          }
        }
        Spacer(modifier = Modifier.height(14.dp))
        currentQ.options.forEachIndexed { idx, option ->
          val answered = selectedOption != null
          val isCorrect = idx == currentQ.correctIndex
          val isChosen = idx == selectedOption
          val bg = when {
            !answered -> WarmPaper
            isCorrect -> MeadowGreenLight
            isChosen -> CoralLight
            else -> WarmPaper
          }
          val border = when {
            !answered -> WatercolorBorder
            isCorrect -> MeadowGreen
            isChosen -> CoralTerracotta
            else -> WatercolorBorder
          }
          Surface(
            modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp).testTag("quiz_option_$idx")
              .clickable(enabled = !answered) {
                selectedOption = idx
                if (isCorrect) score++
              },
            shape = RoundedCornerShape(18.dp),
            color = bg,
            border = BorderStroke(1.8.dp, border),
          ) {
            Text(
              text = option,
              style = MaterialTheme.typography.bodyLarge,
              color = InkCharcoal,
              fontWeight = if (isChosen || (answered && isCorrect)) FontWeight.Bold else FontWeight.Normal,
              modifier = Modifier.padding(16.dp),
            )
          }
        }

        AnimatedVisibility(visible = selectedOption != null) {
          val correct = selectedOption == currentQ.correctIndex
          Column(modifier = Modifier.padding(top = 12.dp)) {
            Surface(shape = RoundedCornerShape(18.dp), color = if (correct) MeadowGreenLight else CoralLight, modifier = Modifier.fillMaxWidth()) {
              Text(
                text = if (correct) "✅ Muito bem! ${currentQ.explanation}" else "💛 Quase! ${currentQ.explanation}",
                style = MaterialTheme.typography.bodyMedium,
                color = InkCharcoal,
                modifier = Modifier.padding(14.dp),
              )
            }
            Spacer(modifier = Modifier.height(12.dp))
            Button(
              onClick = {
                if (qIndex + 1 < questions.size) {
                  qIndex++
                  selectedOption = null
                } else {
                  onCompleteQuiz(score, questions.size) { reward = it }
                }
              },
              modifier = Modifier.fillMaxWidth().height(54.dp).testTag("quiz_next_button"),
              shape = RoundedCornerShape(20.dp),
              colors = ButtonDefaults.buttonColors(containerColor = SkyWatercolor, contentColor = Color.White),
            ) {
              Text(if (qIndex + 1 < questions.size) "Próxima Pergunta ➡️" else "Ver Meu Selo! 🏅", style = MaterialTheme.typography.titleMedium)
            }
          }
        }
      }
    }
  }
}
