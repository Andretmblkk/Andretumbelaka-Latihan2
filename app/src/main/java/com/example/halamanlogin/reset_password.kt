package com.example.halamanlogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ResetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        // Tombol "Kembali ke Login"
        val loginBackText = findViewById<TextView>(R.id.loginback)
        loginBackText.setOnClickListener {
            // Intent untuk kembali ke halaman login
            val intent = Intent(this@ResetPassword, MainActivity::class.java)
            startActivity(intent)
            finish() // Tutup halaman ResetPassword agar tidak bisa kembali dengan tombol "back"
        }
    }
}
