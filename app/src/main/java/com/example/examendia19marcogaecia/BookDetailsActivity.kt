
package com.example.examendia19marcogaecia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BookDetailsActivity : AppCompatActivity() {

    var btnSiguiente= findViewById<Button>(R.id.button)

    var titulo: String = ""
    var numero = 0

    var nombreAutor = findViewById<TextView>(R.id.editTextText)
    var año = findViewById<TextView>(R.id.editTextText2)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        titulo = intent.getStringExtra("titulo").toString()
        numero = intent.getIntExtra("numero",0)

        btnSiguiente.setOnClickListener {

            val intent = Intent(this@BookDetailsActivity, BookTitleActivity::class.java)

            intent.putExtra("titulo",titulo)
            intent.putExtra("numero",numero)
            intent.putExtra("nombreAutor","Posbile nombreAutor")
            intent.putExtra("año","Posible Año")



            /*
            intent.putExtra("titulo",titulo)
            intent.putExtra("numero",numero)
            intent.putExtra("nombreAutor",nombreAutor.transitionName)
            intent.putExtra("año",año.transitionName)
            */


            startActivity(intent)


        }
    }
}
