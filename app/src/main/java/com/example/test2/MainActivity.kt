package com.example.test2

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val next: Button = findViewById(R.id.button)
        next.setOnClickListener {
            val myIntent = Intent(this, snd_nme::class.java)
            startActivityForResult(myIntent, 0)
        }

        val image2: ImageView = findViewById(R.id.imageView4)
        image2.setImageResource(R.drawable.sgdf)
    }
}