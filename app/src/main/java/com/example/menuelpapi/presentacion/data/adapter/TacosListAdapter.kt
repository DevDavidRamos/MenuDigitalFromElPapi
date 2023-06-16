package com.example.menuelpapi.presentacion.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuelpapi.R
import com.example.menuelpapi.presentacion.data.model.Burgers
import com.example.menuelpapi.presentacion.data.model.Tacos

class TacosListAdapter(private val tacosList: List<Tacos>) : RecyclerView.Adapter<TacosViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TacosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TacosViewHolder(layoutInflater.inflate(R.layout.itemcard_menu,parent, false))
    }

    override fun onBindViewHolder(holder: TacosViewHolder, position: Int) {
        val item = tacosList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int =tacosList.size


}