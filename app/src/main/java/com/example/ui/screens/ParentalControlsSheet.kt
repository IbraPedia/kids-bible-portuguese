package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
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
import com.example.data.UserPrefsState
import com.example.model.BibleStory
import com.example.model.DifficultyLevel
import com.example.model.StoryWorld
import com.example.ui.theme.CoralTerracotta
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.SepiaMuted
import com.example.ui.theme.WarmPaper
import com.example.ui.theme.WatercolorBorder

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ParentalControlsSheet(
  prefs: UserPrefsState,
  worlds: List<StoryWorld>,
  stories: List<BibleStory>,
  onDismiss: () -> Unit,
  onUpdateAccessibility: (Float, Boolean, Float) -> Unit,
  onUpdateParentalSettings: (DifficultyLevel, Int, String) -> Unit,
  onResetProgress: () -> Unit,
) {
  var unlocked by remember { mutableStateOf(false) }
  var pinInput by remember { mutableStateOf("") }
  var pinError by remember { mutableStateOf(false) }

  ModalBottomSheet(onDismissRequest = onDismiss, containerColor = WarmPaper) {
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState())
        .padding(horizontal = 20.dp, vertical = 12.dp),
      verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
      Text("👨‍👩‍👧 Área dos Pais e Acessibilidade", style = MaterialTheme.typography.headlineMedium, color = InkCharcoal)

      if (!unlocked) {
        Text(
          text = "Digite o PIN dos pais (padrão: 1234) para ver o relatório e alterar configurações.",
          style = MaterialTheme.typography.bodyMedium,
          color = SepiaMuted,
        )
        OutlinedTextField(
          value = pinInput,
          onValueChange = { if (it.length <= 4) pinInput = it; pinError = false },
          label = { Text("PIN (4 dígitos)") },
          isError = pinError,
          singleLine = true,
          modifier = Modifier.fillMaxWidth().testTag("parent_pin_input"),
        )
        if (pinError) Text("PIN incorreto. Tente novamente.", color = CoralTerracotta, style = MaterialTheme.typography.labelSmall)
        Button(
          onClick = {
            if (pinInput == prefs.parentPin) unlocked = true else pinError = true
          },
          modifier = Modifier.fillMaxWidth().height(50.dp).testTag("parent_unlock_button"),
          shape = RoundedCornerShape(16.dp),
          colors = ButtonDefaults.buttonColors(containerColor = MeadowGreen, contentColor = Color.White),
        ) {
          Text("Desbloquear Painel")
        }
      } else {
        // Accessibility Controls
        Surface(shape = RoundedCornerShape(18.dp), color = Color.White, border = BorderStroke(1.dp, WatercolorBorder)) {
          Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("♿ Acessibilidade e Leitura", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
              Column(modifier = Modifier.weight(1f)) {
                Text("Fonte para Dislexia (Lexend)", style = MaterialTheme.typography.bodyMedium, color = InkCharcoal)
                Text("Espaçamento extra e letras claras", style = MaterialTheme.typography.labelSmall, color = SepiaMuted)
              }
              Switch(
                checked = prefs.dyslexiaFontEnabled,
                onCheckedChange = { onUpdateAccessibility(prefs.fontScaleLevel, it, prefs.ttsSpeechRate) },
                modifier = Modifier.testTag("parent_dyslexia_switch"),
              )
            }
            Text("Tamanho do Texto: ${(prefs.fontScaleLevel * 100).toInt()}%", style = MaterialTheme.typography.bodyMedium)
            Slider(
              value = prefs.fontScaleLevel,
              onValueChange = { onUpdateAccessibility(it, prefs.dyslexiaFontEnabled, prefs.ttsSpeechRate) },
              valueRange = 0.85f..1.35f,
            )
            Text("Velocidade da Voz (TTS): ${String.format("%.2fx", prefs.ttsSpeechRate)}", style = MaterialTheme.typography.bodyMedium)
            Slider(
              value = prefs.ttsSpeechRate,
              onValueChange = { onUpdateAccessibility(prefs.fontScaleLevel, prefs.dyslexiaFontEnabled, it) },
              valueRange = 0.65f..1.35f,
            )
          }
        }

        // Difficulty & Goal
        Surface(shape = RoundedCornerShape(18.dp), color = Color.White, border = BorderStroke(1.dp, WatercolorBorder)) {
          Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text("🎯 Nível de Dificuldade e Meta", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
            Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
              DifficultyLevel.entries.forEach { lvl ->
                FilterChip(
                  selected = prefs.difficultyMode == lvl,
                  onClick = { onUpdateParentalSettings(lvl, prefs.dailyGoal, prefs.parentPin) },
                  label = { Text(lvl.badgePt) },
                )
              }
            }
            Text("Meta diária: ${prefs.dailyGoal} história(s)/dia", style = MaterialTheme.typography.bodyMedium)
            Slider(
              value = prefs.dailyGoal.toFloat(),
              onValueChange = { onUpdateParentalSettings(prefs.difficultyMode, it.toInt(), prefs.parentPin) },
              valueRange = 1f..5f,
              steps = 3,
            )
          }
        }

        // Progress Report by World
        Surface(shape = RoundedCornerShape(18.dp), color = Color.White, border = BorderStroke(1.dp, WatercolorBorder)) {
          Column(modifier = Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Text("📋 Relatório de Progresso", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
            Text(
              text = "Criança: ${prefs.childName} • Histórias: ${prefs.completedStoryIds.size}/100 • Ofensiva: ${prefs.currentStreak} dias",
              style = MaterialTheme.typography.bodyMedium,
              color = SepiaMuted,
            )
            worlds.forEach { w ->
              val wStories = stories.filter { it.worldId == w.id }
              val done = wStories.count { prefs.completedStoryIds.contains(it.id) }
              Text("${w.emoji} ${w.title}: $done/${wStories.size}", style = MaterialTheme.typography.labelSmall, color = InkCharcoal)
            }
          }
        }

        OutlinedButton(
          onClick = onResetProgress,
          modifier = Modifier.fillMaxWidth(),
          colors = ButtonDefaults.outlinedButtonColors(contentColor = CoralTerracotta),
        ) {
          Text("Reiniciar Progresso Local")
        }
      }
      Spacer(modifier = Modifier.height(24.dp))
    }
  }
}
