package dam.moviles.runnifydamdaw.modelo

import androidx.recyclerview.widget.RecyclerView
import dam.moviles.runnifydamdaw.databinding.ItemcarreraBinding

class CarreraHolder(val binding: ItemcarreraBinding) : RecyclerView.ViewHolder(binding.root){

    lateinit var carrera: Carrera

    fun mostrarCarrera(c:Carrera){
        carrera = c
        binding.imgCarrera.ponerFotoActor(c)
    }

}