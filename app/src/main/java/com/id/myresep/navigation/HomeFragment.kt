package com.id.myresep.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.id.myresep.R

// HomeFragment adalah Fragment yang berfungsi sebagai halaman utama (Home/Beranda)
class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Mengambil RecyclerView dari layout fragment_home
        val rvHome = view.findViewById<RecyclerView>(R.id.rvHome)

        // Mengatur RecyclerView agar menampilkan item secara vertikal (atas ke bawah)
        rvHome.layoutManager = LinearLayoutManager(requireContext())

        // Membuat data dummy menggunakan data class Koleksi
        // Data ini nantinya akan ditampilkan ke RecyclerView melalui adapter
        val homeList = listOf(
            Koleksi(
                "Pot Tanaman",
                "Pot tanaman dari botol bekas adalah kerajinan sederhana yang memanfaatkan botol plastik sebagai pot tanaman.",
                R.drawable.pot,
                R.drawable.pot2,
                listOf(
                    "Botol plastik bekas",
                    "Gunting atau cutter",
                    "Cat akrilik atau cat semprot",
                    "Kuas cat",
                    "Tanah dan bibit tanaman"
                ),
                listOf(
                    "Potong botol bekas sesuai ukuran yang diinginkan",
                    "Lubangi bagian bawah botol untuk saluran air",
                    "Cat botol sesuai selera lalu biarkan kering kan",
                    "Masukkan tanah ke dalam pot",
                    "Tanam bibit dan siram secukupnya"
                )
            ),

            Koleksi(
                "Celengan Botol",
                "Celengan dari botol bekas yang sederhana, kreatif, dan membantu mengurangi sampah plastik di sekitar kita.",
                R.drawable.celengan,
                R.drawable.celengan2,
                listOf(
                    "Botol plastik bekas",
                    "Cutter atau gunting",
                    "Cat atau stiker hias"
                ),
                listOf(
                    "Buat lubang pada botol untuk memasukkan uang",
                    "Hias botol sesuai selera",
                    "Celengan siap digunakan"
                )
            ),

            Koleksi(
                "Bingkai Foto Kardus",
                "Bingkai foto dari kardus bekas yang sederhana cocok untuk mempercantik dekorasi ruangan.",
                R.drawable.bingkaifoto,
                R.drawable.bingkai2,
                listOf(
                    "Kardus bekas",
                    "Gunting atau cutter",
                    "Lem",
                    "Hiasan (kertas warna, stiker, pita)"
                ),
                listOf(
                    "Potong kardus membentuk bingkai foto",
                    "Rekatkan bagian bingkai dengan lem",
                    "Hias bingkai sesuai selera",
                    "Masukkan foto ke dalam bingkai"
                )
            )
        )

        // Menghubungkan data (homeList) ke RecyclerView menggunakan HomeAdapter
        // Adapter berperan sebagai penghubung antara data dan tampilan item_koleksi
        rvHome.adapter = HomeAdapter(homeList)
    }
}
