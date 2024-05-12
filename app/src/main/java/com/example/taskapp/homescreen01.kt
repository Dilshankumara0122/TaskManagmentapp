package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class homescreen01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen01)

        val navigateToLoginButton = findViewById<Button>(R.id.button)
        navigateToLoginButton.setOnClickListener { // Navigate to login page
            val intent = Intent(this@homescreen01, onbodescreen03::class.java)
            startActivity(intent)
        }
    }
}
