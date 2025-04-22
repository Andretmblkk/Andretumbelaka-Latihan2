package com.example.Nasa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class home : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var menuIcon: ImageView // Deklarasikan ImageView untuk ikon menu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val rootView = findViewById<View>(R.id.home)
        ViewCompat.setOnApplyWindowInsetsListener(rootView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupDrawer()
        setupButtonActions()
    }

    private fun setupDrawer() {
        // Inisialisasi DrawerLayout
        drawerLayout = findViewById(R.id.drawer_layout)

        // Inisialisasi NavigationView
        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)


        menuIcon = findViewById(R.id.menu_icon)

        // Tambahkan toggle (ikon hamburger)
        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        menuIcon.setOnClickListener {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }
    }

    private fun setupButtonActions() {

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.nasa.gov/missions/nasa-space-techs-favorite-place-to-travel-in-2025-the-moon/")
            startActivity(intent)
        }


        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val activityIntent = Intent(this, detail::class.java)
            startActivity(activityIntent)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.profile -> {
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
            R.id.about -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
            R.id.logout -> {
                // Logout dan kembali ke halaman Login
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Tutup activity saat ini untuk mencegah kembali
            }
        }

        // Tutup drawer setelah item dipilih
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}