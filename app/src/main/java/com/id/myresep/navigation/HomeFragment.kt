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
                "Pot tanaman",
                listOf("Botol bekas", "Gunting", "Cat"),
                listOf("Potong botol", "Cat", "Isi tanah"),
                R.drawable.pot,
                R.drawable.pot2
            ),
            Kerajinan(
                "Pot tanaman hias",
                listOf("Botol plastik", "Pisau"),
                listOf("Bentuk botol", "Hias"),
                R.drawable.pot2,
                R.drawable.pot
            ),

            Kerajinan(
                "Pot botol plastik",
                listOf("Botol plastik", "Pisau", "Gunting"),
                listOf("Bentuk botol", "Hias"),
                R.drawable.pot2,
                R.drawable.pot
            )


        )

        rvHome.adapter = HomeAdapter(homeList)
    }
}
