package com.example.examendia19marcogaecia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BookDisplayActivity : AppCompatActivity() {


    var btnVolver= findViewById<Button>(R.id.button)
    var titulo = findViewById<TextView>(R.id.textView)
    var numero = findViewById<TextView>(R.id.textView2)

    var nombreAutor = findViewById<TextView>(R.id.textView3)
    var año = findViewById<TextView>(R.id.textView4)

    var aux =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)




        btnVolver.setOnClickListener {

            val intent = Intent(this@BookDisplayActivity, BookDetailsActivity::class.java)

           // aux = titulo+numero+nombreAutor+año
           // intent.putExtra("titulo",aux)
            startActivity(intent)


        }
    }



}