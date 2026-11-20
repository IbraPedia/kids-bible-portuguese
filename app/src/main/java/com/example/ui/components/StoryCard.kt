package com.example.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.MenuBook
import androidx.compose.material.icons.rounded.AutoStories
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Collections
import androidx.compose.material.icons.rounded.EmojiEvents
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.model.BibleStory
import com.example.ui.theme.HoneyGold
import com.example.ui.theme.HoneyGoldDark
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.SepiaMuted
import com.example.ui.theme.WarmPaper
import com.example.ui.theme.WatercolorBorder

@Composable
fun StoryCard(
  story: BibleStory,
  accentColor: Color,
  isCompleted: Boolean,
  isNextUp: Boolean,
  bestScore: Int?,
  onClick: () -> Unit,
  modifier: Modifier = Modifier,
) {
  val interaction = remember { MutableInteractionSource() }
  val pressed by interaction.collectIsPressedAsState()
  val pressScale by animateFloatAsState(
    targetValue = if (pressed) 0.97f else 1f,
    animationSpec = spring(dampingRatio = 0.65f),
    label = "story_card_press",
  )

  val coverRes = remember(story.id) { resolveStoryCoverDrawable(story) }
  val borderColor = when {
    isNextUp -> accentColor
    isCompleted -> HoneyGold
    else -> WatercolorBorder
  }

  Card(
    modifier = modifier
      .fillMaxWidth()
      .scale(pressScale)
      .testTag("story_node_${story.id}")
      .clickable(interactionSource = interaction, indication = null, onClick = onClick),
    shape = RoundedCornerShape(24.dp),
    colors = CardDefaults.cardColors(containerColor = WarmPaper),
    border = BorderStroke(if (isNextUp) 2.dp else 1.4.dp, borderColor),
    elevation = CardDefaults.cardElevation(defaultElevation = if (isNextUp) 5.dp else 2.dp),
  ) {
    Column(modifier = Modifier.fillMaxWidth()) {
      Box(modifier = Modifier.fillMaxWidth().height(152.dp)) {
        Image(
          painter = painterResource(id = coverRes),
          contentDescription = story.title,
          contentScale = ContentScale.Crop,
          modifier = Modifier.fillMaxSize(),
        )
        Box(
          modifier = Modifier.fillMaxSize().background(
            Brush.verticalGradient(listOf(Color.Transparent, Color.Transparent, WarmPaper.copy(alpha = 0.65f))),
          ),
        )
        Surface(
          shape = RoundedCornerShape(50),
          color = WarmPaper.copy(alpha = 0.9f),
          border = BorderStroke(1.dp, WatercolorBorder),
          modifier = Modifier.align(Alignment.TopStart).padding(10.dp),
        ) {
          Text(
            text = "História ${story.id}",
            style = MaterialTheme.typography.labelSmall,
            color = InkCharcoal,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
          )
        }
        if (isCompleted || isNextUp) {
          val badgeBg = if (isCompleted) MeadowGreen else accentColor
          val badgeLabel = if (isCompleted) "Concluída" else "Próxima leitura"
          val badgeIcon = if (isCompleted) Icons.Rounded.CheckCircle else Icons.Rounded.AutoStories
          Surface(
            shape = RoundedCornerShape(50),
            color = badgeBg,
            modifier = Modifier.align(Alignment.TopEnd).padding(10.dp),
          ) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)) {
              Icon(badgeIcon, contentDescription = null, tint = Color.White, modifier = Modifier.size(14.dp))
              Spacer(modifier = Modifier.width(4.dp))
              Text(badgeLabel, style = MaterialTheme.typography.labelSmall, color = Color.White, fontWeight = FontWeight.Bold)
            }
          }
        }
      }

      Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 12.dp)) {
        Text(
          text = story.title,
          style = MaterialTheme.typography.titleLarge,
          color = InkCharcoal,
          fontWeight = FontWeight.Bold,
          maxLines = 2,
          overflow = TextOverflow.Ellipsis,
        )
        Text(
          text = "${story.reference} • ${story.difficulty.badgePt}",
          style = MaterialTheme.typography.bodyMedium,
          color = SepiaMuted,
          modifier = Modifier.padding(top = 2.dp),
        )
        Row(
          modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
          horizontalArrangement = Arrangement.SpaceBetween,
          verticalAlignment = Alignment.CenterVertically,
        ) {
          Row(horizontalArrangement = Arrangement.spacedBy(10.dp), verticalAlignment = Alignment.CenterVertically) {
            Row(verticalAlignment = Alignment.CenterVertically) {
              Icon(Icons.Rounded.Collections, contentDescription = null, tint = SepiaMuted, modifier = Modifier.size(15.dp))
              Spacer(modifier = Modifier.width(4.dp))
              Text("${story.scenes.size} cenas", style = MaterialTheme.typography.labelSmall, color = SepiaMuted)
            }
            if (bestScore != null) {
              Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Rounded.EmojiEvents, contentDescription = null, tint = HoneyGoldDark, modifier = Modifier.size(15.dp))
                Spacer(modifier = Modifier.width(4.dp))
                Text("Quiz $bestScore/5", style = MaterialTheme.typography.labelSmall, color = HoneyGoldDark, fontWeight = FontWeight.Bold)
              }
            }
          }
          Surface(shape = RoundedCornerShape(50), color = accentColor) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)) {
              Icon(Icons.AutoMirrored.Rounded.MenuBook, contentDescription = null, tint = Color.White, modifier = Modifier.size(15.dp))
              Spacer(modifier = Modifier.width(5.dp))
              Text("Ler", style = MaterialTheme.typography.labelLarge, color = Color.White, fontWeight = FontWeight.Bold)
            }
          }
        }
      }
    }
  }
}
