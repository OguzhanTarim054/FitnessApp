package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tekdambil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tekdambil)

        val geributon31: Button = findViewById(R.id.tekdambilgeributon)

        geributon31.setOnClickListener {
            val intent: Intent = Intent(this, BicepsActivity::class.java)
            startActivity(intent)
        }
    }
}