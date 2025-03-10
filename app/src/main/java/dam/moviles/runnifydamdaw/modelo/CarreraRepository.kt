package dam.moviles.runnifydamdaw.modelo

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class CarreraRepository {

    val carreraApi:CarreraApi

    init {
        carreraApi = Retrofit.Builder()
            .baseUrl("http://192.168.70.91:8000")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()
    }
    suspend fun consultarTodosActores():List<Carrera> =
        carreraApi.consultarTodasCarreras()

    suspend fun addParticipante(p: Participante): Participante =
        carreraApi.addParticipante(p)
}