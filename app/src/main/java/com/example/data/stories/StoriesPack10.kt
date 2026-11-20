package com.example.data.stories

import com.example.model.*

val storiesPack10: List<BibleStory> = listOf(
  story(46, 5, "Naamã e a Menininha Bondosa", "💧", Testament.ANTIGO, DifficultyLevel.MEDIO, "2 Reis 5", "Sete Mergulhos", "👧",
    "Até uma criança pequena pode falar de Deus e ajudar alguém importante!",
    listOf(
      "Naamã era um general famoso, mas tinha uma doença triste na pele que ninguém conseguia curar. 😔",
      "Em sua casa trabalhava uma menininha simples que confiava muito em Deus. Ela disse: 'Na minha terra há um profeta que pode curá-lo!' 👧",
      "Naamã viajou de carruagem até a casa do profeta Eliseu levando muitos presentes caros. 🎁",
      "Eliseu mandou um recado simples: 'Vá até o rio Jordão e mergulhe sete vezes na água!' 🌊",
      "No início Naamã ficou bravo achando simples demais, mas seus amigos o convenceram a obedecer com humildade. 😊",
      "No sétimo mergulho, a pele de Naamã ficou limpinha como a pele de um bebê! Ele agradeceu a Deus cheio de alegria! 🎉"
    ),
    listOf(
      sc(1, "A Dica da Menininha", "A menina bondosa fala com esperança sobre o Deus vivo.", SceneBackdrop.PALACE, listOf(a("Menina", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY), a("Naamã", 0xFFE76F51, 0xFF2D2520, CharacterMood.SAD))),
      sc(4, "Mergulhando no Rio Jordão", "Naamã obedece com humildade e mergulha sete vezes.", SceneBackdrop.RIVER, listOf(a("Naamã", 0xFFE76F51, 0xFF2D2520, CharacterMood.PEACEFUL), a("Ajudante", 0xFF3E92CC, 0xFF4A3525, CharacterMood.HAPPY))),
      sc(5, "Curado e Agradecido!", "Naamã celebra sua cura e reconhece o amor de Deus.", SceneBackdrop.GARDEN, listOf(a("Naamã", 0xFF43A06A, 0xFF2D2520, CharacterMood.HAPPY)), SceneProp.DOVE),
    ),
    listOf(
      q("Quem contou a Naamã sobre o profeta Eliseu?", "Uma menininha que trabalhava em sua casa", "Um rei", "Um músico", 0, "Uma criança corajosa falou com fé sobre o poder de Deus!"),
      q("O que Eliseu mandou Naamã fazer?", "Mergulhar sete vezes no rio Jordão", "Subir uma montanha", "Pagar mil moedas", 0, "Bastava obedecer com humildade e mergulhar no rio."),
      q("Quantas vezes Naamã mergulhou?", "Sete vezes", "Duas vezes", "Vinte vezes", 0, "Ele só foi curado depois de obedecer até o sétimo mergulho."),
      q("Como ficou a pele de Naamã?", "Completamente limpa e saudável", "Igual antes", "Pintada de azul", 0, "Deus realizou uma cura maravilhosa!"),
      q("O que a menininha nos ensina?", "Crianças podem ajudar e falar de Deus com coragem", "Crianças devem ficar caladas", "Só presentes caros ajudam", 0, "Pequenas palavras de fé podem transformar vidas!")
    )
  ),
  story(47, 5, "Elias e a Carruagem de Fogo", "🔥", Testament.ANTIGO, DifficultyLevel.DESAFIO, "2 Reis 2", "Amigo Fiel", "🕊️",
    "Quem caminha fielmente com Deus recebe inspiração para continuar fazendo o bem.",
    listOf(
      "O profeta Elias já estava velhinho e sabia que logo iria para o céu estar com Deus. ☁️",
      "Seu jovem amigo e ajudante Eliseu não quis sair do lado dele nem por um segundo: 'Vou ficar com você até o fim!' 🤝",
      "Juntos caminharam até a beira do rio Jordão. Elias tocou a água com seu manto e o rio abriu caminho sequinho! 🌊",
      "Elias perguntou: 'O que você gostaria antes de eu partir?' Eliseu respondeu: 'Quero a força de Deus para servir como você!' 🙏",
      "De repente apareceu no céu uma carruagem brilhante com cavalos de fogo, levando Elias num redemoinho direto para o céu! 🔥🐎",
      "Eliseu pegou o manto que Elias deixou e continuou ajudando muitas pessoas com o mesmo amor! ✨"
    ),
    listOf(
      sc(2, "Atravessando o Rio", "Elias e Eliseu caminham juntos em amizade e fé.", SceneBackdrop.RIVER, listOf(a("Elias", 0xFF43A06A, 0xFFEEEEEE, CharacterMood.PEACEFUL, SceneProp.CLOAK_HELD), a("Eliseu", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE))),
      sc(4, "Subindo ao Céu em Luz", "Luz dourada e fogo envolvem Elias rumo ao céu.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Elias", 0xFF43A06A, 0xFFEEEEEE, CharacterMood.AWED, SceneProp.FIRE), a("Eliseu", 0xFF3E92CC, 0xFF3A2820, CharacterMood.SURPRISED)), SceneProp.STAR),
      sc(5, "Continuando a Missão", "Eliseu segue servindo a Deus com alegria.", SceneBackdrop.GARDEN, listOf(a("Eliseu", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.CLOAK_HELD))),
    ),
    listOf(
      q("Quem era o amigo fiel que acompanhou Elias?", "Eliseu", "Golias", "Caim", 0, "Eliseu amava aprender com Elias e não o deixou sozinho."),
      q("O que Eliseu pediu antes de Elias subir?", "O mesmo espírito e força de Deus para servir", "Uma coroa de ouro", "Um castelo", 0, "Eliseu queria continuar ajudando o povo em nome de Deus."),
      q("O que apareceu para levar Elias ao céu?", "Uma carruagem e cavalos de fogo", "Um barco voador", "Um balão", 0, "Deus levou Elias de um jeito glorioso direto para o céu!"),
      q("O que Elias deixou cair para Eliseu?", "Seu manto", "Seu chapéu", "Sua lanterna", 0, "O manto simbolizava que a missão continuaria com Eliseu."),
      q("O que aprendemos com Eliseu?", "Aprender com bons exemplos e continuar fazendo o bem", "Desistir quando alguém parte", "Não ajudar ninguém", 0, "Devemos seguir os bons exemplos com dedicação!")
    )
  ),
  story(48, 5, "Sadraque, Mesaque e Abednego", "🔥", Testament.ANTIGO, DifficultyLevel.MEDIO, "Daniel 3", "Amigos na Fornalha", "👼",
    "Nunca estamos sozinhos quando escolhemos obedecer a Deus acima de tudo!",
    listOf(
      "Três jovens amigos chamados Sadraque, Mesaque e Abednego amavam a Deus mais do que tudo na Babilônia. 🤝",
      "O rei construiu uma estátua enorme de ouro e ordenou que todo mundo se ajoelhasse diante dela quando a música tocasse! 🎺",
      "Todos se curvaram... menos os três amigos, que ficaram em pé com coragem! 'Nós só adoramos ao Deus vivo!' 🛡️",
      "O rei ficou furioso e mandou jogá-los dentro de uma fornalha ardendo com fogo altíssimo! 🔥",
      "Mas quando o rei espiou lá dentro, levou um susto gigante: havia QUATRO pessoas passeando tranquilas no fogo, sem queimar nem um fio de cabelo! 😮👼",
      "O anjo de Deus protegeu os três amigos! Eles saíram sem nem cheiro de fumaça e o rei louvou ao Deus verdadeiro! 🎉"
    ),
    listOf(
      sc(2, "Coragem de Ficar em Pé", "Os três amigos escolhem adorar apenas a Deus.", SceneBackdrop.PALACE, listOf(a("Sadraque", 0xFF3E92CC, 0xFF2D2520, CharacterMood.BRAVE), a("Mesaque", 0xFF43A06A, 0xFF3A2820, CharacterMood.BRAVE), a("Abednego", 0xFFF2A93B, 0xFF2D2520, CharacterMood.BRAVE))),
      sc(4, "Protegidos no Meio do Fogo!", "Um anjo luminoso guarda os três amigos ilesos na fornalha.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.PEACEFUL, SceneProp.ANGEL_WINGS), a("Sadraque", 0xFF3E92CC, 0xFF2D2520, CharacterMood.HAPPY, SceneProp.FIRE), a("Mesaque", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.FIRE),
      sc(5, "Saindo Sem Nenhum Arranhão", "O rei fica admirado ao ver o cuidado de Deus.", SceneBackdrop.THRONE, listOf(a("Rei", 0xFF8C6EC9, 0xFF1F1A18, CharacterMood.AWED, SceneProp.CROWN), a("Abednego", 0xFFF2A93B, 0xFF2D2520, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Por que os três amigos não se curvaram à estátua?", "Porque só adoravam ao Deus verdadeiro", "Porque estavam com dor na perna", "Porque não ouviram a música", 0, "Eles amavam a Deus e não adoravam estátuas."),
      q("Onde o rei jogou os três amigos?", "Numa fornalha bem quente", "Num rio gelado", "Num jardim", 0, "O rei ordenou que fossem lançados no fogo."),
      q("Quantas pessoas o rei viu dentro da fornalha?", "Quatro — os três amigos e um anjo de Deus", "Nenhuma", "Dez", 0, "Deus enviou Seu mensageiro para andar com eles no fogo!"),
      q("Como eles saíram da fornalha?", "Completamente salvos e sem queimaduras", "Com a roupa rasgada", "Tristes", 0, "Nem cheiro de fumaça ficou nas roupas deles!"),
      q("O que esta história nos ensina?", "Ter coragem para fazer o certo sempre", "Seguir a multidão mesmo no erro", "Ter medo", 0, "Deus sempre está ao lado de quem tem coragem de ser fiel!")
    )
  ),
  story(49, 5, "Daniel na Cova dos Leões", "🦁", Testament.ANTIGO, DifficultyLevel.FACIL, "Daniel 6", "Oração Sem Medo", "🙏",
    "Orar a Deus todos os dias nos dá paz até no meio dos maiores perigos!",
    listOf(
      "Daniel era um homem honesto que orava a Deus três vezes ao dia com a janela aberta voltada para Jerusalém. 🪟🙏",
      "Alguns homens invejosos convenceram o rei Dario a criar uma lei proibindo orar a Deus por trinta dias! 📜",
      "Daniel não mudou seu hábito bonito: continuou agradecendo a Deus de joelhos todos os dias, sem medo! 💪",
      "Por causa da lei injusta, o rei triste precisou colocar Daniel dentro de uma cova escura cheia de leões famintos! 🦁",
      "Durante a noite inteira, Deus enviou um anjo que fechou a boca dos leões — eles pareciam gatinhos mansos dormindo perto de Daniel! 😴🦁",
      "De manhã o rei correu feliz ao ver Daniel vivo e sem nenhum arranhão! Todos reconheceram que o Deus de Daniel é poderoso! 🎉"
    ),
    listOf(
      sc(0, "Orando na Janela", "Daniel ora com fé três vezes ao dia agradecendo a Deus.", SceneBackdrop.PALACE, listOf(a("Daniel", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.PEACEFUL, SceneProp.SCROLL))),
      sc(4, "Na Cova com os Leões Mansos", "Um anjo protege Daniel enquanto os leões ficam calmos.", SceneBackdrop.LIONS_DEN, listOf(a("Daniel", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.PEACEFUL, SceneProp.LION), a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.BRAVE, SceneProp.ANGEL_WINGS)), SceneProp.LION),
      sc(5, "Salvo de Manhã!", "O rei Dario celebra aliviado ao ver Daniel em segurança.", SceneBackdrop.CROSS_SUNRISE, listOf(a("Daniel", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.HAPPY), a("Rei Dario", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.AWED, SceneProp.CROWN))),
    ),
    listOf(
      q("Quantas vezes por dia Daniel orava?", "Três vezes ao dia", "Uma vez por mês", "Nunca", 0, "Daniel orava três vezes todos os dias agradecendo a Deus!"),
      q("Onde Daniel foi jogado por não deixar de orar?", "Numa cova cheia de leões", "Num lago", "Numa torre", 0, "Homens invejosos fizeram uma armadilha para jogá-lo aos leões."),
      q("Quem fechou a boca dos leões?", "Um anjo enviado por Deus", "Um domador", "O vento", 0, "Deus enviou Seu anjo para proteger Daniel a noite inteira!"),
      q("Como o rei Dario ficou na manhã seguinte?", "Muito feliz ao ver Daniel vivo", "Indiferente", "Foi viajar", 0, "O rei gostava muito de Daniel e comemorou o milagre!"),
      q("Por que é tão bom orar todos os dias?", "Porque conversar com Deus traz paz e força", "Para ganhar moedas", "Só quando chove", 0, "A oração diária fortalece nossa amizade com Deus!")
    )
  ),
  story(50, 5, "A Corajosa Rainha Ester", "👸", Testament.ANTIGO, DifficultyLevel.MEDIO, "Ester 2–8", "Rainha Corajosa", "👑",
    "Deus pode colocar você no lugar certo, na hora certa, para ajudar muitas pessoas!",
    listOf(
      "Ester era uma jovem doce e gentil cuidada por seu primo Mardoqueu. Um dia, ela foi escolhida para ser a nova rainha do grande reino! 👑",
      "Um conselheiro malvado chamado Hamã criou um plano cruel para prejudicar todo o povo de Ester. 😢",
      "Mardoqueu pediu ajuda a Ester dizendo: 'Quem sabe não foi exatamente para uma hora como esta que você se tornou rainha?' ✨",
      "Ester ficou apreensiva porque entrar diante do rei sem convite era proibido, mas pediu que todos orassem por três dias! 🙏",
      "Vestida com sua coroa, Ester entrou com coragem! O rei sorriu, estendeu o cetro de ouro e ouviu seu pedido em um banquete! 🍽️",
      "O plano mau foi desfeito, Hamã perdeu o poder e o povo de Ester celebrou com muita festa e gratidão a Deus! 🎉"
    ),
    listOf(
      sc(0, "Ester Torna-se Rainha", "A doce Ester recebe a coroa real com humildade.", SceneBackdrop.PALACE, listOf(a("Ester", 0xFF8C6EC9, 0xFF1F1A18, CharacterMood.HAPPY, SceneProp.CROWN), a("Mardoqueu", 0xFF3E92CC, 0xFF6B5D53, CharacterMood.PEACEFUL))),
      sc(4, "Coragem Diante do Rei", "Ester entra na sala do trono após três dias de oração.", SceneBackdrop.THRONE, listOf(a("Ester", 0xFF8C6EC9, 0xFF1F1A18, CharacterMood.BRAVE, SceneProp.CROWN), a("Rei", 0xFFF2A93B, 0xFF2D2520, CharacterMood.HAPPY, SceneProp.CROWN))),
      sc(5, "Alegria e Livramento", "Ester e Mardoqueu comemoram o livramento do povo.", SceneBackdrop.GARDEN, listOf(a("Ester", 0xFF8C6EC9, 0xFF1F1A18, CharacterMood.HAPPY), a("Mardoqueu", 0xFF3E92CC, 0xFF6B5D53, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Quem ajudou a criar a rainha Ester?", "Seu primo Mardoqueu", "Golias", "Noé", 0, "Mardoqueu cuidou de Ester com carinho e deu sábios conselhos."),
      q("O que Ester pediu ao povo antes de falar com o rei?", "Para orarem e jejuarem por três dias", "Para fazerem silêncio", "Para fugirem", 0, "Ester buscou forças em Deus antes de agir!"),
      q("O que o rei estendeu para Ester mostrando paz?", "Seu cetro de ouro", "Uma espada", "Um livro", 0, "O rei sorriu e estendeu o cetro de ouro acolhendo Ester."),
      q("O que aconteceu com o povo de Ester?", "Foi salvo e comemorou com alegria", "Ficou preso", "Viajou longe", 0, "A coragem de Ester salvou milhares de famílias!"),
      q("O que aprendemos com a rainha Ester?", "Usar nossa posição e voz para defender os outros", "Ficar calado diante da injustiça", "Pensar só em coroas", 0, "Coragem com oração transforma o mundo ao nosso redor!")
    )
  ),
)
