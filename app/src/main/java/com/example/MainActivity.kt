package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.audio.PortugueseTtsManager
import com.example.ui.BibliaAppRoot
import com.example.ui.theme.BibliaCriancasTheme
import com.example.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
  private val viewModel: MainViewModel by viewModels()
  private lateinit var ttsManager: PortugueseTtsManager

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    ttsManager = PortugueseTtsManager(this)
    setContent {
      val prefs by viewModel.prefs.collectAsStateWithLifecycle()
      BibliaCriancasTheme(
        dyslexiaFriendly = prefs.dyslexiaFontEnabled,
        fontScaleMultiplier = prefs.fontScaleLevel,
      ) {
        BibliaAppRoot(viewModel = viewModel, ttsManager = ttsManager)
      }
    }
  }

  override fun onDestroy() {
    ttsManager.shutdown()
    super.onDestroy()
  }
}
