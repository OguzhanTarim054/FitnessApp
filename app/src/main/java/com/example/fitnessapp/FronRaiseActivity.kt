package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FronRaiseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fron_raise)

        val frontraise : Button = findViewById(R.id.frontraisegeri)

        frontraise.setOnClickListener{
            val intent : Intent = Intent(this,ShoulderActivity::class.java)
            startActivity(intent)

        }
    }


}