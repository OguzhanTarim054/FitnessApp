package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kabloCekme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kablo_cekme)
        val geributon: Button = findViewById(R.id.kablogeri)

        geributon.setOnClickListener {
            val intent: Intent = Intent(this, BicepsActivity::class.java)
            startActivity(intent)
        }
    }
}