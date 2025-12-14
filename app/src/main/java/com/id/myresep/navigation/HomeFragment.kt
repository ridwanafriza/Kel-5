package com.id.myresep.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.id.myresep.R
import com.id.myresep.Starina.Kerajinan

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvHome = view.findViewById<RecyclerView>(R.id.rvHome)
        rvHome.layoutManager = LinearLayoutManager(requireContext())

        val homeList = listOf(
            Kerajinan(
                "Pot Tanaman",
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
                ),
                R.drawable.pot,
                R.drawable.pot2
            ),
            Kerajinan(
                "Celengan Botol",
                listOf(
                    "Botol plastik bekas",
                    "Cutter atau gunting",
                    "Cat atau stiker hias"
                ),
                listOf(
                    "Buat lubang pada botol untuk memasukkan uang",
                    "Hias botol sesuai selera",
                    "Celengan siap digunakan"
                ),
                R.drawable.celengan,
                R.drawable.celengan2
            ),
            Kerajinan(
                "Bingkai Foto Kardus",
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
                ),
                R.drawable.bingkaifoto,
                R.drawable.bingkai2
            )


        )

        rvHome.adapter = HomeAdapter(homeList)
    }
}
