package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.MenuBook
import androidx.compose.material.icons.rounded.LocalFireDepartment
import androidx.compose.material.icons.rounded.OfflinePin
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.data.UserPrefsState
import com.example.model.StoryWorld
import com.example.ui.theme.HoneyGoldDark
import com.example.ui.theme.HoneyGoldLight
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.MeadowGreenLight
import com.example.ui.theme.SkyWatercolor
import com.example.ui.theme.StreakFlameOrange
import com.example.ui.theme.WarmPaper
import com.example.ui.theme.WatercolorBorder

@Composable
fun HomeTopBar(
  prefs: UserPrefsState,
  worlds: List<StoryWorld>,
  selectedWorldId: Int,
  query: String,
  onQueryChange: (String) -> Unit,
  onSelectWorld: (Int) -> Unit,
) {
  Surface(
    color = WarmPaper.copy(alpha = 0.94f),
    border = BorderStroke(1.dp, WatercolorBorder),
    shadowElevation = 2.dp,
  ) {
    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 10.dp)) {
      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
      ) {
        Column(modifier = Modifier.weight(1f)) {
          Text("Olá, ${prefs.childName}!", style = MaterialTheme.typography.titleMedium, color = InkCharcoal, fontWeight = FontWeight.Bold)
          Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Rounded.OfflinePin, contentDescription = null, tint = MeadowGreen, modifier = Modifier.size(14.dp))
            Spacer(modifier = Modifier.width(4.dp))
            Text("Offline • ${prefs.difficultyMode.badgePt}", style = MaterialTheme.typography.labelSmall, color = MeadowGreen)
          }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
          StatPill(Icons.Rounded.LocalFireDepartment, "${prefs.currentStreak}", Color(0xFFFFEAE2), StreakFlameOrange)
          StatPill(Icons.Rounded.Star, "${prefs.totalXp}", HoneyGoldLight, HoneyGoldDark)
          StatPill(Icons.AutoMirrored.Rounded.MenuBook, "${prefs.completedStoryIds.size}/100", MeadowGreenLight, MeadowGreen)
        }
      }

      OutlinedTextField(
        value = query,
        onValueChange = onQueryChange,
        placeholder = { Text("Buscar história (ex: José, Davi, Arca...)") },
        leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = "Buscar") },
        singleLine = true,
        shape = RoundedCornerShape(18.dp),
        colors = OutlinedTextFieldDefaults.colors(
          focusedContainerColor = Color.White,
          unfocusedContainerColor = Color.White,
          focusedBorderColor = SkyWatercolor,
          unfocusedBorderColor = WatercolorBorder,
        ),
        modifier = Modifier.fillMaxWidth().padding(top = 8.dp).testTag("home_search_input"),
      )

      LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(top = 8.dp)) {
        item {
          FilterChip(
            selected = selectedWorldId == 0,
            onClick = { onSelectWorld(0) },
            label = { Text("Todos os 10 Mundos") },
            colors = FilterChipDefaults.filterChipColors(selectedContainerColor = SkyWatercolor.copy(alpha = 0.2f)),
          )
        }
        items(worlds, key = { it.id }) { w ->
          FilterChip(
            selected = selectedWorldId == w.id,
            onClick = { onSelectWorld(if (selectedWorldId == w.id) 0 else w.id) },
            label = { Text("${w.id}. ${w.title.substringBefore(" ")}") },
          )
        }
      }
    }
  }
}

@Composable
private fun StatPill(icon: ImageVector, text: String, bg: Color, fg: Color) {
  Surface(shape = RoundedCornerShape(50), color = bg) {
    Row(
      verticalAlignment = Alignment.CenterVertically,
      modifier = Modifier.padding(horizontal = 9.dp, vertical = 5.dp),
    ) {
      Icon(icon, contentDescription = null, tint = fg, modifier = Modifier.size(14.dp))
      Spacer(modifier = Modifier.width(3.dp))
      Text(
        text = text,
        style = MaterialTheme.typography.labelSmall,
        color = fg,
        fontWeight = FontWeight.Bold,
      )
    }
  }
}
