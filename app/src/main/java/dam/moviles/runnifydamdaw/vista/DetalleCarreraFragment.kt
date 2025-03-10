package dam.moviles.runnifydamdaw.vista

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import dam.moviles.runnifydamdaw.R
import dam.moviles.runnifydamdaw.databinding.FragmentDetalleCarreraBinding
import dam.moviles.runnifydamdaw.modelo.Carrera
import dam.moviles.runnifydamdaw.modelo.CarreraRepository
import dam.moviles.runnifydamdaw.modelo.Participante
import dam.moviles.runnifydamdaw.modelo.User
import dam.moviles.runnifydamdaw.modelo.convertirFecha
import dam.moviles.runnifydamdaw.modelo.ponerFotoActor
import kotlinx.coroutines.launch

class DetalleCarreraFragment : Fragment() {

    lateinit var binding:FragmentDetalleCarreraBinding
    val carrera:Carrera = DetalleCarreraFragmentArgs.fromBundle(requireArguments()).carrera

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

    private fun inicializarBoton(){
        binding.btnInscribirse.setOnClickListener{
            lifecycleScope.launch {
                inscribirse()
            }
        }
    }

    private suspend fun inscribirse() {
        val roles = listOf("USER_ROLE")

        val p = Participante(
            1,
            User(
                id = 1,
                email = "ejemplo@ejemplo.com",
                roles = roles,
                name = "Juan Pérez",
                banned = false,
                age = 19,
                gender = "M",
                image = ""
            ),
            carrera,
            null,
            null,
            null
        )

        // Llamada a la función para agregar el participante
        CarreraRepository().addParticipante(p)
    }


    private fun actualizarInterfaz(){

        binding.imgCarreraDetalle.ponerFotoActor(carrera)
        binding.txtNombreCarrera.text = carrera.name
        binding.txtTipo.text = carrera.category
        binding.txtFecha.text = convertirFecha(carrera.date,true)
        binding.txtDinero.text = carrera.entry_fee.toString()
        binding.txtPlazas.text = carrera.available_slots.toString()
        binding.txtDescripcion.text = carrera.description.toString()
        binding.txtEstado.text = carrera.status.toString()

    }
}
