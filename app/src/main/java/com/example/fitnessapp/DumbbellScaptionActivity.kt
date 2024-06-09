package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DumbbellScaptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dumbbell_scaption)

        val dambilscaption : Button = findViewById(R.id.dumbbleescaptiongeriButton)

        dambilscaption.setOnClickListener{
            val intent : Intent = Intent(this,ShoulderActivity::class.java)
            startActivity(intent)

        }



    }
}