package com.example.fitnessapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


        val imageView = findViewById<ImageView>(R.id.imageView)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)
        Glide.with(this).load(R.drawable.chest).into(imageView);
        Glide.with(this).load(R.drawable.biseps).into(imageView3);
        Glide.with(this).load(R.drawable.back).into(imageView5);
        Glide.with(this).load(R.drawable.shoulder).into(imageView6);
        val profileButton: Button = findViewById(R.id.button)

        profileButton.setOnClickListener {
            val intent: Intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)

        }
        val gsbuton: Button = findViewById(R.id.gbuton)


//        val timer = object: CountDownTimer(30, 1) {
//            override fun onTick(millisUntilFinished: Long) {}
//
//            override fun onFinish() {
//                val  intent = Intent(this@MainActivity,Gecis::class.java)
//                startActivity(intent)
//            }
//
//        }
//        timer.start()


        gsbuton.setOnClickListener {

            val intent: Intent = Intent(this, Gecis::class.java)
            startActivity(intent)
            finish()

        }
        val bbuton: Button = findViewById(R.id.bbuton)

        bbuton.setOnClickListener {
            val intent: Intent = Intent(this, Gecis2::class.java)
            startActivity(intent)
            finish()

        }
        val ssbuton: Button = findViewById(R.id.sbuton)

        ssbuton.setOnClickListener {
            val intent: Intent = Intent(this, Gecis3::class.java)
            startActivity(intent)
            finish()

        }
        val obuton: Button = findViewById(R.id.obuton)

        obuton.setOnClickListener {
            val intent: Intent = Intent(this, Gecis4::class.java)
            startActivity(intent)
            finish()

        }
    }
}