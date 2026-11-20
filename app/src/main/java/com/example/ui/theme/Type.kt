package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.R

val FredokaFontFamily = FontFamily(Font(R.font.fredoka, FontWeight.Normal))
val NunitoFontFamily = FontFamily(Font(R.font.nunito, FontWeight.Normal))
val LexendFontFamily = FontFamily(Font(R.font.lexend, FontWeight.Normal))

fun buildAppTypography(
  dyslexiaFriendly: Boolean,
  fontScaleMultiplier: Float,
): Typography {
  val displayFamily = if (dyslexiaFriendly) LexendFontFamily else FredokaFontFamily
  val bodyFamily = if (dyslexiaFriendly) LexendFontFamily else NunitoFontFamily
  val extraTracking = if (dyslexiaFriendly) 0.8.sp else 0.15.sp
  val lineMultiplier = if (dyslexiaFriendly) 1.55f else 1.42f
  val scale = fontScaleMultiplier.coerceIn(0.85f, 1.4f)

  return Typography(
    displaySmall = TextStyle(
      fontFamily = displayFamily,
      fontWeight = FontWeight.Bold,
      fontSize = (28f * scale).sp,
      lineHeight = (34f * scale).sp,
      letterSpacing = extraTracking,
    ),
    headlineMedium = TextStyle(
      fontFamily = displayFamily,
      fontWeight = FontWeight.Bold,
      fontSize = (22f * scale).sp,
      lineHeight = (28f * scale).sp,
      letterSpacing = extraTracking,
    ),
    titleLarge = TextStyle(
      fontFamily = displayFamily,
      fontWeight = FontWeight.SemiBold,
      fontSize = (19f * scale).sp,
      lineHeight = (25f * scale).sp,
      letterSpacing = extraTracking,
    ),
    titleMedium = TextStyle(
      fontFamily = bodyFamily,
      fontWeight = FontWeight.Bold,
      fontSize = (16f * scale).sp,
      lineHeight = (22f * scale).sp,
      letterSpacing = extraTracking,
    ),
    bodyLarge = TextStyle(
      fontFamily = bodyFamily,
      fontWeight = FontWeight.Normal,
      fontSize = (17f * scale).sp,
      lineHeight = (17f * scale * lineMultiplier).sp,
      letterSpacing = extraTracking,
    ),
    bodyMedium = TextStyle(
      fontFamily = bodyFamily,
      fontWeight = FontWeight.Normal,
      fontSize = (14.5f * scale).sp,
      lineHeight = (14.5f * scale * lineMultiplier).sp,
      letterSpacing = extraTracking,
    ),
    labelLarge = TextStyle(
      fontFamily = displayFamily,
      fontWeight = FontWeight.SemiBold,
      fontSize = (14f * scale).sp,
      lineHeight = (18f * scale).sp,
      letterSpacing = extraTracking,
    ),
    labelSmall = TextStyle(
      fontFamily = bodyFamily,
      fontWeight = FontWeight.SemiBold,
      fontSize = (11.5f * scale).sp,
      lineHeight = (15f * scale).sp,
      letterSpacing = extraTracking,
    ),
  )
}
