package com.example.ui.screens

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.ui.theme.HoneyGold
import com.example.ui.theme.InkCharcoal
import com.example.ui.theme.MeadowGreen
import com.example.ui.theme.ParchmentCream
import com.example.ui.theme.WarmPaper
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
  childName: String,
  onEnterApp: () -> Unit,
) {
  var started by remember { mutableStateOf(false) }
  LaunchedEffect(Unit) {
    started = true
    delay(2600)
    onEnterApp()
  }

  val titleScale by animateFloatAsState(
    targetValue = if (started) 1f else 0.7f,
    animationSpec = spring(dampingRatio = 0.55f, stiffness = 220f),
    label = "splash_scale",
  )
  val contentAlpha by animateFloatAsState(
    targetValue = if (started) 1f else 0f,
    animationSpec = tween(700),
    label = "splash_alpha",
  )

  val inf = rememberInfiniteTransition(label = "splash_float")
  val bobY by inf.animateFloat(
    initialValue = -8f,
    targetValue = 8f,
    animationSpec = infiniteRepeatable(tween(1400), RepeatMode.Reverse),
    label = "bob",
  )

  Box(modifier = Modifier.fillMaxSize()) {
    Image(
      painter = painterResource(id = R.drawable.img_splash_art),
      contentDescription = "Ilustração em aquarela da Bíblia para Crianças",
      contentScale = ContentScale.Crop,
      modifier = Modifier.fillMaxSize(),
    )
    Box(
      modifier = Modifier
        .fillMaxSize()
        .background(
          Brush.verticalGradient(
            listOf(
              ParchmentCream.copy(alpha = 0.25f),
              ParchmentCream.copy(alpha = 0.65f),
              ParchmentCream.copy(alpha = 0.94f),
            ),
          ),
        ),
    )

    Column(
      modifier = Modifier
        .fillMaxSize()
        .safeDrawingPadding()
        .padding(28.dp)
        .alpha(contentAlpha),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center,
    ) {
      Row(
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        modifier = Modifier.offset(y = bobY.dp),
      ) {
        Text("🕊️", fontSize = 30.sp)
        Text("📖", fontSize = 54.sp)
        Text("🌈", fontSize = 30.sp)
      }
      Spacer(modifier = Modifier.height(16.dp))
      Surface(
        shape = RoundedCornerShape(28.dp),
        color = WarmPaper.copy(alpha = 0.9f),
        shadowElevation = 6.dp,
        modifier = Modifier.scale(titleScale),
      ) {
        Column(
          modifier = Modifier.padding(horizontal = 24.dp, vertical = 20.dp),
          horizontalAlignment = Alignment.CenterHorizontally,
        ) {
          Text(
            text = "Bíblia para Crianças",
            style = MaterialTheme.typography.displaySmall,
            color = InkCharcoal,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
          )
          Text(
            text = "100 Histórias Ilustradas em Aquarela ✨",
            style = MaterialTheme.typography.titleMedium,
            color = MeadowGreen,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 6.dp),
          )
          Text(
            text = "Olá, $childName! Modo Offline Ativo 🌿",
            style = MaterialTheme.typography.bodyMedium,
            color = InkCharcoal.copy(alpha = 0.78f),
            modifier = Modifier.padding(top = 8.dp),
          )
        }
      }

      Spacer(modifier = Modifier.height(28.dp))

      Button(
        onClick = onEnterApp,
        modifier = Modifier
          .height(54.dp)
          .testTag("splash_start_button"),
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(containerColor = HoneyGold, contentColor = InkCharcoal),
      ) {
        Text("Abrir Meu Livro de Histórias 🚀", style = MaterialTheme.typography.titleMedium)
      }
    }
  }
}
