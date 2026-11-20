package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.UserPrefsState
import com.example.data.WorldsCatalog
import com.example.model.BibleStory
import com.example.model.DifficultyLevel
import com.example.model.StoryWorld
import com.example.model.Testament
import com.example.ui.components.MetricBox
import com.example.ui.components.ProgressRow
import com.example.ui.components.WatercolorPaperBackground
import com.example.ui.theme.HoneyGold
import com.example.ui.theme.HoneyGoldLight
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.LavenderStory
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.SkyWatercolor
import com.example.ui.theme.StreakFlameOrange
import com.example.ui.theme.WarmPaper
import com.example.ui.theme.WatercolorBorder

@Composable
fun DashboardScreen(
  prefs: UserPrefsState,
  levelTitle: String,
  worlds: List<StoryWorld>,
  stories: List<BibleStory>,
  onUpdateProfile: (String, String) -> Unit,
  onUpdateAccessibility: (Float, Boolean, Float) -> Unit,
  onUpdateParentalSettings: (DifficultyLevel, Int, String) -> Unit,
  onResetProgress: () -> Unit,
  modifier: Modifier = Modifier,
) {
  var nameInput by remember(prefs.childName) { mutableStateOf(prefs.childName) }
  var showParentalSheet by remember { mutableStateOf(false) }

  val antigoDone = stories.count { it.testament == Testament.ANTIGO && prefs.completedStoryIds.contains(it.id) }
  val novoDone = stories.count { it.testament == Testament.NOVO && prefs.completedStoryIds.contains(it.id) }
  val avgQuiz = if (prefs.quizBestScores.isEmpty()) 0 else {
    ((prefs.quizBestScores.values.sum().toFloat() / (prefs.quizBestScores.size * 5f)) * 100f).toInt()
  }

  WatercolorPaperBackground(modifier = modifier) {
    Column(
      modifier = Modifier
        .fillMaxSize()
        .widthIn(max = 680.dp)
        .align(Alignment.TopCenter)
        .verticalScroll(rememberScrollState())
        .padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
      Surface(shape = RoundedCornerShape(24.dp), color = WarmPaper, border = BorderStroke(1.5.dp, WatercolorBorder), shadowElevation = 2.dp) {
        Column(modifier = Modifier.padding(18.dp)) {
          Text("👤 Perfil do Explorador (Salvo Localmente)", style = MaterialTheme.typography.titleMedium, color = InkCharcoal, fontWeight = FontWeight.Bold)
          Text(levelTitle, style = MaterialTheme.typography.labelLarge, color = LavenderStory, modifier = Modifier.padding(top = 2.dp))
          LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(vertical = 10.dp)) {
            items(WorldsCatalog.avatarOptions()) { avatar ->
              Surface(
                shape = RoundedCornerShape(14.dp),
                color = if (prefs.childAvatarEmoji == avatar) HoneyGoldLight else Color(0xFFF3ECE0),
                border = BorderStroke(1.5.dp, if (prefs.childAvatarEmoji == avatar) HoneyGold else Color.Transparent),
                modifier = Modifier.clickable { onUpdateProfile(nameInput, avatar) },
              ) { Text(avatar, fontSize = 26.sp, modifier = Modifier.padding(10.dp)) }
            }
          }
          Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedTextField(
              value = nameInput,
              onValueChange = { nameInput = it },
              label = { Text("Nome da Criança") },
              singleLine = true,
              shape = RoundedCornerShape(16.dp),
              modifier = Modifier.weight(1f).testTag("profile_name_input"),
            )
            Button(
              onClick = { onUpdateProfile(nameInput, prefs.childAvatarEmoji) },
              shape = RoundedCornerShape(16.dp),
              colors = ButtonDefaults.buttonColors(containerColor = MeadowGreen, contentColor = Color.White),
              modifier = Modifier.height(54.dp).testTag("save_profile_button"),
            ) { Text("Salvar") }
          }
        }
      }

      Row(horizontalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.fillMaxWidth()) {
        MetricBox("🔥 Ofensiva", "${prefs.currentStreak} dias\nRecorde: ${prefs.bestStreak}", StreakFlameOrange, Modifier.weight(1f))
        MetricBox("⭐ Experiência", "${prefs.totalXp} XP\nMédia Quiz: $avgQuiz%", HoneyGold, Modifier.weight(1f))
        MetricBox("⏱️ Tempo", "${prefs.totalMinutesRead} min\nOffline Ativo", SkyWatercolor, Modifier.weight(1f))
      }

      Surface(shape = RoundedCornerShape(24.dp), color = WarmPaper, border = BorderStroke(1.5.dp, WatercolorBorder)) {
        Column(modifier = Modifier.padding(18.dp), verticalArrangement = Arrangement.spacedBy(10.dp)) {
          Text("📊 Progresso na Bíblia", style = MaterialTheme.typography.titleMedium, color = InkCharcoal, fontWeight = FontWeight.Bold)
          ProgressRow("Antigo Testamento", antigoDone, 50, MeadowGreen)
          ProgressRow("Novo Testamento", novoDone, 50, SkyWatercolor)
        }
      }

      Button(
        onClick = { showParentalSheet = true },
        modifier = Modifier.fillMaxWidth().height(56.dp).testTag("open_parental_controls_button"),
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(containerColor = LavenderStory, contentColor = Color.White),
      ) {
        Icon(Icons.Rounded.Lock, contentDescription = null, modifier = Modifier.padding(end = 8.dp))
        Text("Controle dos Pais, Relatório e Acessibilidade", style = MaterialTheme.typography.labelLarge)
      }
      Spacer(modifier = Modifier.height(8.dp))
    }
  }

  if (showParentalSheet) {
    ParentalControlsSheet(
      prefs = prefs,
      worlds = worlds,
      stories = stories,
      onDismiss = { showParentalSheet = false },
      onUpdateAccessibility = onUpdateAccessibility,
      onUpdateParentalSettings = onUpdateParentalSettings,
      onResetProgress = onResetProgress,
    )
  }
}
