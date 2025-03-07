package dam.moviles.runnifydamdaw.vista

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import dam.moviles.runnifydamdaw.databinding.FragmentMainBinding
import dam.moviles.runnifydamdaw.modelo.CarreraAdapter
import dam.moviles.runnifydamdaw.viewModel.MainFragmentViewModel


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
        return binding.root
    }

    private fun inicializarBinding(inflater: LayoutInflater, container: ViewGroup?){
        binding=FragmentMainBinding.inflate(inflater,container,false)
    }

    private fun inicializarViewModel(){
        viewModel = ViewModelProvider(this).get(MainFragmentViewModel::class.java)
    }

    fun inicializarRecyclerView(){
        binding.lstCarreras.adapter = CarreraAdapter(viewModel.listaCarreras){ holder ->



        }
    }

}