package dam.moviles.runnifydamdaw.modelo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dam.moviles.runnifydamdaw.databinding.ItemcarreraBinding

class CarreraAdapter(
    var carrera:List<Carrera>,
    val lambda: (CarreraHolder) -> Unit
) : RecyclerView.Adapter<CarreraHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarreraHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemcarreraBinding.inflate(inflater, parent, false)
        return CarreraHolder(binding)
    }

    override fun getItemCount(): Int = carrera.size

    override fun onBindViewHolder(holder: CarreraHolder, position: Int) {
        val carrera = carrera.get(position)
        holder.mostrarCarrera(carrera)
        holder.binding.root.setOnClickListener{
            lambda(holder)
        }
    }

}