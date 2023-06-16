package com.example.menuelpapi.presentacion.data.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.menuelpapi.databinding.ItemcardMenuBinding
import com.example.menuelpapi.presentacion.data.model.Burgers
import com.example.menuelpapi.presentacion.data.model.HotDogs
import com.example.menuelpapi.presentacion.data.model.Tacos


class TacosViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val binding = ItemcardMenuBinding.bind(view)

    fun render(tacos: Tacos)
    {
        binding.tvBurguerName.text = tacos.Nombre
        binding.tvPrecio.text = tacos.Precio
        binding.tvDescripcion.text =tacos.Descripcion

    }
}