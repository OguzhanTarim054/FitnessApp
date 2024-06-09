package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tekTarafGogus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tek_taraf_gogus)

        val geributon : Button = findViewById(R.id.seatedcablerowgeriButton)

        geributon.setOnClickListener{
            val intent : Intent = Intent(this,ChestActivity::class.java)
            startActivity(intent)

        }
    }
}