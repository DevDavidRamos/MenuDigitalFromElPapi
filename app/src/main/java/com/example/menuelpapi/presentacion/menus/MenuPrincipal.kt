package com.example.menuelpapi.presentacion.menus

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.menuelpapi.R
import com.example.menuelpapi.databinding.ActivityMainBinding
import com.example.menuelpapi.databinding.FragmentMenuPrincipalBinding

class MenuPrincipal : Fragment() {

    private  var _binding: FragmentMenuPrincipalBinding? = null
    private val binding get() = _binding!!
    private val _url = "https://www.whatsapp.com/catalog/5219221864268/?app_absent=0"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMenuPrincipalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
  initListener()
        initImageButton()
    }

    private fun initListener(){
        with(binding){
            btnGoBurger.setOnClickListener { findNavController().navigate(R.id.action_menuPrincipal_to_mainActivity) }
            btnGoHotdogs.setOnClickListener { findNavController().navigate(R.id.action_menuPrincipal_to_hotDogs) }
            btnGoTacos.setOnClickListener { findNavController().navigate(R.id.action_menuPrincipal_to_tacos) }
            btnGoPaponas.setOnClickListener { findNavController().navigate(R.id.action_menuPrincipal_to_paponas) }
        }
    }

    fun initImageButton(){
        binding.imageButtonPideya.setOnClickListener {
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



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}