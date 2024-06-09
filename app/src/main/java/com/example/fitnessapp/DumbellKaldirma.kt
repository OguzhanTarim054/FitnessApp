package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.Button
import android.widget.ImageView


class DumbellKaldirma : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dumbell_kaldirma)



        val geributon : Button = findViewById(R.id.dambilkaldirmageri)

        geributon.setOnClickListener{
            val intent : Intent = Intent(this,ChestActivity::class.java)
            startActivity(intent)

        }

    }
}