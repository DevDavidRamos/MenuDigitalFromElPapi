package com.example.menuelpapi.presentacion.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menuelpapi.R
import com.example.menuelpapi.presentacion.data.model.Burgers
import com.example.menuelpapi.presentacion.data.model.Papas
import com.example.menuelpapi.presentacion.data.model.Tacos
import com.example.menuelpapi.presentacion.paponas.Paponas

class PapasListAdapter(private val paponasList: List<Papas>) : RecyclerView.Adapter<PapasViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PapasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PapasViewHolder(layoutInflater.inflate(R.layout.itemcard_menu,parent, false))
    }

    override fun onBindViewHolder(holder: PapasViewHolder, position: Int) {
        val item = paponasList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int =paponasList.size


}