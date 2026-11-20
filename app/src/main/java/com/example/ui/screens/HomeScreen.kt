package com.example.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.example.data.UserPrefsState
import com.example.model.BibleStory
import com.example.model.StoryWorld
import com.example.ui.components.HomeTopBar
import com.example.ui.components.StoryCard
import com.example.ui.components.WatercolorPaperBackground
import com.example.ui.components.WorldBannerCard
import com.example.ui.theme.SepiaMuted

@Composable
fun HomeScreen(
  prefs: UserPrefsState,
  worlds: List<StoryWorld>,
  stories: List<BibleStory>,
  onOpenStory: (Int) -> Unit,
  modifier: Modifier = Modifier,
) {
  var selectedWorldId by remember { mutableIntStateOf(0) }
  var query by remember { mutableStateOf("") }

  val nextStoryId = remember(prefs.completedStoryIds, stories) {
    stories.firstOrNull { !prefs.completedStoryIds.contains(it.id) }?.id ?: 1
  }
  val filteredWorlds = remember(selectedWorldId, worlds) {
    if (selectedWorldId == 0) worlds else worlds.filter { it.id == selectedWorldId }
  }

  WatercolorPaperBackground(modifier = modifier) {
    Column(
      modifier = Modifier
        .fillMaxSize()
        .widthIn(max = 700.dp)
        .align(Alignment.TopCenter),
    ) {
      HomeTopBar(
        prefs = prefs,
        worlds = worlds,
        selectedWorldId = selectedWorldId,
        query = query,
        onQueryChange = { query = it },
        onSelectWorld = { selectedWorldId = it },
      )

      LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 14.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
        modifier = Modifier.fillMaxSize().testTag("home_story_list"),
      ) {
        filteredWorlds.forEach { world ->
          val worldStories = stories.filter {
            it.worldId == world.id && (query.isBlank() || it.title.contains(query, ignoreCase = true))
          }
          if (worldStories.isNotEmpty()) {
            val allWorldStories = stories.filter { it.worldId == world.id }
            val doneCount = allWorldStories.count { prefs.completedStoryIds.contains(it.id) }
            item(key = "world_${world.id}") {
              WorldBannerCard(world = world, completedCount = doneCount, totalCount = allWorldStories.size)
            }
            items(worldStories, key = { it.id }) { story ->
              StoryCard(
                story = story,
                accentColor = Color(world.accentColorHex),
                isCompleted = prefs.completedStoryIds.contains(story.id),
                isNextUp = story.id == nextStoryId,
                bestScore = prefs.quizBestScores[story.id],
                onClick = { onOpenStory(story.id) },
              )
            }
          }
        }
        item {
          Text(
            text = "Todas as 100 histórias ilustradas estão disponíveis offline.",
            style = MaterialTheme.typography.labelSmall,
            color = SepiaMuted,
            modifier = Modifier.padding(vertical = 12.dp),
          )
        }
      }
    }
  }
}
