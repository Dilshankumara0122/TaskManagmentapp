package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    private lateinit var singin: TextView
    private lateinit var loginbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // Initialize btn
        singin = findViewById(R.id.no_sing_in)
        loginbtn = findViewById(R.id.login)
        // Set OnClickListener for the button
        singin.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
        // Set OnClickListener for the button
        loginbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}