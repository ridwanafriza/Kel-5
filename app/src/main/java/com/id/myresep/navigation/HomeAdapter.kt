package com.id.myresep.navigation

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.id.myresep.Starina.DetailKerajinanActivity
import com.id.myresep.R

// Adapter untuk menghubungkan data Home dengan tampilan RecyclerView
class HomeAdapter(
    private val listKoleksi: List<Koleksi>
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    // ViewHolder untuk menyimpan view pada setiap item
    inner class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtJudul: TextView = view.findViewById(R.id.txtJudul)
        val txtCaption: TextView = view.findViewById(R.id.txtCaption)
        val img: ImageView = view.findViewById(R.id.imgKerajinan)
    }

    // Membuat tampilan item dari layout XML
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_koleksi, parent, false)
        return HomeViewHolder(view)
    }

    // Mengisi data ke tampilan item sesuai posisi
    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = listKoleksi[position]

        holder.txtJudul.text = item.judul
        holder.txtCaption.text = item.caption
        holder.img.setImageResource(item.gambar1)

        // Klik item menuju halaman detail
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailKerajinanActivity::class.java)
            intent.putExtra("judul", item.judul)
            intent.putExtra("caption", item.caption)
            intent.putExtra("gambar1", item.gambar1)
            intent.putExtra("gambar2", item.gambar2)
            intent.putStringArrayListExtra("bahanList", ArrayList(item.bahan))
            intent.putStringArrayListExtra("caraList", ArrayList(item.cara))
            context.startActivity(intent)
        }
    }

    // Menentukan jumlah data yang ditampilkan
    override fun getItemCount(): Int = listKoleksi.size
}
