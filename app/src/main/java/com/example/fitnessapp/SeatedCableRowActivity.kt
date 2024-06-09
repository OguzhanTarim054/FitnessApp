package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SeatedCableRowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seated_cable_row)

        val seatedcablerowgeributton: Button = findViewById(R.id.seatedcablerowgeriButton)

        seatedcablerowgeributton.setOnClickListener {
            val intent: Intent = Intent(this, BackActivity::class.java)
            startActivity(intent)
        }
    }
}