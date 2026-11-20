package com.example.data.stories

import com.example.model.*

val storiesPack11: List<BibleStory> = listOf(
  story(51, 6, "O Anjo Gabriel e Maria", "👼", Testament.NOVO, DifficultyLevel.FACIL, "Lucas 1", "Sim de Amor", "🌸",
    "Dizer 'sim' aos planos de Deus traz bênçãos lindas para o mundo inteiro!",
    listOf(
      "Numa cidadezinha tranquila chamada Nazaré vivia uma jovem muito bondosa chamada Maria, que amava a Deus de todo coração. 🌸",
      "Um dia, um anjo brilhante chamado Gabriel entrou em sua casa dizendo: 'Alegre-se, Maria! Deus está muito feliz com você!' 👼",
      "Maria ficou surpresa com tanta luz! O anjo explicou: 'Você vai ter um bebê muito especial e o nome Dele será Jesus!' ✨",
      "'Ele será o Filho de Deus, o Salvador cheio de amor que vai trazer paz para todas as pessoas!' ❤️",
      "Mesmo sem entender tudo ainda, Maria sorriu humilde e respondeu: 'Que aconteça comigo tudo o que Deus quiser!' 🙏",
      "Depois Maria cantou um hino lindo agradecendo a Deus e foi visitar sua prima Isabel com muita alegria! 🎶"
    ),
    listOf(
      sc(1, "A Visita do Anjo Gabriel", "O anjo luminoso traz a linda notícia para Maria.", SceneBackdrop.VILLAGE, listOf(a("Anjo Gabriel", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS), a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.SURPRISED))),
      sc(4, "O Sim de Maria", "Maria aceita com humildade e fé o plano de Deus.", SceneBackdrop.GARDEN, listOf(a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL)), SceneProp.DOVE),
      sc(5, "Alegria Compartilhada", "Maria e Isabel celebram juntas as promessas de Deus.", SceneBackdrop.VILLAGE, listOf(a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Isabel", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Qual anjo levou a notícia especial para Maria?", "Anjo Gabriel", "Pedro", "Noé", 0, "O anjo Gabriel trouxe a mensagem alegre de Deus."),
      q("Em qual cidade Maria morava?", "Nazaré", "Egito", "Babilônia", 0, "Maria vivia na pequena cidade de Nazaré."),
      q("Qual seria o nome do bebê especial?", "Jesus", "Golias", "Saul", 0, "O anjo disse que Ele se chamaria Jesus, o Salvador!"),
      q("Como Maria respondeu ao chamado de Deus?", "Com humildade e confiança", "Fugiu", "Ficou brava", 0, "Maria confiou completamente no cuidado de Deus."),
      q("Quem Maria foi visitar cheia de alegria?", "Sua prima Isabel", "O rei Herodes", "Um pescador", 0, "Maria e Isabel compartilharam muita alegria juntas!")
    )
  ),
  story(52, 6, "O Nascimento de Jesus em Belém", "🌟", Testament.NOVO, DifficultyLevel.FACIL, "Lucas 2", "Noite Feliz", "👶",
    "O maior presente da história chegou numa humilde manjedoura cheia de amor!",
    listOf(
      "José e Maria precisaram viajar de Nazaré até a cidadezinha de Belém para um recenseamento oficial. 🐴",
      "Quando chegaram cansados, todas as hospedarias estavam lotadas — não havia nem um quartinho livre! 😔",
      "Um estalajadeiro gentil ofereceu um estábulo quentinho cheio de feno limpo e animais mansinhos. 🐑🐄",
      "Naquela noite estrelada, nasceu o pequeno Jesus! Maria o enrolou com carinho em paninhos macios e o deitou numa manjedoura. 👶",
      "Uma estrela brilhante brilhou bem alto no céu anunciando que o Salvador havia chegado ao mundo! ⭐",
      "José e Maria sorriam maravilhados olhando para o menino Jesus dormindo em paz! ❤️"
    ),
    listOf(
      sc(0, "Viagem até Belém", "José guia Maria pela estrada até a cidade de Belém.", SceneBackdrop.MOUNTAIN, listOf(a("José", 0xFF43A06A, 0xFF4A3525, CharacterMood.BRAVE, SceneProp.STAFF), a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL))),
      sc(3, "Jesus na Manjedoura", "Maria e José cuidam do bebê Jesus sob a estrela brilhante.", SceneBackdrop.STABLE, listOf(a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("José", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.LAMP)), SceneProp.STAR),
      sc(4, "A Estrela de Belém", "Uma estrela especial ilumina a noite de paz.", SceneBackdrop.STARRY_NIGHT, listOf(a("José", 0xFF43A06A, 0xFF4A3525, CharacterMood.AWED, SceneProp.SHEEP)), SceneProp.STAR),
    ),
    listOf(
      q("Em qual cidade Jesus nasceu?", "Belém", "Jericó", "Nínive", 0, "Jesus nasceu em Belém, conforme as promessas antigas!"),
      q("Onde Maria deitou o bebê Jesus?", "Numa manjedoura com feno", "Num trono de ferro", "Num barco", 0, "Como não havia quarto na hospedaria, Ele dormiu numa manjedoura."),
      q("O que brilhou bem forte no céu naquela noite?", "Uma estrela especial", "Raios", "Um cometa verde", 0, "Uma estrela linda anunciou o nascimento de Jesus!"),
      q("Quem cuidou de Jesus em Belém?", "Maria e José", "Soldados", "Pescadores", 0, "Maria e José cuidaram Dele com todo amor."),
      q("Por que o Natal lembra esse dia?", "Porque celebra o nascimento de Jesus", "Porque neva", "Para comer só doces", 0, "Jesus é o maior presente de amor de Deus para nós!")
    )
  ),
  story(53, 6, "Os Pastores e o Coral de Anjos", "🎶", Testament.NOVO, DifficultyLevel.FACIL, "Lucas 2", "Coral do Céu", "🐑",
    "Deus compartilha Suas melhores notícias com os humildes e atentos!",
    listOf(
      "Perto de Belém, pastores simples passavam a noite acordados cuidando de suas ovelhinhas nos campos escuros. 🐑",
      "De repente, o céu inteiro se iluminou mais forte que o meio-dia e um anjo apareceu diante deles! ✨",
      "Os pastores levaram um susto enorme, mas o anjo sorriu: 'Não tenham medo! Trago uma notícia de muita alegria para todos!' 👼",
      "Logo um coral gigante de anjos encheu o céu cantando: 'Glória a Deus nas alturas e paz na terra!' 🎶",
      "Quando os anjos voltaram ao céu, os pastores correram animados até Belém para conhecer o bebê Jesus! 🏃",
      "Eles encontraram Maria, José e Jesus na manjedoura, e voltaram contando essa maravilha para todo mundo! ❤️"
    ),
    listOf(
      sc(1, "Luz no Campo", "Os pastores olham admirados quando o anjo aparece no céu.", SceneBackdrop.STARRY_NIGHT, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS), a("Pastor", 0xFF43A06A, 0xFF4A3525, CharacterMood.SURPRISED, SceneProp.SHEEP)), SceneProp.STAR),
      sc(3, "Coral de Anjos", "Anjos cantam louvores anunciando a chegada da paz.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Anjo 1", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS), a("Anjo 2", 0xFFE1F2FC, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS))),
      sc(5, "Visitando Jesus", "Os pastores chegam alegres ao estábulo com suas ovelhas.", SceneBackdrop.STABLE, listOf(a("Pastor", 0xFF43A06A, 0xFF4A3525, CharacterMood.AWED, SceneProp.SHEEP), a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Quem recebeu primeiro o anúncio dos anjos?", "Humildes pastores no campo", "Generais", "Mercadores ricos", 0, "Deus escolheu humildes pastores de ovelhas!"),
      q("O que o anjo disse para acalmar os pastores?", "Não tenham medo! Trago boa notícia", "Fujam logo", "Fiquem quietos", 0, "Era uma notícia de alegria e paz para todos os povos."),
      q("O que o coral de anjos cantava?", "Glória a Deus e paz na terra", "Canção de ninar", "Silêncio", 0, "Os anjos celebravam a paz trazida por Jesus!"),
      q("O que os pastores fizeram logo depois?", "Foram correndo ver Jesus em Belém", "Voltaram a dormir", "Esqueceram", 0, "Eles correram cheios de alegria até a manjedoura!"),
      q("O que fizeram depois de ver Jesus?", "Contaram a boa notícia a todos", "Guardaram segredo", "Choraram", 0, "Espalharam a alegria do nascimento de Jesus!")
    )
  ),
  story(54, 6, "Os Reis Magos Seguem a Estrela", "🎁", Testament.NOVO, DifficultyLevel.FACIL, "Mateus 2", "Estrela Guia", "⭐",
    "Quando buscamos Jesus com sinceridade, Deus guia o nosso caminho!",
    listOf(
      "Bem longe, no Oriente, homens sábios que estudavam o céu viram uma nova estrela muito brilhante surgir! 🌟",
      "Eles sabiam pelas profecias antigas que aquela estrela anunciava o nascimento de um novo Rei muito especial! 📜",
      "Arrumaram seus camelos com presentes preciosos e viajaram por semanas seguindo a luz da estrela! 🐪",
      "Quando chegaram perto de Belém, a estrela parou certinho bem em cima da casa onde estava o menino Jesus! ✨",
      "Eles entraram alegres, se ajoelharam diante de Jesus e entregaram ouro, incenso e mirra com muito respeito! 🎁",
      "Depois um anjo avisou em sonho para voltarem para casa por outro caminho seguro, protegendo Jesus! 👼"
    ),
    listOf(
      sc(2, "Seguindo a Estrela", "Os sábios do Oriente viajam guiados pela estrela brilhante.", SceneBackdrop.DESERT, listOf(a("Mago 1", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.AWED, SceneProp.CROWN), a("Mago 2", 0xFFF2A93B, 0xFF2D2520, CharacterMood.HAPPY, SceneProp.CROWN)), SceneProp.STAR),
      sc(4, "Presentes para Jesus", "Os visitantes entregam presentes com carinho e alegria.", SceneBackdrop.VILLAGE, listOf(a("Mago", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BASKET), a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
      sc(5, "Caminho Seguro", "Os sábios retornam felizes guiados pela proteção divina.", SceneBackdrop.STARRY_NIGHT, listOf(a("Mago", 0xFFF2A93B, 0xFF2D2520, CharacterMood.PEACEFUL, SceneProp.STAR)), SceneProp.STAR),
    ),
    listOf(
      q("O que guiou os sábios do Oriente até Jesus?", "Uma estrela muito brilhante", "Um mapa rasgado", "Uma bússola quebrada", 0, "Eles seguiram a estrela especial no céu!"),
      q("Quais presentes eles levaram para Jesus?", "Ouro, incenso e mirra", "Frutas e flores", "Brinquedos de madeira", 0, "Levaram três presentes preciosos para honrar o Rei Jesus."),
      q("Como eles se sentiram quando viram a estrela parar sobre a casa?", "Cheios de alegria", "Com raiva", "Entediados", 0, "Eles transbordaram de alegria ao encontrar Jesus!"),
      q("Por que voltaram por outro caminho?", "Porque Deus avisou em sonho para proteger Jesus", "Porque se perderam", "Porque era mais curto", 0, "Um sonho de Deus protegeu a família de Jesus!"),
      q("Qual é o melhor presente que podemos dar a Jesus hoje?", "Nosso amor e obediência", "Dinheiro", "Pedras", 0, "Nosso coração alegre e bondoso é o maior presente!")
    )
  ),
  story(55, 6, "Jesus Aos Doze Anos no Templo", "📖", Testament.NOVO, DifficultyLevel.MEDIO, "Lucas 2:41–52", "Pequeno Sábio", "🏛️",
    "Aprender sobre Deus desde criança deixa nosso coração sábio e forte!",
    listOf(
      "Jesus cresceu saudável, obediente e curioso em Nazaré, ajudando seu pai José na carpintaria. 🪵",
      "Quando fez doze anos, foi com Maria e José à grande festa de Páscoa em Jerusalém, cheia de famílias e músicas! 🎉",
      "Na volta para casa, Maria e José andaram um dia inteiro achando que Jesus estava brincando com os primos no grupo. 😟",
      "Quando perceberam que Ele não estava lá, voltaram apressados para Jerusalém procurando por toda parte por três dias! 🔍",
      "Finalmente encontraram Jesus dentro do templo, sentado entre os professores da Bíblia fazendo perguntas e dando respostas incríveis! 📖",
      "Jesus voltou obediente com seus pais para Nazaré e crescia em sabedoria, tamanho e graça diante de Deus e de todos! ❤️"
    ),
    listOf(
      sc(1, "Festa em Jerusalém", "Jesus caminha com Maria e José rumo à linda cidade.", SceneBackdrop.VILLAGE, listOf(a("José", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY), a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Jesus Jovem", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(4, "No Templo com os Professores", "Jesus conversa alegremente sobre as Escrituras no templo.", SceneBackdrop.TEMPLE, listOf(a("Jesus Jovem", 0xFFF2A93B, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.SCROLL), a("Mestre", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.AWED, SceneProp.SCROLL))),
      sc(5, "Obediente aos Pais", "Jesus volta feliz para casa crescendo em amor e sabedoria.", SceneBackdrop.GARDEN, listOf(a("Jesus Jovem", 0xFFF2A93B, 0xFF3A2820, CharacterMood.PEACEFUL), a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Quantos anos Jesus tinha nessa viagem ao templo?", "Doze anos", "Cinco anos", "Trinta anos", 0, "Jesus tinha doze anos quando visitou o templo com os pais."),
      q("Onde Maria e José encontraram Jesus?", "No templo conversando com os mestres", "No mercado", "Na praia", 0, "Ele estava aprendendo e ensinando sobre a Palavra de Deus!"),
      q("Como os professores ficaram ao ouvir Jesus?", "Admirados com Sua sabedoria", "Irritados", "Dormindo", 0, "Todos se admiravam com Suas perguntas e respostas!"),
      q("Como Jesus se comportou ao voltar para casa?", "Foi obediente aos seus pais", "Ficou teimoso", "Fugiu", 0, "Jesus deu o exemplo de amar e obedecer aos pais!"),
      q("O que podemos fazer como o jovem Jesus?", "Aprender a Bíblia e obedecer em casa", "Falar sem pensar", "Esquecer os pais", 0, "Crescer aprendendo de Deus nos faz mais sábios cada dia!")
    )
  ),
)
