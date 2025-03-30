package com.example.Nasa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Nasa.R
import com.example.Nasa.model.detailItem

class DetailAdapter(private val itemList: List<detailItem>) :
    RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {

    inner class DetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivItem: ImageView = itemView.findViewById(R.id.ivItem)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvDescription: TextView = itemView.findViewById(R.id.tvDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail, parent, false)
        return DetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        val item = itemList[position]
        holder.tvTitle.text = item.title
        holder.tvDescription.text = item.description
        holder.ivItem.setImageResource(item.imageRes)
    }

    override fun getItemCount(): Int = itemList.size
}
