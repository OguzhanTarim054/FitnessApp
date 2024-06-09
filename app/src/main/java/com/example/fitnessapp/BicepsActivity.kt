package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BicepsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biceps)

        val zbar : Button = findViewById(R.id.zbarbuton3)

        zbar.setOnClickListener{




            val intent : Intent = Intent(this,z_barcurl::class.java)
            startActivity(intent)

        }

        val tekdambil1 : Button = findViewById(R.id.tekdambilpazubutton)

        tekdambil1.setOnClickListener{




            val intent : Intent = Intent(this,tekdambil::class.java)
            startActivity(intent)

        }



        val geributon : Button = findViewById(R.id.bkgeributon2)

        geributon.setOnClickListener{
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        val oturkal : Button = findViewById(R.id.otkaldirbutton)

        oturkal.setOnClickListener{




            val intent : Intent = Intent(this,oturarakKaldiris::class.java)
            startActivity(intent)

        }

        val kablocek : Button = findViewById(R.id.kabloCekmebutton)

        kablocek.setOnClickListener{




            val intent : Intent = Intent(this,kabloCekme::class.java)
            startActivity(intent)

        }
    }

}