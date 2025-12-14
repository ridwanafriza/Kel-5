package com.id.myresep.navigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.id.myresep.R
import com.id.myresep.Starina.DetailKerajinanActivity
import com.id.myresep.navigation.Koleksi
import com.id.myresep.navigation.KoleksiAdapter

class KoleksiFragment : Fragment(R.layout.fragment_koleksi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Ambil view dari layout
        val rvKoleksi = view.findViewById<RecyclerView>(R.id.rvKoleksi)
        val txtJumlah = view.findViewById<TextView>(R.id.txtJumlah)

        // RecyclerView setup
        rvKoleksi.layoutManager = LinearLayoutManager(requireContext())

        // DATA DUMMY (sementara)
        val koleksiList = listOf(
            Koleksi(
                "Pot tanaman",
                "Pot tanaman dari botol bekas adalah kerajinan sederhana yang memanfaatkan botol plastik sebagai pot tanaman.",
                R.drawable.pot, R.drawable.pot2
            ),
            Koleksi(
                "Celengan dari botol",
                "Celengan dari botol bekas yang sederhana, kreatif, dan membantu mengurangi sampah plastik di sekitar kita.",
                R.drawable.celengan, R.drawable.celengan2
            ),
            Koleksi(
                "Bingkai Foto Kardus",
                "Bingkai foto dari kardus bekas yang sederhana cocok untuk mempercantik dekorasi ruangan.",
                R.drawable.bingkaifoto, R.drawable.bingkai2
        )
        )

        txtJumlah.text = "${koleksiList.size} tersimpan"

        rvKoleksi.adapter = KoleksiAdapter(koleksiList)

        // (OPSIONAL) Klik item → ke detail
        rvKoleksi.adapter = KoleksiAdapter(koleksiList).apply {
            // Kalau nanti mau klik item, logic-nya ditaruh di adapter
        }
    }
}
