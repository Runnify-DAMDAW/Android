package dam.moviles.runnifydamdaw.vista

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dam.moviles.runnifydamdaw.R
import dam.moviles.runnifydamdaw.databinding.FragmentDetalleCarreraBinding

class DetalleCarreraFragment : Fragment() {

    lateinit var binding:FragmentDetalleCarreraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inicializarBinding(inflater, container)
        return binding.root
    }

    private fun inicializarBinding(inflater: LayoutInflater, container: ViewGroup?){
        binding= FragmentDetalleCarreraBinding.inflate(inflater, container, false)
    }



}