package com.example.data.stories

import com.example.model.*

val storiesPack07: List<BibleStory> = listOf(
  story(31, 4, "Josué e as Muralhas de Jericó", "🎺", Testament.ANTIGO, DifficultyLevel.FACIL, "Josué 6", "Trombeta da Vitória", "🏰",
    "Obedecer ao plano de Deus, mesmo quando parece diferente, traz grandes vitórias!",
    listOf(
      "Depois de Moisés, o corajoso Josué liderou o povo até a Terra Prometida. Mas havia uma cidade com muros gigantes: Jericó! 🏰",
      "As portas estavam trancadas e ninguém conseguia entrar. Então Deus deu a Josué um plano muito curioso! 🎺",
      "'Marchem em silêncio ao redor da cidade uma vez por dia, durante seis dias, levando a Arca e sete trombetas!' 🚶",
      "No sétimo dia, eles deram sete voltas bem cedinho. Os moradores olhavam do muro sem entender nada! 😲",
      "Na sétima volta, Josué gritou: 'Toquem as trombetas e deem um grande grito de fé!' 📣",
      "BUM! Sem nenhuma espada tocar nas pedras, os muros enormes caíram no chão e Deus deu a vitória a Josué! 🎉"
    ),
    listOf(
      sc(0, "Os Grandes Muros", "Josué observa os muros altos de Jericó confiando em Deus.", SceneBackdrop.DESERT, listOf(a("Josué", 0xFFE76F51, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.STAFF))),
      sc(2, "Marchando com Trombetas", "Sacerdotes tocam trombetas enquanto o povo caminha em fé.", SceneBackdrop.VILLAGE, listOf(a("Sacerdote", 0xFFF2A93B, 0xFF4A3525, CharacterMood.PEACEFUL, SceneProp.TRUMPET), a("Josué", 0xFFE76F51, 0xFF3A2820, CharacterMood.BRAVE))),
      sc(5, "Vitória pela Fé!", "Todos comemoram alegres a promessa cumprida.", SceneBackdrop.GARDEN, listOf(a("Josué", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.TRUMPET)), SceneProp.STAR),
    ),
    listOf(
      q("Quem liderou o povo em Jericó?", "Josué", "Noé", "Jonas", 0, "Josué assumiu a liderança com muita coragem e fé."),
      q("O que o povo carregava ao redor dos muros?", "A Arca e trombetas", "Escadas de corda", "Canhões", 0, "Eles marcharam tocando trombetas conforme Deus pediu."),
      q("Quantas voltas deram no sétimo dia?", "Sete voltas", "Uma volta", "Cinquenta voltas", 0, "No sétimo dia deram sete voltas completas."),
      q("O que derrubou os muros de Jericó?", "O poder de Deus após o grito de fé e trombetas", "Um trator", "Chuva", 0, "Deus derrubou as muralhas por causa da obediência deles!"),
      q("O que aprendemos com Josué?", "Confiar e obedecer aos planos de Deus", "Ter medo de muros altos", "Desistir cedo", 0, "Com Deus, nenhum obstáculo é grande demais!")
    )
  ),
  story(32, 4, "Débora, a Juíza Corajosa", "🌴", Testament.ANTIGO, DifficultyLevel.MEDIO, "Juízes 4–5", "Sabedoria sob a Palmeira", "⚖️",
    "Deus usa homens, mulheres e jovens corajosos para trazer justiça e paz.",
    listOf(
      "Naqueles tempos antigos, o povo não tinha rei, mas Deus escolhia líderes sábios chamados juízes. ⚖️",
      "Débora era uma mulher muito sábia que se sentava à sombra de uma linda palmeira para aconselhar e ajudar as famílias! 🌴",
      "Um exército inimigo assustava o povo com carruagens de ferro. Débora chamou o comandante Baraque e deu coragem a ele! 🛡️",
      "Baraque disse: 'Eu só vou se você for junto comigo, Débora!' E ela respondeu firme: 'Eu vou com você, pois Deus nos ajudará!' 💪",
      "Deus mandou uma grande chuva que atolou as carruagens pesadas no barro e livrou Israel sem perder a fé! 🌧️",
      "Depois da vitória, Débora compôs um cântico alegre agradecendo a Deus pela paz! 🎶"
    ),
    listOf(
      sc(1, "Conselhos sob a Palmeira", "Débora ouve e ajuda o povo com muita sabedoria.", SceneBackdrop.GARDEN, listOf(a("Débora", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.SCROLL), a("Moradora", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY)), SceneProp.TREE),
      sc(3, "Coragem para Lutar", "Débora encoraja Baraque a confiar no Senhor.", SceneBackdrop.MOUNTAIN, listOf(a("Débora", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.BRAVE), a("Baraque", 0xFF3E92CC, 0xFF2D2520, CharacterMood.BRAVE, SceneProp.STAFF))),
      sc(5, "Cântico de Paz", "Débora celebra a paz restaurada com alegria.", SceneBackdrop.CROSS_SUNRISE, listOf(a("Débora", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.HARP)), SceneProp.DOVE),
    ),
    listOf(
      q("Onde Débora costumava aconselhar o povo?", "Debaixo de uma palmeira", "Dentro de um barco", "Num castelo de gelo", 0, "Ela atendia todos à sombra de uma palmeira."),
      q("Quem pediu para Débora ir junto na batalha?", "O comandante Baraque", "Golias", "Faraó", 0, "Baraque confiou na fé e sabedoria de Débora."),
      q("Como Deus ajudou a vencer as carruagens de ferro?", "Com uma chuva forte que trouxe livramento", "Com vento de areia", "Com gelo", 0, "Deus usou a chuva para proteger Seu povo."),
      q("O que Débora fez depois da vitória?", "Cantou um hino de gratidão", "Foi dormir brava", "Escondeu-se", 0, "Débora celebrou com um cântico lindo de louvor!"),
      q("O que a história de Débora mostra?", "Coragem e sabedoria vêm de Deus", "Só guerreiros podem liderar", "Devemos ter medo", 0, "Todos que confiam em Deus podem fazer a diferença!")
    )
  ),
  story(33, 4, "Gideão e as Tochas Brilhantes", "🔥", Testament.ANTIGO, DifficultyLevel.MEDIO, "Juízes 7", "Pequeno Valente", "🏺",
    "Não precisamos ser um gigante nem ter um exército enorme quando Deus está conosco.",
    listOf(
      "Gideão era um jovem tímido que malhava trigo escondido com medo de invasores. Um anjo o chamou de 'homem valente'! 👼",
      "Gideão juntou milhares de soldados, mas Deus disse: 'Tem gente demais! Se vencerem, vão achar que foi pela própria força.' 😮",
      "Então ficaram apenas trezentos homens escolhidos pelo jeito atento como beberam água no riacho! 💧",
      "Em vez de espadas pesadas, cada um recebeu apenas uma trombeta e um jarro de barro com uma tocha acesa dentro! 🏺🔥",
      "À meia-noite, cercaram o acampamento inimigo, quebraram os jarros juntos e levantaram as tochas brilhantes tocando as trombetas! 🎺",
      "O susto foi tão grande que os inimigos correram para longe e Israel ficou em paz! ✨"
    ),
    listOf(
      sc(2, "Os Trezentos no Riacho", "Gideão observa os companheiros atentos junto à água.", SceneBackdrop.RIVER, listOf(a("Gideão", 0xFFE76F51, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.STAFF), a("Soldado", 0xFF3E92CC, 0xFF2D2520, CharacterMood.HAPPY))),
      sc(4, "Tochas na Noite!", "Gideão e seu grupo iluminam a noite com jarros e trombetas.", SceneBackdrop.STARRY_NIGHT, listOf(a("Gideão", 0xFFE76F51, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.FIRE), a("Amigo", 0xFFF2A93B, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.TRUMPET)), SceneProp.FIRE),
      sc(5, "Paz Conquistada", "Todos celebram o cuidado incrível de Deus.", SceneBackdrop.GARDEN, listOf(a("Gideão", 0xFFE76F51, 0xFF3A2820, CharacterMood.PEACEFUL)), SceneProp.STAR),
    ),
    listOf(
      q("Quantos homens ficaram no grupo de Gideão?", "300 homens", "10.000 homens", "2 meninos", 0, "Deus reduziu para apenas 300 para mostrar que a vitória era Dele!"),
      q("O que eles carregavam nas mãos?", "Trombetas, jarros e tochas", "Arcos e flechas", "Redes de pesca", 0, "Usaram tochas escondidas em jarros e trombetas."),
      q("Em que horário cercaram o acampamento?", "À meia-noite", "Ao meio-dia", "De manhãzinha", 0, "À noite as tochas brilharam bem forte de repente!"),
      q("Como o anjo chamou Gideão mesmo ele sendo tímido?", "Homem valente", "Preguiçoso", "Desajeitado", 0, "Deus vê o potencial de coragem dentro de cada um de nós."),
      q("Por que Deus pediu um grupo pequeno?", "Para saberem que a vitória veio de Deus", "Porque faltou comida", "Por acaso", 0, "Quando confiamos em Deus, pouco se torna muito!")
    )
  ),
  story(34, 4, "Sansão, o Homem Forte", "💪", Testament.ANTIGO, DifficultyLevel.MEDIO, "Juízes 13–16", "Força que Vem de Deus", "🦁",
    "A verdadeira força não está nos músculos, mas na obediência e na oração a Deus.",
    listOf(
      "Antes de Sansão nascer, um anjo avisou seus pais que ele seria muito especial e nunca deveria cortar os cabelos. ✂️",
      "Sansão cresceu com uma força extraordinária dada por Deus! Certa vez ele até afastou um leão feroz no caminho! 🦁",
      "Infelizmente, às vezes Sansão esquecia de usar sua força com sabedoria e se envolveu com Dalila, que não queria seu bem. 😟",
      "Depois de muita insistência, ele contou o segredo da sua consagração e cortaram seu cabelo enquanto dormia. Ele perdeu a força! 😢",
      "Preso pelos inimigos, Sansão percebeu seu erro, arrependeu-se e pediu em oração que Deus o perdoasse mais uma vez. 🙏",
      "Seu cabelo começou a crescer, Deus ouviu sua oração e deu-lhe força no último momento para salvar seu povo! 💪"
    ),
    listOf(
      sc(1, "A Força Incrível", "Sansão caminha forte e corajoso sob a proteção divina.", SceneBackdrop.MOUNTAIN, listOf(a("Sansão", 0xFFE76F51, 0xFF2D2520, CharacterMood.BRAVE, SceneProp.LION))),
      sc(3, "Momento de Erro", "Sansão fica triste ao perder o cuidado com sua promessa.", SceneBackdrop.VILLAGE, listOf(a("Sansão", 0xFFE76F51, 0xFF2D2520, CharacterMood.SAD), a("Dalila", 0xFF8C6EC9, 0xFF1F1A18, CharacterMood.TEMPTING))),
      sc(4, "Oração na Prisão", "Sansão ora arrependido atrás das grades e Deus ouve.", SceneBackdrop.PRISON_CELL, listOf(a("Sansão", 0xFFE76F51, 0xFF2D2520, CharacterMood.PEACEFUL, SceneProp.IRON_BARS)), SceneProp.IRON_BARS),
    ),
    listOf(
      q("Qual era o sinal da promessa especial de Sansão?", "Nunca cortar o cabelo", "Usar luvas azuis", "Não comer frutas", 0, "Seus cabelos compridos simbolizavam sua consagração a Deus."),
      q("De onde vinha a força de Sansão?", "De Deus", "De espinafre", "De uma pedra mágica", 0, "Era o Espírito de Deus quem dava força a Sansão."),
      q("Quem insistiu para descobrir o segredo de Sansão?", "Dalila", "Miriã", "Rute", 0, "Dalila enganou Sansão e entregou seu segredo."),
      q("O que Sansão fez quando estava preso e arrependido?", "Orou pedindo perdão e ajuda a Deus", "Fugiu nadando", "Riu muito", 0, "Ele reconheceu que precisava de Deus e orou com fé."),
      q("Qual é a verdadeira lição dessa história?", "Obedecer a Deus nos mantém fortes", "Contar segredos a quem nos faz mal", "Brigar sempre", 0, "Estar perto de Deus é a nossa maior força!")
    )
  ),
  story(35, 4, "Rute e Noemi, Amigas para Sempre", "🌾", Testament.ANTIGO, DifficultyLevel.FACIL, "Rute 1–4", "Amizade Fiel", "💛",
    "Cuidar de quem amamos nos momentos difíceis é uma das coisas mais lindas do mundo.",
    listOf(
      "Noemi era uma senhora bondosa que ficou muito triste e sozinha em outra terra. Sua nora Rute não quis deixá-la sozinha! 😢",
      "Rute disse uma frase inesquecível: 'Para onde você for, eu irei! Seu povo será o meu povo e o seu Deus será o meu Deus!' ❤️",
      "Juntas viajaram até Belém. Para conseguir comida, Rute trabalhava o dia todo recolhendo espigas de trigo nos campos. 🌾",
      "O dono da fazenda, um homem muito gentil chamado Boaz, viu o quanto Rute cuidava com carinho de Noemi. 😊",
      "Boaz ordenou aos empregados que deixassem bastante trigo para Rute colher e a tratassem com todo respeito! ✨",
      "Mais tarde, Boaz e Rute se casaram, Noemi ganhou um netinho lindo e eles entraram na família do futuro rei Davi! 👶👑"
    ),
    listOf(
      sc(1, "Promessa de Amizade", "Rute abraça Noemi prometendo caminhar sempre ao seu lado.", SceneBackdrop.MOUNTAIN, listOf(a("Rute", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY), a("Noemi", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.PEACEFUL))),
      sc(2, "Colhendo Trigo em Belém", "Rute trabalha alegre no campo dourado sob o cuidado de Boaz.", SceneBackdrop.GARDEN, listOf(a("Rute", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BASKET), a("Boaz", 0xFFF2A93B, 0xFF4A3525, CharacterMood.HAPPY))),
      sc(5, "Família Abençoada", "Rute, Boaz e Noemi sorriem felizes com o bebê.", SceneBackdrop.VILLAGE, listOf(a("Noemi", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.HAPPY), a("Rute", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("O que Rute escolheu fazer por Noemi?", "Ficar com ela e ajudá-la", "Ir embora sozinha", "Esquecê-la", 0, "Rute foi super leal e amorosa com Noemi."),
      q("Para qual cidade elas foram morar?", "Belém", "Egito", "Nínive", 0, "Elas voltaram para a cidadezinha de Belém."),
      q("Como Rute conseguia comida?", "Colhendo espigas de trigo no campo", "Pescando no mar", "Vendendo pedras", 0, "Ela trabalhava colhendo as espigas que ficavam no campo."),
      q("Quem era o fazendeiro gentil que ajudou Rute?", "Boaz", "Golias", "Saul", 0, "Boaz admirou a bondade de Rute e cuidou delas."),
      q("O que aprendemos com Rute?", "Ser amigo leal e cuidar da família", "Pensar só em si", "Desistir quando é difícil", 0, "O amor fiel traz grandes bênçãos!")
    )
  ),
)
