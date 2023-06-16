package com.example.menuelpapi.presentacion.burger


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.menuelpapi.databinding.ActivityMainBinding
import com.example.menuelpapi.presentacion.data.adapter.BurgerListAdapter
import com.example.menuelpapi.presentacion.data.model.BurgersProvider
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : Fragment() {

    private  var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private val _url = "https://www.whatsapp.com/catalog/5219221864268/?app_absent=0"
    private val burgerListAdapter: BurgerListAdapter = BurgerListAdapter(BurgersProvider.burgerList)




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = ActivityMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        initImageButton()
        iniListener()

    }


    private fun initRecyclerView(){
        binding.rv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = burgerListAdapter
        }
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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}