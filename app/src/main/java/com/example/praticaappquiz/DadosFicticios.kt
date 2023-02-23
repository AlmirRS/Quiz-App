package com.example.praticaappquiz

class DadosFicticios {

   companion object {

       //Lista de pergfuntas
       fun recuperarListasPerguntas(): Array<Pergunta> {

           val pergunta1 = Pergunta(
               1,
               "Quem foi lançado na cova dos leões?",
               "Paulo", "José", "Daniel",
               3
           )

           val pergunta2 = Pergunta(
               2,
               "Quantas pragas foram enviadas ao Egito?",
               "7 Pragas", "10 Pragas", "3 Pragas",
               2
           )

           val pergunta3 = Pergunta(
               3,
               "Qual instrumento Davi gostava de tocar?",
               "Tambor", "Harpa", "Flauta",
               2
           )

           val pergunta4 = Pergunta(
               4,
               "Na parábola do semeador, quais sementes que cresceram e deram uma boa colheita?",
               "As sementes que caíram nas pedras.", "As sementes que caíram em boa terra.", "As sementes que caíram entre os espinhos.",
               2
           )

           val pergunta5 = Pergunta(
               5,
               "Jesus comparou o Reino de Deus a qual semente?",
               "Ao grão de milho.", "Ao grão de mostarda.", "A semente de uva.",
               2
           )

           val pergunta6 = Pergunta(
               6,
               "Quem são conhecidos como os patriarcas na Bíblia?",
               "Jesus, Maria e José", "Pedro, João e Tiago", "Abraão, Isaque e Jacó",
               3
           )

           val pergunta7 = Pergunta(
               7,
               "Quem ensinou os discípulos a oração do Pai nosso?",
               "Os fariseus", "Jesus", "Paulo",
               2
           )

           val pergunta8 = Pergunta(
               8,
               "Quem foi o 'assistente' do profeta Elias?",
               "Eliseu", "Enoque", "Abraão",
               1
           )

           val pergunta9 = Pergunta(
               9,
               "Na transfiguração, quem apareceu ao lado de Jesus?",
               "Enoque e Elias", "Elias e Moisés", "Abraão e Isaque",
               2
           )

           val pergunta10 = Pergunta(
               10,
               "Qual é o último capítulo da Bíblia?",
               "Apocalipse 22", "Apocalipse 16", "Apocalipse 24",
               1
           )

           return arrayOf(
               pergunta1, pergunta2, pergunta3, pergunta4, pergunta5, pergunta6, pergunta7, pergunta8, pergunta9, pergunta10
           )
       }
   }
}