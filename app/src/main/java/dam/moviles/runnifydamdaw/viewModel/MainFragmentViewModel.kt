package dam.moviles.runnifydamdaw.viewModel

import androidx.lifecycle.ViewModel
import dam.moviles.runnifydamdaw.modelo.Carrera
import dam.moviles.runnifydamdaw.modelo.CarreraRepository

class MainFragmentViewModel: ViewModel() {

    var listaCarreras:List<Carrera> = emptyList()


    suspend fun cargarListaCarreras(
        lambdaExito: () -> Unit,
        lambdaError: (String) -> Unit
    ){
        try {
            listaCarreras = CarreraRepository().consultarTodosActores()
            lambdaExito()
        }catch (e:Exception){
            lambdaError(e.message.toString())
        }
    }

    fun getNombresCarreras():List<String> =
        listaCarreras.map { carrera -> carrera.name  }
}