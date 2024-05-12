package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onbodescreen03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onbodescreen03)

        val navigateToLoginButton = findViewById<Button>(R.id.button3)
        navigateToLoginButton.setOnClickListener { // Navigate to login page
            val intent = Intent(this@onbodescreen03, Homescreen2::class.java)
            startActivity(intent)
        }
    }
}