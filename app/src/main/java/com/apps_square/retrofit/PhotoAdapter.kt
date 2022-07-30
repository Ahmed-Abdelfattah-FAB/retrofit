package com.apps_square.retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.apps_square.retrofit.data.model.Data
import com.bumptech.glide.Glide


class PhotoAdapter : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {
    private var data = emptyList<Data?>()

    internal fun setDataList(data: List<Data?>) {
        this.data = data
        notifyDataSetChanged()
    }
    
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var title: TextView
        var desc: TextView

        init {
            image = itemView.findViewById(R.id.image)
            title = itemView.findViewById(R.id.title)
            desc = itemView.findViewById(R.id.desc)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.photo_layout, parent, false))
    }


    override fun getItemCount() = data.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        data[position]?.apply {
            holder.title.text = name
            holder.desc.text = price.toString()
            Glide.with(holder.itemView.context).load(image).into(holder.image)
        }
    }
}