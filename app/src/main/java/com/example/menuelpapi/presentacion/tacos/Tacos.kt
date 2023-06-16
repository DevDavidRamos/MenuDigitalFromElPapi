package com.example.menuelpapi.presentacion.tacos

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.menuelpapi.R
import com.example.menuelpapi.databinding.FragmentHotDogsBinding
import com.example.menuelpapi.databinding.FragmentTacosBinding
import com.example.menuelpapi.presentacion.data.adapter.HotListAdapter
import com.example.menuelpapi.presentacion.data.adapter.TacosListAdapter
import com.example.menuelpapi.presentacion.data.model.HotDogsProvider
import com.example.menuelpapi.presentacion.data.model.TacosProvider
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
 class Tacos : Fragment() {

 private  var _binding: FragmentTacosBinding? = null
 private val binding get() = _binding!!
 private val _url = "https://www.whatsapp.com/catalog/5219221864268/?app_absent=0"
 private val tacosListAdapter: TacosListAdapter = TacosListAdapter(TacosProvider.tacosList)

 override fun onCreateView(
  inflater: LayoutInflater, container: ViewGroup?,
  savedInstanceState: Bundle?
 ): View {

  _binding = FragmentTacosBinding.inflate(inflater, container, false)
  return binding.root
 }

 override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
  super.onViewCreated(view, savedInstanceState)
  iniListener()
  initImageButton()
  initRecyclerView()
 }

 private fun iniListener(){
  with(binding){
   btnBack.setOnClickListener { activity?.onBackPressed() }
  }
 }

 fun initImageButton(){
  binding.ibWhatsapp.setOnClickListener {
   // Crea un objeto Uri con la URL
   val webpage: Uri = Uri.parse(_url)

   // Crea un Intent con la acción ACTION_VIEW y la Uri
   val intent = Intent(Intent.ACTION_VIEW, webpage)

   // Verifica si hay una aplicación disponible para manejar el Intent
   if (intent.resolveActivity(requireContext().packageManager) != null) {
    // Inicia la actividad con el Intent
    startActivity(intent)
   }
  }
 }

 private fun initRecyclerView(){
  binding.rv.apply {
   setHasFixedSize(true)
   layoutManager = LinearLayoutManager(context)
   adapter = tacosListAdapter
  }
 }

 override fun onDestroyView() {
  super.onDestroyView()
  _binding = null
 }








}