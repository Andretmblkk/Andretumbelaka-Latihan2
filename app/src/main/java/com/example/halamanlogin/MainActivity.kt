package com.example.halamanlogin

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

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


        setupButtonActions()
    }

    private fun setupButtonActions() {

        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {
            val intent = Intent(this@MainActivity, home::class.java)
            startActivity(intent)
        }


        val registerText = findViewById<TextView>(R.id.register_text)
        registerText.setOnClickListener {
            val intent = Intent(this@MainActivity, Register::class.java)
            startActivity(intent)
        }


        val forgotPasswordText = findViewById<TextView>(R.id.forgot_password_text)
        forgotPasswordText.setOnClickListener {
            val intent = Intent(this@MainActivity, ResetPassword::class.java)
            startActivity(intent)
        }
    }

}
