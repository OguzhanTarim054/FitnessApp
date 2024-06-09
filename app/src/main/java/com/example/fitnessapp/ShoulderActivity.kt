package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ShoulderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoulder)

        val omuzbuton : Button = findViewById(R.id.shoulderpressbuton)

        omuzbuton.setOnClickListener{

            val intent : Intent = Intent(this,shoulderPress::class.java)
            startActivity(intent)

        }
        val dumbbellfrontrisebutton : Button = findViewById(R.id.dumbbellfrontriseButton)

        dumbbellfrontrisebutton.setOnClickListener{

            val intent : Intent = Intent(this,FronRaiseActivity::class.java)
            startActivity(intent)

        }

        val dumbbellscaptionbtn : Button = findViewById(R.id.dumbbleescaptionbutton)

        dumbbellscaptionbtn.setOnClickListener{

            val intent : Intent = Intent(this,DumbbellScaptionActivity::class.java)
            startActivity(intent)

        }

        val lateralbutton : Button = findViewById(R.id.lateralraisebutton)

        lateralbutton.setOnClickListener{

            val intent : Intent = Intent(this,LateralRaiseActivity::class.java)
            startActivity(intent)

        }
        val omuzgeri : Button = findViewById(R.id.omuzgeributon)

        omuzgeri.setOnClickListener{
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}