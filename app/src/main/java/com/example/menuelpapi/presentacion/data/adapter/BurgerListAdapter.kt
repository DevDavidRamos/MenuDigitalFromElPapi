package com.example.menuelpapi.presentacion.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuelpapi.R
import com.example.menuelpapi.presentacion.data.model.Burgers

class BurgerListAdapter(private val burgerList: List<Burgers>) : RecyclerView.Adapter<BurgerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BurgerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BurgerViewHolder(layoutInflater.inflate(R.layout.itemcard_menu,parent, false))
    }

    override fun onBindViewHolder(holder: BurgerViewHolder, position: Int) {
        val item = burgerList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int =burgerList.size


}