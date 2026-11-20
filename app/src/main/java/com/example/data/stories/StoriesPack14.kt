package com.example.data.stories

import com.example.model.*

val storiesPack14: List<BibleStory> = listOf(
  story(66, 7, "A Filha de Jairo", "👧", Testament.NOVO, DifficultyLevel.MEDIO, "Marcos 5:21–43", "Esperança Viva", "🌸",
    "Mesmo quando tudo parece perdido, Jesus pede: 'Não tenha medo, apenas creia!'",
    listOf(
      "Jairo era um pai desesperado que correu até Jesus porque sua filhinha de doze anos estava muito doente. 😢",
      "Ele se ajoelhou pedindo: 'Por favor, venha colocar Suas mãos sobre ela para que fique curada!' 🙏",
      "Jesus começou a caminhar até a casa dele, mas no caminho chegaram notícias tristes dizendo que a menina tinha dormido para sempre. 😔",
      "O coração do pai apertou, mas Jesus olhou nos olhos dele e disse: 'Não tenha medo! Apenas continue crendo!' ❤️",
      "Ao chegarem no quarto calminho, Jesus segurou a mãozinha da menina e disse suave: 'Menina, eu digo a você: levante-se!' ✨",
      "Na mesma hora ela abriu os olhos, levantou-se sorrindo e correu abraçar papai e mamãe! Jesus até lembrou de darem comida a ela! 🍎🎉"
    ),
    listOf(
      sc(0, "Um Pai Pedindo Ajuda", "Jairo se ajoelha diante de Jesus pedindo pela filha.", SceneBackdrop.VILLAGE, listOf(a("Jairo", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.WORRIED), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL))),
      sc(3, "Não Tenha Medo, Creia!", "Jesus consola o papai Jairo no caminho para casa.", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE), a("Jairo", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.PEACEFUL))),
      sc(5, "Alegria em Casa!", "A menina desperta saudável e feliz nos braços da família.", SceneBackdrop.VILLAGE, listOf(a("Menina", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Por quem Jairo foi pedir ajuda a Jesus?", "Pela sua filhinha doente", "Por seu cavalo", "Por um amigo rico", 0, "Jairo amava muito sua filha e confiou em Jesus."),
      q("O que Jesus disse quando chegaram notícias tristes?", "Não tenha medo, apenas creia!", "Voltemos para trás", "Não dá mais", 0, "Jesus deu esperança ao coração do pai."),
      q("O que Jesus fez no quarto da menina?", "Segurou sua mão e a chamou para levantar", "Gritou bem alto", "Ficou na rua", 0, "Com voz suave e poderosa, Jesus devolveu a vida à menina!"),
      q("O que Jesus pediu para darem à menina depois?", "Comida", "Um livro pesado", "Pedras", 0, "Jesus cuidou até da fome da menina com muito carinho!"),
      q("O que aprendemos sobre Jesus nessa história?", "Ele tem poder até sobre a tristeza mais difícil", "Ele não se importa com famílias", "Devemos ter medo", 0, "Jesus traz vida, amor e esperança às famílias!")
    )
  ),
  story(67, 7, "Os Dez Leprosos e a Gratidão", "🙏", Testament.NOVO, DifficultyLevel.FACIL, "Lucas 17:11–19", "Coração Grato", "💖",
    "Dizer 'muito obrigado' alegra o coração de quem nos ajuda e de Deus!",
    listOf(
      "Perto de uma vila, dez homens estavam muito tristes porque tinham uma doença chamada lepra e não podiam abraçar suas famílias. 😔",
      "Quando viram Jesus passando longe, gritaram juntos: 'Jesus, Mestre, tenha pena de nós e nos cure!' 📣",
      "Jesus olhou com amor e disse: 'Vão mostrar-se aos sacerdotes!' Enquanto caminhavam obedecendo, suas peles ficaram limpinhas! ✨",
      "Todos os dez começaram a pular e correr felizes de volta para suas casas! 🏃",
      "Mas apenas UM deles parou, voltou correndo até Jesus, ajoelhou-se e disse com lágrimas de alegria: 'Muito obrigado, Senhor!' 🙏❤️",
      "Jesus sorriu perguntando pelos outros nove e abençoou aquele homem grato ainda mais! 🌟"
    ),
    listOf(
      sc(1, "Pedindo Cura de Longe", "Os homens chamam Jesus confiando em Sua bondade.", SceneBackdrop.VILLAGE, listOf(a("Homem", 0xFFE76F51, 0xFF4A3525, CharacterMood.SAD), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL))),
      sc(2, "Curados no Caminho!", "Ao obedecerem a Jesus, todos ficam saudáveis no caminho.", SceneBackdrop.GARDEN, listOf(a("Homem 1", 0xFF43A06A, 0xFF3A2820, CharacterMood.SURPRISED), a("Homem 2", 0xFFF2A93B, 0xFF4A3525, CharacterMood.HAPPY))),
      sc(4, "O Único que Voltou para Agradecer", "Um homem volta feliz para dizer muito obrigado a Jesus.", SceneBackdrop.GARDEN, listOf(a("Homem Grato", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.DOVE),
    ),
    listOf(
      q("Quantos homens doentes pediram ajuda a Jesus?", "Dez homens", "Dois homens", "Cinquenta homens", 0, "Dez homens clamaram juntos por cura."),
      q("Quando eles foram curados?", "Enquanto caminhavam obedecendo a Jesus", "No ano seguinte", "Nunca", 0, "No caminho da obediência, Deus realizou o milagre!"),
      q("Quantos voltaram para agradecer a Jesus?", "Apenas um", "Todos os dez", "Cinco", 0, "Só um deles voltou para dizer muito obrigado!"),
      q("Como Jesus se sentiu com a gratidão dele?", "Muito feliz e o abençoou ainda mais", "Indiferente", "Bravo", 0, "Jesus valoriza muito um coração agradecido."),
      q("O que devemos fazer sempre que recebemos ajuda?", "Dizer obrigado com carinho", "Esquecer rápido", "Reclamar", 0, "A gratidão transforma nossos dias e alegra a Deus!")
    )
  ),
  story(68, 7, "O Amigo Descendo pelo Telhado", "🏠", Testament.NOVO, DifficultyLevel.FACIL, "Marcos 2:1–12", "Quatro Amigos", "🤝",
    "Amigos verdadeiros não desistem de ajudar quem precisa chegar perto de Jesus!",
    listOf(
      "Jesus estava ensinando numa casa tão lotada que não cabia mais ninguém nem na porta nem nas janelas! 🏠",
      "Quatro amigos carregavam um amigo paralisado numa maca, querendo muito que Jesus o curasse. 🛏️",
      "Quando viram a multidão na porta, não desistiram! Tiveram uma ideia brilhante e subiram pela escada até o telhado plano! 💡",
      "Com todo cuidado, abriram um espacinho no teto de barro e desceram a maca com cordas bem na frente de Jesus! 😮",
      "Jesus olhou para cima, viu a fé incrível dos amigos e sorriu: 'Amigo, seus erros estão perdoados! Pegue sua maca e ande!' ✨",
      "Na hora o homem levantou pulando de alegria e foi andando para casa agradecendo a Deus e aos amigos! 🎉"
    ),
    listOf(
      sc(1, "Casa Cheia de Gente", "Os quatro amigos carregam o colega buscando Jesus.", SceneBackdrop.VILLAGE, listOf(a("Amigo 1", 0xFF43A06A, 0xFF3A2820, CharacterMood.BRAVE), a("Amigo 2", 0xFFF2A93B, 0xFF4A3525, CharacterMood.BRAVE))),
      sc(3, "Descendo pelo Teto!", "Os amigos baixam a maca com carinho bem diante de Jesus.", SceneBackdrop.VILLAGE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Homem Curado", 0xFFE76F51, 0xFF3A2820, CharacterMood.SURPRISED))),
      sc(5, "Andando e Pulando!", "O homem caminha feliz celebrando a cura com seus amigos.", SceneBackdrop.GARDEN, listOf(a("Homem Curado", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY), a("Amigo 1", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Quantos amigos carregavam o homem na maca?", "Quatro amigos", "Um amigo", "Dez amigos", 0, "Quatro amigos fiéis trabalharam juntos para ajudar!"),
      q("Por onde eles entraram na casa cheia?", "Por uma abertura no telhado", "Pela chaminé", "Por baixo da terra", 0, "Subiram no teto e desceram o amigo com cordas."),
      q("O que Jesus admirou mais?", "A fé e o amor dos amigos", "O tamanho das cordas", "A cor da maca", 0, "Jesus viu o amor gigante daqueles amigos!"),
      q("O que aconteceu com o homem paralisado?", "Levantou-se e saiu andando curado", "Continuou deitado", "Dormiu", 0, "Jesus o perdoou e o curou completamente!"),
      q("Como podemos ser amigos assim?", "Ajudando e orando pelos nossos colegas sem desistir", "Deixando colegas para trás", "Rindo quando caem", 0, "A verdadeira amizade encontra jeitos criativos de ajudar!")
    )
  ),
  story(69, 7, "Lázaro Sai da Caverna Vivo!", "🌅", Testament.NOVO, DifficultyLevel.MEDIO, "João 11", "Amigo Ressuscitado", "💐",
    "Jesus chora com quem está triste e traz esperança nova onde havia dor!",
    listOf(
      "Jesus tinha três amigos muito queridos em Betânia: Lázaro e suas irmãs Marta e Maria. ❤️",
      "Um dia Lázaro ficou muito doente e morreu antes de Jesus chegar à cidade. Marta e Maria choravam muito! 😢",
      "Quando Jesus viu Suas amigas chorando, Ele também chorou de amor e compaixão junto delas. 💧",
      "Jesus caminhou até a caverna fechada por uma pedra grande e pediu: 'Tirem a pedra!' 🪨",
      "Jesus orou ao Pai e gritou bem forte: 'Lázaro, venha para fora!' 📣",
      "De repente Lázaro saiu caminhando vivo e saudável! As irmãs abraçaram Jesus chorando de alegria! 🎉✨"
    ),
    listOf(
      sc(2, "Jesus Consola Marta e Maria", "Jesus sente compaixão e chora junto com as amigas.", SceneBackdrop.VILLAGE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.SAD), a("Maria", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.SAD))),
      sc(4, "Lázaro, Venha para Fora!", "Jesus chama Seu amigo diante da pedra aberta.", SceneBackdrop.MOUNTAIN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE), a("Marta", 0xFFF2A93B, 0xFF4A3525, CharacterMood.AWED)), SceneProp.STONE),
      sc(5, "Alegria do Reencontro!", "Lázaro, Marta, Maria e Jesus celebram a vida.", SceneBackdrop.GARDEN, listOf(a("Lázaro", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Quem eram as irmãs de Lázaro?", "Marta e Maria", "Rute e Noemi", "Sara e Rebeca", 0, "Lázaro, Marta e Maria eram grandes amigos de Jesus!"),
      q("O que Jesus fez ao ver as amigas chorando?", "Chorou com elas cheio de amor", "Ficou bravo", "Riu", 0, "Jesus sente a nossa dor e nos consola sempre."),
      q("O que Jesus ordenou diante da caverna?", "Lázaro, venha para fora!", "Fechem tudo", "Vamos embora", 0, "A voz de Jesus trouxe Lázaro de volta à vida!"),
      q("Como ficaram Marta e Maria depois?", "Extremamente felizes e agradecidas", "Assustadas para sempre", "Com sono", 0, "A tristeza virou festa e fé!"),
      q("O que Jesus nos mostra aqui?", "Que Ele é a ressurreição e a vida", "Que não entende lágrimas", "Que está longe", 0, "Com Jesus, a esperança sempre vence!")
    )
  ),
  story(70, 7, "Jesus Abençoa as Crianças", "👧👦", Testament.NOVO, DifficultyLevel.FACIL, "Marcos 10:13–16", "Abraço de Jesus", "💛",
    "As crianças são super importantes e especiais para Jesus!",
    listOf(
      "Em todas as cidades por onde Jesus passava, papais e mamães levavam seus filhinhos para receberem um abraço Dele! 🤗",
      "As crianças corriam sorrindo querendo sentar perto de Jesus e ouvir Suas histórias lindas. 😊",
      "Mas alguns discípulos ficaram sérios e tentaram afastar as crianças: 'Não atrapalhem o Mestre, Ele está ocupado!' ✋",
      "Quando Jesus viu aquilo, não gostou nada e disse: 'Deixem as crianças virem a Mim! Não as impeçam!' ❤️",
      "Jesus explicou a todos os adultos: 'O Reino de Deus pertence a quem tem coração puro e alegre como o dessas crianças!' ✨",
      "Então Ele pegou cada menino e menina no colo, deu um abraço apertado e abençoou todos com alegria! 👧👦🌟"
    ),
    listOf(
      sc(2, "Discípulos Pedem Distância", "As crianças querem chegar perto enquanto os adultos hesitam.", SceneBackdrop.VILLAGE, listOf(a("Discípulo", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.WORRIED), a("Menina", 0xFFF2A93B, 0xFF3A2820, CharacterMood.SAD))),
      sc(3, "Deixem Vir a Mim!", "Jesus chama as crianças com sorriso acolhedor.", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Menino", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(5, "Abençoadas com Carinho", "Jesus abraça e abençoa cada criança no jardim.", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Menina", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY), a("Menino", 0xFFE76F51, 0xFF2D2520, CharacterMood.HAPPY)), SceneProp.RAINBOW),
    ),
    listOf(
      q("Por que os papais levavam as crianças até Jesus?", "Para que Ele as abençoasse", "Para comprar pão", "Para lavar roupas", 0, "Eles sabiam que o abraço e a bênção de Jesus eram preciosos!"),
      q("O que os discípulos tentaram fazer?", "Afastar as crianças", "Brincar de roda", "Dar doces", 0, "Eles acharam que Jesus estava ocupado demais."),
      q("O que Jesus disse aos discípulos?", "Deixem as crianças virem a Mim!", "Mandem embora", "Fiquem em silêncio", 0, "Jesus deixou bem claro que ama ter crianças bem pertinho!"),
      q("Para quem pertence o Reino dos Céus segundo Jesus?", "Para quem tem coração como o das crianças", "Só para adultos sérios", "Só para reis", 0, "A pureza e confiança das crianças são um exemplo!"),
      q("Você é importante para Jesus?", "Sim, muito importante!", "Só quando crescer", "Talvez", 0, "Jesus ama e ouve cada criança todos os dias!")
    )
  ),
)
