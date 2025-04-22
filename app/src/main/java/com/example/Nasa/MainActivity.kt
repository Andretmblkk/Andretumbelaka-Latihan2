package com.example.Nasa

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val mainView = findViewById<View>(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(mainView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupButtonActions()
    }

    private fun setupButtonActions() {

        val context = this


        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {

            val intent = Intent(context, home::class.java)
            startActivity(intent)
        }


        val registerText = findViewById<TextView>(R.id.register_text)
        registerText.setOnClickListener {
            val intent = Intent(context, Register::class.java)
            startActivity(intent)
        }



        }
    }

