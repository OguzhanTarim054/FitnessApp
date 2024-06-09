package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val geributon : Button = findViewById(R.id.pgeributon)

        geributon.setOnClickListener{
            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        val heightInput = findViewById<EditText>(R.id.heightInput)
        val weightInput = findViewById<EditText>(R.id.weightInput)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        calculateButton.setOnClickListener {
            val heightStr = heightInput.text.toString()
            val weightStr = weightInput.text.toString()

            if (heightStr.isNotEmpty() && weightStr.isNotEmpty()) {
                val height = heightStr.toDouble()
                val weight = weightStr.toDouble()
                val bmi = weight / (height * height)
                val category = getBMICategory(bmi)
                resultText.text = "VKİ: %.2f\nKategori: %s".format(bmi, category)
                //resultText.text = "VKİ : ${bmi}\nKategori: $category"
            } else {
                resultText.text = "Lütfen boyunuzu ve kilonuzu girin."
            }
        }
    }

    private fun getBMICategory(bmi: Double): String {
        return when {
            bmi < 18.5 -> "Zayıf"
            bmi < 24.9 -> "Normal Kilolu"
            bmi < 29.9 -> "Fazla Kilolu"
            bmi < 39.9 -> "Obez"
            else -> "Morbid Obez"
        }


    }
}