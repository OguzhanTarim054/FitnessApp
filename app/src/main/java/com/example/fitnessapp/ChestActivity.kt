package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chest)

        val dambilbuton : Button = findViewById(R.id.dkbuton)

        dambilbuton.setOnClickListener{
            val intent : Intent = Intent(this,DumbellKaldirma::class.java)
            startActivity(intent)

        }
        val geributon : Button = findViewById(R.id.dkgeributon)

        geributon.setOnClickListener{
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }

}