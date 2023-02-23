package com.example.praticaappquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.praticaappquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnIniciarQuiz.setOnClickListener {

            val nome = binding.editPersonName.text.toString()

            if (nome.isEmpty()){
                Toast.makeText(this, "Preencha o nome", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, PerguntasActivity::class.java)
                intent.putExtra("nome_usuario", nome)
                startActivity( intent )
            }
        }
    }
}