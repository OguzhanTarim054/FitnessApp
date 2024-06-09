package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back)

        val latpulldown : Button = findViewById(R.id.latpulldownButton)

        latpulldown.setOnClickListener{

            val intent : Intent = Intent(this,LatpulldownActivity::class.java)
            startActivity(intent)

        }


        val seatedcablerow : Button = findViewById(R.id.seatedcablerowButton)

        seatedcablerow.setOnClickListener{

            val intent : Intent = Intent(this,SeatedCableRowActivity::class.java)
            startActivity(intent)

        }

        val cablepulloverbutton : Button = findViewById(R.id.cablepulloverButton)

        cablepulloverbutton.setOnClickListener{

            val intent : Intent = Intent(this,CablePulloverActivity::class.java)
            startActivity(intent)

        }

        val vbarlatpulldownbutton : Button = findViewById(R.id.vbarlatpulldownButton)

        vbarlatpulldownbutton.setOnClickListener{

            val intent : Intent = Intent(this,VBarLatPulldownActivity::class.java)
            startActivity(intent)

        }


        val sirtgeri : Button = findViewById(R.id.sirtgeributon)

        sirtgeri.setOnClickListener{
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }


}