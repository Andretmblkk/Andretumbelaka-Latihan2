package com.example.Nasa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Nasa.adapter.DetailAdapter
import com.example.Nasa.model.detailItem

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Temukan RecyclerView dari layout
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewDetail)
        recyclerView.layoutManager = LinearLayoutManager(this)


        val detailList = listOf(
            detailItem(
                "Apollo 11",
                "Misi Apollo 11 pada tahun 1969 membawa Neil Armstrong dan Buzz Aldrin mendarat di Bulan. Momen bersejarah ini menginspirasi jutaan orang di seluruh dunia.",
                R.drawable.gambar1
            ),
            detailItem(
                "Apollo 13",
                "Meskipun mengalami kendala teknis, Apollo 13 berhasil menyelamatkan awaknya dan menjadi contoh keberanian serta kecerdikan tim NASA.",
                R.drawable.gambar2
            ),
            detailItem(
                "Voyager 1",
                "Diluncurkan pada tahun 1977, Voyager 1 sekarang menjadi objek buatan manusia terjauh dari Bumi, mengungkap rahasia tata surya dan ruang antar bintang.",
                R.drawable.gambar2
            ),
            detailItem(
                "Hubble Space Telescope",
                "Sejak diluncurkan pada 1990, Hubble telah memberikan gambar-gambar astronomi yang luar biasa, membuka jendela menuju alam semesta yang luas.",
                R.drawable.gambar3
            ),
            detailItem(
                "Mars Rover Curiosity",
                "Rover Curiosity mendarat di Mars pada 2012 dan memberi wawasan tentang lingkungan planet merah, termasuk potensi kehidupan di masa lalu.",
                R.drawable.gambar4
            ),
            detailItem(
                "International Space Station (ISS)",
                "ISS adalah laboratorium ruang angkasa yang memungkinkan eksperimen sains dan penelitian teknologi di kondisi gravitasi mikro sepanjang masa.",
                R.drawable.gambar5
            ),
            detailItem(
                "James Webb Space Telescope",
                "Diprediksi akan mengubah cara kita memandang alam semesta, James Webb adalah penerus Hubble dengan kemampuan pengamatan yang lebih jauh dan mendalam.",
                R.drawable.gambar6
            )
        )

        // Pasang Adapter ke RecyclerView
        recyclerView.adapter = DetailAdapter(detailList)
    }
}
