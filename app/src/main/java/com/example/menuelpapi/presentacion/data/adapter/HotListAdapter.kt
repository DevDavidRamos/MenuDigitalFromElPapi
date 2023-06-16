package com.example.menuelpapi.presentacion.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuelpapi.R
import com.example.menuelpapi.presentacion.data.model.Burgers
import com.example.menuelpapi.presentacion.data.model.HotDogs

class HotListAdapter(private val hotDogList: List<HotDogs>) : RecyclerView.Adapter<HotViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HotViewHolder(layoutInflater.inflate(R.layout.itemcard_menu,parent, false))
    }

    override fun onBindViewHolder(holder: HotViewHolder, position: Int) {
        val item = hotDogList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int =hotDogList.size


}