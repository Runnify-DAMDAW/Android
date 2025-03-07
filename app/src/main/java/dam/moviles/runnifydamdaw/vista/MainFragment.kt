package dam.moviles.runnifydamdaw.vista

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import dam.moviles.runnifydamdaw.databinding.FragmentMainBinding
import dam.moviles.runnifydamdaw.modelo.CarreraAdapter
import dam.moviles.runnifydamdaw.modelo.CarreraRepository
import dam.moviles.runnifydamdaw.viewModel.MainFragmentViewModel
import kotlinx.coroutines.launch


class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding
    lateinit var viewModel:MainFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inicializarBinding(inflater, container)
        inicializarViewModel()
        inicializarRecyclerView()
        cargarDatos()
        test()
        return binding.root
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
            val carrera = viewModel.listaCarreras.get(holder.adapterPosition)
            Log.d("MainFragment", "Carrera seleccionada: ${carrera?.name}")
        }
    }

    fun test(){

        lifecycleScope.launch {
            Log.d("Api", CarreraRepository().consultarTodosActores().toString())
        }

    }

}