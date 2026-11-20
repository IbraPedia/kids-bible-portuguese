package com.example.data.stories

import com.example.model.*

val storiesPack03: List<BibleStory> = listOf(
  story(11, 2, "Rebeca no Poço", "🏺", Testament.ANTIGO, DifficultyLevel.FACIL, "Gênesis 24", "Coração Prestativo", "💧",
    "Ser gentil e ajudar quem tem sede mostra um coração lindo aos olhos de Deus.",
    listOf(
      "Quando Isaque cresceu, Abraão enviou seu servo de confiança para encontrar uma boa esposa para ele. 🐪",
      "O servo viajou com dez camelos até chegar perto de um poço de água fresca no fim da tarde. 🌅",
      "Ele fez uma oração simples: 'Senhor, que a moça gentil que me der água e também cuidar dos camelos seja a escolhida!' 🙏",
      "Antes mesmo de terminar a oração, apareceu Rebeca com um jarro no ombro, toda sorridente e educada. 🏺",
      "Ela deu água fresca para o viajante e correu com alegria para encher o bebedouro dos dez camelos cansados! 💧",
      "O servo agradeceu a Deus na hora! Rebeca aceitou viajar e tornou-se a amada esposa de Isaque. 💛"
    ),
    listOf(
      sc(1, "Oração Perto do Poço", "O servo ora pedindo sabedoria a Deus junto aos camelos.", SceneBackdrop.DESERT, listOf(a("Servo", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.PEACEFUL, SceneProp.STAFF))),
      sc(4, "Bondade com os Camelos", "Rebeca serve água com alegria e gentileza.", SceneBackdrop.VILLAGE, listOf(a("Rebeca", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BASKET), a("Servo", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.AWED))),
      sc(5, "Novo Lar Feliz", "Rebeca e Isaque iniciam uma família abençoada.", SceneBackdrop.GARDEN, listOf(a("Isaque", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY), a("Rebeca", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("O que o servo pediu em oração perto do poço?", "Um sinal de gentileza", "Uma coroa de ouro", "Chuva forte", 0, "Ele pediu a Deus que reconhecesse a escolhida pela bondade!"),
      q("Como Rebeca tratou o viajante?", "Deu água a ele e aos camelos", "Fechou o poço", "Saiu correndo", 0, "Rebeca foi super prestativa com ele e os dez camelos."),
      q("O que Rebeca carregava no ombro?", "Um jarro de água", "Uma espada", "Um tambor", 0, "Ela carregava um jarro para buscar água no poço."),
      q("Quem se casou com Rebeca?", "Isaque", "Noé", "Davi", 0, "Rebeca se casou com Isaque e formaram uma linda família."),
      q("Que qualidade bonita Rebeca mostrou?", "Bondade e disposição em ajudar", "Preguiça", "Teimosia", 0, "Ajudar com alegria faz toda a diferença!")
    )
  ),
  story(12, 2, "Jacó e Esaú", "🍲", Testament.ANTIGO, DifficultyLevel.MEDIO, "Gênesis 25 e 27", "Verdade e Perdão", "🤝",
    "Contar a verdade e valorizar a família vale muito mais do que qualquer prêmio.",
    listOf(
      "Isaque e Rebeca tiveram dois filhos gêmeos bem diferentes: Esaú era caçador corajoso e Jacó gostava de ficar perto das tendas. ⛺",
      "Certo dia, Esaú chegou com muita fome e trocou seu direito especial de filho mais velho por um prato de sopa quentinha! 🍲",
      "Mais tarde, Jacó enganou seu pai Isaque para receber a bênção especial no lugar do irmão. 😔",
      "Quando Esaú descobriu, ficou muito chateado e Jacó precisou viajar para bem longe por muitos anos. 🚶",
      "Mas o tempo e o amor de Deus transformaram o coração dos dois irmãos! 🙏",
      "Quando finalmente se reencontraram, Esaú correu para abraçar Jacó e os dois choraram de alegria pelo perdão! 🤗"
    ),
    listOf(
      sc(1, "O Prato de Sopa", "Esaú com fome troca sua primogenitura com Jacó.", SceneBackdrop.VILLAGE, listOf(a("Esaú", 0xFFE76F51, 0xFF5C2E1E, CharacterMood.WORRIED), a("Jacó", 0xFF3E92CC, 0xFF3A2820, CharacterMood.SURPRISED, SceneProp.BREAD_CUP))),
      sc(3, "Viagem Distante", "Jacó parte pensativo em busca de recomeço.", SceneBackdrop.DESERT, listOf(a("Jacó", 0xFF3E92CC, 0xFF3A2820, CharacterMood.SAD, SceneProp.STAFF))),
      sc(5, "O Abraço do Perdão", "Jacó e Esaú fazem as pazes com um abraço sincero.", SceneBackdrop.MOUNTAIN, listOf(a("Jacó", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Esaú", 0xFFE76F51, 0xFF5C2E1E, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Quem eram os dois irmãos gêmeos?", "Jacó e Esaú", "Caim e Abel", "Pedro e João", 0, "Isaque e Rebeca eram pais dos gêmeos Jacó e Esaú."),
      q("Pelo que Esaú trocou seu direito de primogênito?", "Por um prato de sopa", "Por um cavalo", "Por ouro", 0, "Com pressa e fome, trocou algo precioso por uma sopa."),
      q("O que Jacó fez de errado antes de viajar?", "Enganou o pai e o irmão", "Quebrou o arco", "Dormiu na aula", 0, "Jacó fingiu ser Esaú para pegar a bênção."),
      q("Como foi o reencontro anos depois?", "Com um grande abraço e perdão", "Com guerra", "Não se falaram", 0, "Eles se perdoaram e se abraçaram com alegria!"),
      q("Qual é a lição principal?", "Sempre dizer a verdade e saber perdoar", "Enganar os irmãos", "Guardar mágoa", 0, "A verdade e o perdão restauram qualquer amizade.")
    )
  ),
  story(13, 2, "A Escada de Jacó", "🪜", Testament.ANTIGO, DifficultyLevel.FACIL, "Gênesis 28", "Sonho do Céu", "👼",
    "Mesmo quando estamos longe de casa, Deus está bem pertinho cuidando de nós.",
    listOf(
      "Na primeira noite longe de casa, Jacó estava sozinho no campo e usou uma pedra como travesseiro para dormir. 🪨",
      "Enquanto dormia profundamente sob o céu estrelado, Jacó teve o sonho mais lindo da sua vida! 💤",
      "Ele viu uma escada brilhante que ia da terra até o céu, com anjinhos subindo e descendo cheia de luz! 👼✨",
      "No alto da escada, Deus falou com carinho: 'Eu estou com você, Jacó! Vou proteger você por onde andar.' ❤️",
      "Jacó acordou admirado e disse: 'Com certeza Deus está neste lugar, e eu nem sabia!' 😲",
      "Ele chamou o lugar de Betel, 'Casa de Deus', e seguiu viagem cheio de coragem e paz! 🌟"
    ),
    listOf(
      sc(0, "Dormindo ao Relento", "Jacó descansa sob as estrelas com uma pedra.", SceneBackdrop.STARRY_NIGHT, listOf(a("Jacó", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.STONE)), SceneProp.STAR),
      sc(2, "A Escada de Luz e Anjos", "Anjos luminosos descem e sobem no sonho de Jacó.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Anjo 1", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS), a("Anjo 2", 0xFFE1F2FC, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS)), SceneProp.STAR),
      sc(5, "Coração Corajoso", "Jacó acorda animado sabendo que Deus o acompanha.", SceneBackdrop.MOUNTAIN, listOf(a("Jacó", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.STAFF))),
    ),
    listOf(
      q("O que Jacó usou como travesseiro?", "Uma pedra", "Um livro", "Uma bolsa", 0, "Ele apoiou a cabeça em uma pedra para descansar."),
      q("O que Jacó viu em seu sonho?", "Uma escada até o céu com anjos", "Um dragão", "Um navio voador", 0, "Ele sonhou com anjos subindo e descendo uma escada até o céu."),
      q("O que Deus prometeu no sonho?", "Que estaria sempre com Jacó", "Que ia chover pedra", "Que ele ficaria sozinho", 0, "Deus garantiu proteção e presença por onde ele fosse."),
      q("Como Jacó chamou aquele lugar?", "Betel, a Casa de Deus", "Castelo Forte", "Vale Escuro", 0, "Betel significa Casa de Deus!"),
      q("Onde Deus está quando nos sentimos sozinhos?", "Sempre pertinho de nós", "Muito distante", "Só nos domingos", 0, "Deus está conosco em todos os lugares e momentos!")
    )
  ),
  story(14, 2, "Jacó e Raquel", "🐑", Testament.ANTIGO, DifficultyLevel.MEDIO, "Gênesis 29", "Amor Paciente", "💐",
    "O amor verdadeiro é paciente e sabe esperar com alegria e dedicação.",
    listOf(
      "Seguindo viagem, Jacó chegou a uma terra bonita e encontrou pastores perto de um poço com suas ovelhinhas. 🐑",
      "Logo chegou Raquel, sua prima gentil, trazendo o rebanho do pai dela. Jacó ajudou a tirar a pedra pesada do poço! 💪",
      "Jacó ficou encantado com o carinho e a alegria de Raquel e pediu ao pai dela, Labão, para se casar com ela. 💐",
      "Labão disse que Jacó precisaria trabalhar sete anos cuidando das ovelhas antes do casamento! ⏳",
      "Por amar tanto Raquel, os sete anos passaram tão rápido para Jacó que pareceram apenas alguns dias! ❤️",
      "Mesmo com obstáculos pelo caminho, a paciência de Jacó foi recompensada e eles formaram uma grande família! 👨‍👩‍👧‍👦"
    ),
    listOf(
      sc(1, "Ajuda no Poço", "Jacó ajuda Raquel a dar água às ovelhinhas.", SceneBackdrop.GARDEN, listOf(a("Jacó", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.SHEEP), a("Raquel", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.HAPPY))),
      sc(4, "Sete Anos de Trabalho", "Jacó cuida das ovelhas com paciência e sorriso.", SceneBackdrop.MOUNTAIN, listOf(a("Jacó", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.STAFF)), SceneProp.SHEEP),
      sc(5, "A União Feliz", "Jacó e Raquel celebram a família abençoada.", SceneBackdrop.VILLAGE, listOf(a("Jacó", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Raquel", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Onde Jacó conheceu Raquel?", "Perto de um poço com ovelhas", "Num navio", "Numa caverna", 0, "Raquel estava levando ovelhas para beber água no poço."),
      q("O que Jacó fez para ajudar Raquel?", "Tirou a pedra pesada do poço", "Escondeu os baldes", "Subiu na árvore", 0, "Jacó foi gentil e abriu o poço para as ovelhas beberem."),
      q("Quantos anos Jacó trabalhou por Raquel?", "Sete anos", "Dois dias", "Cem anos", 0, "Jacó trabalhou sete anos com dedicação!"),
      q("Por que os sete anos pareceram rápidos?", "Porque ele a amava muito", "Porque ele dormiu muito", "Porque tinha relógio quebrado", 0, "O amor torna a espera leve e cheia de esperança."),
      q("Que virtude Jacó demonstrou?", "Paciência e trabalho dedicado", "Pressa", "Raiva", 0, "Ter paciência nos ajuda a conquistar coisas boas.")
    )
  ),
  story(15, 2, "José e a Túnica Colorida", "🎨", Testament.ANTIGO, DifficultyLevel.FACIL, "Gênesis 37", "Túnica de Arco-Íris", "🌈",
    "Deus tem planos lindos para cada um de nós, mesmo antes de entendermos.",
    listOf(
      "Jacó teve doze filhos, e um dos mais novos era José, um menino alegre, honesto e sonhador. 😊",
      "Seu pai amava tanto José que lhe deu de presente uma túnica linda, cheia de cores vibrantes como um arco-íris! 🌈",
      "Uma noite, José sonhou que feixes de trigo se curvavam para o seu feixe, e que o sol, a lua e onze estrelas o saudavam! ⭐",
      "Quando José contou os sonhos, seus irmãos mais velhos ficaram com ciúmes da túnica e dos sonhos especiais. 😠",
      "Devemos lembrar de nunca deixar o ciúme entrar no coração quando um amigo ou irmão ganha algo bonito! 💛",
      "Deus já estava preparando um futuro incrível para José ajudar muitas famílias! ✨"
    ),
    listOf(
      sc(1, "A Túnica Colorida", "Jacó entrega a linda túnica colorida para José.", SceneBackdrop.VILLAGE, listOf(a("Jacó", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.HAPPY), a("José", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.COLORFUL_COAT))),
      sc(2, "Os Sonhos de José", "José sonha com estrelas e feixes dourados.", SceneBackdrop.STARRY_NIGHT, listOf(a("José", 0xFFF2A93B, 0xFF3A2820, CharacterMood.AWED, SceneProp.COLORFUL_COAT)), SceneProp.STAR),
      sc(3, "Ciúme dos Irmãos", "Os irmãos olham emburrados enquanto José sorri inocente.", SceneBackdrop.GARDEN, listOf(a("José", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.COLORFUL_COAT), a("Irmão", 0xFFE76F51, 0xFF2D2520, CharacterMood.WORRIED))),
    ),
    listOf(
      q("Que presente especial José recebeu do pai?", "Uma túnica bem colorida", "Uma coroa de ferro", "Um barco", 0, "Jacó presenteou José com uma bela túnica colorida!"),
      q("O que apareceu no segundo sonho de José?", "O sol, a lua e onze estrelas", "Peixes voadores", "Montanhas de gelo", 0, "Ele sonhou com o sol, a lua e onze estrelas se curvando."),
      q("Como os irmãos se sentiram com os sonhos?", "Com ciúmes", "Super felizes", "Com sono", 0, "Infelizmente os irmãos deixaram o ciúme crescer."),
      q("Quantos filhos Jacó tinha ao todo?", "Doze filhos", "Dois filhos", "Cinquenta", 0, "José fazia parte de uma família grande com doze irmãos!"),
      q("O que devemos sentir quando alguém ganha um presente?", "Alegria pelo amigo, sem ciúme", "Raiva", "Tristeza", 0, "Celebrar a alegria do próximo deixa o coração em paz.")
    )
  ),
)
