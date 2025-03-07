package dam.moviles.runnifydamdaw.modelo

import android.widget.ImageView
import coil3.load
import coil3.request.crossfade
import dam.moviles.runnifydamdaw.R

fun ImageView.ponerFotoActor(c:Carrera){
    // loas carga una footo en el image view
    this.load(c.image){
        this.crossfade(true)
    }
}