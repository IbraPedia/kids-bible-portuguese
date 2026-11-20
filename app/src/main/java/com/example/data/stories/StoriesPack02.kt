package com.example.data.stories

import com.example.model.*

val storiesPack02: List<BibleStory> = listOf(
  story(6, 1, "A Torre de Babel", "🧱", Testament.ANTIGO, DifficultyLevel.MEDIO, "Gênesis 11", "Vozes Unidas", "🗣️",
    "A verdadeira grandeza está em honrar a Deus, não em querer ser mais famoso que Ele.",
    listOf(
      "Muitos anos depois de Noé, todas as pessoas da terra falavam exatamente a mesma língua e viajavam juntas. 🗣️",
      "Elas chegaram a uma grande planície e disseram: 'Vamos fazer tijolos e construir uma torre altíssima até as nuvens!' 🧱",
      "O problema é que queriam ficar famosas sozinhas e esqueceram de perguntar o que Deus desejava para elas. 😔",
      "Deus viu que o orgulho estava crescendo no coração do povo e decidiu mudar um detalhe bem curioso! ✨",
      "De repente, um falava 'tijolo' e o outro entendia algo diferente! Ninguém conseguia mais entender o colega. 🤷",
      "Assim a torre parou e as famílias se espalharam por todo o planeta, formando povos e idiomas lindos pelo mundo. 🌍"
    ),
    listOf(
      sc(1, "Construindo Tijolos", "Pessoas empilham tijolos para fazer uma torre enorme.", SceneBackdrop.DESERT, listOf(a("Construtor", 0xFFE76F51, 0xFF3A2820, CharacterMood.BRAVE), a("Ajudante", 0xFFF2A93B, 0xFF4A3525, CharacterMood.HAPPY))),
      sc(4, "Idiomas Diferentes", "Os construtores ficam surpresos sem entender uns aos outros.", SceneBackdrop.VILLAGE, listOf(a("Mestre", 0xFFE76F51, 0xFF3A2820, CharacterMood.SURPRISED), a("Colega", 0xFF3E92CC, 0xFF2D2520, CharacterMood.WORRIED))),
      sc(5, "Povos pelo Mundo", "Famílias seguem caminhos diferentes sob o céu azul.", SceneBackdrop.MOUNTAIN, listOf(a("Viajante", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL, SceneProp.STAFF)), SceneProp.RAINBOW),
    ),
    listOf(
      q("O que o povo queria construir em Babel?", "Um navio", "Uma torre até o céu", "Um parquinho", 1, "Eles queriam erguer uma torre que chegasse até o céu."),
      q("Qual foi o erro do coração deles?", "O orgulho de esquecer de Deus", "Fazer tijolos fortes", "Cantar músicas", 0, "Eles queriam se exaltar sozinhos e esqueceram de Deus."),
      q("O que Deus fez para parar a construção?", "Confundiu as línguas que falavam", "Mandou um tornado", "Derrubou os baldes", 0, "Cada grupo começou a falar um idioma diferente!"),
      q("O que aconteceu depois que não se entendiam?", "Espalharam-se por toda a terra", "Fizeram silêncio para sempre", "Moraram na água", 0, "Os povos se espalharam por diversas regiões do mundo."),
      q("O que essa história ensina?", "Ter humildade e incluir Deus nos planos", "Gritar bem alto", "Fazer muros grandes", 0, "Devemos ser humildes e lembrar de Deus em tudo.")
    )
  ),
  story(7, 1, "O Chamado de Abraão", "✨", Testament.ANTIGO, DifficultyLevel.FACIL, "Gênesis 12 e 15", "Estrelas da Fé", "🌟",
    "Quando confiamos na direção de Deus, Ele guia cada passo da nossa jornada.",
    listOf(
      "Abraão morava numa cidade distante com sua esposa Sara. Um dia, Deus falou com ele de forma muito especial! 🐪",
      "Deus disse: 'Deixe sua terra e vá para um lugar novo que Eu vou mostrar. Farei de você uma grande bênção!' 🗺️",
      "Mesmo sem saber exatamente para onde ia, Abraão arrumou as tendas, chamou Sara e seguiu confiando em Deus. ⛺",
      "Em uma noite bem escura, Deus levou Abraão para fora da tenda e pediu: 'Olhe para o céu e tente contar as estrelas!' 🌟",
      "Eram tantas estrelinhas brilhando! Deus prometeu que a família de Abraão seria tão numerosa quanto aquelas estrelas. ✨",
      "Abraão acreditou de todo coração e ficou conhecido como o grande amigo da fé! 💛"
    ),
    listOf(
      sc(2, "A Grande Viagem", "Abraão e Sara caminham confiantes pelo deserto.", SceneBackdrop.DESERT, listOf(a("Abraão", 0xFF3E92CC, 0xFFCCCCCC, CharacterMood.BRAVE, SceneProp.STAFF), a("Sara", 0xFFF2A93B, 0xFF8B6F5C, CharacterMood.HAPPY))),
      sc(3, "Contando as Estrelas", "Abraão olha maravilhado para o céu estrelado.", SceneBackdrop.STARRY_NIGHT, listOf(a("Abraão", 0xFF3E92CC, 0xFFCCCCCC, CharacterMood.AWED)), SceneProp.STAR),
      sc(5, "Promessa de Amor", "Um coração cheio de fé sorri com gratidão.", SceneBackdrop.MOUNTAIN, listOf(a("Abraão", 0xFF3E92CC, 0xFFCCCCCC, CharacterMood.PEACEFUL), a("Sara", 0xFFF2A93B, 0xFF8B6F5C, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Quem Deus chamou para viajar a uma nova terra?", "Abraão", "Golias", "Faraó", 0, "Deus chamou Abraão e prometeu abençoá-lo."),
      q("Como Abraão reagiu ao chamado?", "Ficou com medo e não foi", "Obedeceu e partiu com fé", "Escondeu o mapa", 1, "Abraão confiou em Deus e saiu em viagem com Sara."),
      q("O que Deus mostrou no céu à noite?", "Nuvens de chuva", "Muitas estrelas brilhantes", "Balões", 1, "Deus mostrou as incontáveis estrelas como sinal da promessa."),
      q("Quem acompanhava Abraão na viagem?", "Sua esposa Sara", "Dez soldados", "Um rei", 0, "Sua esposa querida, Sara, caminhava ao seu lado."),
      q("Como Abraão ficou conhecido?", "Como o pai da fé", "Como o rei do gelo", "Como marinheiro", 0, "Abraão é lembrado até hoje por sua grande fé!")
    )
  ),
  story(8, 1, "Ló e a Cidade Protegida", "🏃", Testament.ANTIGO, DifficultyLevel.DESAFIO, "Gênesis 19", "Caminho Seguro", "🕊️",
    "Quando Deus nos mostra o caminho seguro, devemos seguir em frente sem olhar para trás.",
    listOf(
      "Ló era sobrinho de Abraão e morava com sua família em uma cidade chamada Sodoma, onde havia muita maldade. 🏙️",
      "Abraão orou muito para que Deus protegesse Ló. Então Deus enviou dois anjos gentis para avisá-lo do perigo! 👼",
      "Os anjos seguraram as mãos de Ló, de sua esposa e suas filhas dizendo: 'Saiam depressa para as montanhas e não olhem para trás!' ⛰️",
      "Eles correram pela estrada enquanto o sol nascia no horizonte, buscando abrigo seguro bem longe dali. 🌅",
      "Ló e suas filhas obedeceram até chegar à cidadezinha de Zoar, mas sua esposa olhou para trás e virou estátua de sal. 🧂",
      "Deus ouviu as orações de Abraão e salvou Ló, mostrando que cuidar de quem amamos por meio da oração tem valor! 🙏"
    ),
    listOf(
      sc(1, "Os Anjos Avisam Ló", "Dois anjos luminosos chegam para ajudar Ló.", SceneBackdrop.VILLAGE, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.BRAVE, SceneProp.ANGEL_WINGS), a("Ló", 0xFF43A06A, 0xFF4A3525, CharacterMood.SURPRISED))),
      sc(3, "Correndo para as Montanhas", "Ló guia suas filhas pelo caminho seguro.", SceneBackdrop.MOUNTAIN, listOf(a("Ló", 0xFF43A06A, 0xFF4A3525, CharacterMood.BRAVE, SceneProp.STAFF), a("Filha", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.WORRIED))),
      sc(5, "Salvos pela Oração", "A família chega segura ao nascer do sol.", SceneBackdrop.CROSS_SUNRISE, listOf(a("Ló", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL)), SceneProp.DOVE),
    ),
    listOf(
      q("Quem orou para Deus proteger Ló?", "Abraão", "Golias", "Caim", 0, "Abraão era tio de Ló e orou por ele com carinho."),
      q("Quem Deus enviou para avisar Ló?", "Dois anjos", "Dois leões", "Dois barcos", 0, "Dois anjos ajudaram Ló e sua família a sair a tempo."),
      q("Qual instrução importante os anjos deram?", "Não olhar para trás", "Pular no rio", "Sentar no muro", 0, "Eles pediram para correr para a montanha sem olhar para trás."),
      q("Para onde Ló e as filhas foram?", "Para um lugar seguro nas montanhas", "Para uma caverna escura", "Para o fundo do mar", 0, "Eles chegaram em segurança à cidadezinha perto das montanhas."),
      q("O que aprendemos sobre a oração?", "Orar pelos outros ajuda e abençoa", "Não serve para nada", "Só adultos podem orar", 0, "As orações feitas com amor chegam até Deus!")
    )
  ),
  story(9, 1, "O Nascimento de Isaque", "👶", Testament.ANTIGO, DifficultyLevel.FACIL, "Gênesis 18 e 21", "Sorriso de Deus", "😄",
    "Para Deus nunca é tarde demais para realizar uma linda promessa.",
    listOf(
      "Abraão e Sara já tinham cabelinhos brancos de tanta idade e ainda não tinham nenhum filho em casa. 👵👴",
      "Um dia, três visitantes especiais apareceram perto da tenda e disseram: 'No ano que vem, Sara terá um bebê!' 🍼",
      "Sara ouviu escondida e deu uma risadinha baixinha pensando: 'Eu já sou velhinha, será mesmo verdade?' 😄",
      "Mas para o nosso Deus poderoso não existe nada impossível! Ele conhece o tempo perfeito para todas as coisas. ⏰",
      "Exatamente como Deus havia prometido, nasceu um menininho lindo! Eles o chamaram de Isaque, que significa 'riso'! 👶",
      "A tenda se encheu de gargalhadas, abraços e alegria, porque a promessa de Deus virou realidade! 🎉"
    ),
    listOf(
      sc(1, "A Visita Especial", "Visitantes trazem a boa notícia na tenda de Abraão.", SceneBackdrop.DESERT, listOf(a("Abraão", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.AWED), a("Sara", 0xFFF2A93B, 0xFFEEEEEE, CharacterMood.SURPRISED))),
      sc(4, "O Bebê Isaque Nasceu!", "Abraão e Sara sorriem felizes com o pequeno Isaque.", SceneBackdrop.VILLAGE, listOf(a("Abraão", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.HAPPY), a("Sara", 0xFFF2A93B, 0xFFEEEEEE, CharacterMood.HAPPY, SceneProp.BASKET))),
      sc(5, "Alegria na Família", "Todos celebram o sorriso que Deus deu.", SceneBackdrop.GARDEN, listOf(a("Isaque", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Qual era o nome do filho de Abraão e Sara?", "Isaque", "Davi", "Jonas", 0, "O menino recebeu o nome de Isaque."),
      q("O que significa o nome Isaque?", "Riso ou alegria", "Tempestade", "Pedra", 0, "Isaque significa riso, por causa da grande alegria!"),
      q("Por que Sara ficou surpresa com a notícia?", "Porque ela e Abraão já eram bem velhinhos", "Porque não gostavam de tendas", "Porque era inverno", 0, "Eles já tinham muita idade, mas Deus fez um milagre."),
      q("O que esta história mostra sobre Deus?", "Nada é impossível para Ele", "Ele esquece promessas", "Só ajuda crianças", 0, "Deus sempre cumpre Suas promessas no momento certo!"),
      q("Como ficou a casa quando Isaque nasceu?", "Cheia de alegria e gratidão", "Vazia", "Silenciosa", 0, "Houve muita festa e gratidão a Deus.")
    )
  ),
  story(10, 1, "O Carneirinho no Monte", "🐏", Testament.ANTIGO, DifficultyLevel.DESAFIO, "Gênesis 22", "Deus Provedor", "⛰️",
    "Deus vê o amor no coração de quem confia Nele e sempre provê o que precisamos.",
    listOf(
      "Isaque cresceu forte e carinhoso. Um dia, Deus quis ver o quanto o coração de Abraão confiava Nele completamente. ❤️",
      "Abraão subiu um monte alto com Isaque levando lenha. No caminho, Isaque perguntou: 'Papai, cadê o carneirinho para a oferta?' 🐑",
      "Abraão respondeu cheio de fé: 'Deus mesmo vai providenciar o cordeirinho, meu filho.' ⛰️",
      "Quando chegaram ao topo e mostraram total obediência, um anjo chamou do céu: 'Abraão! Não faça mal algum ao menino!' 👼",
      "Abraão olhou para o lado e viu um carneirinho preso entre os arbustos, exatamente o que precisavam para agradecer a Deus! 🐏",
      "Eles abraçaram-se emocionados e chamaram aquele lugar de 'O Senhor Proverá', porque Deus nunca falha! 🌟"
    ),
    listOf(
      sc(1, "Subindo o Monte", "Abraão e Isaque caminham juntos com fé.", SceneBackdrop.MOUNTAIN, listOf(a("Abraão", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.PEACEFUL, SceneProp.STAFF), a("Isaque", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY))),
      sc(3, "O Anjo do Céu", "O anjo fala do alto trazendo paz e alívio.", SceneBackdrop.MOUNTAIN, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.BRAVE, SceneProp.ANGEL_WINGS), a("Abraão", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.SURPRISED))),
      sc(4, "O Carneirinho Providenciado", "Abraão e Isaque veem o carneirinho enviado por Deus.", SceneBackdrop.GARDEN, listOf(a("Isaque", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.SHEEP), a("Abraão", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.AWED))),
    ),
    listOf(
      q("O que Isaque perguntou enquanto subiam o monte?", "Onde está o cordeirinho?", "Que horas vamos lanchar?", "Onde está o mar?", 0, "Isaque perguntou onde estava o carneirinho da oferta."),
      q("O que Abraão respondeu?", "Deus vai providenciar", "Esquecemos em casa", "Não sei", 0, "Abraão confiou que Deus mesmo cuidaria de tudo!"),
      q("Quem falou do céu para parar Abraão?", "Um anjo do Senhor", "Um rei", "Um soldado", 0, "O anjo do Senhor protegeu Isaque."),
      q("O que apareceu nos arbustos?", "Um carneirinho", "Um barco", "Um tesouro", 0, "Deus enviou um carneirinho para a oferta de gratidão."),
      q("O que significa 'O Senhor Proverá'?", "Deus cuida e dá o que precisamos", "O dia acabou", "O monte é alto", 0, "Mostra que Deus nunca desampara quem confia Nele.")
    )
  ),
)
