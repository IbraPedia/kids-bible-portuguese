package com.example.data.stories

import com.example.model.*

val storiesPack17: List<BibleStory> = listOf(
  story(81, 9, "Zaqueu Sobe na Árvore", "🌳", Testament.NOVO, DifficultyLevel.FACIL, "Lucas 19:1–10", "Visita Especial", "🏡",
    "Jesus conhece até o nosso nome e transforma qualquer coração que deseja mudar!",
    listOf(
      "Zaqueu morava em Jericó e era bem baixinho. Muitas pessoas não gostavam dele porque ele cobrava dinheiro demais nos impostos. 😔",
      "Um dia Jesus entrou na cidade e uma multidão enorme cercou a rua! Zaqueu queria muito ver Jesus, mas só via ombros altos! 👀",
      "Então Zaqueu teve uma ideia engraçada: correu na frente e subiu nos galhos de uma árvore figueira bem alta! 🌳",
      "Quando Jesus passou embaixo da árvore, parou, olhou direto para cima e chamou: 'Zaqueu, desça depressa! Hoje quero ir na sua casa!' 😲❤️",
      "Zaqueu desceu quase voando de felicidade e recebeu Jesus com um jantar caprichado! 🍽️",
      "O amor de Jesus mudou Zaqueu na hora: ele prometeu devolver o dinheiro errado em quádruplo e ajudar os pobres! 🎉"
    ),
    listOf(
      sc(2, "Zaqueu na Figueira", "O pequeno Zaqueu sobe nos galhos para conseguir ver Jesus.", SceneBackdrop.GARDEN, listOf(a("Zaqueu", 0xFFF2A93B, 0xFF3A2820, CharacterMood.SURPRISED, SceneProp.TREE))),
      sc(3, "Jesus Olha para Cima!", "Jesus sorri e chama Zaqueu pelo nome com carinho.", SceneBackdrop.VILLAGE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Zaqueu", 0xFFF2A93B, 0xFF3A2820, CharacterMood.AWED))),
      sc(5, "Coração Transformado", "Zaqueu celebra com Jesus e decide fazer o bem a todos.", SceneBackdrop.VILLAGE, listOf(a("Zaqueu", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BREAD_CUP), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Por que Zaqueu não conseguia ver Jesus na rua?", "Porque era baixinho e havia muita gente", "Porque estava escuro", "Porque fechou os olhos", 0, "A multidão era alta e tampava a visão de Zaqueu."),
      q("Onde Zaqueu subiu para ver Jesus?", "Numa árvore (figueira-brava)", "Num muro de vidro", "Numa escada de bombeiro", 0, "Ele subiu numa árvore no caminho por onde Jesus passava!"),
      q("O que Jesus fez quando passou embaixo da árvore?", "Chamou Zaqueu pelo nome e pediu para ir à casa dele", "Passou reto", "Riu dele", 0, "Jesus conhecia Zaqueu e quis visitá-lo com amor!"),
      q("Como Zaqueu mudou depois de receber Jesus?", "Devolveu o que pegou errado e ajudou os pobres", "Ficou ainda mais egoísta", "Escondeu-se", 0, "O encontro com Jesus trouxe generosidade ao seu coração!"),
      q("Jesus também sabe o seu nome?", "Sim, Ele conhece e ama cada um de nós!", "Não", "Só de adultos", 0, "Jesus conhece você pelo nome e quer estar com você!")
    )
  ),
  story(82, 9, "Entrada Alegre em Jerusalém", "🌿", Testament.NOVO, DifficultyLevel.FACIL, "Mateus 21:1–11", "Hosana ao Rei", "🐴",
    "Jesus é um Rei manso e humilde que reina com amor e paz!",
    listOf(
      "Chegou a semana especial da Páscoa e Jesus entrou na cidade de Jerusalém de um jeito bem diferente dos reis comuns! 🐴",
      "Em vez de um cavalo de guerra ou carruagem dourada, Jesus veio montado num jumentinho manso, mostrando paz e humildade. 😊",
      "Crianças e adultos saíram correndo animados para a estrada! Alguns estendiam seus mantos coloridos no chão como tapete! 🎨",
      "Outros balançavam ramos verdes de palmeiras no ar cantando com alegria: 'Hosana! Bendito o Rei que vem em nome do Senhor!' 🌿🎶",
      "Até as crianças no templo cantavam 'Hosana!', e Jesus sorriu dizendo que Deus ama o louvor sincero dos pequeninos! 👧👦",
      "Foi um dia lindo celebrando Jesus, o Rei da Paz! ❤️"
    ),
    listOf(
      sc(1, "No Jumentinho de Paz", "Jesus entra humilde e sorridente rumo a Jerusalém.", SceneBackdrop.VILLAGE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL))),
      sc(3, "Ramos e Cânticos de Hosana!", "Crianças e famílias celebram com ramos verdes.", SceneBackdrop.GARDEN, listOf(a("Criança", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.TREE), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(4, "Louvor das Crianças", "Os pequenos cantam alegria para Jesus no templo.", SceneBackdrop.TEMPLE, listOf(a("Menina", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY), a("Menino", 0xFFE76F51, 0xFF2D2520, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Em qual animal manso Jesus entrou em Jerusalém?", "Um jumentinho", "Um leão", "Um camelo de guerra", 0, "Jesus escolheu um jumentinho como símbolo de paz e humildade."),
      q("O que as pessoas balançavam e colocavam na estrada?", "Ramos verdes de palmeira e seus mantos", "Bandeiras pretas", "Pedras", 0, "Fizeram um lindo caminho verde e colorido para Jesus!"),
      q("O que a multidão e as crianças gritavam felizes?", "Hosana!", "Silêncio!", "Boa noite!", 0, "'Hosana' significa 'Salva-nos!' em um grito alegre de louvor."),
      q("Jesus gostou quando as crianças cantaram no templo?", "Sim! Ele defendeu e amou o louvor delas", "Mandou pararem", "Não ouviu", 0, "Jesus sempre valoriza a adoração sincera das crianças!"),
      q("Que tipo de Rei Jesus é?", "Rei de paz, humildade e amor", "Rei bravo", "Rei distante", 0, "Jesus conquista corações com bondade e paz!")
    )
  ),
  story(83, 9, "A Última Ceia de Amor", "🍞", Testament.NOVO, DifficultyLevel.MEDIO, "João 13 e Lucas 22", "Novo Mandamento", "🍇",
    "Servir com humildade e amar uns aos outros é a marca dos amigos de Jesus!",
    listOf(
      "Na noite antes de ir para a cruz, Jesus jantou com Seus doze amigos numa sala tranquila preparada em Jerusalém. 🕯️",
      "Antes de comer, Jesus fez algo surpreendente: pegou uma bacia de água e uma toalha e lavou os pés empoeirados de cada discípulo! 💧",
      "Pedro ficou admirado, e Jesus explicou: 'Dei esse exemplo para que vocês também sirvam e ajudem uns aos outros com humildade!' ❤️",
      "Na mesa, Jesus partiu o pão e dividiu o cálice dizendo: 'Sempre que fizerem isso juntos, lembrem-se do Meu amor por vocês!' 🍞🍇",
      "Depois deixou seu mandamento mais bonito: 'Amem uns aos outros exatamente como Eu amei vocês!' 🤝",
      "Eles cantaram um hino juntos e saíram sob o luar para orar no jardim! 🌙"
    ),
    listOf(
      sc(1, "Servindo com Humildade", "Jesus mostra amor lavando os pés dos seus amigos.", SceneBackdrop.VILLAGE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.AWED))),
      sc(3, "Partindo o Pão Juntos", "Jesus compartilha o pão e o suco ensinando a lembrar Dele.", SceneBackdrop.PALACE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BREAD_CUP), a("João", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.PEACEFUL))),
      sc(4, "Amem Uns aos Outros", "Os amigos de Jesus aprendem a cuidar uns dos outros.", SceneBackdrop.STARRY_NIGHT, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Discípulo", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("Qual gesto humilde Jesus fez antes do jantar?", "Lavou os pés dos discípulos", "Deu ordens duras", "Sentou no trono", 0, "Mesmo sendo o Mestre, Jesus serviu os amigos com carinho!"),
      q("O que Jesus partiu na mesa para lembrarmos Dele?", "O pão e o cálice", "Uma maçã", "Um bolo", 0, "O pão e o cálice lembram Seu amor entregue por nós."),
      q("Qual foi o novo mandamento de Jesus?", "Amem uns aos outros como Eu amei vocês", "Briguem sempre", "Fiquem sozinhos", 0, "O amor entre irmãos mostra que somos amigos de Jesus!"),
      q("Como podemos lavar os 'pés' hoje?", "Servindo e ajudando em casa e na escola", "Mandando nos colegas", "Ficando parados", 0, "Pequenos atos de serviço mostram um coração como o de Jesus!"),
      q("O que eles fizeram ao final da ceia?", "Cantaram um hino e foram orar", "Foram embora bravos", "Dormiram na mesa", 0, "Terminaram em louvor e oração!")
    )
  ),
  story(84, 9, "O Maior Amor na Cruz", "✝️", Testament.NOVO, DifficultyLevel.MEDIO, "Lucas 23", "Amor que Perdoa", "❤️",
    "Na cruz Jesus provou o tamanho gigante do Seu amor e nos ensinou a perdoar!",
    listOf(
      "Depois de orar no jardim das Oliveiras, soldados prenderam Jesus injustamente mesmo Ele nunca tendo feito nada de errado. 😔",
      "Alguns líderes invejosos condenaram Jesus a morrer numa cruz de madeira no alto de uma colina. 😢",
      "Mesmo sentindo tanta dor, Jesus olhou para as pessoas que O machucavam e orou baixinho: 'Pai, perdoa-lhes, pois não sabem o que fazem!' 🙏",
      "Ao lado Dele, um homem arrependido pediu: 'Jesus, lembra de mim!' E Jesus prometeu com ternura que ele estaria no Paraíso! ✨",
      "À tarde o céu escureceu em silêncio enquanto Jesus entregava Sua vida por amor para limpar todos os nossos erros. ❤️",
      "Seus amigos colocaram o corpo de Jesus num túmulo novo fechado com uma pedra grande... mas a história não terminou ali! 🪨🌅"
    ),
    listOf(
      sc(0, "Oração no Jardim", "Jesus ora ao Pai pedindo força com amor obediente.", SceneBackdrop.STARRY_NIGHT, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL)), SceneProp.TREE),
      sc(2, "Perdão na Cruz", "Jesus demonstra amor infinito perdoando até quem O feriu.", SceneBackdrop.CROSS_SUNRISE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.CROSS)), SceneProp.CROSS),
      sc(5, "Esperança Silenciosa", "Amigos guardam esperança esperando pela promessa de Deus.", SceneBackdrop.MOUNTAIN, listOf(a("Maria", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.SAD), a("João", 0xFF43A06A, 0xFF3A2820, CharacterMood.PEACEFUL)), SceneProp.STONE),
    ),
    listOf(
      q("Jesus tinha feito algum mal para ser preso?", "Não, Ele sempre só fez o bem", "Sim, brigou", "Quebrou casas", 0, "Jesus era totalmente inocente, mas aceitou por amor a nós!"),
      q("O que Jesus orou na cruz pelos que O machucavam?", "Pai, perdoa-lhes!", "Castiga todos!", "Esquece deles!", 0, "Até na hora mais difícil Jesus escolheu perdoar."),
      q("O que Jesus prometeu ao homem arrependido ao Seu lado?", "Que estaria com Ele no Paraíso", "Nada", "Que ficaria triste", 0, "Quem se arrepende e confia em Jesus recebe acolhimento!"),
      q("Por que Jesus deu Sua vida na cruz?", "Por amor a nós, para perdoar nossos erros", "Por engano", "Sem motivo", 0, "Foi a maior prova de amor da história do universo!"),
      q("A história de Jesus terminou na tristeza do túmulo?", "Não! No terceiro dia Ele ressuscitou!", "Sim", "Ninguém sabe", 0, "A vitória da Páscoa estava chegando logo depois!")
    )
  ),
  story(85, 9, "A Manhã Linda da Ressurreição!", "🌅", Testament.NOVO, DifficultyLevel.FACIL, "Mateus 28 e João 20", "Jesus Vive!", "🎉",
    "Jesus venceu a morte! Ele está vivo para sempre e caminha pertinho de nós!",
    listOf(
      "Três dias depois, bem cedinho no domingo quando o sol começava a pintar o céu de dourado, Maria Madalena e suas amigas foram ao túmulo. 🌅",
      "De repente a terra tremeu suave! Um anjo brilhante como um raio rolou a pedra pesada da entrada! ✨👼",
      "Quando as mulheres olharam para dentro... o túmulo estava VAZIO! Só os paninhos dobrados estavam lá! 😲",
      "O anjo sorriu alegre: 'Não tenham medo! Jesus não está aqui — Ele ressuscitou como prometeu!' 🎉",
      "No jardim, Maria ouviu uma voz doce chamar seu nome: 'Maria!' Era o próprio JESUS vivo bem na frente dela! ❤️",
      "As amigas correram contar a todo mundo a melhor notícia de todos os tempos: 'Jesus está vivo!' 🌟"
    ),
    listOf(
      sc(1, "A Pedra Rolada pelo Anjo", "Luz da manhã brilha enquanto o anjo abre o túmulo vazio.", SceneBackdrop.CROSS_SUNRISE, listOf(a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS), a("Maria Madalena", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.SURPRISED)), SceneProp.STAR),
      sc(4, "Jesus Vivo no Jardim!", "Maria reconhece feliz o Senhor Jesus ressuscitado!", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Maria Madalena", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.AWED)), SceneProp.RAINBOW),
      sc(5, "Boas Notícias para Todos!", "Os amigos celebram cheios de alegria que Jesus vive.", SceneBackdrop.VILLAGE, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY), a("João", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.DOVE),
    ),
    listOf(
      q("Em qual dia Jesus ressuscitou?", "No terceiro dia, domingo de manhã", "Depois de um ano", "Nunca", 0, "Logo no amanhecer do terceiro dia Jesus venceu a morte!"),
      q("O que as amigas encontraram no túmulo?", "O túmulo vazio com um anjo brilhante", "Soldados dormindo só", "Pedra fechada", 0, "A pedra tinha sido rolada e Jesus não estava mais lá!"),
      q("O que o anjo anunciou a elas?", "Ele não está aqui, pois ressuscitou!", "Voltem outro dia", "Fiquem tristes", 0, "Foi o anúncio mais feliz de toda a Bíblia!"),
      q("Quem encontrou Jesus no jardim e ouviu seu nome?", "Maria Madalena", "Golias", "Faraó", 0, "Jesus chamou Maria pelo nome e ela ficou radiante!"),
      q("Jesus está vivo hoje?", "Sim! Ele vive para sempre e nos ama!", "Não", "Só nos livros", 0, "Jesus é vivo e caminha ao nosso lado todos os dias!")
    )
  ),
)
