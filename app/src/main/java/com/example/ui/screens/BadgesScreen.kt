package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.R
import com.example.data.UserPrefsState
import com.example.data.WorldsCatalog
import com.example.model.BibleStory
import com.example.model.StoryWorld
import com.example.ui.components.BadgeStickerCard
import com.example.ui.components.WatercolorPaperBackground
import com.example.ui.theme.HoneyGold
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.ParchmentCream
import com.example.ui.theme.SepiaMuted

@Composable
fun BadgesScreen(
  prefs: UserPrefsState,
  worlds: List<StoryWorld>,
  stories: List<BibleStory>,
  modifier: Modifier = Modifier,
) {
  var selectedWorldId by remember { mutableIntStateOf(0) }
  val filteredStories = remember(selectedWorldId, stories) {
    if (selectedWorldId == 0) stories else stories.filter { it.worldId == selectedWorldId }
  }

  WatercolorPaperBackground(modifier = modifier) {
    LazyVerticalGrid(
      columns = GridCells.Adaptive(minSize = 135.dp),
      contentPadding = PaddingValues(16.dp),
      horizontalArrangement = Arrangement.spacedBy(10.dp),
      verticalArrangement = Arrangement.spacedBy(10.dp),
      modifier = Modifier
        .fillMaxSize()
        .widthIn(max = 760.dp)
        .align(Alignment.TopCenter)
        .testTag("badges_grid"),
    ) {
      item(span = { GridItemSpan(maxLineSpan) }) {
        Card(
          shape = RoundedCornerShape(26.dp),
          border = BorderStroke(1.5.dp, HoneyGold.copy(alpha = 0.5f)),
        ) {
          Box(modifier = Modifier.fillMaxWidth().height(136.dp)) {
            Image(
              painter = painterResource(id = R.drawable.img_badges_banner),
              contentDescription = "Banner de Selos em Aquarela",
              contentScale = ContentScale.Crop,
              modifier = Modifier.fillMaxSize(),
            )
            Box(
              modifier = Modifier.fillMaxSize().background(
                Brush.horizontalGradient(listOf(ParchmentCream.copy(alpha = 0.92f), ParchmentCream.copy(alpha = 0.55f))),
              ),
            )
            Column(modifier = Modifier.padding(18.dp), verticalArrangement = Arrangement.Center) {
              Text(
                text = "🎨 Álbum de Selos em Aquarela",
                style = MaterialTheme.typography.headlineMedium,
                color = InkCharcoal,
                fontWeight = FontWeight.Bold,
              )
              Text(
                text = "${prefs.completedStoryIds.size} de 100 adesivos conquistados • ${prefs.unlockedMilestones.size}/${WorldsCatalog.milestones.size} marcos",
                style = MaterialTheme.typography.bodyMedium,
                color = MeadowGreen,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 4.dp),
              )
            }
          }
        }
      }

      item(span = { GridItemSpan(maxLineSpan) }) {
        Column(modifier = Modifier.padding(top = 6.dp)) {
          Text(
            text = "🏆 Marcos de Jornada",
            style = MaterialTheme.typography.titleLarge,
            color = InkCharcoal,
            fontWeight = FontWeight.Bold,
          )
          LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(top = 8.dp),
          ) {
            items(WorldsCatalog.milestones, key = { it.id }) { m ->
              val unlocked = prefs.unlockedMilestones.contains(m.id)
              BadgeStickerCard(
                emoji = m.emoji,
                title = m.title,
                subtitle = m.description,
                accentColor = HoneyGold,
                unlocked = unlocked,
                modifier = Modifier.width(142.dp),
              )
            }
          }
        }
      }

      item(span = { GridItemSpan(maxLineSpan) }) {
        Column(modifier = Modifier.padding(top = 8.dp)) {
          Text(
            text = "📖 Adesivos das Histórias",
            style = MaterialTheme.typography.titleLarge,
            color = InkCharcoal,
            fontWeight = FontWeight.Bold,
          )
          Text(
            text = "Conclua cada história e seu quiz para desbloquear o selo colorido!",
            style = MaterialTheme.typography.bodyMedium,
            color = SepiaMuted,
          )
          LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(top = 8.dp),
          ) {
            item {
              FilterChip(
                selected = selectedWorldId == 0,
                onClick = { selectedWorldId = 0 },
                label = { Text("Todos (100)") },
              )
            }
            items(worlds, key = { it.id }) { w ->
              FilterChip(
                selected = selectedWorldId == w.id,
                onClick = { selectedWorldId = if (selectedWorldId == w.id) 0 else w.id },
                label = { Text("${w.emoji} M${w.id}") },
              )
            }
          }
        }
      }

      items(filteredStories, key = { it.id }) { story ->
        val world = worlds.firstOrNull { it.id == story.worldId }
        val accent = Color(world?.accentColorHex ?: 0xFF43A06A)
        val unlocked = prefs.completedStoryIds.contains(story.id)
        BadgeStickerCard(
          emoji = story.badgeEmoji,
          title = story.badgeTitle,
          subtitle = "História ${story.id} • ${story.title}",
          accentColor = accent,
          unlocked = unlocked,
        )
      }
    }
  }
}
