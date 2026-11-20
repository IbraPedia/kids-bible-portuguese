package com.example.data.stories

import com.example.model.*

val storiesPack04: List<BibleStory> = listOf(
  story(16, 2, "José na Cisterna e no Egito", "🐪", Testament.ANTIGO, DifficultyLevel.MEDIO, "Gênesis 37 e 39", "Fé na Estrada", "🏜️",
    "Mesmo nos momentos difíceis e injustos, Deus nunca abandona quem confia Nele.",
    listOf(
      "Um dia, José foi levar comida para os irmãos que cuidavam das ovelhas longe de casa. 🐑",
      "Quando os irmãos o viram chegando com a túnica colorida, tiraram sua túnica e o jogaram dentro de um poço seco! 😢",
      "Logo passou uma caravana de mercadores com camelos indo para o Egito, e os irmãos venderam José para viajar com eles. 🐪",
      "José chorou muito sentindo saudade do papai, mas fez uma oração pedindo forças ao Senhor no meio do deserto. 🙏",
      "No Egito, um oficial importante chamado Potifar gostou tanto do jeito trabalhador de José que o colocou para cuidar de toda a casa! 🏛️",
      "Tudo o que José fazia dava certo, porque Deus estava sempre ao lado dele! ✨"
    ),
    listOf(
      sc(1, "José no Poço Seco", "José assustado dentro do poço olha para cima confiando em Deus.", SceneBackdrop.DESERT, listOf(a("José", 0xFF3E92CC, 0xFF3A2820, CharacterMood.SAD), a("Irmão", 0xFFE76F51, 0xFF2D2520, CharacterMood.WORRIED, SceneProp.CLOAK_HELD))),
      sc(2, "A Caravana no Deserto", "José caminha pelo deserto rumo ao Egito.", SceneBackdrop.DESERT, listOf(a("Mercador", 0xFF8C6EC9, 0xFF2D2520, CharacterMood.BRAVE, SceneProp.STAFF), a("José", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL))),
      sc(4, "Cuidando da Casa de Potifar", "José trabalha com honestidade no palácio egípcio.", SceneBackdrop.PALACE, listOf(a("José", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.SCROLL), a("Potifar", 0xFFF2A93B, 0xFF2D2520, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Onde os irmãos colocaram José primeiro?", "Num poço seco", "Numa árvore", "Num navio", 0, "Eles tiraram a túnica e colocaram José em uma cisterna seca."),
      q("Para qual país José foi levado?", "Para o Egito", "Para a Itália", "Para o Brasil", 0, "Uma caravana de camelos levou José até o Egito."),
      q("Quem comprou e confiou em José no Egito?", "Potifar", "Golias", "Caim", 0, "Potifar percebeu que José era honesto e muito dedicado."),
      q("Por que tudo dava certo nas mãos de José?", "Porque Deus estava com ele", "Porque ele tinha mágica", "Por sorte", 0, "A Bíblia conta que Deus abençoava tudo o que José fazia."),
      q("O que fazer quando passamos por uma injustiça?", "Orar e continuar fazendo o bem", "Desistir de ser bom", "Fazer maldade também", 0, "José continuou honesto e confiando em Deus!")
    )
  ),
  story(17, 2, "José e a Esposa de Potifar", "🛡️", Testament.ANTIGO, DifficultyLevel.MEDIO, "Gênesis 39", "Coração Puro", "💎",
    "Dizer 'não' ao que é errado e escolher agradar a Deus vale mais que tudo.",
    listOf(
      "José cuidava de todos os bens da casa de Potifar com honestidade e respeito. Potifar confiava nele de olhos fechados! 🏛️",
      "Mas a esposa de Potifar começou a tentar convencer José a fazer algo errado escondido do marido e de Deus. 😟",
      "José respondeu com firmeza: 'Meu senhor confiou tudo a mim! Como eu poderia fazer uma maldade tão grande contra Deus?' 🛡️",
      "Um dia, ela segurou com força a capa de José tentando detê-lo, mas José preferiu deixar a capa nas mãos dela e fugir correndo! 🏃",
      "Com raiva por José não ceder, ela inventou uma mentira para Potifar mostrando a capa como falsa prova. 😢",
      "Potifar acreditou na mentira e mandou os guardas levarem o inocente José para a prisão real, mas Deus continuou com ele! 🙏"
    ),
    listOf(
      sc(0, "José Trabalhador Fiel", "José organiza os pergaminhos na casa de Potifar.", SceneBackdrop.PALACE, listOf(a("José", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.SCROLL))),
      sc(3, "José e a Esposa de Potifar", "A esposa de Potifar segura a capa enquanto José diz NÃO e se afasta.", SceneBackdrop.PALACE, listOf(a("Esposa de Potifar", 0xFFE76F51, 0xFF1F1A18, CharacterMood.TEMPTING, SceneProp.CLOAK_HELD), a("José", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE))),
      sc(4, "A Falsa Acusação", "Potifar observa a capa sem saber toda a verdade.", SceneBackdrop.PALACE, listOf(a("Potifar", 0xFFF2A93B, 0xFF2D2520, CharacterMood.WORRIED, SceneProp.CLOAK_HELD), a("Esposa de Potifar", 0xFFE76F51, 0xFF1F1A18, CharacterMood.SAD))),
      sc(5, "Levado para a Cela", "José mantém a paz no coração mesmo sendo preso injustamente.", SceneBackdrop.PRISON_CELL, listOf(a("José", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.IRON_BARS)), SceneProp.IRON_BARS),
    ),
    listOf(
      q("O que a esposa de Potifar queria que José fizesse?", "Algo errado e desonesto", "Cozinhar pão", "Pintar a casa", 0, "Ela insistiu para José trair a confiança de Potifar e de Deus."),
      q("O que José respondeu para ela?", "Que não pecaria contra Deus", "Que ia pensar", "Ficou calado", 0, "José foi corajoso e disse que não ofenderia a Deus."),
      q("O que ficou nas mãos da esposa de Potifar?", "A capa de José", "Um chapéu", "Uma chave", 0, "José fugiu deixando a capa para trás para não fazer o mal!"),
      q("O que aconteceu depois da mentira dela?", "José foi mandado para a prisão", "José virou cantor", "Nada aconteceu", 0, "Potifar acreditou na esposa e colocou José na prisão."),
      q("Qual atitude corajosa aprendemos com José?", "Fugir do que é errado mesmo custando caro", "Aceitar mentiras", "Esconder erros", 0, "Escolher o que é certo diante de Deus é verdadeira coragem!")
    )
  ),
  story(18, 2, "José na Prisão com os Prisioneiros", "⛓️", Testament.ANTIGO, DifficultyLevel.MEDIO, "Gênesis 39–40", "Luz na Cela", "🕯️",
    "Mesmo num lugar triste como uma cela, podemos servir, consolar e confiar em Deus.",
    listOf(
      "Lá estava José dentro de uma cela de pedra com grandes grades de ferro, dividindo o espaço com outros prisioneiros. ⛓️",
      "Mesmo preso injustamente, o rosto de José mostrava calma e bondade. Logo o carcereiro confiou nele para ajudar os presos! 😊",
      "Um dia chegaram dois prisioneiros tristes na mesma cela: o copeiro do rei e o padeiro do rei Faraó. 🍞🍷",
      "Certa manhã, José olhou os rostos preocupados deles atrás das grades e perguntou: 'Por que estão tão tristes hoje?' 👀",
      "Eles contaram dois sonhos misteriosos! José sorriu e disse: 'Deus dá a resposta! Ele vai explicar cada sonho.' ✨",
      "Com a sabedoria de Deus, José explicou os sonhos certinhos e pediu ao copeiro que lembrasse dele quando saísse livre! 🙏"
    ),
    listOf(
      sc(0, "José na Cela com Prisioneiros", "O rosto sereno de José atrás das grades junto aos outros prisioneiros.", SceneBackdrop.PRISON_CELL, listOf(a("José", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.IRON_BARS), a("Copeiro", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.SAD), a("Padeiro", 0xFFE76F51, 0xFF2D2520, CharacterMood.WORRIED)), SceneProp.IRON_BARS),
      sc(2, "Os Sonhos do Pão e da Taça", "O copeiro e o padeiro conversam sobre seus sonhos na cela.", SceneBackdrop.PRISON_CELL, listOf(a("Copeiro", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.WORRIED, SceneProp.BREAD_CUP), a("José", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE)), SceneProp.IRON_BARS),
      sc(4, "Deus Revela a Resposta", "José explica os sonhos apontando para o cuidado de Deus.", SceneBackdrop.PRISON_CELL, listOf(a("José", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BREAD_CUP), a("Copeiro", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.AWED)), SceneProp.STAR),
      sc(5, "Esperança Além das Grades", "José consola os colegas e confia no tempo de Deus.", SceneBackdrop.PRISON_CELL, listOf(a("José", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL), a("Padeiro", 0xFFE76F51, 0xFF2D2520, CharacterMood.PEACEFUL)), SceneProp.IRON_BARS),
    ),
    listOf(
      q("Com quem José dividiu a cela na prisão?", "Com outros prisioneiros, como o copeiro e o padeiro", "Com leões", "Estava sozinho", 0, "José convivia com outros prisioneiros atrás das grades."),
      q("Como era o comportamento de José na prisão?", "Ajudava a todos com bondade e calma", "Ficava gritando", "Quebrava as pedras", 0, "José era gentil até com os outros prisioneiros e o guarda."),
      q("Por que o copeiro e o padeiro estavam tristes?", "Porque tiveram sonhos e não entendiam", "Porque faltou água", "Porque perderam um sapato", 0, "Eles sonharam e não sabiam o significado."),
      q("Quem José disse que dava a explicação dos sonhos?", "Deus", "Um mago", "O vento", 0, "José deu toda honra a Deus pela sabedoria."),
      q("O que o jeito de José na prisão nos ensina?", "Podemos ser gentis mesmo em dias difíceis", "Só sorrir quando tudo é fácil", "Esquecer os colegas", 0, "Olhar para quem está triste por perto é um ato de amor!")
    )
  ),
  story(19, 2, "José e os Sonhos de Faraó", "👑", Testament.ANTIGO, DifficultyLevel.MEDIO, "Gênesis 41", "Sábio do Egito", "🌾",
    "Deus pode transformar uma longa espera em uma grande vitória para abençoar muitos.",
    listOf(
      "Dois anos se passaram! Então o poderoso Faraó do Egito teve dois sonhos estranhos que ninguém no palácio conseguia explicar. 👑",
      "De repente o copeiro bateu na testa e lembrou: 'Majestade! Na prisão havia um jovem chamado José que entende sonhos com Deus!' 💡",
      "José saiu da cela, vestiu roupas limpas e foi até a sala do trono diante do Faraó. 🏛️",
      "Faraó contou sobre sete vacas gordas e sete magras, e sete espigas cheias e sete secas. José explicou com sabedoria! 🌾",
      "'Deus está avisando: haverá sete anos de muita comida, e depois sete anos de muita fome. Precisamos guardar alimentos!' 📦",
      "Faraó ficou tão admirado que colocou um anel no dedo de José e o fez governador de todo o Egito! 🎉"
    ),
    listOf(
      sc(0, "Os Sonhos do Rei Faraó", "Faraó pensa preocupado no seu palácio dourado.", SceneBackdrop.THRONE, listOf(a("Faraó", 0xFFF2A93B, 0xFF1F1A18, CharacterMood.WORRIED, SceneProp.CROWN))),
      sc(3, "José Diante do Trono", "José explica os sonhos de Faraó apontando para Deus.", SceneBackdrop.THRONE, listOf(a("José", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.SCROLL), a("Faraó", 0xFFF2A93B, 0xFF1F1A18, CharacterMood.AWED, SceneProp.CROWN))),
      sc(5, "Governador do Egito", "José usa sua sabedoria para guardar comida e salvar o povo.", SceneBackdrop.PALACE, listOf(a("José", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.CROWN)), SceneProp.BREAD_CUP),
    ),
    listOf(
      q("Quem lembrou de José quando Faraó sonhou?", "O copeiro", "O padeiro", "Potifar", 0, "O copeiro lembrou que José havia interpretado seu sonho na cela!"),
      q("O que os sonhos de Faraó significavam?", "7 anos de fartura e 7 de fome", "7 anos de chuva", "7 dias de festa", 0, "Deus avisou sobre sete anos bons seguidos de sete anos de seca."),
      q("Qual plano sábio José deu a Faraó?", "Guardar comida nos anos bons", "Fazer uma festa enorme", "Viajar para longe", 0, "Guardar alimentos salvou o Egito e países vizinhos da fome."),
      q("Que cargo importante José recebeu?", "Governador de todo o Egito", "Cozinheiro", "Pescador", 0, "Faraó deu a José autoridade sobre todo o Egito!"),
      q("O que aprendemos sobre esperar em Deus?", "Ele prepara a hora certa para agir", "Nunca vale esperar", "Devemos desistir", 0, "No tempo certo, Deus honrou a fidelidade de José.")
    )
  ),
  story(20, 2, "José Perdoa seus Irmãos", "🤗", Testament.ANTIGO, DifficultyLevel.FACIL, "Gênesis 42–45", "Coração Perdoador", "💖",
    "O perdão cura o passado e transforma tristeza em abraços de amor.",
    listOf(
      "Quando chegou a grande fome, famílias de vários lugares viajaram ao Egito para comprar trigo. Entre eles estavam os irmãos de José! 🌾",
      "Eles se curvaram diante do governador sem imaginar que era o irmãozinho deles! José reconheceu todos na hora. 😲",
      "José percebeu que agora os irmãos tinham mudado e protegiam o caçula Benjamim com todo carinho. 💛",
      "Então José não aguentou de emoção, chorou de alegria e revelou: 'Eu sou José, o irmão de vocês! Papai ainda está vivo?' 😭❤️",
      "Os irmãos ficaram assustados pensando que José fosse se vingar, mas ele disse: 'Não tenham medo! Deus transformou o mal em bem!' 🤗",
      "Logo o papai Jacó também veio morar no Egito e todos viveram juntos, unidos pelo perdão! 👨‍👩‍👦‍👦"
    ),
    listOf(
      sc(1, "Irmãos Diante de José", "Os irmãos se curvam diante do governador sem reconhecê-lo.", SceneBackdrop.THRONE, listOf(a("José", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.SURPRISED, SceneProp.CROWN), a("Irmão", 0xFFE76F51, 0xFF2D2520, CharacterMood.WORRIED))),
      sc(3, "Eu Sou José!", "José revela quem é com lágrimas de alegria.", SceneBackdrop.PALACE, listOf(a("José", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.HAPPY), a("Benjamim", 0xFF43A06A, 0xFF3A2820, CharacterMood.AWED))),
      sc(5, "Família Reunida", "Jacó, José e os irmãos celebram juntos em paz.", SceneBackdrop.GARDEN, listOf(a("Jacó", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.HAPPY), a("José", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.RAINBOW),
    ),
    listOf(
      q("Por que os irmãos de José foram ao Egito?", "Para comprar alimentos na época da fome", "Para passear de barco", "Para ver pirâmides", 0, "Havia muita fome e só no Egito tinha comida guardada."),
      q("José se vingou dos irmãos?", "Não, ele os perdoou e abraçou", "Sim, prendeu todos", "Mandou embora", 0, "José escolheu o perdão e disse que Deus usou tudo para o bem!"),
      q("Quem veio morar perto de José no Egito?", "Seu pai Jacó e toda a família", "Ninguém", "Só um camelo", 0, "Toda a família de Jacó foi acolhida por José."),
      q("Como os irmãos se sentiram quando José revelou quem era?", "Assustados no início, depois muito aliviados", "Indiferentes", "Com sono", 0, "Eles temeram, mas o amor de José trouxe grande paz."),
      q("Qual o maior ensinamento da vida de José?", "Perdoar e confiar que Deus transforma tudo em bem", "Guardar rancor", "Fugir de casa", 0, "Perdoar liberta o coração e une a família!")
    )
  ),
)
