package com.example.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.AllStoriesRepository
import com.example.data.CompletionReward
import com.example.data.UserPreferencesRepository
import com.example.data.UserPrefsState
import com.example.data.WorldsCatalog
import com.example.model.BibleStory
import com.example.model.DifficultyLevel
import com.example.model.StoryWorld
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {
  private val repo = UserPreferencesRepository(application.applicationContext)

  val prefs: StateFlow<UserPrefsState> = repo.prefsFlow.stateIn(
    scope = viewModelScope,
    started = SharingStarted.WhileSubscribed(5_000),
    initialValue = UserPrefsState(),
  )

  val worlds: List<StoryWorld> = WorldsCatalog.worlds
  val allStories: List<BibleStory> = AllStoriesRepository.stories

  private val _pendingStreakCelebration = MutableStateFlow<CompletionReward?>(null)
  val pendingStreakCelebration: StateFlow<CompletionReward?> = _pendingStreakCelebration.asStateFlow()

  fun getStory(storyId: Int): BibleStory? = AllStoriesRepository.getStoryById(storyId)

  fun updateProfile(name: String, avatar: String) {
    viewModelScope.launch { repo.updateProfile(name, avatar) }
  }

  fun updateAccessibility(fontScale: Float, dyslexia: Boolean, ttsRate: Float) {
    viewModelScope.launch { repo.updateAccessibility(fontScale, dyslexia, ttsRate) }
  }

  fun updateParentalSettings(difficulty: DifficultyLevel, dailyGoal: Int, pin: String) {
    viewModelScope.launch { repo.updateParentalSettings(difficulty, dailyGoal, pin) }
  }

  fun completeStoryAndQuiz(
    storyId: Int,
    quizScore: Int,
    totalQuestions: Int,
    onRewardReady: (CompletionReward) -> Unit,
  ) {
    viewModelScope.launch {
      val reward = repo.recordStoryCompletion(storyId, quizScore, totalQuestions)
      onRewardReady(reward)
      if (reward.streakTriggered) {
        _pendingStreakCelebration.value = reward
      }
    }
  }

  fun dismissStreakCelebration() {
    _pendingStreakCelebration.value = null
  }

  fun resetAllProgress() {
    viewModelScope.launch { repo.resetProgress() }
  }

  fun getReaderLevelTitle(xp: Int): String = when {
    xp < 150 -> "Pequeno Semente 🌱"
    xp < 500 -> "Amigo das Histórias 📖"
    xp < 1200 -> "Explorador da Fé 🧭"
    xp < 2500 -> "Estrela de Belém ⭐"
    else -> "Guardião da Palavra 👑"
  }
}
