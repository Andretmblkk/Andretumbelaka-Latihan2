package com.example.Nasa


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ResetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val emailEditText = findViewById<EditText>(R.id.email_edit_text)
        val resetButton = findViewById<Button>(R.id.reset_button)
        val loginText = findViewById<TextView>(R.id.login_text)

        resetButton.setOnClickListener {
            val email = emailEditText.text.toString()

            if (email.isEmpty()) {
                Toast.makeText(this, "Email harus diisi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Link reset password telah dikirim", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        loginText.setOnClickListener {
            finish()
        }
    }
}