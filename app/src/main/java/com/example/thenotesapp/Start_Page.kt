package com.example.thenotesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Start_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_page)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this@Start_Page,MainActivity::class.java)
            startActivity(intent)
        }
    }
}