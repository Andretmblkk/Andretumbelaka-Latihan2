package com.example.Nasa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Nasa.adapter.DetailAdapter
import com.example.Nasa.model.DetailItem

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Temukan RecyclerView dari layout
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewDetail)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Buat data contoh sederhana
        val detailList = listOf(
            DetailItem("Judul 1", "Deskripsi singkat item 1."),
            DetailItem("Judul 2", "Deskripsi singkat item 2."),
            DetailItem("Judul 3", "Deskripsi singkat item 3."),
            DetailItem("Judul 4", "Deskripsi singkat item 4.")
        )

        // Pasang adapter ke RecyclerView
        val adapter = DetailAdapter(detailList)
        recyclerView.adapter = adapter
    }
}


