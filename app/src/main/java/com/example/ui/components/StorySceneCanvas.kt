package com.example.ui.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.model.StoryScene
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.SepiaMuted
import com.example.ui.theme.WarmPaper
import com.example.ui.theme.WatercolorBorder
import kotlin.math.cos
import kotlin.math.sin

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AnimatedWatercolorScene(
  scene: StoryScene,
  modifier: Modifier = Modifier,
) {
  val inf = rememberInfiniteTransition(label = "watercolor_scene")
  val kenBurnsScale by inf.animateFloat(
    initialValue = 1.0f,
    targetValue = 1.07f,
    animationSpec = infiniteRepeatable(tween(7500, easing = FastOutSlowInEasing), RepeatMode.Reverse),
    label = "kb_scale",
  )
  val kenBurnsShift by inf.animateFloat(
    initialValue = -8f,
    targetValue = 8f,
    animationSpec = infiniteRepeatable(tween(8200, easing = FastOutSlowInEasing), RepeatMode.Reverse),
    label = "kb_shift",
  )
  val shimmerPhase by inf.animateFloat(
    initialValue = 0f,
    targetValue = 6.28318f,
    animationSpec = infiniteRepeatable(tween(4800, easing = LinearEasing), RepeatMode.Restart),
    label = "shimmer",
  )

  val imageRes = resolveWatercolorSceneDrawable(scene)

  Card(
    modifier = modifier.fillMaxWidth(),
    shape = RoundedCornerShape(24.dp),
    colors = CardDefaults.cardColors(containerColor = WarmPaper),
    border = BorderStroke(1.5.dp, WatercolorBorder),
    elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
  ) {
    Column {
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .height(216.dp)
          .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)),
      ) {
        Image(
          painter = painterResource(id = imageRes),
          contentDescription = "${scene.title}: ${scene.caption}",
          contentScale = ContentScale.Crop,
          modifier = Modifier
            .fillMaxSize()
            .graphicsLayer {
              scaleX = kenBurnsScale
              scaleY = kenBurnsScale
              translationX = kenBurnsShift
              translationY = kenBurnsShift * 0.4f
            },
        )

        // Soft watercolor paper vignette & animated golden light motes
        Canvas(modifier = Modifier.fillMaxSize()) {
          drawRect(
            brush = Brush.verticalGradient(
              colors = listOf(Color(0x14FFF8EC), Color.Transparent, WarmPaper.copy(alpha = 0.28f)),
            ),
          )
          for (i in 0..5) {
            val mx = size.width * (0.14f + i * 0.14f) + sin(shimmerPhase + i) * 10f
            val my = size.height * (0.22f + (i % 3) * 0.2f) + cos(shimmerPhase + i * 0.8f) * 8f
            val alpha = 0.22f + 0.22f * sin(shimmerPhase + i * 1.3f)
            drawCircle(
              brush = Brush.radialGradient(
                listOf(Color(0xFFFFF3B0).copy(alpha = alpha), Color.Transparent),
                center = Offset(mx, my),
                radius = 16f,
              ),
              radius = 16f,
              center = Offset(mx, my),
            )
          }
        }

        // Subtle scene badge pill in top corner
        Surface(
          shape = RoundedCornerShape(50),
          color = WarmPaper.copy(alpha = 0.86f),
          border = BorderStroke(1.dp, WatercolorBorder),
          modifier = Modifier
            .align(Alignment.TopStart)
            .padding(10.dp),
        ) {
          Text(
            text = "🎨 ${scene.title}",
            style = MaterialTheme.typography.labelSmall,
            color = InkCharcoal,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
          )
        }
      }

      Column(
        modifier = Modifier
          .fillMaxWidth()
          .background(WarmPaper)
          .padding(horizontal = 16.dp, vertical = 12.dp),
      ) {
        Text(
          text = scene.caption,
          style = MaterialTheme.typography.bodyMedium,
          color = SepiaMuted,
        )
        if (scene.actors.isNotEmpty()) {
          FlowRow(
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp),
            modifier = Modifier.padding(top = 8.dp),
          ) {
            scene.actors.forEach { actor ->
              Surface(
                shape = RoundedCornerShape(50),
                color = Color(actor.robeColorHex).copy(alpha = 0.14f),
                border = BorderStroke(1.dp, Color(actor.robeColorHex).copy(alpha = 0.35f)),
              ) {
                Text(
                  text = "${moodEmojiPt(actor.mood)} ${actor.name}",
                  style = MaterialTheme.typography.labelSmall,
                  color = InkCharcoal,
                  modifier = Modifier.padding(horizontal = 9.dp, vertical = 4.dp),
                )
              }
            }
          }
        }
      }
    }
  }
}
