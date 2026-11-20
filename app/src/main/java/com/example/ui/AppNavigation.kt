package com.example.ui

import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.EmojiEvents
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.rounded.EmojiEvents
import androidx.compose.material.icons.rounded.Explore
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.audio.PortugueseTtsManager
import com.example.ui.components.StreakCelebrationDialog
import com.example.ui.screens.BadgesScreen
import com.example.ui.screens.DashboardScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.QuizScreen
import com.example.ui.screens.SplashScreen
import com.example.ui.screens.StoryReaderScreen
import com.example.ui.theme.WarmPaper
import com.example.viewmodel.MainViewModel

object Routes {
  const val SPLASH = "splash"
  const val HOME = "home"
  const val BADGES = "badges"
  const val DASHBOARD = "dashboard"
  const val READER = "reader/{storyId}"
  const val QUIZ = "quiz/{storyId}"
}

@Composable
fun BibliaAppRoot(
  viewModel: MainViewModel,
  ttsManager: PortugueseTtsManager,
) {
  val navController = rememberNavController()
  val prefs by viewModel.prefs.collectAsStateWithLifecycle()
  val pendingStreak by viewModel.pendingStreakCelebration.collectAsStateWithLifecycle()
  val backStackEntry by navController.currentBackStackEntryAsState()
  val currentRoute = backStackEntry?.destination?.route

  val showBottomBar = currentRoute in setOf(Routes.HOME, Routes.BADGES, Routes.DASHBOARD)

  Scaffold(
    contentWindowInsets = WindowInsets(0, 0, 0, 0),
    bottomBar = {
      if (showBottomBar) {
        NavigationBar(containerColor = WarmPaper) {
          val tabs = listOf(
            Triple(Routes.HOME, "Trilha", Icons.Rounded.Explore to Icons.Outlined.Explore),
            Triple(Routes.BADGES, "Selos", Icons.Rounded.EmojiEvents to Icons.Outlined.EmojiEvents),
            Triple(Routes.DASHBOARD, "Painel", Icons.Rounded.Person to Icons.Outlined.Person),
          )
          tabs.forEach { (route, label, icons) ->
            val selected = currentRoute == route
            NavigationBarItem(
              selected = selected,
              onClick = {
                navController.navigate(route) {
                  popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                  launchSingleTop = true
                  restoreState = true
                }
              },
              icon = { Icon(if (selected) icons.first else icons.second, contentDescription = label) },
              label = { Text(label) },
              modifier = Modifier.testTag("nav_tab_$route"),
            )
          }
        }
      }
    },
  ) { innerPadding ->
    Box(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
      NavHost(
        navController = navController,
        startDestination = Routes.SPLASH,
        enterTransition = { slideInHorizontally { it / 4 } + fadeIn() },
        exitTransition = { fadeOut() },
        popEnterTransition = { fadeIn() },
        popExitTransition = { slideOutHorizontally { it / 4 } + fadeOut() },
      ) {
        composable(Routes.SPLASH) {
          SplashScreen(
            childName = prefs.childName,
            onEnterApp = {
              navController.navigate(Routes.HOME) {
                popUpTo(Routes.SPLASH) { inclusive = true }
              }
            },
          )
        }
        composable(Routes.HOME) {
          HomeScreen(
            prefs = prefs,
            worlds = viewModel.worlds,
            stories = viewModel.allStories,
            onOpenStory = { storyId -> navController.navigate("reader/$storyId") },
          )
        }
        composable(Routes.BADGES) {
          BadgesScreen(prefs = prefs, worlds = viewModel.worlds, stories = viewModel.allStories)
        }
        composable(Routes.DASHBOARD) {
          DashboardScreen(
            prefs = prefs,
            levelTitle = viewModel.getReaderLevelTitle(prefs.totalXp),
            worlds = viewModel.worlds,
            stories = viewModel.allStories,
            onUpdateProfile = viewModel::updateProfile,
            onUpdateAccessibility = viewModel::updateAccessibility,
            onUpdateParentalSettings = viewModel::updateParentalSettings,
            onResetProgress = viewModel::resetAllProgress,
          )
        }
        composable(
          route = Routes.READER,
          arguments = listOf(navArgument("storyId") { type = NavType.IntType }),
        ) { entry ->
          val storyId = entry.arguments?.getInt("storyId") ?: 1
          val story = viewModel.getStory(storyId) ?: viewModel.allStories.first()
          StoryReaderScreen(
            story = story,
            prefs = prefs,
            ttsManager = ttsManager,
            onBack = { navController.popBackStack() },
            onOpenQuiz = { navController.navigate("quiz/${story.id}") },
            onUpdateAccessibility = viewModel::updateAccessibility,
          )
        }
        composable(
          route = Routes.QUIZ,
          arguments = listOf(navArgument("storyId") { type = NavType.IntType }),
        ) { entry ->
          val storyId = entry.arguments?.getInt("storyId") ?: 1
          val story = viewModel.getStory(storyId) ?: viewModel.allStories.first()
          QuizScreen(
            story = story,
            difficultyMode = prefs.difficultyMode,
            onBack = { navController.popBackStack() },
            onCompleteQuiz = { score, total, cb ->
              viewModel.completeStoryAndQuiz(story.id, score, total, cb)
            },
            onFinishToHome = {
              navController.popBackStack(Routes.HOME, inclusive = false)
            },
          )
        }
      }
    }
  }

  pendingStreak?.let { streakReward ->
    StreakCelebrationDialog(
      reward = streakReward,
      childName = prefs.childName,
      onDismiss = viewModel::dismissStreakCelebration,
    )
  }
}
