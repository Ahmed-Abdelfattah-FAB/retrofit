package com.apps_square.retrofit

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhotoAdapter(var context : Context) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {
    var datalist = emptyList<DataModel>()

    internal fun setDataList(datalist : List<DataModel>){
        this.datalist = datalist
        notifyDataSetChanged()
    }


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var image : ImageView
        var title: TextView
        var desc : TextView
        init {
            image= itemView.findViewById(R.id.image)
            title= itemView.findViewById(R.id.title)
            desc= itemView.findViewById(R.id.desc)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.photo_layout,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount()= datalist.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = datalist[position]
        holder.title.text = data.title
        holder.desc.text = data.desc

        holder.image.setImageResource(data.image)
    }
}