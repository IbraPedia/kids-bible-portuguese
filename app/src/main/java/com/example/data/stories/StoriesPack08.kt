package com.example.data.stories

import com.example.model.*

val storiesPack08: List<BibleStory> = listOf(
  story(36, 4, "O Pequeno Samuel Ouve Deus", "👂", Testament.ANTIGO, DifficultyLevel.FACIL, "1 Samuel 3", "Ouvido Atento", "🕯️",
    "Deus ama ouvir e falar até com as crianças bem pequenas!",
    listOf(
      "Ana orou muito por um filho e, quando Samuel nasceu, ela o levou para ajudar o velho sacerdote Eli no templo! 🏛️",
      "O pequeno Samuel gostava de acender as lamparinas, abrir as portas e servir com um sorriso doce. 🕯️",
      "Uma noite, enquanto Samuel dormia em sua caminha, ouviu uma voz chamar: 'Samuel! Samuel!' 😮",
      "Ele correu até o quarto de Eli dizendo: 'Estou aqui, senhor! O senhor me chamou?' Mas Eli respondeu que não tinha chamado! 🛏️",
      "Isso aconteceu três vezes! Então Eli sorriu sábio e disse: 'É Deus quem está chamando você! Diga: Fala, Senhor, que o teu servo ouve.' ✨",
      "Quando Deus chamou de novo, Samuel respondeu prontinho e cresceu como um grande profeta cheio de sabedoria! 🌟"
    ),
    listOf(
      sc(1, "Ajudando no Templo", "O pequeno Samuel acende a lamparina com carinho.", SceneBackdrop.TEMPLE, listOf(a("Samuel", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.LAMP), a("Eli", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.PEACEFUL))),
      sc(3, "Quem Me Chamou?", "Samuel corre até Eli durante a noite estrelada.", SceneBackdrop.TEMPLE, listOf(a("Samuel", 0xFF3E92CC, 0xFF3A2820, CharacterMood.SURPRISED), a("Eli", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.PEACEFUL)), SceneProp.STAR),
      sc(5, "Fala, Senhor!", "Samuel ouve a voz de Deus com o coração atento.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Samuel", 0xFF3E92CC, 0xFF3A2820, CharacterMood.AWED)), SceneProp.STAR),
    ),
    listOf(
      q("Onde o pequeno Samuel morava e ajudava?", "No templo de Deus com Eli", "Num barco", "Num deserto vazio", 0, "Sua mãe Ana o dedicou para servir no templo desde pequeno."),
      q("Quantas vezes Samuel foi até Eli achando que ele o chamava?", "Três vezes", "Uma vez", "Dez vezes", 0, "Na terceira vez Eli percebeu que era a voz de Deus!"),
      q("O que Eli ensinou Samuel a responder?", "Fala, Senhor, que o teu servo ouve", "Agora não posso", "Quem está aí?", 0, "Essa resposta mostra um coração pronto para obedecer."),
      q("Como Samuel se tornou quando cresceu?", "Um grande profeta sábio", "Um pirata", "Um caçador", 0, "Samuel guiou o povo com a palavra de Deus."),
      q("Deus também fala com crianças?", "Sim! Ele ama todas as crianças", "Não", "Só com reis", 0, "Deus conhece e ama o coração de cada criança!")
    )
  ),
  story(37, 4, "Saul, o Primeiro Rei", "👑", Testament.ANTIGO, DifficultyLevel.MEDIO, "1 Samuel 9–15", "Coração Obediente", "⚖️",
    "Obedecer a Deus com humildade é mais importante que qualquer coroa brilhante.",
    listOf(
      "O povo de Israel pediu a Samuel: 'Queremos um rei como todas as outras nações!' 👑",
      "Deus escolheu um jovem muito alto chamado Saul. No começo Saul era humilde e até tímido! 😊",
      "Samuel ungiu a cabeça de Saul com óleo perfumado e todo o povo gritou feliz: 'Viva o rei Saul!' 🎉",
      "Enquanto Saul ouviu os conselhos de Deus, ele venceu batalhas e protegeu as cidades com coragem. 🛡️",
      "Mas aos poucos, Saul ficou orgulhoso e quis fazer tudo do seu próprio jeito em vez de obedecer ao Senhor. 😔",
      "Samuel explicou com tristeza: 'Obedecer a Deus é melhor do que grandes festas!' Por isso Deus já preparava um novo rei segundo o Seu coração. 💛"
    ),
    listOf(
      sc(2, "Coroado Rei", "Samuel unge Saul diante do povo alegre.", SceneBackdrop.VILLAGE, listOf(a("Samuel", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.PEACEFUL), a("Saul", 0xFF3E92CC, 0xFF2D2520, CharacterMood.SURPRISED, SceneProp.CROWN))),
      sc(4, "Desobediência no Trono", "Saul fica preocupado ao escolher o próprio caminho.", SceneBackdrop.THRONE, listOf(a("Saul", 0xFF3E92CC, 0xFF2D2520, CharacterMood.WORRIED, SceneProp.CROWN), a("Samuel", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.SAD))),
      sc(5, "Lição de Humildade", "Obedecer com sinceridade agrada a Deus.", SceneBackdrop.MOUNTAIN, listOf(a("Samuel", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.PEACEFUL, SceneProp.SCROLL))),
    ),
    listOf(
      q("Quem foi o primeiro rei de Israel?", "Saul", "Davi", "José", 0, "Saul foi o primeiro rei ungido por Samuel."),
      q("O que mudou em Saul depois de um tempo?", "Ficou orgulhoso e desobediente", "Ficou baixinho", "Virou pescador", 0, "O orgulho afastou Saul da obediência."),
      q("O que Samuel disse que vale mais que tudo?", "Obedecer a Deus", "Ter muito ouro", "Gritar alto", 0, "A obediência sincera alegra o coração do Pai!"),
      q("Como Saul era no comecinho?", "Humilde e tímido", "Muito bravo", "Preguiçoso", 0, "No início ele era humilde, mas deixou o orgulho entrar."),
      q("Que atitude devemos guardar sempre?", "Humildade para ouvir e obedecer", "Fazer tudo sem ouvir ninguém", "Mandar nos amigos", 0, "A humildade nos mantém perto da sabedoria!")
    )
  ),
  story(38, 4, "Davi, o Pequeno Pastor", "🎶", Testament.ANTIGO, DifficultyLevel.FACIL, "1 Samuel 16 e Salmo 23", "Harpa do Amor", "🐑",
    "Deus não olha apenas para a altura ou aparência; Ele vê a beleza dentro do coração!",
    listOf(
      "Em Belém vivia um menino ruivo e alegre chamado Davi. Ele passava os dias no campo cuidando das ovelhinhas do pai! 🐑",
      "Enquanto as ovelhas descansavam no pasto verde, Davi tocava uma harpa doce e cantava músicas lindas para Deus! 🎶",
      "Um dia o profeta Samuel visitou a casa de Jessé porque Deus escolhera um dos filhos para ser o futuro rei. 👑",
      "Passaram os irmãos altos e fortes, mas Deus cochichou a Samuel: 'Eu não olho a aparência, Eu vejo o coração!' ❤️",
      "Chamaram o caçula Davi lá do campo! Assim que chegou corado e sorridente, Deus disse: 'É ele!' ✨",
      "Samuel ungiu Davi com óleo, e ele continuou cuidando das ovelhas com o coração cheio de fé! 🌟"
    ),
    listOf(
      sc(1, "Tocando Harpa no Campo", "Davi canta feliz enquanto suas ovelhinhas descansam.", SceneBackdrop.GARDEN, listOf(a("Davi", 0xFF43A06A, 0xFFB85428, CharacterMood.HAPPY, SceneProp.HARP)), SceneProp.SHEEP),
      sc(3, "Deus Vê o Coração", "Samuel olha para os irmãos maiores ouvindo a voz de Deus.", SceneBackdrop.VILLAGE, listOf(a("Samuel", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.PEACEFUL), a("Irmão", 0xFFE76F51, 0xFF2D2520, CharacterMood.BRAVE))),
      sc(5, "O Futuro Rei", "Samuel unge o jovem Davi com alegria e esperança.", SceneBackdrop.VILLAGE, listOf(a("Samuel", 0xFF8C6EC9, 0xFFEEEEEE, CharacterMood.HAPPY), a("Davi", 0xFF43A06A, 0xFFB85428, CharacterMood.AWED, SceneProp.HARP)), SceneProp.STAR),
    ),
    listOf(
      q("Qual era o trabalho de Davi quando criança?", "Pastor de ovelhas", "Ferreiro", "Pescador", 0, "Davi cuidava com carinho do rebanho de seu pai."),
      q("Que instrumento Davi tocava muito bem?", "Harpa", "Bateria", "Piano", 0, "Ele tocava harpa e compunha belos salmos!"),
      q("O que Deus olha nas pessoas?", "O coração", "O tamanho dos sapatos", "A roupa cara", 0, "Deus olha a bondade e a fé dentro do nosso coração."),
      q("Quem ungiu Davi como futuro rei?", "O profeta Samuel", "Golias", "Faraó", 0, "Samuel foi até Belém ungir o pequeno Davi."),
      q("Qual famoso salmo Davi escreveu?", "O Senhor é o meu pastor", "Parabéns a você", "Cai cai balão", 0, "O Salmo 23 lembra como Deus cuida de nós como um bom pastor!")
    )
  ),
  story(39, 4, "Davi e o Gigante Golias", "🪨", Testament.ANTIGO, DifficultyLevel.FACIL, "1 Samuel 17", "Pedrinha da Coragem", "🛡️",
    "Com a ajuda de Deus, até alguém pequeno pode vencer desafios gigantes!",
    listOf(
      "Um exército inimigo trouxe um guerreiro gigante chamado Golias! Ele tinha quase três metros e assustava todos os soldados! 😠",
      "Por quarenta dias Golias gritou desafios, e ninguém tinha coragem de enfrentá-lo... até Davi chegar trazendo pães aos irmãos! 🍞",
      "Davi ouviu Golias desrespeitar a Deus e disse com firmeza: 'Eu vou lutar contra esse gigante! Deus me livrou de leões e ursos!' 💪",
      "A armadura do rei Saul ficou grande demais para Davi. Então ele pegou apenas seu cajado, sua funda e cinco pedrinhas lisas do riacho! 🪨",
      "Golias riu ao ver o menino, mas Davi declarou: 'Você vem com espada, mas eu vou em nome do Senhor!' ⚡",
      "Davi girou a funda, lançou uma única pedrinha certeira na testa de Golias, que caiu no chão! Todo o povo comemorou! 🎉"
    ),
    listOf(
      sc(0, "O Gigante Assustador", "Golias enorme assusta o vale enquanto todos se afastam.", SceneBackdrop.MOUNTAIN, listOf(a("Golias", 0xFFE76F51, 0xFF2D2520, CharacterMood.TEMPTING, SceneProp.STAFF, 1.3f))),
      sc(3, "Cinco Pedrinhas do Riacho", "Davi escolhe pedrinhas lisas confiando em Deus.", SceneBackdrop.RIVER, listOf(a("Davi", 0xFF43A06A, 0xFFB85428, CharacterMood.BRAVE, SceneProp.SLINGSHOT)), SceneProp.STONE),
      sc(5, "Vitória de Davi!", "O pequeno Davi vence o gigante com fé no Senhor.", SceneBackdrop.MOUNTAIN, listOf(a("Davi", 0xFF43A06A, 0xFFB85428, CharacterMood.HAPPY, SceneProp.SLINGSHOT), a("Golias", 0xFFE76F51, 0xFF2D2520, CharacterMood.SURPRISED, SceneProp.NONE, 1.2f)), SceneProp.STAR),
    ),
    listOf(
      q("Qual era o nome do guerreiro gigante?", "Golias", "Sansão", "Abraão", 0, "Golias era um gigante muito alto que assustava os soldados."),
      q("O que Davi usou para enfrentar Golias?", "Uma funda e pedrinhas lisas", "Um escudo de ouro", "Um cavalo", 0, "Davi escolheu usar sua funda de pastor e cinco pedrinhas."),
      q("Por que Davi não usou a armadura de Saul?", "Porque era pesada e grande demais", "Porque era rosa", "Porque quebrou", 0, "Ele não estava acostumado com armadura pesada."),
      q("Em nome de quem Davi enfrentou o gigante?", "Em nome do Senhor Deus", "Em seu próprio nome", "Por aposta", 0, "Davi confiava completamente no poder de Deus!"),
      q("O que Davi nos ensina quando enfrentamos problemas grandes?", "Não ter medo, pois Deus é maior que qualquer gigante", "Correr e chorar", "Desistir antes de tentar", 0, "Com Deus, a coragem vence qualquer medo!")
    )
  ),
  story(40, 4, "A Amizade de Davi e Jônatas", "🤝", Testament.ANTIGO, DifficultyLevel.FACIL, "1 Samuel 18–20", "Amigos de Verdade", "💛",
    "Um verdadeiro amigo alegra-se com o bem do outro e protege com lealdade.",
    listOf(
      "Depois que Davi venceu Golias, ele foi morar no palácio e conheceu Jônatas, o filho do rei Saul. 🏰",
      "Jônatas poderia ter ficado com ciúmes da fama de Davi, mas aconteceu o contrário: eles viraram melhores amigos na hora! 🤝",
      "Em sinal de amizade sincera, Jônatas presenteou Davi com seu próprio manto bonito, seu arco e suas flechas! 🏹",
      "Quando o rei Saul ficou com inveja de Davi e quis fazer-lhe mal, Jônatas defendeu seu amigo com coragem! 🛡️",
      "Eles fizeram uma promessa diante de Deus de sempre cuidarem um do outro e de suas famílias. 🙏",
      "Mesmo quando precisaram se separar para proteger Davi, a amizade verdadeira dos dois durou para sempre! ❤️"
    ),
    listOf(
      sc(2, "Presente de Amizade", "Jônatas entrega seu manto a Davi com um sorriso sincero.", SceneBackdrop.PALACE, listOf(a("Jônatas", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.CLOAK_HELD), a("Davi", 0xFF43A06A, 0xFFB85428, CharacterMood.HAPPY))),
      sc(3, "Protegendo o Amigo", "Jônatas avisa Davi no campo para mantê-lo seguro.", SceneBackdrop.GARDEN, listOf(a("Jônatas", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE), a("Davi", 0xFF43A06A, 0xFFB85428, CharacterMood.PEACEFUL))),
      sc(5, "Promessa Eterna", "Os dois amigos se abraçam confiando em Deus.", SceneBackdrop.MOUNTAIN, listOf(a("Davi", 0xFF43A06A, 0xFFB85428, CharacterMood.HAPPY), a("Jônatas", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.DOVE),
    ),
    listOf(
      q("Quem era o grande amigo de Davi no palácio?", "Jônatas, filho de Saul", "Golias", "Potifar", 0, "Jônatas foi um amigo leal e generoso para Davi."),
      q("O que Jônatas deu a Davi em sinal de amizade?", "Seu manto e suas armas", "Uma bicicleta", "Um barco", 0, "Ele presenteou Davi com seu manto real e seu arco!"),
      q("Jônatas sentiu inveja de Davi?", "Não, ele se alegrou e protegeu Davi", "Sim, brigou muito", "Nunca se falaram", 0, "A verdadeira amizade nunca tem inveja."),
      q("O que eles prometeram um ao outro?", "Sempre cuidar um do outro diante de Deus", "Competir todo dia", "Nunca mais sorrir", 0, "Fizeram uma aliança linda de lealdade!"),
      q("Como podemos ser bons amigos como Jônatas?", "Compartilhando e defendendo nossos amigos", "Rindo dos erros deles", "Escondendo brinquedos", 0, "Amigos verdadeiros se ajudam em todos os momentos!")
    )
  ),
)
