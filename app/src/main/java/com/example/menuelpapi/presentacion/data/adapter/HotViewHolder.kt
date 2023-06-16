package com.example.menuelpapi.presentacion.data.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.menuelpapi.databinding.ItemcardMenuBinding
import com.example.menuelpapi.presentacion.data.model.Burgers
import com.example.menuelpapi.presentacion.data.model.HotDogs


class HotViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val binding = ItemcardMenuBinding.bind(view)

    fun render(hotDogs: HotDogs)
    {
        binding.tvBurguerName.text = hotDogs.Nombre
        binding.tvPrecio.text = hotDogs.Precio
        binding.tvDescripcion.text =hotDogs.Descripcion

    }
}