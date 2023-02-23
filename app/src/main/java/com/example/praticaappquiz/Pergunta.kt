package com.example.praticaappquiz

data class Pergunta (

    val codigo : Int,  //1
    val titulo: String,  //Qual o tempo do primeiro video do youtube?
    val resposta01: String, // 1 minuto?
    val resposta02: String, // 2 minutos?
    val resposta03: String, //18 segundos?
    val respostaCerta: Int  // 3
)