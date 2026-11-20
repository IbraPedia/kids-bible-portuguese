package com.example.data.stories

import com.example.model.*

val storiesPack01: List<BibleStory> = listOf(
  story(1, 1, "A Criação do Mundo", "🌍", Testament.ANTIGO, DifficultyLevel.FACIL, "Gênesis 1", "Criador Curioso", "✨",
    "Deus criou um mundo lindo e cheio de cores para nós cuidarmos com amor.",
    listOf(
      "No comecinho de tudo, não havia árvores, nem rios, nem estrelas. Havia apenas um grande silêncio e o amor de Deus pronto para criar! ✨",
      "Então Deus falou com voz suave: 'Haja luz!' E na mesma hora o brilho dourado iluminou o universo e nasceu o dia e a noite. ☀️",
      "Depois Deus separou o céu azul fofinho das águas dos oceanos. As nuvens começaram a flutuar bem alto como algodão doce. ☁️",
      "Em seguida, Ele encheu a terra de flores perfumadas, árvores com frutas docinhas e montanhas verdinhas! 🌸🌳",
      "Logo o céu ganhou o sol, a lua e milhões de estrelinhas piscando, e o mar ficou cheio de peixinhos coloridos e pássaros cantores. 🐠🐦",
      "Por último, Deus criou os animais e o ser humano, olhou tudo com um sorriso e viu que tudo era muito bom! 💖"
    ),
    listOf(
      sc(0, "Luz na Escuridão", "Deus cria a luz brilhante no início de tudo.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.AWED, SceneProp.ANGEL_WINGS)), SceneProp.STAR),
      sc(2, "Céu, Águas e Flores", "Montanhas verdinhas, árvores e flores nascem.", SceneBackdrop.GARDEN, listOf(a("Passarinho", 0xFF56A3D9, 0xFF2D2520, CharacterMood.HAPPY, SceneProp.TREE)), SceneProp.RAINBOW),
      sc(4, "Sol, Lua e Animais", "Ovelhinhas e estrelas enchem a criação.", SceneBackdrop.STARRY_NIGHT, listOf(a("Pastor", 0xFF43A06A, 0xFF5C4033, CharacterMood.HAPPY, SceneProp.SHEEP)), SceneProp.STAR),
    ),
    listOf(
      q("O que Deus criou primeiro com Sua palavra?", "A luz", "Um carro", "Um castelo", 0, "Deus disse 'Haja luz!' e tudo se iluminou!"),
      q("Onde Deus colocou os peixes?", "Nas nuvens", "Nos mares e rios", "No deserto", 1, "Os peixinhos coloridos nadam nos mares e rios."),
      q("O que brilha no céu durante a noite?", "Apenas chuva", "A lua e as estrelas", "Árvores", 1, "Deus colocou a lua e as estrelas para enfeitar a noite."),
      q("Como Deus se sentiu ao ver toda a criação?", "Muito feliz, era tudo muito bom", "Triste", "Com medo", 0, "A Bíblia conta que Deus viu que tudo era muito bom!"),
      q("Qual é a lição desta história?", "Cuidar da natureza com carinho", "Quebrar as plantas", "Esconder a luz", 0, "Devemos cuidar com amor do mundo lindo que Deus fez.")
    )
  ),
  story(2, 1, "Adão e Eva no Jardim", "🌺", Testament.ANTIGO, DifficultyLevel.FACIL, "Gênesis 2–3", "Amigo do Jardim", "🌿",
    "Obedecer ao conselho de Deus traz paz e proteção para o nosso coração.",
    listOf(
      "Deus preparou um jardim maravilhoso chamado Éden, cheio de rios cristalinos e árvores cheias de frutas saborosas. 🍎",
      "Lá viviam Adão e Eva, cuidando dos bichinhos e dando nome a cada leãozinho, borboleta e coelho do jardim. 🦋",
      "Deus disse com carinho: 'Podem comer de quase todas as árvores, mas não toquem naquela árvore especial no centro.' 🌳",
      "Um dia, uma serpente esperta convenceu Eva a desobedecer, e ela e Adão provaram o fruto proibido. 😔",
      "Quando perceberam o erro, ficaram com vergonha e se esconderam entre as folhas, mas Deus os chamou com amor. 🌿",
      "Eles precisaram sair do jardim, porém Deus prometeu cuidar deles e enviaria um Salvador no futuro. 💛"
    ),
    listOf(
      sc(0, "O Lindo Jardim do Éden", "Adão e Eva vivem felizes entre flores e árvores.", SceneBackdrop.GARDEN, listOf(a("Adão", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY), a("Eva", 0xFFF2A93B, 0xFF6B4226, CharacterMood.HAPPY, SceneProp.TREE))),
      sc(3, "A Escolha Difícil", "Eva e Adão ficam preocupados após desobedecer.", SceneBackdrop.GARDEN, listOf(a("Adão", 0xFF43A06A, 0xFF4A3525, CharacterMood.WORRIED), a("Eva", 0xFFF2A93B, 0xFF6B4226, CharacterMood.SAD))),
      sc(5, "A Promessa de Cuidado", "Mesmo fora do jardim, Deus promete esperança.", SceneBackdrop.CROSS_SUNRISE, listOf(a("Adão", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL), a("Eva", 0xFFF2A93B, 0xFF6B4226, CharacterMood.PEACEFUL)), SceneProp.RAINBOW),
    ),
    listOf(
      q("Qual era o nome do jardim de Adão e Eva?", "Jardim do Éden", "Jardim de Pedras", "Deserto Azul", 0, "Eles moravam no lindo Jardim do Éden!"),
      q("O que Adão fazia com os animais?", "Assustava todos", "Dava nome e cuidava deles", "Escondia os bichos", 1, "Adão deu nome aos animais com muito carinho."),
      q("Por que eles ficaram tristes depois?", "Porque desobedeceram a Deus", "Porque choveu", "Porque perderam um brinquedo", 0, "A desobediência trouxe tristeza ao coração deles."),
      q("O que eles fizeram quando ouviram Deus chamar?", "Se esconderam nas árvores", "Pularam no rio", "Foram dormir", 0, "Eles se esconderam entre as folhas com vergonha."),
      q("Deus deixou de amar Adão e Eva?", "Sim", "Não, Ele prometeu cuidar deles", "Nunca existiram", 1, "Mesmo corrigindo, Deus continuou amando e cuidando deles.")
    )
  ),
  story(3, 1, "Caim e Abel", "🌾", Testament.ANTIGO, DifficultyLevel.MEDIO, "Gênesis 4", "Coração Generoso", "💛",
    "Deus se alegra quando oferecemos o nosso melhor com coração sincero e sem inveja.",
    listOf(
      "Adão e Eva tiveram dois filhos: Caim, que gostava de plantar sementes na terra, e Abel, que cuidava de ovelhinhas brancas. 🐑",
      "Um dia os dois trouxeram presentes para agradecer a Deus. Abel escolheu sua melhor ovelhinha com muito amor. 🎁",
      "Caim trouxe frutos da terra, mas seu coração não estava alegre nem generoso como o de seu irmão. 🌾",
      "Deus ficou muito feliz com a oferta sincera de Abel, e Caim sentiu uma ponta feia de inveja e raiva. 😠",
      "Deus avisou Caim para guardar o coração da raiva, mas Caim brigou com Abel no campo e fez algo muito triste. 😢",
      "Aprendemos com Abel que amar nossos irmãos e fugir da inveja agrada muito ao Senhor. 🕊️"
    ),
    listOf(
      sc(0, "Os Dois Irmãos", "Caim com trigo e Abel cuidando das ovelhinhas.", SceneBackdrop.GARDEN, listOf(a("Abel", 0xFF3E92CC, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.SHEEP), a("Caim", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(3, "Sentimento de Inveja", "Abel agradece feliz, mas Caim fica emburrado.", SceneBackdrop.MOUNTAIN, listOf(a("Abel", 0xFF3E92CC, 0xFF4A3525, CharacterMood.PEACEFUL), a("Caim", 0xFFE76F51, 0xFF3A2820, CharacterMood.WORRIED))),
      sc(5, "Obedecer com Amor", "Um coração cheio de paz escolhe amar o irmão.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Abel", 0xFF3E92CC, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.DOVE)), SceneProp.DOVE),
    ),
    listOf(
      q("O que Abel gostava de cuidar?", "De ovelhas", "De navios", "De pedras", 0, "Abel era um pastor carinhoso de ovelhas."),
      q("O que Caim fazia?", "Plantava e colhia frutos da terra", "Era pescador", "Construía torres", 0, "Caim trabalhava plantando na terra."),
      q("Por que Deus gostou tanto do presente de Abel?", "Porque foi dado com amor sincero", "Porque era brilhante", "Porque era caro", 0, "Deus olha sempre para a sinceridade do nosso coração."),
      q("Qual sentimento ruim atrapalhou Caim?", "A inveja e a raiva", "O sono", "A fome", 0, "A inveja fez Caim ficar com raiva do irmão."),
      q("Como devemos tratar nossos irmãos e amigos?", "Com amor e alegria", "Com brigas", "Ignorando", 0, "Deus se alegra quando amamos uns aos outros!")
    )
  ),
  story(4, 1, "Noé e a Grande Arca", "🚢", Testament.ANTIGO, DifficultyLevel.FACIL, "Gênesis 6–7", "Construtor Fiel", "🪵",
    "Confiar em Deus e obedecer mesmo quando parece difícil traz segurança.",
    listOf(
      "Há muito tempo, as pessoas tinham esquecido de ser bondosas, mas Noé era um homem bom que andava com Deus. 😊",
      "Deus contou a Noé que enviaria uma grande chuva e pediu para ele construir um barco gigante de madeira: uma arca! 🔨",
      "Mesmo sem nunca ter visto chuva daquele jeito, Noé obedeceu e trabalhou duro junto com sua família. 🪵",
      "Quando a arca ficou pronta, Deus enviou pares de todos os animais: girafas, elefantes, leões e passarinhos entraram em fila! 🦒🐘",
      "Então Deus fechou a porta da arca, e começou a chover por quarenta dias e quarenta noites sobre toda a terra. 🌧️",
      "Lá dentro, Noé, sua família e todos os bichinhos ficaram quentinhos, secos e protegidos pelo cuidado de Deus! 🚢"
    ),
    listOf(
      sc(1, "Construindo a Arca", "Noé trabalha com fé na grande arca de madeira.", SceneBackdrop.VILLAGE, listOf(a("Noé", 0xFF8C6EC9, 0xFFE5E5E5, CharacterMood.BRAVE, SceneProp.ARK_BOAT))),
      sc(3, "Os Animais Chegam", "Bichinhos entram em pares na grande arca.", SceneBackdrop.GARDEN, listOf(a("Noé", 0xFF8C6EC9, 0xFFE5E5E5, CharacterMood.HAPPY, SceneProp.SHEEP), a("Leãozinho", 0xFFF2A93B, 0xFFC97F14, CharacterMood.HAPPY, SceneProp.LION))),
      sc(5, "Navegando em Segurança", "A arca flutua tranquila sobre as ondas azuis.", SceneBackdrop.OCEAN_ARK, listOf(a("Noé", 0xFF8C6EC9, 0xFFE5E5E5, CharacterMood.PEACEFUL, SceneProp.ARK_BOAT)), SceneProp.ARK_BOAT),
    ),
    listOf(
      q("O que Deus pediu para Noé construir?", "Uma grande arca de madeira", "Uma ponte de ferro", "Um castelo de areia", 0, "Deus deu instruções para Noé fazer uma arca enorme."),
      q("Quem entrou na arca além da família de Noé?", "Apenas peixes", "Pares de todos os animais", "Somente leões", 1, "Os animais entraram de dois em dois para ficarem salvos!"),
      q("Por quantos dias e noites choveu?", "40 dias e 40 noites", "2 dias", "1 hora", 0, "Choveu durante quarenta dias e quarenta noites."),
      q("Quem fechou a porta da arca?", "O vento", "Deus fechou para proteger", "Um elefante", 1, "Deus mesmo fechou a porta com todo cuidado."),
      q("O que Noé nos ensina?", "Obedecer a Deus com fé", "Desistir quando dá trabalho", "Rir dos outros", 0, "Noé confiou e obedeceu mesmo quando os outros não entendiam.")
    )
  ),
  story(5, 1, "O Arco-Íris da Promessa", "🌈", Testament.ANTIGO, DifficultyLevel.FACIL, "Gênesis 8–9", "Pombinha da Paz", "🕊️",
    "Cada arco-íris no céu nos lembra que Deus sempre cumpre Suas promessas.",
    listOf(
      "Depois da grande chuva, o sol voltou a brilhar e a arca parou suavemente no alto de uma montanha. ⛰️",
      "Noé abriu a janela e soltou uma pombinha branca para ver se a terra já estava seca. 🕊️",
      "Na primeira vez ela voltou cansada, mas dias depois retornou trazendo um raminho verde de oliveira no bico! 🌿",
      "Noé pulou de alegria! Logo a porta se abriu e todos os bichinhos correram contentes pelos campos verdinhos. 🐇",
      "Noé fez uma oração de agradecimento a Deus por ter protegido sua família inteira durante o dilúvio. 🙏",
      "Então Deus pintou no céu um lindo arco-íris colorido como sinal da Sua promessa eterna de amor e cuidado! 🌈"
    ),
    listOf(
      sc(1, "A Pombinha Branca", "Noé solta a pombinha pela janela da arca.", SceneBackdrop.OCEAN_ARK, listOf(a("Noé", 0xFF8C6EC9, 0xFFE5E5E5, CharacterMood.HAPPY, SceneProp.DOVE)), SceneProp.DOVE),
      sc(2, "O Raminho Verde", "A pombinha volta com uma folhinha verde de esperança.", SceneBackdrop.MOUNTAIN, listOf(a("Noé", 0xFF8C6EC9, 0xFFE5E5E5, CharacterMood.SURPRISED, SceneProp.DOVE)), SceneProp.TREE),
      sc(5, "O Arco-Íris no Céu", "Um arco-íris brilhante celebra a promessa de Deus.", SceneBackdrop.GARDEN, listOf(a("Noé", 0xFF8C6EC9, 0xFFE5E5E5, CharacterMood.AWED, SceneProp.RAINBOW)), SceneProp.RAINBOW),
    ),
    listOf(
      q("Qual ave Noé enviou e voltou com um raminho?", "Uma águia", "Uma pombinha branca", "Um pato", 1, "A pombinha branca voltou com um raminho verde de oliveira."),
      q("O que o raminho verde mostrava?", "Que as águas estavam baixando", "Que ia nevar", "Que era noite", 0, "Mostrava que as árvores já apareciam e a terra secava!"),
      q("O que Noé fez ao sair da arca?", "Agradeceu a Deus com oração", "Foi dormir sem agradecer", "Voltou para dentro", 0, "A primeira atitude de Noé foi agradecer a Deus."),
      q("Qual sinal colorido Deus colocou no céu?", "Um arco-íris", "Um foguete", "Uma estrela cadente", 0, "O arco-íris é o lindo sinal da aliança de Deus!"),
      q("O que o arco-íris nos lembra?", "Que Deus cumpre Suas promessas", "Que vai acabar a luz", "Que precisamos correr", 0, "Sempre que vemos um arco-íris lembramos da fidelidade de Deus.")
    )
  ),
)
