package com.example.fitnessapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val profileButton : Button = findViewById(R.id.button)

        profileButton.setOnClickListener{
            val intent :Intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)

        }
        val gsbuton : Button = findViewById(R.id.gbuton)

        gsbuton.setOnClickListener{
            val intent :Intent = Intent(this,ChestActivity::class.java)
            startActivity(intent)

        }
        val bbuton : Button = findViewById(R.id.bbuton)

        bbuton.setOnClickListener{
            val intent :Intent = Intent(this,BicepsActivity::class.java)
            startActivity(intent)

        }
        val sbuton : Button = findViewById(R.id.sbuton)

        sbuton.setOnClickListener{
            val intent :Intent = Intent(this,BackActivity::class.java)
            startActivity(intent)

        }
        val obuton : Button = findViewById(R.id.obuton)

        obuton.setOnClickListener{
            val intent :Intent = Intent(this,ShoulderActivity::class.java)
            startActivity(intent)

        }
    }
}