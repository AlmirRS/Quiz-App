package com.example.praticaappquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.praticaappquiz.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityDetalhesBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*pegar as respostas certas */

        val bundle = intent.extras
        val usuarioAtual = bundle?.getString("usuario_nome") ?: "Nome não identificado"
        val respostasCertas = bundle?.getInt("total_respostas_corretas" ) ?: 0

        binding.textTotalResposta.text = "Respostas corretas: $respostasCertas"

        if (respostasCertas >= 5) {
            binding.textResultado.text = "Parabens $usuarioAtual você conseguiu uma boa nota"
        } else {
            binding.textResultado.text = "Que pena $usuarioAtual, tente outra vez"
        }

        binding.btnReiniciar.setOnClickListener {
            finish()
        }
    }
}