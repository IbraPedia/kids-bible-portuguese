package com.example.data.stories

import com.example.model.*

val storiesPack05: List<BibleStory> = listOf(
  story(21, 3, "O Bebê Moisés no Cesto", "🧺", Testament.ANTIGO, DifficultyLevel.FACIL, "Êxodo 1–2", "Cesto Protegido", "🌿",
    "Deus protege até os pequeninos de maneiras surpreendentes.",
    listOf(
      "Muitos anos depois, um novo Faraó governava o Egito e não se lembrava de José. Ele tinha medo dos hebreus e criou regras duras. 😔",
      "Uma mamãe muito corajosa chamada Joquebede teve um bebê lindo, mas precisava protegê-lo do perigo. 👶",
      "Ela teceu um cestinho de junco bem firme, passou betume para não entrar água e colocou o bebê suavemente no rio Nilo! 🧺",
      "Miriã, a irmã mais velha do bebê, ficou escondidinha entre os juncos vigiando o cestinho flutuar nas águas calmas. 👀",
      "Logo a filha do Faraó veio se banhar no rio, viu o cestinho e ficou encantada com o bebê chorando baixinho! 👑",
      "Miriã correu e sugeriu a própria mamãe para cuidar dele! A princesa o chamou de Moisés, 'tirado das águas'. 💧"
    ),
    listOf(
      sc(2, "O Cestinho no Rio", "A mamãe coloca o bebê Moisés no cesto entre os juncos.", SceneBackdrop.RIVER, listOf(a("Joquebede", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.BASKET), a("Miriã", 0xFFF2A93B, 0xFF3A2820, CharacterMood.BRAVE))),
      sc(4, "A Princesa Encontra Moisés", "A filha do Faraó sorri ao abrir o cestinho seguro.", SceneBackdrop.RIVER, listOf(a("Princesa", 0xFFE76F51, 0xFF1F1A18, CharacterMood.SURPRISED, SceneProp.CROWN), a("Miriã", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BASKET))),
      sc(5, "Seguro no Palácio", "Moisés cresce protegido nos planos de Deus.", SceneBackdrop.PALACE, listOf(a("Moisés", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.BASKET),
    ),
    listOf(
      q("Onde a mamãe colocou o bebê Moisés?", "Num cestinho impermeável no rio", "Num baú de ferro", "Numa árvore", 0, "Ela preparou um cestinho seguro entre os juncos do rio Nilo."),
      q("Quem ficou vigiando o cesto de perto?", "Sua irmã Miriã", "Um soldado", "Um pescador", 0, "Miriã acompanhou tudo com muito cuidado!"),
      q("Quem encontrou o bebê no rio?", "A filha do Faraó", "A rainha de Sabá", "Um mercador", 0, "A princesa do Egito viu o cestinho e amou o bebê."),
      q("O que significa o nome Moisés?", "Tirado das águas", "Rei forte", "Luz do sol", 0, "Ele recebeu esse nome porque foi salvo das águas do rio."),
      q("Quem cuidou de Moisés em sua infância?", "Sua própria mamãe chamada por Miriã", "Ninguém", "Os guardas", 0, "Deus preparou até para sua mamãe cuidar dele!")
    )
  ),
  story(22, 3, "Moisés e a Sarça Ardente", "🔥", Testament.ANTIGO, DifficultyLevel.MEDIO, "Êxodo 3", "Chamado de Luz", "🌿",
    "Deus nos capacita mesmo quando achamos que somos pequenos ou tímidos.",
    listOf(
      "Moisés cresceu e foi morar no deserto trabalhando como pastor de ovelhas tranquilas. 🐑",
      "Um dia, perto do monte Horebe, ele viu algo incrível: um arbusto pegando fogo sem nunca queimar suas folhinhas! 🔥",
      "Curioso, Moisés se aproximou e ouviu a voz de Deus chamar: 'Moisés, tire as sandálias, pois este chão é santo!' 👣",
      "Deus disse que havia ouvido o choro do Seu povo no Egito e escolhera Moisés para libertar todos eles! ✨",
      "Moisés ficou tímido: 'Quem sou eu? Eu nem sei falar muito bem!' Mas Deus garantiu: 'Eu estarei com você!' 💪",
      "Para dar confiança, Deus transformou o cajado de Moisés em um sinal de poder e enviou seu irmão Arão para ajudá-lo. 🪄"
    ),
    listOf(
      sc(1, "O Arbusto que Não Queima", "Moisés observa maravilhado a sarça cheia de fogo dourado.", SceneBackdrop.DESERT, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.AWED, SceneProp.FIRE)), SceneProp.FIRE),
      sc(3, "A Missão de Deus", "Moisés ouve com reverência o chamado do Senhor.", SceneBackdrop.MOUNTAIN, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.SURPRISED, SceneProp.STAFF)), SceneProp.FIRE),
      sc(5, "Prontos para Partir", "Moisés e Arão caminham juntos com o cajado.", SceneBackdrop.DESERT, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.BRAVE, SceneProp.STAFF), a("Arão", 0xFF3E92CC, 0xFF4A3525, CharacterMood.HAPPY))),
    ),
    listOf(
      q("O que Moisés viu pegando fogo sem queimar?", "Uma sarça (arbusto)", "Uma casa", "Um barco", 0, "Era uma sarça ardente cheia da presença de Deus!"),
      q("O que Deus pediu para Moisés tirar dos pés?", "As sandálias", "O chapéu", "A capa", 0, "Ele tirou as sandálias em sinal de respeito em terra santa."),
      q("Qual missão Deus deu a Moisés?", "Libertar o povo do Egito", "Construir uma torre", "Pescar baleias", 0, "Deus o escolheu para guiar o povo rumo à liberdade."),
      q("Quem Deus enviou para ajudar Moisés a falar?", "Seu irmão Arão", "Davi", "Jonas", 0, "Arão caminhou com Moisés como porta-voz."),
      q("O que Deus diz quando sentimos medo?", "Eu estarei com você!", "Vá sozinho", "Volte para casa", 0, "A presença de Deus nos dá coragem para qualquer missão!")
    )
  ),
  story(23, 3, "As Pragas do Egito", "🐸", Testament.ANTIGO, DifficultyLevel.DESAFIO, "Êxodo 7–11", "Força Maior", "⚡",
    "O coração teimoso traz dificuldades, mas ninguém pode impedir os planos de Deus.",
    listOf(
      "Moisés e Arão foram até o palácio e disseram ao Faraó: 'Deus manda deixar Seu povo ir embora livre!' 🏛️",
      "Mas Faraó endureceu o coração e disse: 'Não vou deixar ninguém sair daqui!' 😠",
      "Então Deus mostrou Seu grande poder com dez sinais impressionantes para convencer o rei teimoso. ⚡",
      "O rio ficou vermelho, rãs pularam por toda parte, nuvens de mosquitos e gafanhotos cobriram o céu e até o dia escureceu! 🐸🦗",
      "Cada vez que Faraó prometia soltar o povo, depois mudava de ideia quando o alívio chegava. 😔",
      "Mas Deus protegeu o bairro onde Seu povo morava, mostrando que Ele cuida de Seus filhos! 🛡️"
    ),
    listOf(
      sc(0, "Diante do Faraó", "Moisés e Arão pedem liberdade ao rei do Egito.", SceneBackdrop.THRONE, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.BRAVE, SceneProp.STAFF), a("Faraó", 0xFFF2A93B, 0xFF1F1A18, CharacterMood.WORRIED, SceneProp.CROWN))),
      sc(3, "Os Sinais de Deus", "Faraó se assusta com os sinais poderosos no Egito.", SceneBackdrop.PALACE, listOf(a("Faraó", 0xFFF2A93B, 0xFF1F1A18, CharacterMood.SURPRISED, SceneProp.CROWN), a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.BRAVE, SceneProp.STAFF))),
      sc(5, "Povo Protegido", "Luz suave brilha sobre as casas do povo de Deus.", SceneBackdrop.VILLAGE, listOf(a("Família", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.LAMP)), SceneProp.STAR),
    ),
    listOf(
      q("O que Moisés pediu ao Faraó?", "Para deixar o povo livre", "Por um carro de ouro", "Por um jardim", 0, "Moisés pediu a liberdade do povo de Israel."),
      q("Quantas pragas Deus enviou ao Egito?", "Dez pragas", "Duas pragas", "Cem pragas", 0, "Foram dez sinais para mostrar que só Deus é o Senhor."),
      q("Por que as pragas aconteceram?", "Porque Faraó foi teimoso e não obedeceu", "Porque Moisés quis brincar", "Por acaso", 0, "Faraó sempre endurecia o coração e voltava atrás."),
      q("O povo de Deus ficou desprotegido?", "Não, Deus protegeu Seu povo", "Sim, ficou no escuro", "Sumiu", 0, "Deus guardou Seu povo em segurança durante os sinais."),
      q("O que aprendemos sobre a teimosia?", "Ouvir e obedecer evita sofrimentos", "Teimar é legal", "Nunca pedir desculpas", 0, "Ter um coração humilde e obediente traz bênçãos!")
    )
  ),
  story(24, 3, "A Primeira Páscoa", "🐑", Testament.ANTIGO, DifficultyLevel.MEDIO, "Êxodo 12", "Noite de Livramento", "🚪",
    "Deus protege Sua família e prepara o caminho para uma nova vida livre.",
    listOf(
      "Antes do último sinal no Egito, Deus deu uma instrução muito especial para todas as famílias de Israel. 🏠",
      "Cada família preparou um jantar simples com pão sem fermento e marcou os batentes da porta com cuidado. 🚪",
      "Eles comeram já vestidos com sandálias nos pés e cajados na mão, prontinhos para a grande viagem da liberdade! 🥾",
      "Naquela noite, o anjo passou por cima das casas marcadas e manteve todas as crianças e famílias em total segurança. 👼",
      "Finalmente o Faraó chamou Moisés de madrugada dizendo: 'Levem tudo e vão embora adorar o Deus de vocês!' 📢",
      "Aquela noite foi chamada de Páscoa, que lembra a passagem da escravidão para a alegria da liberdade! 🎉"
    ),
    listOf(
      sc(1, "A Marca na Porta", "A família prepara o jantar de Páscoa dentro de casa.", SceneBackdrop.VILLAGE, listOf(a("Pai", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL, SceneProp.LAMP), a("Criança", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(3, "Anjo Guardião", "A luz protetora passa sobre as casas do povo.", SceneBackdrop.STARRY_NIGHT, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.BRAVE, SceneProp.ANGEL_WINGS)), SceneProp.STAR),
      sc(5, "Partida em Liberdade", "Todos caminham alegres rumo à nova vida.", SceneBackdrop.DESERT, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.STAFF), a("Família", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Como as famílias se prepararam para viajar?", "Com sandálias nos pés e jantar rápido", "Dormindo até tarde", "De pijama", 0, "Elas já ficaram prontinhas com sandálias e cajados!"),
      q("Qual pão comeram naquela noite?", "Pão sem fermento", "Bolo de festa", "Pizza", 0, "Comeram pão sem fermento porque sairiam bem depressa."),
      q("O que aconteceu com as casas que obedeceram?", "Ficaram totalmente protegidas", "Caíram", "Ficaram sem teto", 0, "Todas as famílias que obedeceram foram guardadas por Deus."),
      q("O que Faraó disse depois daquela noite?", "Podem ir embora!", "Fiquem mais dez anos", "Tranquem tudo", 0, "Faraó finalmente deixou o povo partir livre."),
      q("O que significa Páscoa?", "Passagem e libertação", "Inverno", "Silêncio", 0, "Lembra que Deus livrou e passou protegendo Seu povo!")
    )
  ),
  story(25, 3, "A Travessia do Mar Vermelho", "🌊", Testament.ANTIGO, DifficultyLevel.FACIL, "Êxodo 14", "Mar Aberto", "🐚",
    "Quando parece não haver saída, Deus abre um caminho onde ninguém imagina!",
    listOf(
      "O povo caminhava feliz saindo do Egito guiado por uma nuvem de dia e uma coluna de fogo à noite! ☁️🔥",
      "Mas Faraó mudou de ideia outra vez e correu atrás deles com muitos carros e cavalos até encurralar todos na beira do Mar Vermelho! 🐎",
      "As pessoas ficaram assustadas vendo água na frente e soldados atrás, mas Moisés gritou: 'Não tenham medo! Deus vai lutar por nós!' ✋",
      "Deus mandou Moisés levantar seu cajado sobre o mar. De repente soprou um vento forte e as águas se abriram em duas paredes gigantes! 🌊",
      "Todo o povo atravessou pelo meio do mar em chão sequinho, vendo os peixinhos nadando como num aquário enorme! 🐠",
      "Quando chegaram do outro lado salvos, as águas voltaram ao lugar. Todos cantaram e dançaram agradecendo a Deus! 🎶"
    ),
    listOf(
      sc(2, "Na Beira do Mar", "O povo preocupado olha para Moisés em frente ao mar.", SceneBackdrop.RIVER, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.BRAVE, SceneProp.STAFF), a("Viajante", 0xFFE76F51, 0xFF3A2820, CharacterMood.WORRIED))),
      sc(4, "O Mar se Abre!", "Moisés ergue o cajado e o povo passa em segurança pelo meio das águas.", SceneBackdrop.OCEAN_ARK, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.AWED, SceneProp.STAFF), a("Miriã", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(5, "Cântico da Vitória", "Miriã e o povo celebram com música a proteção de Deus.", SceneBackdrop.GARDEN, listOf(a("Miriã", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.TRUMPET), a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Qual mar Deus abriu para o povo passar?", "O Mar Vermelho", "O Rio Amazonas", "Um lago pequeno", 0, "Foi o grande Mar Vermelho que se partiu ao meio!"),
      q("O que Moisés levantou sobre as águas?", "Seu cajado", "Um guarda-chuva", "Uma bandeira", 0, "Ao estender a mão com o cajado, Deus abriu o mar."),
      q("Como estava o chão no meio do mar?", "Completamente seco", "Cheio de lama", "Congelado", 0, "O fundo do mar ficou sequinho para todos caminharem!"),
      q("O que guiava o povo no deserto?", "Nuvem de dia e fogo de noite", "Um satélite", "Placas de madeira", 0, "Deus mesmo guiava com nuvem e fogo."),
      q("O que o povo fez após atravessar?", "Cantou e louvou a Deus", "Esqueceu tudo", "Brigou", 0, "Miriã e todos cantaram com alegria agradecendo a Deus!")
    )
  ),
)
