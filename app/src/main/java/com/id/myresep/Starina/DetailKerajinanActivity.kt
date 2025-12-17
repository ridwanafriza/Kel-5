package com.id.myresep.Starina

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.id.myresep.R

class DetailKerajinanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_kerajinan)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txtJudul: TextView = findViewById(R.id.txtJudul)
        val imageDetail1: ImageView = findViewById(R.id.imageDetail1)
        val imageDetail2: ImageView = findViewById(R.id.imageDetail2)
        val rvBahan: androidx.recyclerview.widget.RecyclerView = findViewById(R.id.rvBahan)
        val rvCara: androidx.recyclerview.widget.RecyclerView = findViewById(R.id.rvCara)
        val judul = intent.getStringExtra("judul") ?: "Judul Tidak Diketahui"
        val bahanList = intent.getStringArrayListExtra("bahanList") ?: arrayListOf()
        val caraList = intent.getStringArrayListExtra("caraList") ?: arrayListOf()
        val gambar1 = intent.getIntExtra("gambar1", R.drawable.pot)
        val gambar2 = intent.getIntExtra("gambar2", R.drawable.pot2)

        txtJudul.text = judul
        imageDetail1.setImageResource(gambar1)
        imageDetail2.setImageResource(gambar2)

        rvBahan.layoutManager = LinearLayoutManager(this)
        rvBahan.adapter = DetailKerajinanAdapter(bahanList)

        rvCara.layoutManager = LinearLayoutManager(this)
        rvCara.adapter = DetailKerajinanAdapter(caraList)


    }
}