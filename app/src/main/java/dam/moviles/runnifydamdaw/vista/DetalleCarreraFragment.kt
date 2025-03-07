package dam.moviles.runnifydamdaw.vista

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dam.moviles.runnifydamdaw.R
import dam.moviles.runnifydamdaw.databinding.FragmentDetalleCarreraBinding
import dam.moviles.runnifydamdaw.modelo.Carrera
import dam.moviles.runnifydamdaw.modelo.ponerFotoActor

class DetalleCarreraFragment : Fragment() {

    lateinit var binding:FragmentDetalleCarreraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inicializarBinding(inflater, container)
        actualizarInterfaz()
        return binding.root
    }

    private fun inicializarBinding(inflater: LayoutInflater, container: ViewGroup?){
        binding= FragmentDetalleCarreraBinding.inflate(inflater, container, false)
    }

    private fun actualizarInterfaz(){

        val carrera:Carrera = DetalleCarreraFragmentArgs.fromBundle(requireArguments()).carrera

        binding.imgCarreraDetalle.ponerFotoActor(carrera)
        binding.txtNombreCarrera.text = carrera.name
        binding.txtTipo.text = carrera.category
        binding.txtFecha.text = carrera.date
        binding.txtDinero.text = carrera.entry_fee.toString()
        binding.txtPlazas.text = carrera.available_slots.toString()

    }


}