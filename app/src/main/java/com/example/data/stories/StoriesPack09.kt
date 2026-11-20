package com.example.data.stories

import com.example.model.*

val storiesPack09: List<BibleStory> = listOf(
  story(41, 5, "A Sabedoria de Salomão", "🦉", Testament.ANTIGO, DifficultyLevel.MEDIO, "1 Reis 3", "Coração Sábio", "👑",
    "Pedir sabedoria a Deus para fazer o bem é o maior tesouro que existe.",
    listOf(
      "Quando Davi ficou velhinho, seu filho Salomão se tornou o novo rei de Israel. Ele era jovem e queria governar direitinho! 👑",
      "Numa noite tranquila, Deus apareceu a Salomão em sonho e disse: 'Peça o que você quiser que Eu te darei!' ✨",
      "Salomão poderia pedir montanhas de ouro ou castelos gigantes, mas pensou no povo e disse: 'Senhor, dá-me um coração sábio!' 🙏",
      "Deus ficou tão feliz com o pedido humilde que deu a Salomão muita sabedoria — e ainda deu paz e riquezas! 🦉",
      "Logo todos viram sua sabedoria quando duas mães disputavam um bebê e Salomão descobriu a mãe verdadeira pelo amor! 👶",
      "Pessoas de países distantes vinham ouvir os lindos provérbios e conselhos sábios do rei Salomão! 📜"
    ),
    listOf(
      sc(1, "O Sonho do Rei", "Salomão ora humilde pedindo sabedoria em sonho.", SceneBackdrop.STARRY_NIGHT, listOf(a("Salomão", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.AWED, SceneProp.CROWN)), SceneProp.STAR),
      sc(4, "Justiça com Amor", "Salomão julga com sabedoria protegendo o bebê.", SceneBackdrop.THRONE, listOf(a("Salomão", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.CROWN), a("Mãe", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.BASKET))),
      sc(5, "Provérbios Sábios", "Salomão escreve conselhos para ensinar famílias.", SceneBackdrop.PALACE, listOf(a("Salomão", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.SCROLL))),
    ),
    listOf(
      q("O que Salomão pediu a Deus no sonho?", "Sabedoria para cuidar bem do povo", "Carros de corrida", "Mil doces", 0, "Salomão pediu um coração sábio e justo!"),
      q("Por que Deus gostou tanto do pedido de Salomão?", "Porque não foi egoísta", "Porque foi rápido", "Porque era noite", 0, "Ele pensou no bem de todas as pessoas, não só nele."),
      q("O que Deus deu além da sabedoria?", "Paz e muitas bênçãos", "Nada mais", "Chuva", 0, "Deus honrou a humildade de Salomão com muitas bênçãos!"),
      q("Qual livro da Bíblia tem muitos conselhos de Salomão?", "Provérbios", "Gênesis", "Êxodo", 0, "O livro de Provérbios guarda conselhos preciosos de sabedoria!"),
      q("Como podemos buscar sabedoria hoje?", "Orando, lendo a Bíblia e ouvindo bons conselhos", "Brincando o dia inteiro sem ouvir", "Brigando", 0, "Deus dá sabedoria a quem pede com sinceridade!")
    )
  ),
  story(42, 5, "O Templo Brilhante de Jerusalém", "🏛️", Testament.ANTIGO, DifficultyLevel.MEDIO, "1 Reis 6 e 8", "Casa de Louvor", "🕯️",
    "Adorar a Deus com alegria une toda a comunidade em gratidão.",
    listOf(
      "O rei Davi sempre sonhou em construir uma linda casa de pedras e ouro para Deus, e seu filho Salomão realizou esse sonho! 🏛️",
      "Milhares de trabalhadores cortaram cedros perfumados das montanhas e poliram pedras brancas com muito capricho. 🪵",
      "Por dentro, as paredes brilhavam com ouro e lindos desenhos de flores, palmeiras e anjinhos! ✨",
      "Quando o grande templo ficou pronto após sete anos, os músicos tocaram trombetas, pratos e harpas em festa! 🎺🎶",
      "Uma nuvem suave encheu a casa de Deus e Salomão ajoelhou-se orando: 'Senhor, ouve sempre quem orar aqui com sinceridade!' 🙏",
      "Todos celebraram juntos com alegria, lembrando que a maior casa de Deus também é o nosso coração! ❤️"
    ),
    listOf(
      sc(1, "Construindo o Templo", "Trabalhadores erguem o lindo templo com madeira e pedra.", SceneBackdrop.VILLAGE, listOf(a("Salomão", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.CROWN), a("Artesão", 0xFFF2A93B, 0xFF4A3525, CharacterMood.BRAVE))),
      sc(3, "Festa de Música e Louvor", "Músicos celebram a inauguração com trombetas e harpas.", SceneBackdrop.TEMPLE, listOf(a("Músico", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.TRUMPET), a("Salomão", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.AWED, SceneProp.CROWN)), SceneProp.LAMP),
      sc(4, "Oração de Gratidão", "Salomão ora pedindo a bênção de Deus sobre todos.", SceneBackdrop.TEMPLE, listOf(a("Salomão", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.PEACEFUL)), SceneProp.STAR),
    ),
    listOf(
      q("Quem construiu o grande templo em Jerusalém?", "O rei Salomão", "Moisés", "Jonas", 0, "Salomão realizou o projeto preparado por seu pai Davi."),
      q("Quantos anos levou a construção do templo?", "Sete anos", "Dois dias", "Cem anos", 0, "Foram sete anos de trabalho cuidadoso e caprichoso."),
      q("Com que o interior do templo foi enfeitado?", "Ouro, madeira perfumada e belos desenhos", "Tinta preta", "Papelão", 0, "O templo era cheio de brilho, ouro e artes lindas!"),
      q("O que Salomão fez na inauguração?", "Ajoelhou-se e fez uma linda oração", "Dormiu", "Foi viajar", 0, "Ele orou pedindo que Deus ouvisse todas as famílias."),
      q("Onde Deus também gosta de morar hoje?", "Dentro do nosso coração", "Só em castelos", "No fundo do mar", 0, "Quando amamos a Deus, nosso coração é Sua casa especial!")
    )
  ),
  story(43, 5, "Elias, os Corvos e a Viúva", "🐦", Testament.ANTIGO, DifficultyLevel.FACIL, "1 Reis 17", "Pão que Nunca Acaba", "🥖",
    "Deus pode usar até pássaros e um pouquinho de farinha para cuidar de quem confia Nele.",
    listOf(
      "Na época do profeta Elias, não chovia fazia muito tempo e quase não havia comida na cidade. 🏜️",
      "Deus disse a Elias: 'Vá para perto de um riacho escondido! Vou mandar os corvos levarem pão e carne para você!' 🐦",
      "Todos os dias de manhã e de tarde, os corvos pretos voavam certinho trazendo comidinha fresca para Elias! 🍞",
      "Quando o riacho secou, Deus mandou Elias para uma cidadezinha onde uma viúva bondosa tinha só um punhado de farinha e azeite. 🏺",
      "Ela confiou em Deus e fez primeiro um pãozinho para Elias. Então aconteceu um milagre maravilhoso! ✨",
      "Todos os dias a panela de farinha e o jarro de azeite continuavam cheios! Nunca mais faltou comida naquela casa! 🎉"
    ),
    listOf(
      sc(2, "Os Corvos Trazem Pão", "Elias sorri agradecido enquanto os corvos trazem comida.", SceneBackdrop.RIVER, listOf(a("Elias", 0xFF43A06A, 0xFF6B5D53, CharacterMood.AWED, SceneProp.BREAD_CUP)), SceneProp.DOVE),
      sc(4, "A Farinha e o Azeite", "A viúva e seu filho preparam pão confiando na promessa.", SceneBackdrop.VILLAGE, listOf(a("Viúva", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.PEACEFUL, SceneProp.BREAD_CUP), a("Elias", 0xFF43A06A, 0xFF6B5D53, CharacterMood.HAPPY))),
      sc(5, "Alegria na Mesa", "A família celebra o alimento diário que nunca acabou.", SceneBackdrop.GARDEN, listOf(a("Viúva", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.HAPPY), a("Filho", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Quais pássaros levaram comida para Elias?", "Corvos", "Pinguins", "Águias", 0, "Deus enviou corvos todas as manhãs e tardes!"),
      q("O que a viúva tinha em casa quando Elias chegou?", "Só um pouquinho de farinha e azeite", "Um supermercado", "Dez vacas", 0, "Ela tinha apenas o último punhado de farinha e azeite."),
      q("O que aconteceu depois que ela repartiu o pão com fé?", "A farinha e o azeite nunca mais acabaram", "Sumiu tudo", "Ficou salgado", 0, "Deus multiplicou o alimento durante toda a seca!"),
      q("Por que a viúva compartilhou mesmo tendo pouco?", "Porque confiou na palavra de Deus", "Porque não gostava de pão", "Por engano", 0, "A generosidade e a fé abrem caminho para milagres!"),
      q("O que aprendemos sobre compartilhar?", "Quando dividimos com amor, Deus multiplica", "Nunca devemos dividir", "Só os ricos ajudam", 0, "Compartilhar traz alegria para quem dá e quem recebe!")
    )
  ),
  story(44, 5, "Elias no Monte Carmelo", "⛈️", Testament.ANTIGO, DifficultyLevel.DESAFIO, "1 Reis 18", "Fogo do Céu", "🔥",
    "Só o nosso Deus é real, ouve nossas orações e manda bênçãos do céu!",
    listOf(
      "Muitas pessoas tinham esquecido o Deus verdadeiro e seguiam falsos ídolos. Elias reuniu todos no alto do Monte Carmelo! ⛰️",
      "Elias propôs um desafio: 'Cada lado prepara um altar sem fogo. O Deus verdadeiro responderá com fogo do céu!' 🔥",
      "Os seguidores dos ídolos gritaram o dia inteiro, pularam e cantaram, mas nada aconteceu — porque estátuas não ouvem! 🤫",
      "Então Elias arrumou doze pedras, colocou madeira e ainda mandou jogar muita água em cima para ninguém ter dúvida! 💧",
      "Elias fez uma oração calma: 'Senhor, mostra hoje que Tu és Deus!' No mesmo instante caiu fogo brilhante do céu! ⚡",
      "Todo o povo ficou admirado e depois caiu uma chuva fresquinha regando toda a terra seca! 🌧️🌿"
    ),
    listOf(
      sc(2, "Silêncio no Altar Falso", "Elias espera tranquilo enquanto os ídolos não respondem.", SceneBackdrop.MOUNTAIN, listOf(a("Elias", 0xFF43A06A, 0xFF6B5D53, CharacterMood.PEACEFUL, SceneProp.STAFF), a("Povo", 0xFFE76F51, 0xFF3A2820, CharacterMood.WORRIED))),
      sc(4, "Fogo do Céu!", "Deus responde à oração de Elias com luz e fogo celestial.", SceneBackdrop.MOUNTAIN, listOf(a("Elias", 0xFF43A06A, 0xFF6B5D53, CharacterMood.AWED, SceneProp.FIRE)), SceneProp.FIRE),
      sc(5, "Chuva de Bênçãos", "A chuva volta a alegrar os campos verdes.", SceneBackdrop.GARDEN, listOf(a("Elias", 0xFF43A06A, 0xFF6B5D53, CharacterMood.HAPPY)), SceneProp.RAINBOW),
    ),
    listOf(
      q("Em qual monte aconteceu o grande desafio?", "Monte Carmelo", "Monte Sinai", "Monte das Oliveiras", 0, "Foi no alto do Monte Carmelo diante de todo o povo."),
      q("Por que os falsos ídolos não responderam?", "Porque não são deuses de verdade", "Porque estava ventando", "Porque era tarde", 0, "Ídolos feitos por mãos humanas não têm poder nem vida."),
      q("O que Elias pediu para jogar sobre o altar?", "Muita água", "Areia", "Folhas secas", 0, "Elias molhou tudo para provar que só Deus acenderia o fogo!"),
      q("Como Deus respondeu à oração de Elias?", "Enviou fogo do céu", "Mandou neve", "Nada fez", 0, "Deus respondeu na mesma hora com fogo poderoso!"),
      q("O que veio logo depois para acabar com a seca?", "Uma chuva maravilhosa", "Um furacão", "Escuridão", 0, "Deus enviou chuva abundante sobre os campos!")
    )
  ),
  story(45, 5, "Jonas e o Grande Peixe", "🐋", Testament.ANTIGO, DifficultyLevel.FACIL, "Jonas 1–4", "Segunda Chance", "🌊",
    "Não dá para fugir de Deus — Ele sempre nos dá uma segunda chance com amor!",
    listOf(
      "Deus deu uma missão a Jonas: 'Vá até a cidade de Nínive avisar as pessoas para pararem de fazer coisas erradas!' 🏙️",
      "Mas Jonas não quis ir e correu para o porto! Ele subiu num navio indo exatamente para o lado oposto! ⛵",
      "No meio do mar veio uma tempestade enorme! Os marinheiros ficaram com medo, e Jonas confessou que estava fugindo de Deus. ⛈️",
      "Para acalmar o mar, Jonas foi lançado na água — e Deus enviou um grande peixe para engoli-lo inteirinho e salvá-lo! 🐋",
      "Dentro da barriga do peixe, por três dias, Jonas orou arrependido. Então o peixe o devolveu sequinho na praia! 🏖️",
      "Dessa vez Jonas obedeceu rapidinho! Foi a Nínive, o povo pediu perdão e Deus perdoou toda a cidade! ❤️"
    ),
    listOf(
      sc(2, "Tempestade no Barco", "Ondas balançam o navio enquanto Jonas percebe seu erro.", SceneBackdrop.BOAT, listOf(a("Jonas", 0xFF3E92CC, 0xFF3A2820, CharacterMood.WORRIED), a("Marinheiro", 0xFFE76F51, 0xFF2D2520, CharacterMood.SURPRISED))),
      sc(4, "Salvo pelo Grande Peixe", "Jonas ora arrependido protegido pelo grande peixe no mar.", SceneBackdrop.OCEAN_ARK, listOf(a("Jonas", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.WHALE)), SceneProp.WHALE),
      sc(5, "Obedecendo em Nínive", "Jonas prega na cidade e o povo muda de coração.", SceneBackdrop.VILLAGE, listOf(a("Jonas", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.SCROLL), a("Morador", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL))),
    ),
    listOf(
      q("Para qual cidade Deus mandou Jonas ir?", "Nínive", "Belém", "Jericó", 0, "Deus enviou Jonas para levar Sua palavra a Nínive."),
      q("O que Jonas fez primeiro?", "Fugiu num navio para o lado contrário", "Foi correndo obedecer", "Pegou um cavalo", 0, "Jonas tentou fugir da missão pegando um navio."),
      q("O que salvou Jonas no fundo do mar?", "Um grande peixe enviado por Deus", "Um bote inflável", "Um golfinho", 0, "Deus preparou um grande peixe para proteger Jonas."),
      q("Quanto tempo Jonas ficou no peixe orando?", "Três dias e três noites", "Dez minutos", "Um ano", 0, "Ele orou arrependido por três dias e foi devolvido à praia!"),
      q("O que aconteceu quando Jonas obedeceu em Nínive?", "As pessoas se arrependeram e foram perdoadas", "Ninguém ouviu", "Ele fugiu de novo", 0, "Deus amava as pessoas de Nínive e as perdoou!")
    )
  ),
)
