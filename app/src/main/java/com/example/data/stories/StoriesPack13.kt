package com.example.data.stories

import com.example.model.*

val storiesPack13: List<BibleStory> = listOf(
  story(61, 7, "A Pesca Maravilhosa de Pedro", "🐟", Testament.NOVO, DifficultyLevel.FACIL, "Lucas 5:1–11", "Redes Cheias", "⛵",
    "Quando confiamos na palavra de Jesus mesmo depois de tentar muito, Ele nos surpreende!",
    listOf(
      "Pedro e seus amigos passaram a noite inteira no mar jogando as redes, mas não pegaram nem um peixinho pequeno! 😕",
      "De manhã estavam lavando as redes bem cansados quando Jesus subiu no barco de Pedro para ensinar a multidão na praia. ⛵",
      "Quando terminou de ensinar, Jesus disse a Pedro: 'Agora reme para o fundo e jogue as redes outra vez!' 🌊",
      "Pedro respondeu: 'Mestre, pescamos a noite toda e não pegamos nada... mas porque Você mandou, eu vou jogar!' 💪",
      "UAU! De repente as redes ficaram tão pesadas de tantos peixes coloridos que tiveram que chamar outro barco para ajudar! 🐟🐟",
      "Pedro caiu de joelhos maravilhado! Jesus sorriu e garantiu que juntos eles levariam esperança para muita gente! ❤️"
    ),
    listOf(
      sc(0, "Redes Vazias", "Pedro cansado limpa a rede após uma noite sem peixes.", SceneBackdrop.BOAT, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.SAD))),
      sc(3, "Confiando em Jesus", "Jesus pede para Pedro lançar a rede mais uma vez.", SceneBackdrop.BOAT, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.BRAVE))),
      sc(4, "Milagre dos Peixes!", "A rede se enche de tantos peixes que todos ficam admirados.", SceneBackdrop.OCEAN_ARK, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.SURPRISED, SceneProp.FISH_BREAD), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Quantos peixes Pedro pegou durante a noite sozinho?", "Nenhum peixe", "Dez peixes", "Cem peixes", 0, "Ele trabalhou a noite inteira sem pescar nada."),
      q("O que Jesus pediu para Pedro fazer de manhã?", "Ir para o fundo e jogar a rede de novo", "Ir dormir", "Vender o barco", 0, "Jesus pediu uma nova tentativa com fé!"),
      q("Por que Pedro aceitou tentar outra vez?", "Por confiança na palavra de Jesus", "Por obrigação", "Por aposta", 0, "Pedro disse: 'Sobre a Tua palavra, lançarei a rede!'"),
      q("O que aconteceu quando jogaram a rede?", "Encheu com uma quantidade enorme de peixes", "Rasgou vazia", "Pegaram uma bota", 0, "Foi uma pesca maravilhosa que encheu dois barcos!"),
      q("O que aprendemos quando algo não dá certo na primeira vez?", "Tentar de novo confiando em Jesus", "Desistir logo", "Ficar bravo", 0, "Com Jesus, nunca devemos perder a esperança!")
    )
  ),
  story(62, 7, "Jesus Acalma a Tempestade", "⛈️", Testament.NOVO, DifficultyLevel.FACIL, "Marcos 4:35–41", "Paz no Mar", "⛵",
    "Quando o medo bater forte como uma tempestade, Jesus traz paz ao nosso coração!",
    listOf(
      "No fim de um dia cheio, Jesus e Seus amigos entraram num barco para atravessar o lago. Cansado, Jesus dormiu tranquilo no fundo! 😴",
      "De repente soprou um vento forte! Nuvens escuras cobriram o céu e ondas enormes começaram a jogar água dentro do barco! 🌊⛈️",
      "Os discípulos ficaram apavorados! 'Mestre, acorde! Estamos afundando!' gritaram segurando as cordas. 😰",
      "Jesus levantou-se calmo, olhou para o vento furioso e falou com autoridade: 'Silêncio! Acalme-se, mar!' ✋",
      "No mesmo segundo o vento parou, as ondas viraram um espelho calminho e o céu ficou sereno outra vez! ✨",
      "Os amigos olharam admirados perguntando: 'Quem é Este que até o vento e o mar obedecem?' Jesus sorriu cuidando deles! ❤️"
    ),
    listOf(
      sc(1, "Tempestade Assustadora", "Ondas balançam o barco enquanto os amigos ficam assustados.", SceneBackdrop.BOAT, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.WORRIED), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL))),
      sc(3, "Silêncio, Mar!", "Jesus estende a mão com calma e ordena que a tempestade pare.", SceneBackdrop.OCEAN_ARK, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE), a("Discípulo", 0xFF43A06A, 0xFF4A3525, CharacterMood.AWED))),
      sc(4, "Calmaria Completa", "O barco navega em paz sob o céu tranquilo.", SceneBackdrop.BOAT, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.RAINBOW),
    ),
    listOf(
      q("O que Jesus estava fazendo quando a tempestade começou?", "Dormindo tranquilo no barco", "Nadando", "Pescando", 0, "Jesus estava descansando em paz dentro do barco."),
      q("Como os discípulos se sentiram com as ondas grandes?", "Com muito medo", "Com vontade de rir", "Entediados", 0, "Eles ficaram com medo e chamaram por Jesus."),
      q("O que Jesus disse ao vento e ao mar?", "Silêncio! Acalme-se!", "Sopre mais forte!", "Girem em círculos!", 0, "Bastava a voz de Jesus para tudo ficar calmo!"),
      q("O que aconteceu depois da ordem de Jesus?", "Ficou tudo completamente calmo", "Choveu mais", "Nada mudou", 0, "Imediatamente o mar virou uma calmaria linda!"),
      q("Quem nos acalma quando temos medo à noite ou na chuva?", "Jesus está sempre conosco", "Ninguém", "Só o travesseiro", 0, "Podemos orar a Jesus e sentir Sua paz!")
    )
  ),
  story(63, 7, "Cinco Pães e Dois Peixinhos", "🍞", Testament.NOVO, DifficultyLevel.FACIL, "João 6:1–14", "Lanche Multiplicado", "🐟",
    "Quando repartimos o pouquinho que temos, Jesus transforma em bênção para muitos!",
    listOf(
      "Uma multidão imensa — milhares de papais, mamães e crianças — subiu um morro verde para ouvir as lindas histórias de Jesus! ⛰️",
      "Já era tarde e todo mundo estava com a barriguinha roncando de fome! Mas não havia nenhuma padaria por perto. 😋",
      "André encontrou um menino generoso que tinha só seu lanchinho na cesta: cinco pãezinhos e dois peixinhos assados! 🍞🐟",
      "O menino entregou seu lanche com alegria nas mãos de Jesus! Jesus sorriu, olhou para o céu e agradeceu a Deus pelo alimento. 🙏",
      "Então começou a repartir! Quanto mais entregavam pão e peixe às pessoas, mais aparecia nas cestas! ✨",
      "Todo mundo comeu até ficar satisfeito e ainda sobraram doze cestos cheinhos de pães! ❤️🎉"
    ),
    listOf(
      sc(2, "O Lanche do Menino", "O menino entrega generoso seus cinco pães e dois peixinhos.", SceneBackdrop.GARDEN, listOf(a("Menino", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.FISH_BREAD), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(3, "Agradecendo a Deus", "Jesus ora abençoando o lanche simples diante da multidão.", SceneBackdrop.MOUNTAIN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL, SceneProp.BREAD_CUP), a("André", 0xFF43A06A, 0xFF4A3525, CharacterMood.AWED))),
      sc(5, "Doze Cestos Sobrando!", "Todos celebram felizes com alimento de sobra.", SceneBackdrop.GARDEN, listOf(a("Menino", 0xFFF2A93B, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BASKET), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY))),
    ),
    listOf(
      q("Quem ofereceu seu lanche para Jesus?", "Um menino generoso", "Um rei", "Um soldado", 0, "Um menino repartiu de coração todo o seu lanche!"),
      q("O que havia na cesta do menino?", "Cinco pães e dois peixinhos", "Dez maçãs", "Bolo de chocolate", 0, "Eram apenas cinco pãezinhos e dois peixes."),
      q("O que Jesus fez antes de repartir a comida?", "Orou agradecendo a Deus", "Escondeu os pães", "Dormiu", 0, "Jesus deu graças a Deus pelo alimento!"),
      q("Quantos cestos cheios sobraram no final?", "Doze cestos", "Nenhum", "Dois cestos", 0, "Todos comeram muito bem e ainda sobraram doze cestos!"),
      q("O que esse milagre ensina às crianças?", "Compartilhar o pouco vira muito nas mãos de Deus", "Guardar comida só para si", "Nunca dividir", 0, "A generosidade alegra o coração de Jesus!")
    )
  ),
  story(64, 7, "Jesus Anda Sobre as Águas", "🌊", Testament.NOVO, DifficultyLevel.MEDIO, "Mateus 14:22–33", "Olhar em Jesus", "🤝",
    "Enquanto olharmos para Jesus com fé, não afundamos nos momentos difíceis!",
    listOf(
      "Numa noite ventosa, os discípulos remavam no barco pelo meio do lago enquanto Jesus orava sozinho no monte. ⛰️",
      "De madrugada, eles viram algo incrível caminhando sobre as ondas brilhantes: era Jesus andando sobre a água! 😮✨",
      "Eles gritaram assustados, mas Jesus logo acalmou: 'Coragem! Sou Eu, não tenham medo!' ❤️",
      "Pedro animado pediu: 'Senhor, se és Tu, manda eu andar sobre a água até Você!' Jesus sorriu e chamou: 'Venha!' 🚶",
      "Pedro saiu do barco e deu os primeiros passos andando na água! Mas quando olhou para o vento forte, teve medo e começou a afundar! 💦",
      "Na hora Jesus estendeu a mão forte, segurou Pedro com carinho e subiram juntos no barco em paz! 🤝"
    ),
    listOf(
      sc(1, "Caminhando Sobre o Mar", "Jesus caminha sereno sobre as ondas iluminando a noite.", SceneBackdrop.OCEAN_ARK, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL)), SceneProp.STAR),
      sc(4, "Pedro Dá os Passos", "Pedro olha para Jesus andando sobre a água com coragem.", SceneBackdrop.BOAT, listOf(a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.BRAVE), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY))),
      sc(5, "A Mão Amiga de Jesus", "Jesus segura Pedro prontamente trazendo segurança.", SceneBackdrop.OCEAN_ARK, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Pedro", 0xFFE76F51, 0xFF3A2820, CharacterMood.AWED))),
    ),
    listOf(
      q("Quem caminhou sobre as águas à noite?", "Jesus", "Golias", "Salomão", 0, "Jesus caminhou tranquilamente sobre as ondas do mar!"),
      q("Qual discípulo pediu para andar sobre a água também?", "Pedro", "Judas", "Tomé", 0, "Pedro teve coragem de pedir para ir ao encontro de Jesus."),
      q("Por que Pedro começou a afundar?", "Porque olhou para o vento e ficou com medo", "Porque era muito pesado", "Porque pulou alto", 0, "Ele tirou os olhos de Jesus e olhou para o problema."),
      q("O que Jesus fez quando Pedro pediu socorro?", "Estendeu a mão na mesma hora e o segurou", "Riu dele", "Foi embora", 0, "Jesus sempre estende a mão quando pedimos ajuda!"),
      q("Para quem devemos olhar quando sentimos medo?", "Para Jesus", "Só para o problema", "Para o chão", 0, "Olhar para Jesus nos dá coragem e equilíbrio!")
    )
  ),
  story(65, 7, "O Cego Bartimeu Volta a Enxergar", "👀", Testament.NOVO, DifficultyLevel.FACIL, "Marcos 10:46–52", "Olhos Abertos", "☀️",
    "Jesus nunca está ocupado demais para parar, ouvir e cuidar de quem chama por Ele!",
    listOf(
      "Na saída da cidade de Jericó morava um homem chamado Bartimeu, que era cego e não conseguia ver as flores nem o sol. 😔",
      "Um dia ele ouviu passos de muita gente passando na estrada e descobriu que Jesus estava bem ali! 👣",
      "Sem vergonha, Bartimeu gritou bem alto: 'Jesus, Filho de Davi, tem compaixão de mim!' 📣",
      "Algumas pessoas mandaram ele ficar quieto, mas Bartimeu clamou com ainda mais fé! ❤️",
      "Jesus parou na hora no meio da multidão e pediu: 'Chamem ele aqui!' Bartimeu pulou feliz deixando sua capa para trás! 🏃",
      "Jesus perguntou o que ele desejava. 'Eu quero voltar a enxergar!' Jesus tocou seus olhos e na hora Bartimeu viu tudo colorido e seguiu Jesus! 🌈👀"
    ),
    listOf(
      sc(2, "Clamando por Jesus", "Bartimeu chama por Jesus na beira da estrada de Jericó.", SceneBackdrop.VILLAGE, listOf(a("Bartimeu", 0xFFF2A93B, 0xFF4A3525, CharacterMood.BRAVE), a("Morador", 0xFF8C6EC9, 0xFF2D2520, CharacterMood.WORRIED))),
      sc(4, "Jesus Para para Ouvir", "Bartimeu corre feliz ao ouvir que Jesus o chamou.", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Bartimeu", 0xFFF2A93B, 0xFF4A3525, CharacterMood.HAPPY))),
      sc(5, "Vendo as Cores do Mundo!", "Bartimeu sorri maravilhado ao enxergar novamente.", SceneBackdrop.CROSS_SUNRISE, listOf(a("Bartimeu", 0xFFF2A93B, 0xFF4A3525, CharacterMood.AWED), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.PEACEFUL)), SceneProp.RAINBOW),
    ),
    listOf(
      q("Qual era o nome do homem cego perto de Jericó?", "Bartimeu", "Zaqueu", "Lázaro", 0, "Bartimeu ficou conhecido por sua fé perseverante!"),
      q("O que Bartimeu fez quando as pessoas pediram silêncio?", "Chamou por Jesus ainda mais forte", "Foi embora", "Ficou mudo", 0, "Ele não desistiu e continuou confiando em Jesus."),
      q("Como Jesus reagiu ao chamado dele?", "Parou e mandou chamá-lo com carinho", "Ignorou", "Passou correndo", 0, "Jesus sempre para para ouvir quem chama com fé!"),
      q("O que Bartimeu pediu a Jesus?", "Para voltar a enxergar", "Um cavalo", "Moedas", 0, "Ele pediu a cura dos seus olhos."),
      q("O que Bartimeu fez depois de ser curado?", "Seguiu Jesus feliz pelo caminho", "Esqueceu de agradecer", "Ficou em casa bravo", 0, "Ele usou sua nova visão para seguir Jesus com gratidão!")
    )
  ),
)
