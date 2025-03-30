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

        // Terapkan window insets ke view root dengan id "main"
        val mainView = findViewById<View>(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(mainView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupButtonActions()
    }

    private fun setupButtonActions() {
        // Simpan context ke variabel lokal (tidak menggunakan this@MainActivity)
        val context = this

        // Tombol Login pindah ke activity login (misalnya Home)
        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {
            // Pastikan Activity yang dituju dinamai dengan huruf kapital, misal Home
            val intent = Intent(context, home::class.java)
            startActivity(intent)
        }

        // Teks Register pindah ke halaman Register
        val registerText = findViewById<TextView>(R.id.register_text)
        registerText.setOnClickListener {
            val intent = Intent(context, Register::class.java)
            startActivity(intent)
        }



        }
    }

