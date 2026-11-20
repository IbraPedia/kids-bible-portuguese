package com.example

import com.example.data.AllStoriesRepository
import com.example.data.WorldsCatalog
import com.example.ui.components.resolveStoryCoverDrawable
import com.example.ui.components.resolveWatercolorSceneDrawable
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class StoryCatalogValidationTest {
  @Test
  fun catalogContainsAll100CompletePortugueseStories() {
    val stories = AllStoriesRepository.stories
    assertEquals("Deve conter exatamente 100 histórias", 100, stories.size)
    assertEquals((1..100).toList(), stories.map { it.id })
    assertEquals(10, WorldsCatalog.worlds.size)

    stories.forEach { s ->
      assertTrue("História ${s.id} deve ter 5–7 parágrafos", s.paragraphs.size in 5..7)
      assertTrue("História ${s.id} deve ter ao menos 3 cenas ilustradas", s.scenes.size >= 3)
      assertTrue("História ${s.id} deve ter ao menos 5 perguntas", s.quiz.size >= 5)
      assertTrue("Capa da história ${s.id} precisa de arte em aquarela válida", resolveStoryCoverDrawable(s) != 0)
      s.scenes.forEach { scene ->
        assertTrue("Cena '${scene.title}' precisa de arte em aquarela válida", resolveWatercolorSceneDrawable(scene) != 0)
      }
      s.quiz.forEach { q ->
        assertTrue("Pergunta na história ${s.id} precisa de índice válido", q.correctIndex in q.options.indices)
      }
    }
  }
}
