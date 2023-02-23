package com.example.praticaappquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.praticaappquiz.databinding.ActivityPerguntasBinding

class PerguntasActivity : AppCompatActivity() {

    private lateinit var listaPerguntas: Array<Pergunta>
    private var indicePerguntaAtual = 1
    private var totalRespostasCorretas = 0

    private val binding by lazy {
        ActivityPerguntasBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Carregar lista de perguntas
        listaPerguntas = DadosFicticios.recuperarListasPerguntas()

        val bundle = intent.extras
        val nome = bundle?.getString("nome_usuario") ?: "Nome não identificado"

        //Dados Mockados ou ficticios
        binding.textNome.text = "Olá, $nome"

        exibirPerguntaAtual()
        binding.btnConfirmar.setOnClickListener {

            if (validarRespostasPerguntaAtual()) {

                verificarRespostaCerta()
                indicePerguntaAtual++

                val totalItemLista = listaPerguntas.size
                if ( indicePerguntaAtual <= totalItemLista ) {
                    exibirPerguntaAtual()
                }else {

                    val intent = Intent(this, DetalhesActivity::class.java)
                    intent.putExtra("total_respostas_corretas", totalRespostasCorretas)
                    intent.putExtra("usuario_nome", nome)
                    startActivity( intent )
                    finish()

                }
            }
        }
    }

    private fun verificarRespostaCerta() {

        val pergunta = listaPerguntas[indicePerguntaAtual - 1]
        val respostaCerta = pergunta.respostaCerta

        var respostaSelecionada = if (binding.radioPergunta01.isChecked) {
            1
        } else if (binding.radioPergunta02.isChecked) {
            2
        } else  if (binding.radioPergunta03.isChecked){
            3
        } else {
            0
        }

        if (respostaSelecionada == respostaCerta) {
            totalRespostasCorretas++
        }

        binding.radioGroupPergunta.clearCheck()
    }

    private fun validarRespostasPerguntaAtual(): Boolean {

        val resposta01 = binding.radioPergunta01.isChecked
        val resposta02 = binding.radioPergunta02.isChecked
        val resposta03 = binding.radioPergunta03.isChecked

        if (resposta01 || resposta02 || resposta03) {
            return true
        }
        Toast.makeText(this, "Preencha a resposta para avançar!", Toast.LENGTH_SHORT).show()
        return false
    }

    private fun exibirPerguntaAtual() {

        val pertguntaAtual = listaPerguntas[indicePerguntaAtual - 1]
        binding.textPergunta.text = pertguntaAtual.titulo
        binding.radioPergunta01.text = pertguntaAtual.resposta01
        binding.radioPergunta02.text = pertguntaAtual.resposta02
        binding.radioPergunta03.text = pertguntaAtual.resposta03

        //val contadorPerguntaAtual =  perguntaAtual.codigo - caso queira usar o codigo

        val totalPerguntas = listaPerguntas.size
        binding.textContadorPergunta.text = " $indicePerguntaAtual pergunta de $totalPerguntas"

    }
}