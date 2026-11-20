package com.example.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.example.ui.theme.HoneyGoldLight
import com.example.ui.theme.MeadowGreenLight
import com.example.ui.theme.ParchmentCream
import com.example.ui.theme.SkyWatercolorLight

@Composable
fun WatercolorPaperBackground(
  modifier: Modifier = Modifier,
  content: @Composable BoxScope.() -> Unit,
) {
  Box(
    modifier = modifier
      .fillMaxSize()
      .background(ParchmentCream),
  ) {
    Canvas(modifier = Modifier.fillMaxSize()) {
      drawCircle(
        brush = Brush.radialGradient(
          colors = listOf(SkyWatercolorLight.copy(alpha = 0.45f), Color.Transparent),
          center = Offset(size.width * 0.15f, size.height * 0.12f),
          radius = size.width * 0.55f,
        ),
        center = Offset(size.width * 0.15f, size.height * 0.12f),
        radius = size.width * 0.55f,
      )
      drawCircle(
        brush = Brush.radialGradient(
          colors = listOf(HoneyGoldLight.copy(alpha = 0.5f), Color.Transparent),
          center = Offset(size.width * 0.88f, size.height * 0.42f),
          radius = size.width * 0.5f,
        ),
        center = Offset(size.width * 0.88f, size.height * 0.42f),
        radius = size.width * 0.5f,
      )
      drawCircle(
        brush = Brush.radialGradient(
          colors = listOf(MeadowGreenLight.copy(alpha = 0.45f), Color.Transparent),
          center = Offset(size.width * 0.2f, size.height * 0.85f),
          radius = size.width * 0.6f,
        ),
        center = Offset(size.width * 0.2f, size.height * 0.85f),
        radius = size.width * 0.6f,
      )
    }
    content()
  }
}
