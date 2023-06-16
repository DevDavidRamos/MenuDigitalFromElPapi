package com.example.menuelpapi.presentacion.data.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.menuelpapi.databinding.ItemcardMenuBinding
import com.example.menuelpapi.presentacion.data.model.Burgers


class BurgerViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val binding = ItemcardMenuBinding.bind(view)

    fun render(burgers: Burgers)
    {
        binding.tvBurguerName.text = burgers.Nombre
        binding.tvPrecio.text = burgers.Precio
        binding.tvDescripcion.text =burgers.Descripcion

    }
}