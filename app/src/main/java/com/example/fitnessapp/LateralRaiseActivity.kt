package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LateralRaiseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lateral_raise)

        val lateralgeri: Button = findViewById(R.id.lateralRaiseGeri)

        lateralgeri.setOnClickListener {
            val intent: Intent = Intent(this, ShoulderActivity::class.java)
            startActivity(intent)
        }
    }
}