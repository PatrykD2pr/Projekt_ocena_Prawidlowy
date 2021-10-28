package com.example.projekt_na_ocen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.Napis1).text = "";

        findViewById<Button>(R.id.Zastapienie).setOnClickListener{
            findViewById<TextView>(R.id.Napis2).text = findViewById<TextView>(R.id.Napis1).text.toString();
        }
        findViewById<Button>(R.id.polaczanie).setOnClickListener{
            var text = findViewById<TextView>(R.id.Napis2).text.toString();
            findViewById<TextView>(R.id.Napis2).text = text.toString() + findViewById<TextView>(R.id.Napis1).text.toString();
        }
    }
}