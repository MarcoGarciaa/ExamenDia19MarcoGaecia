package com.example.examendia19marcogaecia


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BookTitleActivity : AppCompatActivity() {


    var btnSiguiente= findViewById<Button>(R.id.button)
    var titulo = findViewById<TextView>(R.id.editTextText)
    var numero = findViewById<TextView>(R.id.editTextText2)
    var numeroReal: Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSiguiente.setOnClickListener {

            var intent = Intent(this@BookTitleActivity, BookDisplayActivity::class.java)



            intent.putExtra("titulo","Posible Titulo")
            intent.putExtra("numero","Posible Numero")

           // intent.putExtra("titulo",titulo.transitionName)
           // intent.putExtra("numero",numero.transitionName)


            startActivity(intent)


        }
    }



}