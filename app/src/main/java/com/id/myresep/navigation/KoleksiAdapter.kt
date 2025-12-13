package com.id.myresep.navigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.id.myresep.R

class KoleksiAdapter (
    val listKoleksi: List<Koleksi>
) : RecyclerView.Adapter<KoleksiAdapter.KoleksiViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KoleksiViewHolder {

        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_koleksi, parent, false)

        return KoleksiViewHolder(layout)
    }

    override fun onBindViewHolder(
        holder: KoleksiViewHolder,
        position: Int
    ) {
        val koleksi: Koleksi = listKoleksi[position]

        holder.textViewJudul.text = koleksi.judul
        holder.textViewCaption.text = koleksi.caption
        holder.imageKerajinan.setImageResource(koleksi.gambar)
    }

    override fun getItemCount(): Int = listKoleksi.size

    class KoleksiViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val textViewJudul: TextView = row.findViewById(R.id.txtJudul)
        val textViewCaption: TextView = row.findViewById(R.id.txtCaption)
        val imageKerajinan: ImageView = row.findViewById(R.id.imgKerajinan)
    }
}