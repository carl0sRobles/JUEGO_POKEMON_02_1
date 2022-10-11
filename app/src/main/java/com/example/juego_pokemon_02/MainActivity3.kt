package com.example.juego_pokemon_02

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class MainActivity3 : AppCompatActivity() {
    var simpleVideoView: VideoView? = null
    var mediaControls: MediaController? = null
    private lateinit var btnregreso: Button
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnregreso=findViewById<Button>(R.id.button4)

        simpleVideoView = findViewById<View>(R.id.videoView) as VideoView
        if (mediaControls == null) {
            mediaControls = MediaController(this)
            mediaControls!!.setAnchorView(this.simpleVideoView)
        }
        simpleVideoView!!.setMediaController(mediaControls)
        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://"+ packageName + "/" + R.raw.video1))
        simpleVideoView!!.requestFocus()
        simpleVideoView!!.start()
        simpleVideoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext, "Video completed", Toast.LENGTH_LONG).show()
        }
        simpleVideoView!!.setOnErrorListener { mp, what, extra ->
            Toast.makeText(applicationContext, "An Error Occurred " +"While Playing Video !!!", Toast.LENGTH_LONG).show()
            false
        }
        setOnClickListeners(this)

    }
    private fun setOnClickListeners(context: Context) {
        btnregreso.setOnClickListener {
            val regreso = Intent(this, MainActivity2::class.java)
            startActivity(regreso)
        }
    }
}