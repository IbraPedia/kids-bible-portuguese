package com.example.model

fun a(
  name: String,
  robe: Long,
  hair: Long,
  mood: CharacterMood,
  prop: SceneProp = SceneProp.NONE,
  scale: Float = 1f,
): SceneActor = SceneActor(name, robe, hair, mood, prop, scale)

fun sc(
  pIdx: Int,
  title: String,
  caption: String,
  bg: SceneBackdrop,
  actors: List<SceneActor>,
  accent: SceneProp = SceneProp.NONE,
): StoryScene = StoryScene(pIdx, title, caption, bg, actors, accent)

fun q(
  question: String,
  o1: String,
  o2: String,
  o3: String,
  correct: Int,
  explanation: String,
): QuizQuestion = QuizQuestion(question, listOf(o1, o2, o3), correct, explanation)

fun story(
  id: Int,
  worldId: Int,
  title: String,
  emoji: String,
  testament: Testament,
  difficulty: DifficultyLevel,
  reference: String,
  badgeTitle: String,
  badgeEmoji: String,
  moral: String,
  paragraphs: List<String>,
  scenes: List<StoryScene>,
  quiz: List<QuizQuestion>,
): BibleStory = BibleStory(
  id = id,
  worldId = worldId,
  title = title,
  emoji = emoji,
  testament = testament,
  difficulty = difficulty,
  reference = reference,
  badgeTitle = badgeTitle,
  badgeEmoji = badgeEmoji,
  moral = moral,
  paragraphs = paragraphs,
  scenes = scenes,
  quiz = quiz,
)
