package dam.moviles.runnifydamdaw.modelo

import androidx.recyclerview.widget.RecyclerView
import dam.moviles.runnifydamdaw.databinding.ItemcarreraBinding

class CarreraHolder(val binding: ItemcarreraBinding) : RecyclerView.ViewHolder(binding.root){

    lateinit var carrera: Carrera

    fun mostrarCarrera(c:Carrera){
        carrera = c
        binding.imgCarrera.ponerFotoActor(c)
        binding.txtNombreCarrera.text = c.name
        binding.txtTipo.text = c.category
        binding.txtFecha.text = convertirFecha(c.date,false)
        binding.txtDinero.text = c.entry_fee.toString()
        binding.txtPlazas.text = c.available_slots.toString()
    }
}

