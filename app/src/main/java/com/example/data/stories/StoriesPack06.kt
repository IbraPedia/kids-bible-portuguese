package com.example.data.stories

import com.example.model.*

val storiesPack06: List<BibleStory> = listOf(
  story(26, 3, "O Maná do Céu", "🍯", Testament.ANTIGO, DifficultyLevel.FACIL, "Êxodo 16", "Pão do Céu", "✨",
    "Deus cuida das nossas necessidades de cada dia com amor e fartura.",
    listOf(
      "Caminhando pelo deserto quente, o povo começou a ficar com muita fome e reclamou: 'O que vamos comer aqui?' 😋",
      "Moisés orou a Deus, que respondeu com bondade: 'Vou fazer chover pão do céu todas as manhãs!' 🍞",
      "Na manhã seguinte, o chão do acampamento estava branquinho como geada doce! Eram flocos deliciosos com sabor de mel. 🍯",
      "Eles perguntaram admirados: 'Que é isto?' (Maná!). Deus pediu que colhessem apenas o suficiente para cada dia. 🧺",
      "Na sexta-feira colhiam em dobro para descansar tranquilos no sábado especial de adoração. 🙏",
      "Durante quarenta anos inteiros no deserto, o maná nunca faltou nem um só dia! Deus é fiel! ❤️"
    ),
    listOf(
      sc(0, "Fome no Deserto", "O povo cansado conversa com Moisés sobre comida.", SceneBackdrop.DESERT, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL, SceneProp.STAFF), a("Criança", 0xFFF2A93B, 0xFF3A2820, CharacterMood.WORRIED))),
      sc(2, "Manhã de Maná!", "Famílias colhem alegres os flocos docinhos no chão.", SceneBackdrop.DESERT, listOf(a("Criança", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BASKET), a("Mãe", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.BREAD_CUP)), SceneProp.STAR),
      sc(5, "Cuidado Diário", "Todos agradecem felizes pelo alimento de cada manhã.", SceneBackdrop.GARDEN, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.AWED)), SceneProp.BREAD_CUP),
    ),
    listOf(
      q("Como se chamava o alimento que vinha do céu?", "Maná", "Pipoca", "Queijo", 0, "Eles chamaram de maná, que parecia flocos com gosto de mel!"),
      q("Qual era o sabor do maná?", "Bolacha com mel", "Salgado", "Azedo", 0, "A Bíblia diz que tinha gosto doce como bolo de mel."),
      q("Quando eles colhiam o maná?", "Todas as manhãs", "Só no inverno", "À meia-noite", 0, "Todo dia bem cedinho o maná cobria o chão."),
      q("O que acontecia na sexta-feira?", "Colhiam o dobro para o sábado", "Não comiam", "Viajavam de barco", 0, "Colhiam para dois dias para descansar no sábado!"),
      q("O que o maná nos ensina?", "Confiar que Deus cuida de nós cada dia", "Reclamar sempre", "Guardar tudo com egoísmo", 0, "Podemos agradecer pelo alimento de todos os dias!")
    )
  ),
  story(27, 3, "Água que Sai da Rocha", "🪨", Testament.ANTIGO, DifficultyLevel.FACIL, "Êxodo 17", "Fonte Viva", "💧",
    "Deus pode fazer brotar alegria e refrigério até nos lugares mais secos.",
    listOf(
      "Depois de muito andar sob o sol do deserto, as garrafas de água secaram e todo mundo sentiu muita sede! 🥵",
      "As pessoas começaram a reclamar outra vez com Moisés, que correu para falar com Deus em oração. 🙏",
      "Deus disse com ternura: 'Pegue seu cajado, vá diante do povo e bata naquela grande rocha em Horebe.' 🪨",
      "Moisés confiou, caminhou até a pedra dura e bateu nela com seu cajado diante de todos os anciãos. 🪄",
      "Na mesma hora, jorrou da pedra uma cachoeira fresquinha e cristalina de água pura! 💦",
      "Crianças, adultos e bichinhos beberam e riram refrescados, vendo o poder amoroso de Deus! 😊"
    ),
    listOf(
      sc(0, "Sede no Caminho", "Viajantes cansados procuram água no deserto.", SceneBackdrop.DESERT, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.WORRIED, SceneProp.STAFF), a("Viajante", 0xFFE76F51, 0xFF3A2820, CharacterMood.SAD))),
      sc(3, "Batendo na Rocha", "Moisés toca a rocha confiando na ordem de Deus.", SceneBackdrop.MOUNTAIN, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.BRAVE, SceneProp.STAFF)), SceneProp.STONE),
      sc(4, "Água Fresquinha!", "Todos comemoram a fonte maravilhosa que brotou da pedra.", SceneBackdrop.RIVER, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY), a("Criança", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Do que o povo precisava muito no deserto?", "De água fresca", "De sapatos novos", "De neve", 0, "Eles estavam com muita sede no deserto quente."),
      q("O que Moisés fez quando o povo reclamou?", "Orou pedindo ajuda a Deus", "Fugiu", "Gritou de volta", 0, "Moisés sempre levava os problemas a Deus em oração."),
      q("Onde Moisés bateu com seu cajado?", "Numa grande rocha", "Numa árvore", "Num tambor", 0, "Deus mandou Moisés tocar a rocha."),
      q("O que saiu da rocha?", "Água pura e abundante", "Fumaça", "Areia", 0, "Jorrou água suficiente para todo o povo e os animais!"),
      q("O que devemos fazer antes de reclamar?", "Orar e confiar em Deus", "Chorar alto", "Brigar com os amigos", 0, "A oração abre portas para milagres!")
    )
  ),
  story(28, 3, "Os Dez Mandamentos", "📜", Testament.ANTIGO, DifficultyLevel.MEDIO, "Êxodo 19–20", "Leis de Amor", "❤️",
    "As leis de Deus não existem para tirar a alegria, mas para ensinar a amar Deus e o próximo.",
    listOf(
      "O povo chegou ao pé do imponente Monte Sinai, coberto por uma nuvem brilhante e som de trombetas celestiais! ⛰️🎺",
      "Moisés subiu o monte para ouvir Deus, que queria ensinar como viver em paz, amor e respeito uns com os outros. ✨",
      "Deus escreveu com Seu dedo em duas tábuas de pedra dez regras preciosas: Os Dez Mandamentos! 📜",
      "Os primeiros ensinam a amar Deus acima de tudo e guardar um dia especial para descansar e agradecer. 🙏",
      "Os outros ensinam a respeitar papai e mamãe, não mentir, não pegar o que é dos outros e amar a todos! 👨‍👩‍👧",
      "Moisés desceu do monte com as tábuas para guiar o povo com sabedoria e carinho! 💛"
    ),
    listOf(
      sc(0, "O Monte Sinai", "Trombetas e luz brilham no alto da montanha.", SceneBackdrop.MOUNTAIN, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.AWED, SceneProp.STAFF)), SceneProp.TRUMPET),
      sc(2, "As Tábuas de Pedra", "Moisés recebe os Dez Mandamentos escritos por Deus.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL, SceneProp.SCROLL)), SceneProp.STAR),
      sc(4, "Regras de Amor", "Famílias aprendem a respeitar e amar uns aos outros.", SceneBackdrop.VILLAGE, listOf(a("Pai", 0xFF3E92CC, 0xFF4A3525, CharacterMood.HAPPY), a("Filha", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Em qual monte Moisés recebeu os Dez Mandamentos?", "Monte Sinai", "Monte Everest", "Monte Verde", 0, "Foi no Monte Sinai que Deus entregou os mandamentos."),
      q("Onde foram escritos os Dez Mandamentos?", "Em duas tábuas de pedra", "Num caderno", "Na areia", 0, "Deus gravou Suas leis em duas tábuas de pedra."),
      q("O que os primeiros mandamentos ensinam?", "Amar e honrar somente a Deus", "Correr rápido", "Pular corda", 0, "Ensinam que Deus vem sempre em primeiro lugar."),
      q("O que diz o mandamento sobre pai e mãe?", "Honrar e respeitar papai e mamãe", "Ignorar os pais", "Fazer birra", 0, "Devemos honrar e obedecer nossos pais com carinho!"),
      q("Por que Deus nos deu Seus mandamentos?", "Para vivermos felizes, seguros e em paz", "Para nos deixar tristes", "Sem motivo", 0, "As leis de Deus são regras de proteção e amor.")
    )
  ),
  story(29, 3, "O Bezerro de Ouro", "🐂", Testament.ANTIGO, DifficultyLevel.DESAFIO, "Êxodo 32", "Fidelidade Pura", "🙏",
    "Nunca devemos trocar o Deus vivo e verdadeiro por objetos ou coisas passageiras.",
    listOf(
      "Enquanto Moisés passava dias no alto do Monte Sinai falando com Deus, o povo lá embaixo ficou impaciente. ⏳",
      "Eles pediram a Arão: 'Faça um deus que possamos ver!' Então derreteram brincos e pulseiras douradas e fizeram um bezerro de ouro! 🪙",
      "Começaram a dançar em volta da estátua esquecendo que havia sido o Deus vivo quem abriu o Mar Vermelho! 😔",
      "Quando Moisés desceu com as tábuas e viu aquilo, ficou tão triste que as tábuas caíram e se quebraram! 😢",
      "Moisés explicou ao povo que uma estátua de metal não vê, não ouve e não ama ninguém como Deus ama. 🙏",
      "O povo pediu perdão, e Moisés subiu o monte outra vez pedindo a misericórdia de Deus, que perdoou e refez as tábuas! ❤️"
    ),
    listOf(
      sc(1, "Impaciência no Acampamento", "O povo esquece de esperar e cria uma estátua dourada.", SceneBackdrop.DESERT, listOf(a("Arão", 0xFF3E92CC, 0xFF4A3525, CharacterMood.WORRIED), a("Mulher", 0xFFE76F51, 0xFF3A2820, CharacterMood.SURPRISED))),
      sc(3, "A Tristeza de Moisés", "Moisés chega do monte triste ao ver a desobediência.", SceneBackdrop.MOUNTAIN, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.SAD, SceneProp.SCROLL))),
      sc(5, "Perdão e Recomeço", "Deus perdoa o povo arrependido e renova Sua aliança.", SceneBackdrop.CROSS_SUNRISE, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL, SceneProp.SCROLL)), SceneProp.DOVE),
    ),
    listOf(
      q("O que o povo fez enquanto Moisés demorava no monte?", "Um bezerro de ouro", "Uma casa na árvore", "Um barco", 0, "Ficaram impacientes e fizeram uma estátua de ouro."),
      q("De onde veio o ouro para a estátua?", "Das joias do povo", "De uma mina secreta", "Do fundo do mar", 0, "Eles derreteram brincos e anéis dourados."),
      q("Por que adorar estátuas é errado?", "Porque só Deus é vivo e nos ama", "Porque ouro é feio", "Porque pesa muito", 0, "Uma estátua não tem vida; só Deus merece adoração!"),
      q("Como Moisés reagiu ao ver o erro?", "Ficou muito triste e corrigiu o povo", "Dançou junto", "Foi embora", 0, "Moisés ensinou o caminho certo e orou pedindo perdão."),
      q("O que Deus fez quando o povo se arrependeu?", "Perdoou e renovou Suas leis", "Nunca mais falou", "Mandou embora", 0, "Deus é misericordioso com quem se arrepende de verdade!")
    )
  ),
  story(30, 3, "O Lindo Tabernáculo", "⛺", Testament.ANTIGO, DifficultyLevel.MEDIO, "Êxodo 35–40", "Casa de Oração", "🕯️",
    "Cada dom que temos — pintar, costurar, cantar ou ajudar — pode servir a Deus com alegria!",
    listOf(
      "Deus pediu a Moisés para construir uma tenda especial bem bonita chamada Tabernáculo, onde o povo pudesse orar junto. ⛺",
      "Moisés convidou todos que quisessem doar materiais ou talentos com alegria no coração! 🎨",
      "As famílias trouxeram tecidos azuis, púrpuras, fios dourados, madeira cheirosa e pedras brilhantes com tanta generosidade que sobrou! 🧵",
      "Artistas habilidosos como Bezalel e Aoliabe desenharam o candelabro de ouro de sete pontas e a Arca da Aliança. 🕯️",
      "Quando o Tabernáculo ficou pronto, uma nuvem gloriosa de Deus encheu a tenda mostrando que Ele estava bem ali no meio deles! ☁️✨",
      "Sempre que a nuvem subia, o povo arrumava as malas feliz para caminhar com Deus! 🚶"
    ),
    listOf(
      sc(1, "Ofertas com Alegria", "Homens, mulheres e crianças trazem tecidos e dons.", SceneBackdrop.VILLAGE, listOf(a("Artesão", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.HAPPY), a("Criança", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BASKET))),
      sc(3, "Arte para Deus", "O candelabro dourado e os belos tecidos ficam prontos.", SceneBackdrop.TEMPLE, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.AWED, SceneProp.LAMP)), SceneProp.LAMP),
      sc(4, "A Nuvem da Presença", "Luz celestial ilumina a linda tenda de adoração.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Moisés", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL)), SceneProp.STAR),
    ),
    listOf(
      q("O que era o Tabernáculo?", "Uma tenda especial de adoração a Deus", "Um navio pirata", "Uma escola de futebol", 0, "Era a linda tenda onde o povo adorava a Deus no deserto."),
      q("Como o povo contribuiu para construir?", "Com doações alegres e talentos", "Obrigados e bravos", "Com pedras comuns", 0, "Todos doaram de coração tão alegre que até sobrou material!"),
      q("Quem trabalhou na arte do Tabernáculo?", "Artistas e artesãos cheios de sabedoria", "Apenas soldados", "Visitantes", 0, "Deus deu criatividade especial a Bezalel e outros artistas."),
      q("O que encheu a tenda quando ficou pronta?", "A nuvem gloriosa da presença de Deus", "Água do mar", "Areia", 0, "Deus mostrou que habitava pertinho do Seu povo!"),
      q("Como podemos usar nossos talentos hoje?", "Para ajudar pessoas e alegrar a Deus", "Só para competir", "Escondendo tudo", 0, "Desenhar, ajudar e cuidar são formas lindas de servir!")
    )
  ),
)
