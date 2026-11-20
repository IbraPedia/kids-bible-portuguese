package com.example.data.stories

import com.example.model.*

val storiesPack19: List<BibleStory> = listOf(
  story(91, 10, "O Dia Alegre de Pentecostes", "🕊️", Testament.NOVO, DifficultyLevel.FACIL, "Atos 2", "Chama do Amor", "🔥",
    "O Espírito Santo enche nosso coração de coragem, alegria e amor para ajudar os outros!",
    listOf(
      "Seguindo o conselho de Jesus, todos os amigos estavam reunidos juntos numa casa orando com muita união! 🙏",
      "Era o dia da festa de Pentecostes e a cidade de Jerusalém estava cheia de visitantes de muitos países diferentes. 🌍",
      "De repente ouviu-se um som como um vento forte e suave enchendo a sala inteira! 🌬️",
      "Pequenas chamas de luz que não queimavam pousaram suavemente sobre cada pessoa: havia chegado o Espírito Santo! 🔥🕊️",
      "Todos ficaram cheios de alegria e começaram a falar do amor de Deus em línguas que visitantes de todo país entendiam perfeitamente! 🗣️",
      "Pedro falou com tanta coragem que três mil pessoas passaram a seguir Jesus naquele mesmo dia! 🎉"
    ),
    listOf(
      sc(0, "Orando Unidos", "Os discípulos e amigos oram juntos esperando a promessa.", SceneBackdrop.VILLAGE, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.PEACEFUL), a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL))),
      sc(3, "Chegada do Espírito Santo", "Chamas suaves de luz e paz descem sobre os amigos reunidos.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.AWED, SceneProp.FIRE), a("João", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.DOVE)), SceneProp.DOVE),
      sc(5, "A Igreja Nasce!", "Muitas famílias celebram juntas aprendendo sobre Jesus.", SceneBackdrop.TEMPLE, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.BRAVE), a("Visitante", 0xFFF2A93B, 0xFF4A3525, CharacterMood.HAPPY))),
    ),
    listOf(
      q("O que os amigos de Jesus faziam reunidos antes de Pentecostes?", "Oravam unidos esperando a promessa", "Dormiam", "Jogavam pedras", 0, "A oração em união preparou o coração deles!"),
      q("O que apareceu como sinal do Espírito Santo?", "Som de vento e chamas de fogo suaves", "Neve", "Trovões escuros", 0, "Luzes como línguas de fogo e vento anunciaram o Espírito Santo!"),
      q("Qual milagre aconteceu com as línguas faladas?", "Todos os visitantes entendiam no seu próprio idioma", "Ninguém entendia", "Ficaram mudos", 0, "Pessoas de vários países ouviram as maravilhas de Deus!"),
      q("Quantas pessoas creram depois da fala de Pedro?", "Cerca de três mil pessoas", "Duas pessoas", "Dez pessoas", 0, "Foi um dia de muita festa no nascimento da igreja!"),
      q("O que o Espírito Santo traz ao nosso coração?", "Amor, alegria, paz e coragem", "Medo", "Brigas", 0, "Ele é o nosso amigo ajudador todos os dias!")
    )
  ),
  story(92, 10, "Pedro e João na Porta do Templo", "🤸", Testament.NOVO, DifficultyLevel.FACIL, "Atos 3:1–10", "Pulo de Alegria", "🏛️",
    "O melhor presente que podemos dar a alguém é o amor e o nome de Jesus!",
    listOf(
      "Numa tarde ensolarada, os amigos Pedro e João subiam ao templo para fazer a oração da tarde. 🏛️",
      "Perto da porta linda chamada Formosa, estava sentado um homem que nunca tinha conseguido andar desde bebê! 😔",
      "Ele pediu alguma moedinha para comprar comida. Pedro e João pararam e olharam bem nos olhos dele com carinho! 👀",
      "Pedro disse: 'Não tenho prata nem ouro, mas o que eu tenho eu dou a você: em nome de Jesus, levante-se e ande!' ✨",
      "Pedro segurou a mão dele e na hora os tornozelos ficaram fortinhos! O homem deu um pulo e começou a andar! 🤸",
      "Ele entrou no templo saltando, dançando e louvando a Deus diante de todo mundo maravilhado! 🎉"
    ),
    listOf(
      sc(2, "Um Olhar de Carinho", "Pedro e João param na porta Formosa para ouvir o homem.", SceneBackdrop.TEMPLE, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.PEACEFUL), a("João", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY), a("Homem", 0xFFF2A93B, 0xFF4A3525, CharacterMood.SAD))),
      sc(4, "Andando em Nome de Jesus!", "O homem fica de pé firme segurando a mão de Pedro.", SceneBackdrop.TEMPLE, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.BRAVE), a("Homem", 0xFFF2A93B, 0xFF4A3525, CharacterMood.SURPRISED))),
      sc(5, "Pulando de Gratidão!", "O homem curado salta e agradece a Deus com alegria.", SceneBackdrop.GARDEN, listOf(a("Homem", 0xFFF2A93B, 0xFF4A3525, CharacterMood.HAPPY), a("João", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Quem estava entrando no templo para orar?", "Pedro e João", "Golias e Saul", "Caim e Abel", 0, "Os dois amigos sempre oravam juntos no templo."),
      q("O que o homem na porta não conseguia fazer desde que nasceu?", "Andar", "Enxergar", "Ouvir", 0, "Ele nunca havia dado um único passo na vida."),
      q("Pedro deu dinheiro para o homem?", "Não, ele deu a cura em nome de Jesus!", "Sim, cem moedas", "Deu pão", 0, "Pedro disse que o nome de Jesus vale mais que ouro!"),
      q("O que o homem fez assim que foi curado?", "Andou, pulou e louvou a Deus", "Ficou sentado", "Foi dormir", 0, "Sua alegria era tanta que não parava de pular e agradecer!"),
      q("O que vale mais do que dinheiro para ajudar alguém?", "Amor, atenção e oração em nome de Jesus", "Ignorar", "Brinquedos quebrados", 0, "Dar carinho e fé transforma vidas!")
    )
  ),
  story(93, 10, "Filipe Ajuda um Viajante Curioso", "📜", Testament.NOVO, DifficultyLevel.MEDIO, "Atos 8:26–40", "Boa Leitura", "🐎",
    "Explicar a Bíblia com paciência ajuda outras pessoas a descobrirem o amor de Jesus!",
    listOf(
      "Um anjo disse a Filipe: 'Vá caminhar pela estrada tranquila que desce para o sul!' Filipe obedeceu na hora! 🚶",
      "Lá vinha uma carruagem elegante levando um oficial importante da Etiópia que voltava de Jerusalém! 🐎",
      "O viajante lia um rolo antigo da Bíblia em voz alta, tentando entender sobre quem o profeta Isaías estava falando! 📜",
      "Filipe correu perto da carruagem e perguntou simpático: 'Você entende o que está lendo?' O homem convidou: 'Suba e me explique!' 😊",
      "Filipe sentou ao lado dele e contou toda a linda história de Jesus com alegria! ❤️",
      "Logo passaram por uma lagoa de água clara! O viajante pediu para ser batizado ali mesmo e seguiu viagem radiante! 💧🎉"
    ),
    listOf(
      sc(2, "Lendo na Carruagem", "O viajante lê o pergaminho curioso na estrada.", SceneBackdrop.DESERT, listOf(a("Viajante", 0xFF8C6EC9, 0xFF1F1A18, CharacterMood.WORRIED, SceneProp.SCROLL))),
      sc(4, "Filipe Explica Sobre Jesus", "Filipe senta com o viajante explicando a Bíblia com carinho.", SceneBackdrop.DESERT, listOf(a("Filipe", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.SCROLL), a("Viajante", 0xFF8C6EC9, 0xFF1F1A18, CharacterMood.AWED))),
      sc(5, "Alegria na Água!", "O viajante é batizado e segue feliz contando sobre Jesus.", SceneBackdrop.RIVER, listOf(a("Filipe", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY), a("Viajante", 0xFF8C6EC9, 0xFF1F1A18, CharacterMood.HAPPY)), SceneProp.DOVE),
    ),
    listOf(
      q("O que o viajante da Etiópia estava fazendo na carruagem?", "Lendo as Escrituras sem entender direito", "Dormindo", "Cantando ópera", 0, "Ele lia o livro do profeta Isaías com curiosidade!"),
      q("Quem Deus enviou para ajudá-lo a entender?", "Filipe", "Jonas", "Noé", 0, "Filipe obedeceu ao chamado e correu ajudar."),
      q("Sobre quem Filipe falou ao viajante?", "Sobre Jesus e Seu amor", "Sobre pirâmides", "Sobre cavalos", 0, "Filipe mostrou que a profecia falava exatamente de Jesus!"),
      q("O que aconteceu quando viram água no caminho?", "O viajante quis ser batizado na mesma hora", "Lavaram os sapatos", "Passaram direto", 0, "Ele creu de todo coração e foi batizado!"),
      q("Como ele seguiu viagem depois?", "Muito alegre com sua nova fé", "Triste", "Bravo", 0, "Conhecer Jesus trouxe alegria imensa ao viajante!")
    )
  ),
  story(94, 10, "Saulo na Estrada de Damasco", "⚡", Testament.NOVO, DifficultyLevel.MEDIO, "Atos 9:1–20", "Luz que Muda", "🌟",
    "Jesus pode transformar até alguém muito bravo em um grande amigo que espalha amor!",
    listOf(
      "Saulo era um homem muito severo que perseguia os amigos de Jesus e queria prendê-los em outras cidades. 😠",
      "Um dia, viajando pela estrada quente até Damasco, uma luz mais brilhante que o sol desceu do céu bem ao redor dele! ⚡✨",
      "Saulo caiu no chão assustado e ouviu uma voz suave e firme: 'Saulo, Saulo, por que você Me persegue?' 😮",
      "'Quem és Tu, Senhor?' perguntou tremendo. A voz respondeu: 'Eu sou Jesus!' Saulo ficou sem enxergar por três dias para pensar e orar. 🙏",
      "Deus enviou um amigo corajoso chamado Ananias, que colocou as mãos sobre Saulo dizendo: 'Irmão Saulo, Jesus enviou você para enxergar!' ❤️",
      "Na hora caiu algo como escamas dos olhos de Saulo! Ele mudou seu nome para Paulo e virou o maior missionário do amor de Jesus! 🌍🎉"
    ),
    listOf(
      sc(1, "A Grande Luz do Céu!", "Uma luz brilhante envolve Saulo na estrada de Damasco.", SceneBackdrop.DESERT, listOf(a("Saulo", 0xFFE76F51, 0xFF2D2520, CharacterMood.SURPRISED)), SceneProp.STAR),
      sc(4, "Ananias Ora por Saulo", "Ananias acolhe Saulo como irmão em nome de Jesus.", SceneBackdrop.VILLAGE, listOf(a("Ananias", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL), a("Saulo", 0xFF3E92CC, 0xFF2D2520, CharacterMood.AWED))),
      sc(5, "Paulo Pregando Amor!", "Agora chamado Paulo, ele compartilha a alegria de Jesus.", SceneBackdrop.VILLAGE, listOf(a("Paulo", 0xFF3E92CC, 0xFF2D2520, CharacterMood.HAPPY, SceneProp.SCROLL)), SceneProp.DOVE),
    ),
    listOf(
      q("Para qual cidade Saulo estava viajando?", "Damasco", "Belém", "Jericó", 0, "Ele seguia pela estrada rumo a Damasco."),
      q("O que apareceu de repente no meio do caminho?", "Uma luz brilhante do céu e a voz de Jesus", "Um arco-íris duplo", "Uma tempestade de areia", 0, "Jesus falou diretamente com Saulo numa grande luz!"),
      q("Quem Deus enviou para orar pelos olhos de Saulo?", "Ananias", "Golias", "Faraó", 0, "Ananias obedeceu mesmo sabendo que Saulo era bravo antes!"),
      q("Qual novo nome Saulo passou a usar como missionário?", "Paulo", "Pedro", "Davi", 0, "O apóstolo Paulo escreveu muitas cartas lindas da Bíblia!"),
      q("O que a história de Paulo ensina?", "Todos podem mudar para o bem com Jesus", "Ninguém muda", "Devemos guardar mágoa", 0, "O amor de Jesus transforma qualquer coração!")
    )
  ),
  story(95, 10, "Dorcas e suas Costuras de Amor", "🧵", Testament.NOVO, DifficultyLevel.FACIL, "Atos 9:36–42", "Mãos Generosas", "👗",
    "Fazer roupas, desenhos ou pequenos favores com amor é um jeito lindo de servir a Deus!",
    listOf(
      "Na cidade litorânea de Jope morava uma mulher muito doce chamada Dorcas, cheia de bondade e boas obras! 🌸",
      "Dorcas era excelente costureira! Ela passava seus dias costurando túnicas quentinhas e lindas para crianças e viúvas pobres! 🧵👗",
      "Todo mundo na cidade amava Dorcas por seu sorriso gentil e sua vontade de ajudar quem precisava! ❤️",
      "Certo dia, Dorcas ficou muito doente e morreu. Seus amigos choraram muito mostrando as roupinhas que ela tinha feito com tanto carinho. 😢",
      "Eles chamaram depressa o apóstolo Pedro! Pedro pediu a todos que saíssem um pouquinho, ajoelhou-se e orou a Deus com fé. 🙏",
      "Então Pedro disse: 'Tabita (Dorcas), levante-se!' Ela abriu os olhos sorrindo e voltou viva para continuar fazendo o bem! 🎉✨"
    ),
    listOf(
      sc(1, "Costurando com Amor", "Dorcas prepara roupinhas quentinhas para ajudar seus vizinhos.", SceneBackdrop.VILLAGE, listOf(a("Dorcas", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BASKET), a("Criança", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(4, "Oração de Pedro", "Pedro ora com fé diante do carinho de toda a cidade.", SceneBackdrop.VILLAGE, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.PEACEFUL))),
      sc(5, "Dorcas Vive!", "Todos comemoram alegres quando Dorcas desperta saudável.", SceneBackdrop.GARDEN, listOf(a("Dorcas", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.HAPPY), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("O que Dorcas fazia para ajudar os pobres?", "Costurava roupas com carinho", "Construía muros", "Vendia joias", 0, "Ela usava seu dom na costura para abençoar muitas famílias!"),
      q("Como os vizinhos se sentiam em relação a Dorcas?", "Amavam muito ela pela bondade", "Nem conheciam", "Tinham medo", 0, "Todos admiravam suas boas ações sinceras."),
      q("Quem veio orar por Dorcas quando ela ficou doente?", "Pedro", "Salomão", "Moisés", 0, "Os amigos buscaram Pedro na cidade vizinha."),
      q("O que aconteceu depois da oração de Pedro?", "Dorcas abriu os olhos viva e saudável!", "Nada", "Choveu", 0, "Deus ouviu a oração e trouxe Dorcas de volta!"),
      q("Como podemos ser parecidos com Dorcas?", "Usando nossas habilidades para ajudar quem precisa", "Guardando tudo só para nós", "Rindo dos outros", 0, "Pequenos gestos de carinho ficam guardados para sempre!")
    )
  ),
)
