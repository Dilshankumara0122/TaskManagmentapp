package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homescreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen2)

        val navigateToLoginButton = findViewById<Button>(R.id.button2)
        navigateToLoginButton.setOnClickListener { // Navigate to login page
            val intent = Intent(this@Homescreen2, Register::class.java)
            startActivity(intent)
        }
    }
}