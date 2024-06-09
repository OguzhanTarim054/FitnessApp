package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LatpulldownActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latpulldown)


        val latpulldowngeributton: Button = findViewById(R.id.latpulldowngeriButton)

        latpulldowngeributton.setOnClickListener {
            val intent: Intent = Intent(this, BackActivity::class.java)
            startActivity(intent)
        }
    }
}