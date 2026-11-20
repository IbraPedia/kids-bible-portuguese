package com.example.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.model.DifficultyLevel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.bibliaDataStore: DataStore<Preferences> by preferencesDataStore("biblia_criancas_prefs")

data class UserPrefsState(
  val childName: String = "Pequeno Leitor",
  val childAvatarEmoji: String = "🦁",
  val totalXp: Int = 0,
  val currentStreak: Int = 0,
  val bestStreak: Int = 0,
  val lastActiveEpochDay: Long = -1L,
  val completedStoryIds: Set<Int> = emptySet(),
  val quizBestScores: Map<Int, Int> = emptyMap(),
  val unlockedMilestones: Set<String> = emptySet(),
  val fontScaleLevel: Float = 1.0f,
  val dyslexiaFontEnabled: Boolean = false,
  val ttsSpeechRate: Float = 0.95f,
  val difficultyMode: DifficultyLevel = DifficultyLevel.FACIL,
  val dailyGoal: Int = 1,
  val parentPin: String = "1234",
  val totalMinutesRead: Int = 0,
)

data class CompletionReward(
  val xpEarned: Int,
  val streakBonusXp: Int,
  val newStreak: Int,
  val streakTriggered: Boolean,
  val newlyUnlockedMilestones: List<String>,
)

class UserPreferencesRepository(private val context: Context) {
  private object Keys {
    val CHILD_NAME = stringPreferencesKey("child_name")
    val CHILD_AVATAR = stringPreferencesKey("child_avatar")
    val TOTAL_XP = intPreferencesKey("total_xp")
    val CURRENT_STREAK = intPreferencesKey("current_streak")
    val BEST_STREAK = intPreferencesKey("best_streak")
    val LAST_ACTIVE_DAY = longPreferencesKey("last_active_day")
    val COMPLETED_IDS = stringSetPreferencesKey("completed_ids")
    val QUIZ_SCORES = stringSetPreferencesKey("quiz_scores")
    val MILESTONES = stringSetPreferencesKey("milestones")
    val FONT_SCALE = floatPreferencesKey("font_scale")
    val DYSLEXIA_FONT = booleanPreferencesKey("dyslexia_font")
    val TTS_RATE = floatPreferencesKey("tts_rate")
    val DIFFICULTY = stringPreferencesKey("difficulty")
    val DAILY_GOAL = intPreferencesKey("daily_goal")
    val PARENT_PIN = stringPreferencesKey("parent_pin")
    val MINUTES_READ = intPreferencesKey("minutes_read")
  }

  val prefsFlow: Flow<UserPrefsState> = context.bibliaDataStore.data.map { p ->
    val completed = (p[Keys.COMPLETED_IDS] ?: emptySet()).mapNotNull { it.toIntOrNull() }.toSet()
    val scores = (p[Keys.QUIZ_SCORES] ?: emptySet()).mapNotNull { entry ->
      val parts = entry.split(":")
      if (parts.size == 2) parts[0].toIntOrNull()?.let { id -> parts[1].toIntOrNull()?.let { sc -> id to sc } } else null
    }.toMap()
    val diff = runCatching { DifficultyLevel.valueOf(p[Keys.DIFFICULTY] ?: "FACIL") }.getOrDefault(DifficultyLevel.FACIL)
    UserPrefsState(
      childName = p[Keys.CHILD_NAME] ?: "Pequeno Leitor",
      childAvatarEmoji = p[Keys.CHILD_AVATAR] ?: "🦁",
      totalXp = p[Keys.TOTAL_XP] ?: 0,
      currentStreak = p[Keys.CURRENT_STREAK] ?: 0,
      bestStreak = p[Keys.BEST_STREAK] ?: 0,
      lastActiveEpochDay = p[Keys.LAST_ACTIVE_DAY] ?: -1L,
      completedStoryIds = completed,
      quizBestScores = scores,
      unlockedMilestones = p[Keys.MILESTONES] ?: emptySet(),
      fontScaleLevel = p[Keys.FONT_SCALE] ?: 1.0f,
      dyslexiaFontEnabled = p[Keys.DYSLEXIA_FONT] ?: false,
      ttsSpeechRate = p[Keys.TTS_RATE] ?: 0.95f,
      difficultyMode = diff,
      dailyGoal = p[Keys.DAILY_GOAL] ?: 1,
      parentPin = p[Keys.PARENT_PIN] ?: "1234",
      totalMinutesRead = p[Keys.MINUTES_READ] ?: 0,
    )
  }

  suspend fun updateProfile(name: String, avatar: String) {
    context.bibliaDataStore.edit { p ->
      p[Keys.CHILD_NAME] = name.trim().ifEmpty { "Pequeno Leitor" }
      p[Keys.CHILD_AVATAR] = avatar
    }
  }

