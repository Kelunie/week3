package com.example.week3_caleb

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // we add our code from the activity_main.xml
        // example how to use toast message
        val btnMessage1 = findViewById<Button>(R.id.btnMessage1_main)
        btnMessage1.setOnClickListener(View.OnClickListener { VIEW ->
            Toast.makeText(this, getString(R.string.Message1), Toast.LENGTH_LONG).show()
        })

        val btnMessage2 = findViewById<Button>(R.id.btnMessage2_main)
        btnMessage2.setOnClickListener(View.OnClickListener { VIEW ->
            Toast.makeText(this, getString(R.string.Message2), Toast.LENGTH_LONG).show()
        })
    }
}