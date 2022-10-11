package com.example.juego_pokemon_02

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    private lateinit var buttonNext2: Button

    private lateinit var btnaceptar: Button
    private lateinit var imagen: ImageView
    var cont = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        buttonNext2 = findViewById<Button>(R.id.pasar2)
        btnaceptar = findViewById<Button>(R.id.aceptar)



        imagen = findViewById(R.id.imageView)
        imagen.setImageResource(R.drawable.pikachu)
        setOnClickListeners(this)
    }

    private fun setOnClickListeners(context: Context) {

        buttonNext2.setOnClickListener {
            val intento2 = Intent(this, MainActivity3::class.java)
            startActivity(intento2)
        }
        btnaceptar.setOnClickListener {

            var nom = (findViewById<EditText>(R.id.etnombre)).text.toString()
            if (cont == 1) {
                if (nom == "pikachu") {
                    imagen.setImageResource(R.drawable.pikachu2)
                    Toast.makeText(context, "Correcto", Toast.LENGTH_SHORT).show()
                    cont++
                } else
                    Toast.makeText(context, "Incorrecto", Toast.LENGTH_SHORT).show()
            } else if (cont == 2) {
                imagen.setImageResource(R.drawable.bulbasaur)
                cont++
            } else if (cont == 3) {
                if (nom == "bulbasaur") {
                    imagen.setImageResource(R.drawable.bulbasaur2)
                    Toast.makeText(context, "Correcto", Toast.LENGTH_SHORT).show()
                    cont++
                } else
                    Toast.makeText(context, "Incorrecto", Toast.LENGTH_SHORT).show()
            } else if (cont == 4) {
                imagen.setImageResource(R.drawable.charizard)
                cont++
            } else if (cont == 5) {
                if (nom == "charizard") {
                    imagen.setImageResource(R.drawable.charizard2)
                    Toast.makeText(context, "Correcto", Toast.LENGTH_SHORT).show()
                    cont++
                } else
                    Toast.makeText(context, "Incorrecto", Toast.LENGTH_SHORT).show()
            } else if (cont == 6) {
                imagen.setImageResource(R.drawable.metapod)
                cont++
            } else if (cont == 7) {
                if (nom == "metapod") {
                    imagen.setImageResource(R.drawable.metapod2)
                    Toast.makeText(context, "Correcto", Toast.LENGTH_SHORT).show()
                    cont++
                } else
                    Toast.makeText(context, "Incorrecto", Toast.LENGTH_SHORT).show()
            } else if (cont == 8) {
                imagen.setImageResource(R.drawable.squirtle)
                cont++
            }else if (cont == 9) {
                if (nom == "squirtle") {
                    imagen.setImageResource(R.drawable.squirtle2)
                    Toast.makeText(context, "Correcto", Toast.LENGTH_SHORT).show()
                    cont++
                } else
                    Toast.makeText(context, "Incorrecto", Toast.LENGTH_SHORT).show()
            } else if (cont == 10) {
                imagen.setImageResource(R.drawable.pikachu)
                cont=2
            }
        }
        }

}

