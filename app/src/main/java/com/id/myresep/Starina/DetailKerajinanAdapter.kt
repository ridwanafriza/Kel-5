package com.id.myresep.Starina

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.id.myresep.R

class DetailKerajinanAdapter(
    private val listDetail: List<String>
) : RecyclerView.Adapter<DetailKerajinanAdapter.DetailViewHolder>() {

    // ViewHolder
    class DetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewDetail: TextView = itemView.findViewById(R.id.textViewDetail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_detail_kerajinan, parent, false)
        return DetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        val detail = listDetail[position]
        holder.textViewDetail.text = detail
    }

    override fun getItemCount(): Int = listDetail.size
}
