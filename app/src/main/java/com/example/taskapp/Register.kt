package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Register : AppCompatActivity() {
    private lateinit var singup: TextView
    private lateinit var home: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        // Initialize btn
        singup = findViewById(R.id.no_sing_up)
        home = findViewById(R.id.sing_in)
        // Set OnClickListener for the button
        singup.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}