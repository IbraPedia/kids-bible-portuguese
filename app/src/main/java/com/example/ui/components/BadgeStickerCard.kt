package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.SepiaMuted
import com.example.ui.theme.SoftLinen
import com.example.ui.theme.WarmPaper
import com.example.ui.theme.WatercolorBorder

@Composable
fun BadgeStickerCard(
  emoji: String,
  title: String,
  subtitle: String,
  accentColor: Color,
  unlocked: Boolean,
  modifier: Modifier = Modifier,
) {
  Surface(
    modifier = modifier
      .fillMaxWidth()
      .alpha(if (unlocked) 1f else 0.58f),
    shape = RoundedCornerShape(22.dp),
    color = if (unlocked) WarmPaper else SoftLinen,
    border = BorderStroke(1.5.dp, if (unlocked) accentColor.copy(alpha = 0.55f) else WatercolorBorder),
    shadowElevation = if (unlocked) 3.dp else 0.dp,
  ) {
    Column(
      modifier = Modifier.padding(12.dp),
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      Box(
        modifier = Modifier.size(66.dp),
        contentAlignment = Alignment.Center,
      ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
          val splashColor = if (unlocked) accentColor else Color(0xFFBDB3A7)
          drawCircle(
            brush = Brush.radialGradient(
              listOf(splashColor.copy(alpha = 0.38f), Color.Transparent),
              center = Offset(size.width * 0.5f, size.height * 0.5f),
              radius = size.width * 0.5f,
            ),
          )
        }
        Surface(
          modifier = Modifier.size(52.dp),
          shape = CircleShape,
          color = if (unlocked) accentColor.copy(alpha = 0.16f) else Color.White.copy(alpha = 0.6f),
          border = BorderStroke(2.dp, if (unlocked) accentColor else WatercolorBorder),
        ) {
          Box(contentAlignment = Alignment.Center) {
            Text(text = if (unlocked) emoji else "🔒", fontSize = 24.sp)
          }
        }
      }
      Text(
        text = title,
        style = MaterialTheme.typography.labelLarge,
        color = InkCharcoal,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.padding(top = 6.dp),
      )
      Text(
        text = subtitle,
        style = MaterialTheme.typography.labelSmall,
        color = SepiaMuted,
        textAlign = TextAlign.Center,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.padding(top = 2.dp),
      )
    }
  }
}
