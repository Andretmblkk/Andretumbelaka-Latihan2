package com.example.halamanlogin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Atur padding untuk sistem bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.home)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Tombol Lihat Detail
        val detailButton = findViewById<Button>(R.id.detail)
        detailButton.setOnClickListener {
            // Membuat Implicit Intent untuk membuka URL NASA
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.nasa.gov/missions/nasa-space-techs-favorite-place-to-travel-in-2025-the-moon/")
            startActivity(intent)
        }
    }
}
