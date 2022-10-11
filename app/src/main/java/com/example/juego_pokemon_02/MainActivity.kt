package com.example.juego_pokemon_02

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var buttonNext: Button
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mediaPlayer = MediaPlayer.create(this, R.raw.musica1)
        mediaPlayer.start()
        buttonNext=findViewById<Button>(R.id.pasar)


        setOnClickListeners(this)
    }

    private fun setOnClickListeners(context: Context){
        buttonNext.setOnClickListener {
            val intento1 = Intent(this, MainActivity2::class.java)
            startActivity(intento1)
            mediaPlayer.stop()
            mediaPlayer = MediaPlayer.create(this, R.raw.musica1)
        }
    }
}