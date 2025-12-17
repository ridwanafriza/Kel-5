package com.id.myresep

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

// MainActivity sebagai activity utama yang menampung fragment
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                enableEdgeToEdge()

        // Menghubungkan activity dengan layout activity_main.xml
        setContentView(R.layout.activity_main)

        // Mengatur padding agar konten tidak tertutup status bar atau navigation bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top,
                systemBars.right, systemBars.bottom)
            insets
        }

        // Mengambil NavHostFragment yang menjadi wadah fragment
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        // Mengambil NavController untuk mengatur perpindahan fragment
        val navController = navHostFragment.navController

        // Menghubungkan BottomNavigationView dengan NavController
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNav.setupWithNavController(navController)
    }
}
