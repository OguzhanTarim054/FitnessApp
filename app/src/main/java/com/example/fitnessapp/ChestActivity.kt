package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chest)

        val dambilbuton : Button = findViewById(R.id.gbbuton2)

        dambilbuton.setOnClickListener{




            val intent : Intent = Intent(this,DumbellKaldirma::class.java)
            startActivity(intent)

        }


        val chestp : Button = findViewById(R.id.gbbuton31)

        chestp.setOnClickListener{




            val intent : Intent = Intent(this,ChestPress::class.java)
            startActivity(intent)

        }


        val kelebek : Button = findViewById(R.id.kelebekbuton)

        kelebek.setOnClickListener{




            val intent : Intent = Intent(this,Butterfly::class.java)
            startActivity(intent)

        }

        val tektrf : Button = findViewById(R.id.tektarafbutton4)

        tektrf.setOnClickListener{




            val intent : Intent = Intent(this,tekTarafGogus::class.java)
            startActivity(intent)

        }
        val geributon : Button = findViewById(R.id.bkgeributon)

        geributon.setOnClickListener{
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


    }

}