package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.R
import com.example.model.StoryWorld
import com.example.model.Testament
import com.example.ui.theme.InkCharcoal

@Composable
fun WorldBannerCard(
  world: StoryWorld,
  completedCount: Int,
  totalCount: Int,
  modifier: Modifier = Modifier,
) {
  val accent = Color(world.accentColorHex)
  val tint = Color(world.cardTintHex)
  val bannerRes = if (world.testament == Testament.ANTIGO) R.drawable.img_world_antigo else R.drawable.img_world_novo

  Card(
    modifier = modifier.fillMaxWidth(),
    shape = RoundedCornerShape(26.dp),
    colors = CardDefaults.cardColors(containerColor = tint),
    border = BorderStroke(1.5.dp, accent.copy(alpha = 0.4f)),
    elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
  ) {
    Box(modifier = Modifier.fillMaxWidth().height(118.dp)) {
      Image(
        painter = painterResource(id = bannerRes),
        contentDescription = world.title,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxWidth().height(118.dp),
        alpha = 0.42f,
      )
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .height(118.dp)
          .background(
            Brush.horizontalGradient(
              listOf(tint.copy(alpha = 0.92f), tint.copy(alpha = 0.65f)),
            ),
          ),
      )
      Column(
        modifier = Modifier
          .fillMaxWidth()
          .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
      ) {
        Row(
          modifier = Modifier.fillMaxWidth(),
          horizontalArrangement = Arrangement.SpaceBetween,
          verticalAlignment = Alignment.CenterVertically,
        ) {
          Column(modifier = Modifier.weight(1f)) {
            Surface(
              color = accent.copy(alpha = 0.18f),
              shape = RoundedCornerShape(50),
            ) {
              Text(
                text = "Mundo ${world.id} • ${world.testament.labelPt}",
                style = MaterialTheme.typography.labelSmall,
                color = accent,
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 3.dp),
              )
            }
            Text(
              text = world.title,
              style = MaterialTheme.typography.titleLarge,
              color = InkCharcoal,
              fontWeight = FontWeight.Bold,
              modifier = Modifier.padding(top = 4.dp),
            )
            Text(
              text = world.subtitle,
              style = MaterialTheme.typography.bodyMedium,
              color = InkCharcoal.copy(alpha = 0.78f),
            )
          }
          Surface(
            color = Color.White.copy(alpha = 0.85f),
            shape = RoundedCornerShape(14.dp),
          ) {
            Text(
              text = "$completedCount/$totalCount",
              style = MaterialTheme.typography.labelLarge,
              color = accent,
              modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
            )
          }
        }
        LinearProgressIndicator(
          progress = { if (totalCount == 0) 0f else completedCount.toFloat() / totalCount },
          modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
            .height(8.dp)
            .clip(RoundedCornerShape(50)),
          color = accent,
          trackColor = Color.White.copy(alpha = 0.7f),
        )
      }
    }
  }
}
