package com.example.data

import com.example.data.stories.*
import com.example.model.BibleStory

object AllStoriesRepository {
  val stories: List<BibleStory> by lazy {
    storiesPack01 + storiesPack02 + storiesPack03 + storiesPack04 + storiesPack05 +
      storiesPack06 + storiesPack07 + storiesPack08 + storiesPack09 + storiesPack10 +
      storiesPack11 + storiesPack12 + storiesPack13 + storiesPack14 + storiesPack15 +
      storiesPack16 + storiesPack17 + storiesPack18 + storiesPack19 + storiesPack20
  }

  fun getStoryById(id: Int): BibleStory? = stories.find { it.id == id }

  fun getStoriesForWorld(worldId: Int): List<BibleStory> = stories.filter { it.worldId == worldId }
}
