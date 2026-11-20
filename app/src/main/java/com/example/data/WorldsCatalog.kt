package com.example.data

import com.example.model.MilestoneBadge
import com.example.model.MilestoneType
import com.example.model.StoryWorld
import com.example.model.Testament

object WorldsCatalog {
  val worlds: List<StoryWorld> = listOf(
    StoryWorld(1, "A Criação e o Começo", "Do jardim lindo à arca de Noé", "🌍", Testament.ANTIGO, 0xFF43A06A, 0xFFE6F6EC),
    StoryWorld(2, "Patriarcas e José", "Promessas, sonhos e perdão no Egito", "🌈", Testament.ANTIGO, 0xFFF2A93B, 0xFFFFF3DA),
    StoryWorld(3, "Moisés e a Liberdade", "O mar aberto e o cuidado de Deus", "🌊", Testament.ANTIGO, 0xFF3E92CC, 0xFFE1F2FC),
    StoryWorld(4, "Heróis da Fé", "Coragem com Josué, Rute e Davi", "🛡️", Testament.ANTIGO, 0xFFE76F51, 0xFFFFEAE3),
    StoryWorld(5, "Reis e Profetas", "Sabedoria, leões e milagres de fé", "👑", Testament.ANTIGO, 0xFF8C6EC9, 0xFFF2EBFC),
    StoryWorld(6, "A Vinda de Jesus", "A estrela em Belém e os primeiros passos", "⭐", Testament.NOVO, 0xFF3E92CC, 0xFFE1F2FC),
    StoryWorld(7, "Milagres de Amor", "Tempestades calmas, pães e abraços", "🍞", Testament.NOVO, 0xFF43A06A, 0xFFE6F6EC),
    StoryWorld(8, "Parábolas do Reino", "Histórias cheias de tesouros e bondade", "🌱", Testament.NOVO, 0xFFF2A93B, 0xFFFFF3DA),
    StoryWorld(9, "Páscoa e Vitória", "O amor que venceu para sempre", "🌅", Testament.NOVO, 0xFFE76F51, 0xFFFFEAE3),
    StoryWorld(10, "A Igreja e Esperança", "Amigos levando alegria ao mundo", "🕊️", Testament.NOVO, 0xFF8C6EC9, 0xFFF2EBFC),
  )

  val milestones: List<MilestoneBadge> = listOf(
    MilestoneBadge("m_first", "Primeiro Passo", "Concluiu sua 1ª história bíblica", "🌱", 1, MilestoneType.STORIES_READ),
    MilestoneBadge("m_ten", "Leitor Curioso", "Completou 10 histórias da Bíblia", "📖", 10, MilestoneType.STORIES_READ),
    MilestoneBadge("m_quarter", "Explorador Fiel", "Completou 25 histórias ilustradas", "🧭", 25, MilestoneType.STORIES_READ),
    MilestoneBadge("m_half", "Guardião da Palavra", "Alcançou metade das 100 histórias!", "🏅", 50, MilestoneType.STORIES_READ),
    MilestoneBadge("m_all", "Mestre da Bíblia", "Leu todas as 100 histórias!", "👑", 100, MilestoneType.STORIES_READ),
    MilestoneBadge("m_streak3", "Chama Acessa", "Manteve 3 dias seguidos de leitura", "🔥", 3, MilestoneType.STREAK_DAYS),
    MilestoneBadge("m_streak7", "Semana Dourada", "7 dias seguidos aprendendo com fé", "🌟", 7, MilestoneType.STREAK_DAYS),
    MilestoneBadge("m_perfect5", "Sábio dos Desafios", "Tirou nota máxima em 5 quizzes", "🎯", 5, MilestoneType.PERFECT_QUIZ),
  )

  fun avatarOptions(): List<String> = listOf("🦁", "🐑", "🕊️", "🦊", "🐻", "🐰", "🦋", "🌟")
}
