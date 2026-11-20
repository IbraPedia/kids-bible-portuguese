package com.example.data.stories

import com.example.model.*

val storiesPack15: List<BibleStory> = listOf(
  story(71, 8, "O Bom Samaritano", "🩹", Testament.NOVO, DifficultyLevel.FACIL, "Lucas 10:25–37", "Mão Amiga", "❤️",
    "O nosso próximo é qualquer pessoa que precisa da nossa ajuda e bondade!",
    listOf(
      "Para ensinar como amar o próximo, Jesus contou uma história sobre um viajante andando por uma estrada perigosa. 🏜️",
      "Ladrões malvados atacaram o viajante, levaram sua mochila e o deixaram machucado na beira do caminho! 😢",
      "Passou um sacerdote apressado... olhou de longe e atravessou para o outro lado da rua sem ajudar. 😔",
      "Depois passou outro líder importante... também olhou e seguiu viagem fingindo não ver! 😕",
      "Então passou um samaritano simples que nem era do mesmo país, mas sentiu muita pena! Ele parou na hora! 🩹",
      "Ele limpou os machucados, colocou o homem no seu jumentinho, levou para uma hospedaria e pagou tudo para ele melhorar! ❤️🐴"
    ),
    listOf(
      sc(1, "Machucado na Estrada", "O viajante ferido espera ajuda no caminho.", SceneBackdrop.DESERT, listOf(a("Viajante", 0xFFE76F51, 0xFF3A2820, CharacterMood.SAD))),
      sc(3, "Passando Direto", "Pessoas apressadas passam sem ajudar o ferido.", SceneBackdrop.DESERT, listOf(a("Viajante", 0xFFE76F51, 0xFF3A2820, CharacterMood.SAD), a("Líder", 0xFF8C6EC9, 0xFF4A3525, CharacterMood.WORRIED))),
      sc(5, "O Cuidado do Bom Samaritano", "O bom samaritano cuida com amor do viajante.", SceneBackdrop.VILLAGE, listOf(a("Samaritano", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.BASKET), a("Viajante", 0xFFE76F51, 0xFF3A2820, CharacterMood.PEACEFUL))),
    ),
    listOf(
      q("O que aconteceu com o homem na estrada?", "Foi ferido por ladrões", "Achou um tesouro", "Perdeu o chapéu", 0, "Ele ficou machucado precisando muito de socorro."),
      q("O que fizeram os dois primeiros homens que passaram?", "Não pararam para ajudar", "Cuidaram dele", "Deram água", 0, "Eles passaram direto ignorando quem sofria."),
      q("Quem parou para cuidar do viajante?", "O bom samaritano", "Um soldado", "Ninguém", 0, "O samaritano teve compaixão e ajudou com tudo!"),
      q("Para onde ele levou o homem ferido?", "Para uma hospedaria segura", "Para a prisão", "Para o deserto", 0, "Ele pagou a hospedaria até o amigo ficar bom!"),
      q("O que Jesus quer que façamos como o samaritano?", "Ajudar todos que precisam, sem preconceito", "Só ajudar amigos ricos", "Passar direto", 0, "Amar o próximo é ajudar com atitudes concretas!")
    )
  ),
  story(72, 8, "A Ovelhinha Perdida", "🐑", Testament.NOVO, DifficultyLevel.FACIL, "Lucas 15:1–7", "Bom Pastor", "🌿",
    "Cada um de nós é tão valioso que Jesus vem nos procurar com amor se nos perdermos!",
    listOf(
      "Jesus contou sobre um bom pastor que tinha cem ovelhinhas fofinhas e conhecia cada uma pelo nome! 🐑",
      "Toda noite ele contava direitinho: '97, 98, 99...' Opa! Faltava uma! A menorzinha tinha se perdido nos espinhos! 😟",
      "O pastor deixou as noventa e nove bem seguras no curral e saiu no escuro enfrentando pedras e vento para achar a perdida! 🔦",
      "Ele chamou com voz mansa até ouvir um 'mééé' baixinho atrás de um arbusto! 🌿",
      "Que alívio! O pastor pegou a ovelhinha assustada com cuidado, colocou nos ombros e voltou sorrindo para casa! 🤗",
      "Ele chamou os amigos dizendo: 'Alegrem-se comigo, porque encontrei minha ovelhinha querida!' Assim o céu celebra cada pessoa! 🎉"
    ),
    listOf(
      sc(1, "Falta Uma Ovelha!", "O pastor conta seu rebanho e percebe que falta uma.", SceneBackdrop.MOUNTAIN, listOf(a("Pastor", 0xFF3E92CC, 0xFF3A2820, CharacterMood.WORRIED, SceneProp.STAFF)), SceneProp.SHEEP),
      sc(3, "Procurando nos Campos", "O pastor procura com sua lanterna até encontrar a ovelhinha.", SceneBackdrop.STARRY_NIGHT, listOf(a("Pastor", 0xFF3E92CC, 0xFF3A2820, CharacterMood.BRAVE, SceneProp.LAMP)), SceneProp.SHEEP),
      sc(5, "Alegria no Retorno!", "O pastor volta feliz carregando a ovelhinha salva.", SceneBackdrop.GARDEN, listOf(a("Pastor", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY, SceneProp.SHEEP)), SceneProp.RAINBOW),
    ),
    listOf(
      q("Quantas ovelhas o pastor tinha ao todo?", "Cem ovelhas", "Dez ovelhas", "Mil ovelhas", 0, "Ele cuidava de cem ovelhinhas e amava cada uma!"),
      q("O que ele fez quando viu que faltava uma?", "Foi procurá-la imediatamente", "Esqueceu dela", "Ficou dormindo", 0, "Ele enfrentou o caminho difícil para salvar a única perdida!"),
      q("Como ele trouxe a ovelha de volta?", "Nos ombros com muito carinho", "Empurrando", "Amarrada", 0, "Com cuidado e ternura, carregou-a nos ombros."),
      q("O que ele fez ao chegar em casa?", "Chamou os amigos para celebrar", "Deu bronca", "Ficou bravo", 0, "Houve muita festa pela ovelhinha encontrada!"),
      q("Quem é o nosso Bom Pastor?", "Jesus", "Golias", "Faraó", 0, "Jesus cuida de cada um de nós como o Bom Pastor!")
    )
  ),
  story(73, 8, "O Filho que Voltou para Casa", "🤗", Testament.NOVO, DifficultyLevel.MEDIO, "Lucas 15:11–32", "Abraço do Pai", "🏡",
    "O amor de Deus Pai é tão grande que Ele sempre nos recebe de braços abertos!",
    listOf(
      "Um pai bondoso tinha dois filhos. Um dia, o filho mais novo pediu sua parte do dinheiro e foi viver longe sem regras. 💰",
      "Ele gastou tudo em festas e brinquedos, até que acabou o dinheiro e veio uma fome grande! Ele ficou cuidando de porcos com fome. 🐷😔",
      "Triste, ele pensou: 'Na casa do meu pai até os empregados comem bem! Vou voltar e pedir perdão!' 🚶",
      "Enquanto ainda estava bem longe na estrada, seu papai — que olhava todos os dias esperando por ele — o avistou! 👀",
      "O pai correu, abraçou o filho bem apertado, deu-lhe roupas limpas, sandálias novas e um anel! 🤗",
      "E preparou uma grande festa cantando: 'Meu filho estava perdido e voltou para casa!' Assim é o amor de Deus por nós! 🎉❤️"
    ),
    listOf(
      sc(1, "Triste Longe de Casa", "O filho percebe que escolheu mal e sente saudade do pai.", SceneBackdrop.DESERT, listOf(a("Filho", 0xFFE76F51, 0xFF3A2820, CharacterMood.SAD))),
      sc(4, "O Pai Corre para Abraçar!", "O pai amoroso recebe o filho arrependido de braços abertos.", SceneBackdrop.VILLAGE, listOf(a("Pai", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.HAPPY), a("Filho", 0xFFE76F51, 0xFF3A2820, CharacterMood.AWED))),
      sc(5, "Festa de Boas-Vindas", "Toda a casa celebra o retorno e o perdão!", SceneBackdrop.GARDEN, listOf(a("Pai", 0xFF3E92CC, 0xFFEEEEEE, CharacterMood.HAPPY), a("Filho", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.STAR),
    ),
    listOf(
      q("O que aconteceu com o dinheiro do filho mais novo?", "Ele gastou tudo e ficou sem nada", "Guardou no banco", "Ajudou pobres", 0, "Sem sabedoria, ele desperdiçou tudo longe de casa."),
      q("O que o filho decidiu fazer quando percebeu o erro?", "Voltar para casa e pedir perdão ao pai", "Fugir mais longe", "Esconder-se", 0, "Ele teve humildade para voltar e pedir perdão!"),
      q("Como o pai reagiu ao vê-lo na estrada?", "Correu e o abraçou cheio de amor", "Fechou a porta", "Deu um castigo", 0, "O pai esperava todo dia e deu o abraço mais apertado!"),
      q("O que o pai organizou para comemorar?", "Uma grande festa", "Silêncio total", "Uma viagem", 0, "Celebraram porque o filho voltou para a família!"),
      q("Quem esse pai bondoso representa?", "Deus, nosso Pai celestial", "Um estranho", "Um juiz bravo", 0, "Deus sempre perdoa quem volta para Ele com sinceridade!")
    )
  ),
  story(74, 8, "O Semeador e as Sementinhas", "🌱", Testament.NOVO, DifficultyLevel.MEDIO, "Mateus 13:1–23", "Terra Boa", "🌻",
    "Um coração atento e bondoso faz a Palavra de Deus crescer como linda flor!",
    listOf(
      "Na beira do lago, Jesus contou a história de um fazendeiro que saiu alegre jogando sementinhas boas na terra. 🌾",
      "Algumas caíram no caminho duro, e logo os passarinhos vieram e comeram todas! 🐦",
      "Outras caíram no meio das pedras: cresceram rápido, mas como não tinham raiz funda, murcharam com o sol forte. ☀️",
      "Outras caíram entre espinhos apertados, que não deixaram as plantinhas respirarem nem crescerem. 🌵",
      "Mas muitas sementes caíram em TERRA BOA, fofinha e regada! Elas criaram raízes fortes e deram muitos frutos deliciosos! 🌻🍓",
      "Jesus explicou: a semente é a Palavra de Deus! Quem ouve com atenção e pratica o bem é como a terra boa! ❤️"
    ),
    listOf(
      sc(0, "Semeando com Alegria", "O semeador espalha sementinhas douradas pelo campo.", SceneBackdrop.GARDEN, listOf(a("Semeador", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.BASKET)), SceneProp.TREE),
      sc(2, "Pedras e Espinhos", "Algumas plantinhas não conseguem crescer sem terra fofa.", SceneBackdrop.DESERT, listOf(a("Observador", 0xFFF2A93B, 0xFF3A2820, CharacterMood.WORRIED, SceneProp.STONE))),
      sc(4, "Colheita na Terra Boa!", "As sementes na terra boa florescem e dão belos frutos.", SceneBackdrop.GARDEN, listOf(a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY), a("Criança", 0xFF43A06A, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.RAINBOW),
    ),
    listOf(
      q("O que representa a semente na parábola?", "A Palavra de Deus", "Pedras do rio", "Brinquedos", 0, "A Palavra de Deus é plantada em nosso coração!"),
      q("O que aconteceu com as sementes no caminho duro?", "Os passarinhos comeram", "Viraram árvores", "Sumiram na água", 0, "Como a terra era dura, não conseguiram entrar."),
      q("Por que as sementes nas pedras murcharam?", "Não tinham raiz profunda", "Faltou vento", "Choveu demais", 0, "Sem raízes fortes, não resistiram ao sol."),
      q("Onde as sementes deram muitos frutos?", "Na terra boa", "No asfalto", "Nos espinhos", 0, "A terra boa acolheu a semente e gerou lindos frutos!"),
      q("Como nosso coração fica igual à terra boa?", "Ouvindo e praticando o amor de Jesus", "Ignorando ensinamentos", "Guardando raiva", 0, "Obedecer com alegria faz coisas boas florescerem em nós!")
    )
  ),
  story(75, 8, "A Casa Firme na Rocha", "🏡", Testament.NOVO, DifficultyLevel.FACIL, "Mateus 7:24–27", "Base Firme", "🪨",
    "Ouvir Jesus e colocar Seus ensinos em prática constrói uma vida segura como casa na rocha!",
    listOf(
      "No final de um grande sermão no monte, Jesus contou sobre dois construtores construindo suas casas! 🔨",
      "O primeiro construtor foi muito sábio: escolheu uma rocha bem firme e construiu ali sua casinha resistente! 🪨🏡",
      "O segundo construtor teve pressa e preguiça: construiu sua casa direto na areia fofinha da praia! 🏖️",
      "Um dia chegou uma tempestade forte com chuva, vento e rios subindo em volta das duas casas! ⛈️🌊",
      "A casa construída na areia balançou e... PLUFT! Caiu inteira porque não tinha base firme! 😔",
      "Já a casa construída na ROCHA continuou em pé, quentinha e segura! Assim é quem ouve Jesus e obedece! ❤️"
    ),
    listOf(
      sc(1, "Construindo na Rocha", "O construtor sábio trabalha firme sobre a pedra sólida.", SceneBackdrop.MOUNTAIN, listOf(a("Sábio", 0xFF43A06A, 0xFF4A3525, CharacterMood.HAPPY, SceneProp.STONE))),
      sc(3, "Tempestade Chegando", "Chuva e ventos fortes testam as duas construções.", SceneBackdrop.BOAT, listOf(a("Construtor", 0xFFE76F51, 0xFF3A2820, CharacterMood.WORRIED))),
      sc(5, "Firme em Jesus!", "A casa sobre a rocha permanece segura sob o arco-íris.", SceneBackdrop.GARDEN, listOf(a("Sábio", 0xFF43A06A, 0xFF4A3525, CharacterMood.PEACEFUL), a("Jesus", 0xFF3E92CC, 0xFF3A2820, CharacterMood.HAPPY)), SceneProp.RAINBOW),
    ),
    listOf(
      q("Onde o construtor sábio construiu sua casa?", "Sobre a rocha firme", "Na areia fofa", "Em cima da água", 0, "Ele escolheu uma base sólida e resistente!"),
      q("Onde o outro homem construiu com pressa?", "Na areia", "Na montanha de pedra", "Numa árvore", 0, "Ele não quis trabalhar na base e construiu na areia."),
      q("O que aconteceu quando veio a tempestade?", "A casa na rocha ficou firme e a da areia caiu", "As duas voaram", "Nada aconteceu", 0, "A base firme protegeu a casa na tempestade!"),
      q("Quem representa a Rocha na nossa vida?", "Jesus e Seus ensinamentos", "Um brinquedo", "A chuva", 0, "Praticar o que Jesus ensina nos deixa seguros!"),
      q("Qual é a diferença entre só ouvir e praticar?", "Praticar transforma nossa vida para o bem", "Não faz diferença", "Só ouvir basta", 0, "Sábio é quem ouve Jesus e faz o bem todo dia!")
    )
  ),
)
