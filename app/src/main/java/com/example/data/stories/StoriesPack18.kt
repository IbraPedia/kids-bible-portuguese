package com.example.data.stories

import com.example.model.*

val storiesPack18: List<BibleStory> = listOf(
  story(86, 9, "Caminhando com Jesus para Emaús", "🚶", Testament.NOVO, DifficultyLevel.MEDIO, "Lucas 24:13–35", "Coração Aquecido", "🔥",
    "Jesus caminha bem do nosso lado mesmo quando não percebemos logo!",
    listOf(
      "Naquele mesmo domingo da Páscoa, dois amigos de Jesus caminhavam tristes pela estrada rumo à vila de Emaús. 😔",
      "Eles conversavam baixinho sem entender tudo o que havia acontecido em Jerusalém. 🚶‍♂️",
      "De repente, um Viajante gentil alcançou os dois e perguntou: 'Por que estão tão tristes caminhando juntos?' 😊",
      "Era o próprio Jesus, mas os olhos deles ainda não O reconheciam! Jesus foi explicando cada história da Bíblia sobre Ele. 📖✨",
      "Chegando à vila ao pôr do sol, convidaram o Viajante para jantar! Quando Ele partiu o pão e agradeceu, seus olhos se abriram! 🍞😲",
      "'Era Jesus!' disseram vibrando, e voltaram correndo à noite toda para contar a todos que seu coração ardia de alegria! ❤️🔥"
    ),
    listOf(
      sc(2, "Um Viajante na Estrada", "Jesus caminha ao lado dos dois amigos explicando as Escrituras.", SceneBackdrop.MOUNTAIN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL), a("Amigo", 0xFF43A06A, 0xFF4A3525, CharacterMood.SAD))),
      sc(4, "Reconhecido ao Partir o Pão!", "Os amigos ficam maravilhados quando reconhecem Jesus à mesa.", SceneBackdrop.VILLAGE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BREAD_CUP), a("Amigo", 0xFF43A06A, 0xFF4A3525, CharacterMood.AWED))),
      sc(5, "Coração Cheio de Alegria", "Os amigos correm contar as boas novas em Jerusalém.", SceneBackdrop.STARRY_NIGHT, listOf(a("Amigo 1", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY), a("Amigo 2", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Para qual vila os dois amigos estavam caminhando?", "Emaús", "Nínive", "Caná", 0, "Eles seguiam pela estrada rumo à aldeia de Emaús."),
      q("Quem começou a caminhar junto deles?", "O próprio Jesus ressuscitado", "Um soldado", "Um rei", 0, "Jesus se juntou a eles para consolar seus corações!"),
      q("O que Jesus fez durante a caminhada?", "Explicou as Escrituras com carinho", "Ficou calado", "Correu na frente", 0, "Ele mostrou na Bíblia o plano lindo do amor de Deus."),
      q("Em qual momento eles reconheceram Jesus?", "Quando Ele abençoou e partiu o pão", "Logo na saída", "No dia seguinte", 0, "Ao partir o pão, seus olhos reconheceram o Mestre!"),
      q("Como o coração deles ficava ouvindo Jesus?", "Aquecido de alegria e esperança", "Com medo", "Triste", 0, "Ouvir a Palavra de Jesus aquece o nosso coração!")
    )
  ),
  story(87, 9, "Tomé Toca as Mãos de Jesus", "✋", Testament.NOVO, DifficultyLevel.MEDIO, "João 20:24–29", "Fé Verdadeira", "✨",
    "Mesmo quando temos dúvidas, Jesus tem paciência e nos ajuda a crer!",
    listOf(
      "Quando Jesus apareceu vivo aos discípulos numa sala fechada, um deles chamado Tomé não estava lá naquele dia! 🏠",
      "Os amigos contaram animados: 'Nós vimos o Senhor vivo!' Mas Tomé disse duvidoso: 'Eu só acredito se tocar nas mãos Dele!' 🤔",
      "Uma semana depois, Tomé estava junto com todos os amigos dentro da sala. De repente... Jesus apareceu bem no meio dizendo: 'Paz seja com vocês!' ✨",
      "Jesus não brigou com Tomé pela dúvida! Ele sorriu com paciência e chamou: 'Tomé, olhe Minhas mãos e acredite!' ✋❤️",
      "Na mesma hora Tomé caiu emocionado e exclamou: 'Meu Senhor e meu Deus!' 😭🌟",
      "Jesus sorriu e deixou uma bênção especial para nós hoje: 'Felizes são os que não viram com os olhos, mas acreditam no coração!' 🎉"
    ),
    listOf(
      sc(1, "A Dúvida de Tomé", "Os amigos contam a novidade enquanto Tomé pensa pensativo.", SceneBackdrop.VILLAGE, listOf(a("Tomé", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.WORRIED), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(3, "Paz Seja com Vocês!", "Jesus aparece carinhoso e mostra suas mãos para Tomé.", SceneBackdrop.VILLAGE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Tomé", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.AWED))),
      sc(5, "Crer com o Coração", "Tomé celebra cheio de fé ao lado dos amigos.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Tomé", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Qual discípulo não estava presente na primeira visita de Jesus?", "Tomé", "Pedro", "João", 0, "Tomé não estava na sala na primeira vez e duvidou."),
      q("Como Jesus tratou a dúvida de Tomé?", "Com paciência, amor e prova real", "Com castigo", "Expulsando ele", 0, "Jesus acolheu Tomé com ternura para fortalecer sua fé!"),
      q("O que Tomé declarou ao ver Jesus?", "Meu Senhor e meu Deus!", "Boa tarde", "Até logo", 0, "A dúvida virou uma linda declaração de fé!"),
      q("Quem Jesus chamou de bem-aventurados (felizes)?", "Os que creem mesmo sem ter visto", "Os que nunca ouvem", "Os que dormem", 0, "Essa bênção é para todas as crianças e adultos hoje!"),
      q("É normal ter perguntas sobre a fé?", "Sim, podemos levar dúvidas a Jesus em oração", "Não, nunca", "Devemos esconder", 0, "Jesus nos ajuda a entender e confiar cada vez mais!")
    )
  ),
  story(88, 9, "Café da Manhã na Praia com Jesus", "🏖️", Testament.NOVO, DifficultyLevel.FACIL, "João 21:1–17", "Fogueira na Praia", "🐟",
    "Jesus perdoa nossos erros com carinho e nos convida a amar ainda mais!",
    listOf(
      "Certa manhã, Pedro e os amigos foram pescar no lago, mas passaram a noite sem pegar nada outra vez! ⛵",
      "Quando amanheceu, viram alguém na areia da praia chamando: 'Joguem a rede do lado direito do barco!' 🌊",
      "Eles obedeceram e pegaram 153 peixões! João sorriu rápido: 'É o Senhor Jesus!' Pedro pulou na água nadando até a praia! 🏊‍♂️",
      "Na areia, Jesus já tinha preparado uma fogueira quentinha com pão e peixinho assado para o café da manhã deles! 🔥🍞🐟",
      "Depois de comerem, Jesus olhou para Pedro com ternura e perguntou três vezes: 'Pedro, você Me ama?' ❤️",
      "Pedro respondeu feliz: 'Sim, Senhor, Tu sabes que Te amo!' E Jesus confiou a Pedro a missão de cuidar das Suas ovelhinhas! 🐑✨"
    ),
    listOf(
      sc(2, "Rede Cheia ao Amanhecer", "Os discípulos reconhecem Jesus acenando da praia.", SceneBackdrop.BOAT, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.FISH_BREAD), a("João", 0xFF43A06A, 0xFF3A2820, CharacterMood.AWED))),
      sc(3, "Fogueira e Peixe na Praia", "Jesus prepara café da manhã especial para Seus amigos.", SceneBackdrop.RIVER, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.FIRE), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.FISH_BREAD))),
      sc(5, "Cuide das Minhas Ovelhas", "Jesus restaura Pedro com amor e uma nova missão.", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.SHEEP))),
    ),
    listOf(
      q("O que Jesus preparou na praia para os amigos?", "Pão e peixe assado na brasa", "Sopa de pedra", "Bolo de milho", 0, "Jesus fez um café da manhã quentinho com pão e peixe!"),
      q("Quantos peixes grandes pegaram do lado direito?", "153 peixes", "2 peixes", "5 peixes", 0, "A rede não rasgou mesmo com 153 peixes grandes!"),
      q("O que Jesus perguntou três vezes a Pedro?", "Você Me ama?", "Você sabe nadar?", "Que horas são?", 0, "Jesus restaurou Pedro com carinho após ele ter errado antes."),
      q("Qual missão Jesus deu a Pedro?", "Cuidar das Suas ovelhas (pessoas)", "Construir um muro", "Sumir", 0, "Quem ama Jesus cuida das pessoas com carinho!"),
      q("Como Jesus nos trata quando pedimos perdão por um erro?", "Com amor e nova oportunidade", "Com rejeição", "Nunca mais fala", 0, "Jesus sempre dá uma nova chance para recomeçarmos!")
    )
  ),
  story(89, 9, "A Grande Missão de Amor", "🗺️", Testament.NOVO, DifficultyLevel.MEDIO, "Mateus 28:16–20", "Ide ao Mundo", "🌍",
    "Jesus promete estar conosco todos os dias enquanto espalhamos Seu amor pelo mundo!",
    listOf(
      "Numa linda montanha da Galileia, Jesus reuniu Seus discípulos para uma conversa muito especial! ⛰️",
      "Todos olhavam atentos para o Mestre que havia vencido a morte e brilhava de paz. ✨",
      "Jesus disse: 'Todo poder no céu e na terra Me foi dado! Agora tenho uma missão incrível para vocês!' 🌟",
      "'Vão por todo o mundo e façam amigos em todos os países, ensinando tudo o que Eu ensinei a vocês com amor!' 🌍❤️",
      "'E nunca se esqueçam desta promessa maravilhosa: Eu estarei com vocês TODOS os dias, até o fim dos tempos!' 🤝",
      "Os discípulos sentiram uma coragem enorme no coração sabendo que nunca caminhariam sozinhos! 💪"
    ),
    listOf(
      sc(0, "Encontro na Montanha", "Jesus reúne Seus amigos na colina para dar a grande missão.", SceneBackdrop.MOUNTAIN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.AWED))),
      sc(3, "Amor para Todas as Nações", "A mensagem de paz deve chegar a todas as crianças do mundo.", SceneBackdrop.GARDEN, listOf(a("João", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.SCROLL), a("Criança", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.RAINBOW),
      sc(4, "Sempre Conosco!", "Jesus promete Sua presença todos os dias da vida.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Para onde Jesus enviou Seus amigos?", "Para todos os povos do mundo", "Só para uma rua", "Para uma caverna", 0, "O amor de Deus é para pessoas de todos os lugares!"),
      q("O que eles deveriam ensinar?", "Tudo o que Jesus ensinou sobre amor e fé", "A ter medo", "A competir", 0, "Deveriam ensinar os caminhos bons de Jesus!"),
      q("Qual promessa linda Jesus deixou no final?", "Estarei com vocês todos os dias!", "Vou esquecer vocês", "Só nos domingos", 0, "Jesus nunca nos deixa sozinhos em nenhum dia!"),
      q("Crianças também podem falar do amor de Jesus?", "Sim, com palavras gentis e boas ações!", "Não", "Só adultos", 0, "Um gesto de amor já mostra Jesus para os colegas!"),
      q("Como os amigos se sentiram com a promessa?", "Cheios de coragem e alegria", "Desanimados", "Com raiva", 0, "Saber que Jesus está conosco dá muita coragem!")
    )
  ),
  story(90, 9, "Jesus Sobe ao Céu em Nuvens", "☁️", Testament.NOVO, DifficultyLevel.FACIL, "Atos 1:1–11", "Olhando ao Céu", "👼",
    "Jesus foi preparar um lugar lindo no céu e prometeu voltar cheio de alegria!",
    listOf(
      "Durante quarenta dias após a ressurreição, Jesus apareceu muitas vezes animando Seus amigos e falando do Reino de Deus. ❤️",
      "Um dia levou todos até o Monte das Oliveiras e prometeu: 'Esperem em Jerusalém, pois vocês receberão o Espírito Santo!' 🕊️",
      "Enquanto Jesus levantava as mãos abençoando cada um com um sorriso sereno, começou a subir suavemente no ar! ☁️✨",
      "Uma nuvem branquinha e luminosa envolveu Jesus, levando-O de volta para o céu junto de Deus Pai! 🌅",
      "Os discípulos ficaram olhando fixo para o céu azul quando dois anjos de roupas brancas apareceram ali do lado! 👼👼",
      "'Por que olham para cima? Esse mesmo Jesus voltará um dia do mesmo jeito!' Eles voltaram para a cidade cheios de esperança! 🎉"
    ),
    listOf(
      sc(1, "A Promessa do Espírito", "Jesus abençoa os discípulos antes de partir.", SceneBackdrop.MOUNTAIN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.AWED))),
      sc(3, "Subindo entre as Nuvens", "Jesus sobe ao céu envolvido por nuvens luminosas.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
      sc(5, "A Mensagem dos Anjos", "Dois anjos dão esperança alegre aos amigos de Jesus.", SceneBackdrop.MOUNTAIN, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS), a("João", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("De qual monte Jesus subiu para o céu?", "Monte das Oliveiras", "Monte Sinai", "Monte Everest", 0, "Foi no lindo Monte das Oliveiras perto de Jerusalém."),
      q("O que Jesus prometeu enviar aos amigos?", "O Espírito Santo", "Carruagens", "Ouro", 0, "O Espírito Santo daria força e alegria para a missão!"),
      q("O que envolveu Jesus quando Ele subia?", "Uma nuvem luminosa", "Fumaça preta", "Chuva de granizo", 0, "Uma nuvem brilhante O levou ao céu."),
      q("Quem falou com os discípulos depois que Jesus subiu?", "Dois anjos com roupas brancas", "Dois soldados", "Ninguém", 0, "Dois mensageiros celestiais lembraram que Jesus voltará!"),
      q("Como os amigos voltaram para Jerusalém?", "Cheios de alegria e oração", "Tristes", "Brigando", 0, "Eles ficaram muito alegres esperando o Espírito Santo!")
    )
  ),
)
