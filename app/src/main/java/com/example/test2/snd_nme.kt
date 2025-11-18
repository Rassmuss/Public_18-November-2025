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

class snd_nme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.ameno)

        val image3: ImageView = findViewById(R.id.imageView)
        image3.setImageResource(R.drawable.dfbgdfh)

        val next: Button = findViewById(R.id.button2)
        next.setOnClickListener {
            val myIntent1 = Intent(this, MainActivity::class.java)
            startActivityForResult(myIntent1, 0)
        }
    }
}