  suspend fun updateAccessibility(fontScale: Float, dyslexia: Boolean, ttsRate: Float) {
    context.bibliaDataStore.edit { p ->
      p[Keys.FONT_SCALE] = fontScale.coerceIn(0.85f, 1.35f)
      p[Keys.DYSLEXIA_FONT] = dyslexia
      p[Keys.TTS_RATE] = ttsRate.coerceIn(0.65f, 1.35f)
    }
  }

  suspend fun updateParentalSettings(difficulty: DifficultyLevel, dailyGoal: Int, pin: String) {
    context.bibliaDataStore.edit { p ->
      p[Keys.DIFFICULTY] = difficulty.name
      p[Keys.DAILY_GOAL] = dailyGoal.coerceIn(1, 5)
      if (pin.length == 4 && pin.all { it.isDigit() }) p[Keys.PARENT_PIN] = pin
    }
  }

  suspend fun recordStoryCompletion(
    storyId: Int,
    quizScore: Int,
    totalQuestions: Int,
    minutesSpent: Int = 3,
  ): CompletionReward {
    val today = System.currentTimeMillis() / 86_400_000L
    var reward = CompletionReward(0, 0, 1, false, emptyList())
    context.bibliaDataStore.edit { p ->
      val oldCompleted = (p[Keys.COMPLETED_IDS] ?: emptySet()).mapNotNull { it.toIntOrNull() }.toMutableSet()
      val isFirstTime = oldCompleted.add(storyId)
      val oldScores = (p[Keys.QUIZ_SCORES] ?: emptySet()).associate {
        val parts = it.split(":")
        (parts.getOrNull(0)?.toIntOrNull() ?: 0) to (parts.getOrNull(1)?.toIntOrNull() ?: 0)
      }.toMutableMap()
      val prevBest = oldScores[storyId] ?: 0
      if (quizScore >= prevBest) oldScores[storyId] = quizScore

      val lastDay = p[Keys.LAST_ACTIVE_DAY] ?: -1L
      val prevStreak = p[Keys.CURRENT_STREAK] ?: 0
      val (newStreak, streakTriggered) = when {
        lastDay == today -> prevStreak.coerceAtLeast(1) to false
        lastDay == today - 1L -> (prevStreak + 1) to true
        else -> 1 to true
      }
      val bestStreak = maxOf(p[Keys.BEST_STREAK] ?: 0, newStreak)
      val baseXp = (if (isFirstTime) 40 else 15) + quizScore * 10
      val streakBonus = if (streakTriggered) 25 else 0
      val perfectCount = oldScores.count { it.value >= totalQuestions }

      val oldMilestones = (p[Keys.MILESTONES] ?: emptySet()).toMutableSet()
      val newlyUnlocked = mutableListOf<String>()
      WorldsCatalog.milestones.forEach { m ->
        val met = when (m.type) {
          com.example.model.MilestoneType.STORIES_READ -> oldCompleted.size >= m.requiredCount
          com.example.model.MilestoneType.STREAK_DAYS -> newStreak >= m.requiredCount
          com.example.model.MilestoneType.PERFECT_QUIZ -> perfectCount >= m.requiredCount
        }
        if (met && oldMilestones.add(m.id)) newlyUnlocked.add(m.id)
      }

      p[Keys.COMPLETED_IDS] = oldCompleted.map { it.toString() }.toSet()
      p[Keys.QUIZ_SCORES] = oldScores.entries.map { "${it.key}:${it.value}" }.toSet()
      p[Keys.LAST_ACTIVE_DAY] = today
      p[Keys.CURRENT_STREAK] = newStreak
      p[Keys.BEST_STREAK] = bestStreak
      p[Keys.TOTAL_XP] = (p[Keys.TOTAL_XP] ?: 0) + baseXp + streakBonus
      p[Keys.MILESTONES] = oldMilestones
      p[Keys.MINUTES_READ] = (p[Keys.MINUTES_READ] ?: 0) + minutesSpent

      reward = CompletionReward(baseXp, streakBonus, newStreak, streakTriggered, newlyUnlocked)
    }
    return reward
  }

  suspend fun resetProgress() {
    context.bibliaDataStore.edit { p ->
      p[Keys.TOTAL_XP] = 0
      p[Keys.CURRENT_STREAK] = 0
      p[Keys.BEST_STREAK] = 0
      p[Keys.LAST_ACTIVE_DAY] = -1L
      p[Keys.COMPLETED_IDS] = emptySet()
      p[Keys.QUIZ_SCORES] = emptySet()
      p[Keys.MILESTONES] = emptySet()
      p[Keys.MINUTES_READ] = 0
    }
  }
}
