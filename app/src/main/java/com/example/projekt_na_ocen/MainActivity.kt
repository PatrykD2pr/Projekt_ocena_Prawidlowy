package com.example.projekt_na_ocen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.Napis1).text = ""
        findViewById<TextView>(R.id.Liczba1).text = ""
        findViewById<TextView>(R.id.Liczba2).text = ""

        findViewById<Button>(R.id.Zastapienie).setOnClickListener{
            findViewById<TextView>(R.id.Napis2).text = findViewById<TextView>(R.id.Napis1).text.toString()
        }
        findViewById<Button>(R.id.polaczanie).setOnClickListener{
            var text = findViewById<TextView>(R.id.Napis2).text.toString()
            findViewById<TextView>(R.id.Napis2).text = text.toString() + findViewById<TextView>(R.id.Napis1).text.toString()
        }
        findViewById<Button>(R.id.Suma).setOnClickListener{
            var liczba1 = findViewById<TextView>(R.id.Liczba1).text
            var liczba2 = findViewById<TextView>(R.id.Liczba2).text
            var wynik = liczba1.toInt() + liczba2.toInt();
            findViewById<TextView>(R.id.Wynik_sumy).text = wynik.toInt()
        }
    }
}