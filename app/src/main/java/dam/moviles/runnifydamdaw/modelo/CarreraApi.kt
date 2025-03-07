package dam.moviles.runnifydamdaw.modelo

import retrofit2.http.GET

interface CarreraApi {

    @GET("/api/running/")
    suspend fun consultarTodasCarreras(): List<Carrera>

}