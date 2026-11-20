package com.example.data.stories

import com.example.model.*

val storiesPack20: List<BibleStory> = listOf(
  story(96, 10, "Pedro Libertado da Prisão por um Anjo", "🔓", Testament.NOVO, DifficultyLevel.MEDIO, "Atos 12:1–17", "Portas Abertas", "👼",
    "Quando os amigos oram juntos por alguém, Deus responde de maneiras maravilhosas!",
    listOf(
      "Um rei malvado prendeu o apóstolo Pedro numa cela escura vigiada por muitos soldados e grandes grades de ferro! ⛓️",
      "Enquanto isso, na casa da mãe de João Marcos, todos os amigos da igreja passaram a noite orando sem parar por Pedro! 🙏",
      "Dentro da cela, Pedro dormia tranquilo em paz entre dois guardas. De repente uma luz brilhante iluminou toda a prisão! ✨",
      "Um anjo do Senhor tocou no ombro de Pedro: 'Acorde depressa!' Na hora as correntes caíram das mãos dele! 👼",
      "Pedro vestiu as sandálias achando que era um sonho, passou pelas portas e o portão gigante de ferro abriu-se sozinho! 🚪",
      "Quando Pedro bateu na porta onde os amigos oravam, a menina Rode quase não acreditou de tanta felicidade! 🎉"
    ),
    listOf(
      sc(0, "Pedro na Prisão", "Pedro dorme em paz atrás das grades confiando em Deus.", SceneBackdrop.PRISON_CELL, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.IRON_BARS)), SceneProp.IRON_BARS),
      sc(3, "O Anjo na Cela!", "Um anjo luminoso liberta Pedro dentro da cela.", SceneBackdrop.PRISON_CELL, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.BRAVE, SceneProp.ANGEL_WINGS), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.SURPRISED)), SceneProp.STAR),
      sc(5, "Alegria na Porta!", "Rode e os amigos celebram vendo a oração respondida.", SceneBackdrop.VILLAGE, listOf(a("Rode", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("O que os amigos de Pedro faziam enquanto ele estava preso?", "Oravam juntos por ele sem parar", "Foram passear", "Esqueceram dele", 0, "A oração unida dos amigos moveu o céu!"),
      q("Quem apareceu na cela iluminando tudo?", "Um anjo do Senhor", "Um passarinho", "Um pintor", 0, "Deus enviou um anjo para soltar as correntes e abrir os portões!"),
      q("Como os portões de ferro se abriram?", "Abriram-se sozinhos pelo poder de Deus", "Com uma bomba", "Com martelo", 0, "Nenhuma tranca impede os planos de Deus."),
      q("Quem atendeu a porta quando Pedro chegou à casa?", "Uma jovem chamada Rode", "Golias", "Faraó", 0, "Rode reconheceu a voz de Pedro e correu avisar todos!"),
      q("O que aprendemos sobre orar pelos amigos?", "Orar juntos tem muito poder", "Não adianta orar", "Só vale orar sozinho", 0, "Deus ouve as orações da família e dos amigos!")
    )
  ),
  story(97, 10, "Paulo e Silas Cantam na Prisão", "🎵", Testament.NOVO, DifficultyLevel.FACIL, "Atos 16:16–34", "Louvor na Noite", "⛓️",
    "Cantar e agradecer a Deus até nos dias difíceis enche o coração de esperança!",
    listOf(
      "Na cidade de Filipos, Paulo e seu amigo Silas foram presos injustamente e colocados numa cela bem fechada lá no fundo! ⛓️",
      "Estavam machucados e com os pés presos num tronco de madeira. Qualquer pessoa choraria... mas sabe o que eles fizeram? 😮",
      "Perto da meia-noite, Paulo e Silas começaram a ORAR e CANTAR hinos bem alegres louvando a Deus! Todos os prisioneiros ouviam admirados! 🎶✨",
      "De repente, um terremoto suave sacudiu a prisão, as portas abriram e todas as correntes se soltaram na hora! ⚡",
      "O guarda ficou assustado achando que todos tinham fugido, mas Paulo gritou gentil: 'Não se machuque! Estamos todos aqui!' 🛡️",
      "Emocionado com tanto amor, o guarda levou Paulo e Silas para casa, lavou os machucados deles e toda a sua família creu em Jesus! ❤️🎉"
    ),
    listOf(
      sc(2, "Cantando na Cela com os Prisioneiros", "Paulo e Silas cantam alegres atrás das grades enquanto outros ouvem.", SceneBackdrop.PRISON_CELL, listOf(a("Paulo", 0xFF3E92CC, 0xFF2D2520, CharacterMood.HAPPY, SceneProp.IRON_BARS), a("Silas", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY), a("Prisioneiro", 0xFFF2A93B, 0xFF3A2820, CharacterMood.AWED)), SceneProp.IRON_BARS),
      sc(4, "Bondade com o Guarda", "Paulo tranquiliza o guarda assustado mostrando cuidado.", SceneBackdrop.PRISON_CELL, listOf(a("Paulo", 0xFF3E92CC, 0xFF2D2520, CharacterMood.BRAVE), a("Guarda", 0xFFE76F51, 0xFF2D2520, CharacterMood.SURPRISED, SceneProp.LAMP))),
      sc(5, "Família Toda Feliz!", "O guarda e sua família conhecem Jesus com alegria.", SceneBackdrop.VILLAGE, listOf(a("Guarda", 0xFFE76F51, 0xFF2D2520, CharacterMood.HAPPY), a("Paulo", 0xFF3E92CC, 0xFF2D2520, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("O que Paulo e Silas fizeram à meia-noite na prisão?", "Oraram e cantaram louvores a Deus", "Brigaram com os guardas", "Dormiram tristes", 0, "Eles escolheram louvar a Deus mesmo dentro da cela!"),
      q("Quem estava ouvindo as músicas deles?", "Todos os outros prisioneiros", "Ninguém", "Só pássaros", 0, "Os prisioneiros ficaram admirados com tanta alegria."),
      q("O que aconteceu durante os louvores?", "Um terremoto soltou as correntes e abriu as portas", "Começou a nevar", "Apagou a lua", 0, "Deus respondeu com um milagre incrível!"),
      q("Eles fugiram deixando o guarda em apuros?", "Não, ficaram lá e acalmaram o guarda", "Sim, correram rápido", "Esconderam-se", 0, "Paulo mostrou amor até pelo guarda da prisão!"),
      q("Qual foi a maior alegria daquela noite?", "O guarda e toda sua família creram em Jesus", "Acharam ouro", "Ganharam férias", 0, "O amor e louvor transformaram uma família inteira!")
    )
  ),
  story(98, 10, "Paulo no Navio e na Ilha de Malta", "⛵", Testament.NOVO, DifficultyLevel.MEDIO, "Atos 27–28", "Âncora de Paz", "🏝️",
    "Mesmo quando o mar está agitado, Deus guarda nossa vida e nos faz ajudar outros!",
    listOf(
      "Paulo precisou viajar num grande navio de madeira pelo mar, mas veio uma tempestade furiosa que durou muitos dias! ⛈️🌊",
      "As ondas balançavam tudo e os marinheiros ficaram sem esperança. Mas um anjo apareceu a Paulo à noite dizendo: 'Não tenha medo! Todos serão salvos!' 👼",
      "Paulo animou todos os 276 viajantes no navio, agradeceu a Deus e dividiu pão para todos terem forças! 🍞",
      "Perto de uma ilha bonita chamada Malta, o navio bateu num banco de areia e quebrou — mas TODOS nadaram ou boiaram em tábuas até a praia sãos e salvos! 🏖️",
      "Os moradores gentis da ilha acenderam uma fogueira quentinha na chuva para aquecer os viajantes molhados! 🔥",
      "Paulo até orou pelo pai do governador que estava doente e Deus o curou! Todos deram presentes e bênçãos na partida! ❤️"
    ),
    listOf(
      sc(1, "Coragem na Tempestade", "Paulo encoraja todos no navio confiando na promessa de Deus.", SceneBackdrop.BOAT, listOf(a("Paulo", 0xFF3E92CC, 0xFF2D2520, CharacterMood.BRAVE), a("Marinheiro", 0xFFE76F51, 0xFF3A2820, CharacterMood.WORRIED))),
      sc(3, "Todos Salvos na Praia!", "Os viajantes chegam em segurança à bela ilha de Malta.", SceneBackdrop.OCEAN_ARK, listOf(a("Paulo", 0xFF3E92CC, 0xFF2D2520, CharacterMood.HAPPY), a("Viajante", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY))),
      sc(4, "Fogueira de Acolhimento", "Moradores acolhem Paulo e os viajantes junto ao fogo.", SceneBackdrop.GARDEN, listOf(a("Paulo", 0xFF3E92CC, 0xFF2D2520, CharacterMood.PEACEFUL, SceneProp.FIRE), a("Morador", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("O que o anjo prometeu a Paulo durante a tempestade?", "Que todas as pessoas do navio seriam salvas", "Que o navio voaria", "Que ia parar em 1 minuto", 0, "Deus garantiu que nenhuma vida se perderia!"),
      q("Como Paulo ajudou os companheiros no navio?", "Animou todos e repartiu pão com oração", "Ficou escondido", "Gritou de medo", 0, "Paulo trouxe calma e esperança no meio da tormenta."),
      q("Quantas pessoas se salvaram chegando à ilha?", "Todas as 276 pessoas!", "Só metade", "Apenas Paulo", 0, "Cada uma das 276 pessoas chegou viva à praia!"),
      q("Como se chamava a ilha acolhedora?", "Malta", "Nínive", "Belém", 0, "Os moradores da ilha de Malta foram muito gentis!"),
      q("O que aprendemos sobre momentos turbulentos?", "Manter a fé e encorajar quem está por perto", "Entrar em pânico", "Reclamar sempre", 0, "Deus nos dá calma para ajudar os outros também!")
    )
  ),
  story(99, 10, "A Linda Armadura de Deus", "🛡️", Testament.NOVO, DifficultyLevel.FACIL, "Efésios 6:10–18", "Escudo da Fé", "⚔️",
    "A verdade, a bondade, a paz e a fé protegem nosso coração todos os dias!",
    listOf(
      "Em uma carta cheia de carinho, o apóstolo Paulo imaginou uma armadura brilhante especial — não de ferro pesado, mas de coisas boas de Deus! 🛡️",
      "Primeiro colocamos o Cinto da VERDADE: falar sempre a verdade deixa tudo firme e seguro! 🎗️",
      "Depois vestimos a Couraça da JUSTIÇA e BONDADE para proteger bem o nosso coração contra pensamentos maus! ❤️",
      "Nos pés calçamos as Sandálias da PAZ para levar alegria e reconciliação por onde andarmos! 👟🕊️",
      "Na mão seguramos o Escudo da FÉ e na cabeça o Capacete da SALVAÇÃO, lembrando que Jesus nos ama! 🌟",
      "E com a Palavra de Deus e muita oração, ficamos prontos para vencer qualquer dia difícil com sorriso! 📖🙏"
    ),
    listOf(
      sc(1, "Cinto da Verdade", "Uma criança sorridente se prepara com a verdade e bondade.", SceneBackdrop.GARDEN, listOf(a("Pequeno Soldado", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.STAFF))),
      sc(4, "Escudo da Fé!", "Com fé e paz nos pés, o coração fica protegido.", SceneBackdrop.MOUNTAIN, listOf(a("Defensora", 0xFF43A06A, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.DOVE)), SceneProp.STAR),
      sc(5, "Palavra e Oração", "Lendo a Bíblia e orando, estamos sempre fortalecidos.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Paulo", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.PEACEFUL, SceneProp.SCROLL)), SceneProp.STAR),
    ),
    listOf(
      q("Do que é feita a armadura de Deus?", "De verdade, justiça, paz, fé e oração", "De ferro pesado", "De papelão", 0, "São virtudes espirituais que protegem nosso coração!"),
      q("Qual parte protege como um cinto?", "A verdade", "A preguiça", "O medo", 0, "O cinto da verdade mantém tudo no lugar certo."),
      q("O que calçamos nos pés segundo Paulo?", "A disposição para levar a paz", "Sapatos de pedra", "Patins", 0, "Devemos ser mensageiros da paz por onde caminharmos!"),
      q("Qual peça funciona como escudo?", "A fé em Deus", "A raiva", "A desculpa", 0, "O escudo da fé apaga o medo e as dúvidas!"),
      q("Qual é a espada luminosa do Espírito?", "A Palavra de Deus (Bíblia)", "Uma vareta", "Um grito", 0, "Conhecer a Bíblia guia nossas escolhas com sabedoria!")
    )
  ),
  story(100, 10, "O Novo Céu e a Nova Terra", "🌈", Testament.NOVO, DifficultyLevel.FACIL, "Apocalipse 21–22", "Lar Eterno", "👑",
    "Deus preparou um futuro maravilhoso onde não haverá mais lágrimas, só amor e alegria!",
    listOf(
      "Na última história da Bíblia, o apóstolo João teve uma visão maravilhosa do futuro lindo que Deus preparou para quem O ama! ✨",
      "Ele viu um Novo Céu e uma Nova Terra brilhando mais que mil arco-íris juntos! 🌈",
      "Lá existe uma cidade linda com ruas douradas como cristal, portões de pérola e um rio de água pura cristalina! 💎🌊",
      "Nas margens do rio cresce a Árvore da Vida dando frutas fresquinhas todos os meses para todo mundo celebrar! 🌳🍓",
      "E a notícia mais gostosa de todas: lá nunca mais vai existir choro, dor, doença ou medo — Deus enxugará cada lágrima com amor! ❤️",
      "Jesus mesmo será a luz daquele lugar e todos viveremos felizes para sempre com Ele! Vem logo, Senhor Jesus! 👑🌟🎉"
    ),
    listOf(
      sc(1, "O Novo Céu Luminoso", "João contempla o novo céu cheio de paz e cores lindas.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("João", 0xFF43A06A, 0xFFEEEEEE, CharacterMood.AWED, SceneProp.SCROLL)), SceneProp.RAINBOW),
      sc(3, "O Rio e a Árvore da Vida", "Águas cristalinas e frutos lindos alegram o jardim eterno.", SceneBackdrop.GARDEN, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS)), SceneProp.TREE),
      sc(5, "Alegria para Sempre com Jesus!", "Todos celebram juntos sob a luz do amor eterno de Deus.", SceneBackdrop.CROSS_SUNRISE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.CROWN), a("Criança", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Quem recebeu a visão do Novo Céu e Nova Terra?", "O apóstolo João", "Golias", "Faraó", 0, "No livro de Apocalipse, João descreve esse lar maravilhoso!"),
      q("O que nunca mais existirá nesse lugar lindo?", "Lágrimas, dor, doença ou medo", "Alegria", "Música", 0, "Deus mesmo enxugará toda lágrima para sempre!"),
      q("Que árvore especial cresce junto ao rio da vida?", "A Árvore da Vida", "Árvore seca", "Cacto", 0, "A Árvore da Vida dá frutos lindos o ano inteiro!"),
      q("Quem ilumina toda a Nova Jerusalém?", "A própria luz de Deus e de Jesus", "Velas", "Lanternas", 0, "Não haverá mais noite nem escuridão porque Deus é a luz!"),
      q("Parabéns! Você leu 100 histórias! Qual é a mensagem de toda a Bíblia?", "Deus nos ama muito e quer caminhar sempre conosco!", "Ficar sozinho", "Ter medo", 0, "De Gênesis ao Apocalipse, a Bíblia conta o amor imenso de Deus por você!")
    )
  ),
)
