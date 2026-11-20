package com.example.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val StorybookColorScheme = lightColorScheme(
  primary = SkyWatercolor,
  onPrimary = Color.White,
  primaryContainer = SkyWatercolorLight,
  onPrimaryContainer = InkCharcoal,
  secondary = MeadowGreen,
  onSecondary = Color.White,
  secondaryContainer = MeadowGreenLight,
  onSecondaryContainer = InkCharcoal,
  tertiary = HoneyGold,
  onTertiary = InkCharcoal,
  tertiaryContainer = HoneyGoldLight,
  onTertiaryContainer = InkCharcoal,
  error = CoralTerracotta,
  onError = Color.White,
  errorContainer = CoralLight,
  onErrorContainer = InkCharcoal,
  background = ParchmentCream,
  onBackground = InkCharcoal,
  surface = WarmPaper,
  onSurface = InkCharcoal,
  surfaceVariant = SoftLinen,
  onSurfaceVariant = SepiaMuted,
  outline = WatercolorBorder,
)

private val StorybookShapes = Shapes(
  small = RoundedCornerShape(14.dp),
  medium = RoundedCornerShape(22.dp),
  large = RoundedCornerShape(28.dp),
  extraLarge = RoundedCornerShape(34.dp),
)

@Composable
fun BibliaCriancasTheme(
  dyslexiaFriendly: Boolean = false,
  fontScaleMultiplier: Float = 1.0f,
  content: @Composable () -> Unit,
) {
  val typography = buildAppTypography(
    dyslexiaFriendly = dyslexiaFriendly,
    fontScaleMultiplier = fontScaleMultiplier,
  )
  MaterialTheme(
    colorScheme = StorybookColorScheme,
    typography = typography,
    shapes = StorybookShapes,
    content = content,
  )
}
