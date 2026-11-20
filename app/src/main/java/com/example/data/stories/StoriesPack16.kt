package com.example.data.stories

import com.example.model.*

val storiesPack16: List<BibleStory> = listOf(
  story(76, 8, "O Tesouro Escondido no Campo", "💎", Testament.NOVO, DifficultyLevel.FACIL, "Mateus 13:44", "Tesouro Real", "✨",
    "Conhecer Jesus e o amor de Deus é o maior tesouro que podemos encontrar!",
    listOf(
      "Jesus contou uma história curtinha e super animada sobre um trabalhador no campo! 🌾",
      "Enquanto cavava a terra fofa com sua enxada, ele bateu em algo duro... CLINC! Era um baú antigo cheio de joias brilhantes! 💎",
      "Os olhos dele brilharam de alegria! Com cuidado, cobriu o tesouro outra vez para mantê-lo seguro. ✨",
      "Ele correu feliz para casa, vendeu tudo o que tinha guardado e comprou aquele campo inteiro para ficar com o tesouro! 🏡",
      "Ele sabia que nenhuma outra coisa valia tanto quanto aquela descoberta incrível! 💰",
      "Jesus sorriu explicando: o Reino de Deus é assim! Vale qualquer esforço ter Jesus no coração! ❤️"
    ),
    listOf(
      sc(1, "Achando o Tesouro!", "O trabalhador encontra um tesouro precioso escondido no campo.", SceneBackdrop.GARDEN, listOf(a("Trabalhador", 0xFF43A06A, 0xFF3A2820, CharacterMood.SURPRISED, SceneProp.BASKET)), SceneProp.STAR),
      sc(3, "Alegria Imensa", "Ele celebra sabendo que encontrou algo muito especial.", SceneBackdrop.VILLAGE, listOf(a("Trabalhador", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(5, "O Maior Tesouro", "Jesus mostra que o amor de Deus vale mais que todas as joias.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.CROWN),
    ),
    listOf(
      q("O que o homem encontrou cavando no campo?", "Um tesouro precioso escondido", "Um sapato velho", "Uma pedra comum", 0, "Ele encontrou um grande tesouro escondido na terra!"),
      q("Como o homem se sentiu ao achar o tesouro?", "Cheio de alegria", "Com raiva", "Com sono", 0, "Ficou tão alegre que quis conquistar aquele campo!"),
      q("O que ele fez para poder comprar o campo?", "Vendeu tudo o que tinha", "Pediu emprestado e fugiu", "Desistiu", 0, "Ele abriu mão de tudo pelo tesouro maior!"),
      q("O que o tesouro representa?", "O Reino de Deus e o amor de Jesus", "Moedas de chocolate", "Brinquedos caros", 0, "Viver com Jesus é o bem mais valioso da vida!"),
      q("O amor de Deus pode ser comprado com dinheiro?", "Não, é um presente recebido pela fé", "Sim, custa caro", "Só para reis", 0, "Deus nos dá Seu amor gratuitamente!")
    )
  ),
  story(77, 8, "A Pérola Preciosa", "🦪", Testament.NOVO, DifficultyLevel.MEDIO, "Mateus 13:45–46", "Pérola Brilhante", "🌊",
    "Vale a pena escolher Jesus em primeiro lugar todos os dias!",
    listOf(
      "Um mercador viajava por feiras de muitos países procurando pérolas bonitas e raras vindas do fundo do mar. 🌊",
      "Ele tinha visto centenas de pérolas brancas e rosadas em caixinhas de veludo! ✨",
      "Certo dia, seus olhos avistaram UMA pérola perfeita, tão brilhante e linda que não havia outra igual no mundo inteiro! 🦪",
      "Sem pensar duas vezes, ele vendeu todas as outras pérolas que possuía para conseguir aquela pérola única! 💎",
      "Ele voltou para casa segurando a pérola com um sorriso imenso e o coração realizado! 😊",
      "Assim também é caminhar com Deus: quando colocamos Deus em primeiro lugar, nossa vida brilha de verdade! ❤️"
    ),
    listOf(
      sc(0, "Buscando Pérolas", "O viajante observa várias pérolas nas feiras do reino.", SceneBackdrop.VILLAGE, listOf(a("Mercador", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.PEACEFUL, SceneProp.BASKET))),
      sc(2, "A Pérola Única!", "Ele encontra a pérola mais linda e luminosa de todas.", SceneBackdrop.OCEAN_ARK, listOf(a("Mercador", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.AWED)), SceneProp.STAR),
      sc(5, "Alegria Verdadeira", "Ter Deus em primeiro lugar traz luz e alegria.", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("O que o mercador colecionava e procurava?", "Pérolas preciosas", "Carimbos", "Chapéus", 0, "Ele era um especialista em encontrar belas pérolas."),
      q("O que ele fez ao encontrar a pérola mais valiosa?", "Deu tudo o que tinha por ela", "Deixou para lá", "Quebrou", 0, "Ele percebeu que aquela única pérola valia todas as outras!"),
      q("Quem é nossa 'Pérola Preciosa'?", "Jesus e Sua amizade", "Um videogame", "Um relógio", 0, "Nada se compara à alegria de conhecer Jesus!"),
      q("Qual deve ser o primeiro lugar no nosso coração?", "Deus", "Brigas", "Orgulho", 0, "Colocar Deus em primeiro lugar organiza todo o resto!"),
      q("Como o mercador se sentiu ao consegui-la?", "Muito feliz e realizado", "Arrependido", "Triste", 0, "Escolher o Reino de Deus sempre traz alegria verdadeira!")
    )
  ),
  story(78, 8, "O Pequeno Grão de Mostarda", "🌱", Testament.NOVO, DifficultyLevel.FACIL, "Mateus 13:31–32", "Grande Árvore", "🐦",
    "Mesmo gestos pequeninos de amor podem crescer e virar grandes bênçãos!",
    listOf(
      "Jesus mostrou na palma da mão uma sementinha minúscula de mostarda — menor que a cabeça de um alfinete! 🔍",
      "Os amigos olharam curiosos: 'Nossa, Jesus! Como uma coisa tão pequenininha pode fazer diferença?' 😮",
      "Jesus sorriu e contou: 'Quando alguém planta esse grãozinho no jardim, ele começa a crescer devagarinho!' 🌱",
      "Com sol e água, ele vira a maior planta da horta, ficando alto como uma árvore forte cheia de galhos! 🌳",
      "Logo os passarinhos coloridos vêm fazer ninhos seguros e cantar felizes em seus ramos! 🐦🎶",
      "Assim é a fé e a bondade: um pequeno sorriso, uma oração ou ajuda simples cresce e abriga muita gente! ❤️"
    ),
    listOf(
      sc(0, "Uma Sementinha Minúscula", "Jesus mostra o pequeno grão de mostarda aos amigos.", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Criança", 0xFFF2A93B, 0xFF3A2820, CharacterMood.AWED))),
      sc(3, "Crescendo Forte!", "A pequena semente se transforma em árvore frondosa.", SceneBackdrop.GARDEN, listOf(a("Criança", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.TREE)), SceneProp.TREE),
      sc(4, "Passarinhos nos Galhos", "Aves descansam seguras na árvore acolhedora.", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.DOVE)), SceneProp.DOVE),
    ),
    listOf(
      q("Como é o tamanho da semente de mostarda?", "Bem pequenininha", "Do tamanho de uma melancia", "Igual a uma bola", 0, "É uma das menores sementes do jardim!"),
      q("No que o grão de mostarda se transforma quando cresce?", "Numa árvore grande e cheia de galhos", "Numa pedra", "Numa flor seca", 0, "Ele cresce surpreendentemente grande!"),
      q("Quem faz ninhos em seus galhos?", "Os passarinhos", "Os peixes", "Os leões", 0, "As aves encontram abrigo e descanso na árvore."),
      q("O que Jesus ensina com essa semente?", "Pequenas atitudes de fé crescem muito", "Só coisas gigantes importam", "Não vale tentar", 0, "Mesmo crianças pequenas podem semear grandes bênçãos!"),
      q("Dê um exemplo de pequeno gesto que cresce:", "Ajudar um amigo ou orar por alguém", "Empurrar", "Desperdiçar", 0, "Pequenos atos de bondade mudam o mundo!")
    )
  ),
  story(79, 8, "A Moeda Perdida", "🪙", Testament.NOVO, DifficultyLevel.FACIL, "Lucas 15:8–10", "Busca com Amor", "🕯️",
    "Deus nunca desiste de procurar e cuidar de cada pessoa especial que Ele criou!",
    listOf(
      "Jesus contou outra história bonita: uma mulher tinha dez moedinhas de prata guardadas com muito carinho! 🪙",
      "Um dia ela contou e percebeu que faltava UMA! 'Onde será que minha moedinha caiu?' 😟",
      "Ela não disse 'ah, ainda tenho nove'. Não! Ela acendeu a lamparina para iluminar cada cantinho escuro da casa! 🕯️",
      "Pegou a vassoura e varreu devagarinho embaixo da mesa, atrás dos potes e perto da porta procurando com paciência! 🧹",
      "TLIC! Um brilho prateado apareceu no chão! Ela achou a moeda perdida! ✨",
      "Radiante, chamou todas as vizinhas para festejar! Jesus disse que os anjos no céu vibram assim por cada pessoa que volta para Deus! 👼🎉"
    ),
    listOf(
      sc(2, "Procurando com a Lamparina", "A mulher ilumina os cantos da casa procurando a moeda.", SceneBackdrop.VILLAGE, listOf(a("Mulher", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.WORRIED, SceneProp.LAMP))),
      sc(4, "Moeda Encontrada!", "Ela sorri aliviada ao encontrar a moeda brilhando.", SceneBackdrop.VILLAGE, listOf(a("Mulher", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.STAR))),
      sc(5, "Alegria no Céu", "Anjos celebram cada pessoa amada por Deus.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS)), SceneProp.STAR),
    ),
    listOf(
      q("Quantas moedas a mulher tinha antes de perder uma?", "Dez moedas", "Duas moedas", "Cem moedas", 0, "Ela tinha dez moedas de prata e cuidava de todas."),
      q("O que ela usou para iluminar a casa escura?", "Uma lamparina acesa", "Uma lanterna solar", "Um espelho", 0, "Ela acendeu a lamparina e varreu toda a casa!"),
      q("Ela desistiu de procurar porque ainda tinha nove?", "Não! Procurou até encontrar", "Sim, foi dormir", "Jogou as outras fora", 0, "Cada única moeda era super importante para ela."),
      q("O que ela fez quando achou a moeda?", "Chamou as amigas para comemorar", "Escondeu embaixo do tapete", "Ficou triste", 0, "A alegria foi tão grande que ela compartilhou com todos!"),
      q("Quem se alegra quando alguém se aproxima de Deus?", "Os anjos no céu e Deus", "Ninguém", "Só os reis", 0, "Há festa no céu por cada coração que ama a Deus!")
    )
  ),
  story(80, 8, "O Fariseu e o Publicano na Oração", "🙏", Testament.NOVO, DifficultyLevel.MEDIO, "Lucas 18:9–14", "Oração Humilde", "❤️",
    "Deus ama a oração sincera e humilde, muito mais do que palavras orgulhosas!",
    listOf(
      "Jesus observava duas pessoas que foram orar no templo e contou uma história para ensinar sobre humildade. 🏛️",
      "O primeiro era um homem orgulhoso que ficou bem na frente falando alto: 'Deus, obrigado porque sou perfeito e melhor que os outros!' 😤",
      "Ele não agradeceu com amor nem pediu ajuda — só queria se exibir para todo mundo olhar! 😔",
      "Bem lá atrás, quase escondido, estava outro homem que tinha errado muitas vezes. Ele nem tinha coragem de olhar para o céu! 🥺",
      "Ele abaixou a cabeça, bateu de leve no peito e orou baixinho: 'Ó Deus, tenha misericórdia de mim e perdoe os meus erros!' 🙏",
      "Jesus disse: 'Foi o homem humilde quem voltou para casa perdoado e em paz com Deus! Quem se humilha será exaltado!' ❤️✨"
    ),
    listOf(
      sc(1, "Oração Orgulhosa", "O homem orgulhoso fala de si mesmo achando que é melhor.", SceneBackdrop.TEMPLE, listOf(a("Orgulhoso", 0xFFE76F51, 0xFF2D2520, CharacterMood.TEMPTING))),
      sc(4, "Oração Sincera e Humilde", "O homem humilde pede perdão a Deus com sinceridade.", SceneBackdrop.TEMPLE, listOf(a("Humilde", 0xFF3E92CC, 0xFF4A3525, CharacterMood.SAD))),
      sc(5, "Paz no Coração", "Deus acolhe e perdoa quem ora com humildade.", SceneBackdrop.CROSS_SUNRISE, listOf(a("Humilde", 0xFF3E92CC, 0xFF4A3525, CharacterMood.PEACEFUL)), SceneProp.DOVE),
    ),
    listOf(
      q("Onde os dois homens foram orar?", "No templo", "No mercado", "Na praia", 0, "Ambos entraram no templo para fazer suas orações."),
      q("Como o primeiro homem orou?", "Com orgulho, dizendo ser melhor que os outros", "Pedindo perdão", "Em silêncio humilde", 0, "Ele se gabava de si mesmo em vez de falar com humildade."),
      q("O que o segundo homem pediu a Deus?", "Perdão e misericórdia com humildade", "Moedas de ouro", "Fama", 0, "Ele reconheceu seus erros e pediu perdão sincero."),
      q("Qual dos dois voltou em paz e perdoado por Deus?", "O homem humilde", "O orgulhoso", "Nenhum", 0, "Deus sempre ouve o coração sincero e humilde!"),
      q("Como devemos conversar com Deus na oração?", "Com verdade, carinho e humildade", "Nos achando perfeitos", "Só repetindo sem pensar", 0, "Deus ama quando falamos com Ele como filhos sinceros!")
    )
  ),
)
