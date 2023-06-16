package com.example.menuelpapi.presentacion.data.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.menuelpapi.databinding.ItemcardMenuBinding
import com.example.menuelpapi.presentacion.data.model.Papas



class PapasViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val binding = ItemcardMenuBinding.bind(view)

    fun render(papas: Papas)
    {
        binding.tvBurguerName.text = papas.Nombre
        binding.tvPrecio.text = papas.Precio
        binding.tvDescripcion.text =papas.Descripcion

    }
}