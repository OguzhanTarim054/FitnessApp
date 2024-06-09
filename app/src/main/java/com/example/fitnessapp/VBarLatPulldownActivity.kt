package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VBarLatPulldownActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vbar_lat_pulldown)

        val vbarlatpulldowngeributton: Button = findViewById(R.id.vbarlatpulldowngeriButton)

        vbarlatpulldowngeributton.setOnClickListener {
            val intent: Intent = Intent(this, BackActivity::class.java)
            startActivity(intent)
        }
    }
}