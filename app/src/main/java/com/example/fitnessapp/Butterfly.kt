package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Butterfly : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butterfly)

        val geributon : Button = findViewById(R.id.kelebekgeri)

        geributon.setOnClickListener{
            val intent : Intent = Intent(this,ChestActivity::class.java)
            startActivity(intent)

        }
    }
}