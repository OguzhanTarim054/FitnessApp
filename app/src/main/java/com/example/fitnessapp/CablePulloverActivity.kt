package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CablePulloverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cable_pullover)

        val cablepullovergeributton : Button = findViewById(R.id.cablepullovergeriButton)

        cablepullovergeributton.setOnClickListener{
            val intent : Intent = Intent(this,BackActivity::class.java)
            startActivity(intent)

        }
    }
}