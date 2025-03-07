package dam.moviles.runnifydamdaw.vista

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuProvider
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import dam.moviles.runnifydamdaw.R
import dam.moviles.runnifydamdaw.databinding.FragmentMainBinding
import dam.moviles.runnifydamdaw.modelo.CarreraAdapter
import dam.moviles.runnifydamdaw.modelo.CarreraRepository
import dam.moviles.runnifydamdaw.viewModel.MainFragmentViewModel
import kotlinx.coroutines.launch


class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding
    lateinit var viewModel:MainFragmentViewModel

    val menuProvider = object: MenuProvider {
        override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
            menuInflater.inflate(R.menu.menu_toolbar,menu)
        }

        override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
            TODO("Not yet implemented")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inicializarBinding(inflater, container)
        inicializarViewModel()
        inicializarRecyclerView()
        cargarDatos()
        ponerOpcionesToolbar()
        return binding.root
    }

    private fun ponerOpcionesToolbar(){
        val mainActivity = activity as MainActivity
        mainActivity.addMenuProvider(menuProvider)
    }

    fun quitarOpcionesToolbar(){
        val mainActivity = activity as MainActivity
        mainActivity.removeMenuProvider(menuProvider)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        quitarOpcionesToolbar()
    }

    private fun inicializarBinding(inflater: LayoutInflater, container: ViewGroup?){
        binding=FragmentMainBinding.inflate(inflater,container,false)
    }

    private fun inicializarViewModel(){
        viewModel = ViewModelProvider(this).get(MainFragmentViewModel::class.java)
    }

    fun cargarDatos(){
        lifecycleScope.launch {
            viewModel.cargarListaCarreras(
                lambdaExito = {inicializarRecyclerView()},
                lambdaError = { e -> Log.d("Error",e) }
            )
        }
    }

    private fun inicializarRecyclerView() {
        binding.lstCarreras.adapter = CarreraAdapter(viewModel.listaCarreras) { holder ->

            findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetalleCarreraFragment(holder.carrera))

        }
    }

    fun test(){

        lifecycleScope.launch {
            Log.d("Api", CarreraRepository().consultarTodosActores().toString())
        }

    }

}