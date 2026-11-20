package com.example.model

enum class Testament(val labelPt: String) {
  ANTIGO("Antigo Testamento"),
  NOVO("Novo Testamento"),
}

enum class DifficultyLevel(val labelPt: String, val badgePt: String) {
  FACIL("Iniciante (4–6 anos)", "Fácil"),
  MEDIO("Explorador (7–9 anos)", "Médio"),
  DESAFIO("Sábio (10+ anos)", "Desafio"),
}

enum class SceneBackdrop {
  GARDEN,
  OCEAN_ARK,
  DESERT,
  PALACE,
  PRISON_CELL,
  MOUNTAIN,
  RIVER,
  VILLAGE,
  TEMPLE,
  STARRY_NIGHT,
  LIONS_DEN,
  BOAT,
  STABLE,
  CROSS_SUNRISE,
  CLOUD_HEAVEN,
  THRONE,
}

enum class CharacterMood {
  HAPPY,
  BRAVE,
  WORRIED,
  SAD,
  SURPRISED,
  PEACEFUL,
  TEMPTING,
  AWED,
}

enum class SceneProp {
  NONE,
  COLORFUL_COAT,
  CLOAK_HELD,
  IRON_BARS,
  BREAD_CUP,
  RAINBOW,
  DOVE,
  ARK_BOAT,
  STAFF,
  SLINGSHOT,
  STONE,
  HARP,
  CROWN,
  LION,
  WHALE,
  FISH_BREAD,
  LAMP,
  SCROLL,
  SHEEP,
  STAR,
  ANGEL_WINGS,
  FIRE,
  CROSS,
  TREE,
  BASKET,
  TRUMPET,
}

data class SceneActor(
  val name: String,
  val robeColorHex: Long,
  val hairColorHex: Long,
  val mood: CharacterMood,
  val prop: SceneProp = SceneProp.NONE,
  val scale: Float = 1f,
)

data class StoryScene(
  val paragraphIndex: Int,
  val title: String,
  val caption: String,
  val backdrop: SceneBackdrop,
  val actors: List<SceneActor>,
  val accentProp: SceneProp = SceneProp.NONE,
)

data class QuizQuestion(
  val question: String,
  val options: List<String>,
  val correctIndex: Int,
  val explanation: String,
)

data class BibleStory(
  val id: Int,
  val worldId: Int,
  val title: String,
  val emoji: String,
  val testament: Testament,
  val difficulty: DifficultyLevel,
  val reference: String,
  val badgeTitle: String,
  val badgeEmoji: String,
  val moral: String,
  val paragraphs: List<String>,
  val scenes: List<StoryScene>,
  val quiz: List<QuizQuestion>,
)

data class StoryWorld(
  val id: Int,
  val title: String,
  val subtitle: String,
  val emoji: String,
  val testament: Testament,
  val accentColorHex: Long,
  val cardTintHex: Long,
)

enum class MilestoneType {
  STORIES_READ,
  STREAK_DAYS,
  PERFECT_QUIZ,
}

data class MilestoneBadge(
  val id: String,
  val title: String,
  val description: String,
  val emoji: String,
  val requiredCount: Int,
  val type: MilestoneType,
)
