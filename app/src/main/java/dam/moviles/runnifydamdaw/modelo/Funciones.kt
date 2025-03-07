package dam.moviles.runnifydamdaw.modelo

import android.widget.ImageView
import coil3.load
import coil3.request.crossfade
import coil3.request.error
import dam.moviles.runnifydamdaw.R

fun ImageView.ponerFotoActor(c:Carrera){
    // loas carga una footo en el image view
    this.load(c.image){
        this.crossfade(true)
        this.error(R.drawable.logo_vacio)
    }
}

fun convertirFecha(f: String, b: Boolean): String{
    val separado = f.split("T")
    val hora = separado[1].split("+")[1]
    val fecha = separado[0]
    return if (b) fecha+" "+hora else fecha
}