package com.example.ui.components

import androidx.annotation.DrawableRes
import com.example.R
import com.example.model.BibleStory
import com.example.model.CharacterMood
import com.example.model.SceneBackdrop
import com.example.model.SceneProp
import com.example.model.StoryScene

@DrawableRes
fun resolveWatercolorSceneDrawable(scene: StoryScene): Int {
  val isPotipharWifeScene = scene.actors.any {
    it.name.contains("Potifar", ignoreCase = true) && it.mood == CharacterMood.TEMPTING
  } || (scene.title.contains("Potifar", ignoreCase = true) && scene.actors.any { it.prop == SceneProp.CLOAK_HELD })

  if (isPotipharWifeScene && scene.backdrop != SceneBackdrop.PRISON_CELL) {
    return R.drawable.img_scene_joseph_potiphar
  }

  if (scene.backdrop == SceneBackdrop.PRISON_CELL || scene.accentProp == SceneProp.IRON_BARS) {
    return R.drawable.img_scene_joseph_prison
  }

  return when (scene.backdrop) {
    SceneBackdrop.GARDEN -> R.drawable.img_scene_garden
    SceneBackdrop.OCEAN_ARK -> R.drawable.img_scene_ark_sea
    SceneBackdrop.BOAT -> R.drawable.img_scene_boat
    SceneBackdrop.DESERT -> R.drawable.img_scene_desert
    SceneBackdrop.PALACE, SceneBackdrop.THRONE -> R.drawable.img_scene_palace
    SceneBackdrop.PRISON_CELL -> R.drawable.img_scene_joseph_prison
    SceneBackdrop.MOUNTAIN -> R.drawable.img_scene_mountain
    SceneBackdrop.RIVER -> R.drawable.img_scene_river
    SceneBackdrop.VILLAGE -> R.drawable.img_scene_village
    SceneBackdrop.TEMPLE -> R.drawable.img_scene_temple
    SceneBackdrop.STARRY_NIGHT, SceneBackdrop.STABLE -> R.drawable.img_scene_starry_stable
    SceneBackdrop.LIONS_DEN -> R.drawable.img_scene_lions_den
    SceneBackdrop.CROSS_SUNRISE -> R.drawable.img_scene_cross_sunrise
    SceneBackdrop.CLOUD_HEAVEN -> R.drawable.img_scene_cloud_heaven
  }
}

@DrawableRes
fun resolveStoryCoverDrawable(story: BibleStory): Int {
  val scenes = story.scenes
  if (scenes.isEmpty()) return R.drawable.img_scene_garden
  val preferred = scenes.firstOrNull { scene ->
    val res = resolveWatercolorSceneDrawable(scene)
    res == R.drawable.img_scene_joseph_potiphar || res == R.drawable.img_scene_joseph_prison
  } ?: scenes.firstOrNull { it.backdrop != SceneBackdrop.PALACE } ?: scenes.first()
  return resolveWatercolorSceneDrawable(preferred)
}

fun moodEmojiPt(mood: CharacterMood): String = when (mood) {
  CharacterMood.HAPPY -> "😊"
  CharacterMood.BRAVE -> "🛡️"
  CharacterMood.WORRIED -> "😟"
  CharacterMood.SAD -> "😢"
  CharacterMood.SURPRISED -> "😲"
  CharacterMood.PEACEFUL -> "🕊️"
  CharacterMood.TEMPTING -> "🎭"
  CharacterMood.AWED -> "✨"
}
