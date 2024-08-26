package com.daniel.primeiroapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }
    fun cliqueAqui(view:View){
        println("Foi clicado...")
    }
    fun numeroRandon(view: View){
        var textoResultado = findViewById<TextView>(R.id.txtResultado)
        var numero = java.util.Random().nextInt(10)

        textoResultado.setText("numero aleatório ${numero}")
    }
}