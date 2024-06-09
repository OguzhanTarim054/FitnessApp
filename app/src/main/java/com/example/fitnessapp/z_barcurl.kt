package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class z_barcurl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zbarcurl)

        val geributon: Button = findViewById(R.id.zbargeributon2)

        geributon.setOnClickListener {
            val intent: Intent = Intent(this, BicepsActivity::class.java)
            startActivity(intent)
        }
    }
}