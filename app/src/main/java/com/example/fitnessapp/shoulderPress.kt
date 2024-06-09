package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class shoulderPress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoulder_press)

        val shoulderpresgeri: Button = findViewById(R.id.shouldergeriButton)

        shoulderpresgeri.setOnClickListener {
            val intent: Intent = Intent(this, ShoulderActivity::class.java)
            startActivity(intent)
        }
    }
}