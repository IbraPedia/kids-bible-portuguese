package com.example.data.stories

import com.example.model.*

val storiesPack12: List<BibleStory> = listOf(
  story(56, 6, "O Batismo de Jesus no Jordão", "🕊️", Testament.NOVO, DifficultyLevel.FACIL, "Mateus 3", "Pomba do Céu", "💧",
    "Deus se alegra quando escolhemos fazer a Sua vontade com o coração limpo!",
    listOf(
      "João Batista era primo de Jesus e vivia perto do rio Jordão ensinando as pessoas a pedirem perdão e fazerem o bem. 🌊",
      "Quando Jesus cresceu, Ele foi até o rio Jordão e pediu a João para batizá-lo na água clarinha! 💧",
      "João disse surpreso: 'Eu é que preciso ser batizado por Você!' Mas Jesus sorriu explicando que era o certo a fazer. 😊",
      "Assim que Jesus saiu da água, o céu se abriu e uma linda pomba branca desceu suavemente sobre Ele! 🕊️",
      "E uma voz doce do céu disse: 'Este é o meu Filho amado, de quem Eu tenho muita alegria!' ✨",
      "Assim começou a linda missão de Jesus ensinando e amando todas as pessoas! ❤️"
    ),
    listOf(
      sc(1, "No Rio Jordão", "Jesus conversa com João Batista nas águas calmas.", SceneBackdrop.RIVER, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL), a("João Batista", 0xFFE76F51, 0xFF4A3525, CharacterMood.AWED, SceneProp.STAFF))),
      sc(3, "A Pomba Branca do Céu", "O céu se abre com luz suave e a pombinha desce sobre Jesus.", SceneBackdrop.RIVER, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.DOVE)), SceneProp.DOVE),
      sc(5, "Filho Amado", "Luz celestial abençoa o início da jornada de Jesus.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL)), SceneProp.STAR),
    ),
    listOf(
      q("Em qual rio Jesus foi batizado?", "Rio Jordão", "Rio Nilo", "Mar Vermelho", 0, "João Batista batizou Jesus no rio Jordão."),
      q("Quem batizou Jesus?", "João Batista", "Davi", "Moisés", 0, "Seu primo João Batista teve essa grande alegria."),
      q("O que desceu do céu sobre Jesus?", "O Espírito de Deus como uma pomba", "Uma águia", "Neve", 0, "Desceu suavemente como uma pomba branca!"),
      q("O que a voz do céu declarou?", "Este é o meu Filho amado", "Saiam daqui", "Silêncio", 0, "Deus Pai mostrou todo o Seu amor por Jesus."),
      q("Como agradamos a Deus hoje?", "Sendo bondosos e obedientes como Jesus", "Brincando sem parar", "Brigando", 0, "Seguir o exemplo de Jesus alegra o coração de Deus!")
    )
  ),
  story(57, 6, "Jesus no Deserto Diz Não ao Erro", "🛡️", Testament.ANTIGO.let { Testament.NOVO }, DifficultyLevel.MEDIO, "Mateus 4:1–11", "Força da Palavra", "📜",
    "Conhecer a Palavra de Deus nos ajuda a dizer NÃO às tentações!",
    listOf(
      "Logo depois do batismo, Jesus passou quarenta dias orando num deserto tranquilo antes de começar Seus milagres. 🏜️",
      "Depois de tanto tempo sem comer, Jesus estava com muita fome e bem cansado. 😔",
      "Então o inimigo tentou enganá-lo dizendo: 'Se Você é Filho de Deus, transforme essas pedras em pão gostoso!' 🍞",
      "Jesus não caiu na armadilha e respondeu usando a Bíblia: 'Não vivemos só de pão, mas de toda palavra que vem de Deus!' 📖",
      "Mais duas vezes o tentador tentou convencê-lo com truques de fama e poder, mas Jesus disse NÃO com firmeza todas as vezes! 🛡️",
      "Logo o tentador foi embora, e anjos gentis vieram do céu cuidar de Jesus e dar-lhe forças! 👼✨"
    ),
    listOf(
      sc(0, "Oração no Deserto", "Jesus ora fortalecendo seu coração no deserto silencioso.", SceneBackdrop.DESERT, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL))),
      sc(3, "Firme na Palavra", "Jesus responde com sabedoria usando as Escrituras.", SceneBackdrop.MOUNTAIN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.SCROLL))),
      sc(5, "Cuidado dos Anjos", "Anjos descem para cuidar de Jesus após a vitória.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Anjo", 0xFFFFF3C4, 0xFFF2C14E, CharacterMood.HAPPY, SceneProp.ANGEL_WINGS))),
    ),
    listOf(
      q("Quantos dias Jesus passou orando no deserto?", "Quarenta dias", "Dois dias", "Cem dias", 0, "Jesus orou por quarenta dias no deserto."),
      q("O que Jesus usou para responder às tentações?", "A Palavra de Deus (a Bíblia)", "Pedras", "Uma espada", 0, "Cada resposta de Jesus veio direto das Escrituras!"),
      q("Jesus aceitou transformar pedras para se exibir?", "Não, Ele disse não com firmeza", "Sim, fez dez pães", "Ficou na dúvida", 0, "Jesus não usou Seu poder para egoísmo."),
      q("Quem veio cuidar de Jesus depois?", "Anjos do céu", "Soldados", "Pescadores", 0, "Deus enviou anjos para servir e alegrar Jesus!"),
      q("O que ajuda a vencer momentos de tentação?", "Orar e lembrar do que a Bíblia ensina", "Ficar bravo", "Obedecer ao erro", 0, "Guardar versículos no coração nos deixa fortes!")
    )
  ),
  story(58, 6, "Os Amigos Pescadores de Jesus", "🎣", Testament.NOVO, DifficultyLevel.FACIL, "Marcos 1:16–20", "Rede de Amigos", "⛵",
    "Jesus convida todos nós para caminharmos juntos com Ele em amizade!",
    listOf(
      "Caminhando pela beira do lindo mar da Galileia, Jesus viu dois irmãos pescadores jogando a rede na água: Pedro e André! 🌊",
      "Eles trabalhavam duro todos os dias pescando peixinhos para suas famílias. 🐟",
      "Jesus sorriu e fez um convite especial: 'Venham comigo! Vou ensinar vocês a pescar pessoas com amor para Deus!' ❤️",
      "Na mesma hora, Pedro e André deixaram as redes e seguiram Jesus cheios de alegria! ⛵",
      "Um pouco mais à frente estavam Tiago e João consertando os barcos com o pai. Jesus também os chamou! 🛶",
      "Logo Jesus formou um grupo de doze amigos especiais — os discípulos — que aprenderam com Ele todos os dias! 🤝"
    ),
    listOf(
      sc(0, "Pescadores no Lago", "Pedro e André trabalham com suas redes na água azul.", SceneBackdrop.BOAT, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY), a("André", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.FISH_BREAD))),
      sc(2, "O Convite de Jesus", "Jesus chama os irmãos com um sorriso acolhedor.", SceneBackdrop.RIVER, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.AWED))),
      sc(5, "Caminhando Juntos", "Os discípulos seguem felizes ao lado de Jesus.", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("João", 0xFF8C6EC9, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Qual era o trabalho de Pedro e André?", "Pescadores", "Ferreiros", "Padeiros", 0, "Eles pescavam peixes no mar da Galileia."),
      q("O que Jesus disse que eles passariam a pescar?", "Pessoas, trazendo amor para Deus", "Baleias gigantes", "Conchas", 0, "Jesus os convidou a compartilhar o amor de Deus com as pessoas!"),
      q("Como eles responderam ao convite de Jesus?", "Deixaram as redes e O seguiram na hora", "Disseram depois", "Correram", 0, "Eles confiaram e foram imediatamente!"),
      q("Quais outros dois irmãos Jesus chamou no barco?", "Tiago e João", "Caim e Abel", "Jacó e Esaú", 0, "Tiago e João também aceitaram o convite com alegria."),
      q("Quantos discípulos próximos Jesus escolheu?", "Doze amigos especiais", "Três", "Cinquenta", 0, "Os doze discípulos caminhavam e aprendiam com Jesus!")
    )
  ),
  story(59, 6, "O Primeiro Milagre em Caná", "🏺", Testament.NOVO, DifficultyLevel.MEDIO, "João 2:1–11", "Festa Feliz", "🍇",
    "Jesus se importa até com a alegria simples das festas e famílias!",
    listOf(
      "Jesus, Sua mãe Maria e Seus amigos foram convidados para uma linda festa de casamento na cidadezinha de Caná! 🎉",
      "Todo mundo estava feliz comendo e cantando, até que Maria percebeu um problema: o suco da festa tinha acabado! 😟",
      "Maria contou a Jesus com confiança e disse aos ajudantes da cozinha: 'Façam tudo o que Ele mandar!' 🙏",
      "Havia seis grandes potes de pedra vazios ali perto. Jesus disse: 'Encham esses potes com água bem limpinha!' 💧",
      "Os ajudantes encheram até a boca! Então Jesus pediu para servirem um copo ao chefe da festa. 🏺",
      "Para surpresa geral, a água tinha virado o suco de uva mais delicioso de toda a festa! Foi o primeiro milagre de Jesus! 🍇✨"
    ),
    listOf(
      sc(0, "Festa de Casamento", "Famílias celebram felizes com música em Caná.", SceneBackdrop.VILLAGE, listOf(a("Maria", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL), a("Jesus", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(3, "Enchendo os Potes", "Os ajudantes colocam água pura nos potes obedecendo a Jesus.", SceneBackdrop.PALACE, listOf(a("Jesus", 0xFFF2A93B, 0xFF3A2820, CharacterMood.PEACEFUL), a("Ajudante", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.BREAD_CUP))),
      sc(5, "O Milagre da Alegria", "Todos provam admirados a bebida deliciosa!", SceneBackdrop.VILLAGE, listOf(a("Mestre da Festa", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.SURPRISED, SceneProp.BREAD_CUP), a("Jesus", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Onde aconteceu o primeiro milagre de Jesus?", "Numa festa de casamento em Caná", "Num deserto", "Num navio", 0, "Foi em um casamento alegre na cidade de Caná!"),
      q("O que faltou na festa?", "O suco/bebida da festa", "Cadeiras", "Música", 0, "A bebida tinha acabado no meio da celebração."),
      q("O que Jesus mandou colocar nos seis potes?", "Água limpinha", "Areia", "Leite", 0, "Os servos encheram os grandes potes com água pura."),
      q("No que a água se transformou?", "Na melhor bebida de uva da festa", "Em gelo", "Em sopa", 0, "Jesus transformou água em uma bebida deliciosa!"),
      q("O que Maria ensinou aos ajudantes?", "Fazer tudo o que Jesus mandar", "Ir embora", "Esconder os potes", 0, "Obedecer a Jesus sempre traz boas surpresas!")
    )
  ),
  story(60, 6, "Nicodemos Conversa à Noite", "🌙", Testament.NOVO, DifficultyLevel.DESAFIO, "João 3:1–16", "Novo Coração", "❤️",
    "Deus amou tanto o mundo que enviou Jesus para nos dar um coração novo!",
    listOf(
      "Nicodemos era um professor muito estudado em Jerusalém que ficou curioso com as histórias bonitas sobre Jesus. 📜",
      "Uma noite, sob as estrelas, ele foi visitar Jesus bem calminho para conversar e tirar suas dúvidas. 🌙",
      "Jesus acolheu Nicodemos com carinho e explicou um segredo lindo: 'Para entrar no Reino de Deus é preciso nascer de novo no coração!' ✨",
      "Nicodemos coçou a cabeça sem entender: 'Como alguém grande pode ser bebê outra vez?' 😮",
      "Jesus sorriu e explicou: 'É um nascimento do Espírito! Deus limpa e renova o coração como uma brisa suave que a gente sente.' 🌬️❤️",
      "E revelou o versículo mais famoso: 'Porque Deus amou o mundo de tal maneira que enviou Seu Filho para salvar quem Nele crer!' 🌟"
    ),
    listOf(
      sc(1, "Encontro Sob as Estrelas", "Nicodemos procura Jesus à noite com uma lamparina.", SceneBackdrop.STARRY_NIGHT, listOf(a("Nicodemos", 0xFF8C6EC9, 0xFF6B5D53, CharacterMood.SURPRISED, SceneProp.LAMP), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
      sc(3, "Conversa Sábia", "Jesus ensina com paciência sobre o novo nascimento espiritual.", SceneBackdrop.VILLAGE, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.SCROLL), a("Nicodemos", 0xFF8C6EC9, 0xFF6B5D53, CharacterMood.AWED))),
      sc(5, "O Grande Amor de Deus", "Corações renovados brilham com a luz do amor de Deus.", SceneBackdrop.CLOUD_HEAVEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.CROSS),
    ),
    listOf(
      q("Em qual horário Nicodemos foi conversar com Jesus?", "À noite", "Ao meio-dia", "De manhãzinha", 0, "Ele visitou Jesus à noite para conversar tranquilo."),
      q("O que Jesus disse que precisamos para o Reino de Deus?", "Nascer de novo no coração", "Comprar uma coroa", "Subir numa árvore", 0, "É uma renovação linda feita por Deus em nosso interior!"),
      q("Como Jesus comparou a ação do Espírito de Deus?", "Com a brisa suave do vento", "Com uma pedra", "Com um muro", 0, "Não vemos o vento, mas sentimos seu sopro suave!"),
      q("Por que Deus enviou Jesus ao mundo?", "Porque Ele amou muito o mundo inteiro", "Por acaso", "Para assustar", 0, "João 3:16 mostra o amor gigante de Deus por cada pessoa!"),
      q("Podemos fazer perguntas a Jesus quando temos dúvidas?", "Sim! Jesus acolhe todas as dúvidas com amor", "Não", "Só adultos", 0, "Jesus ouve nossas dúvidas com paciência e carinho!")
    )
  ),
)
