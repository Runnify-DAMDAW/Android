package dam.moviles.runnifydamdaw.modelo

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface CarreraApi {

    @GET("/api/running/")
    suspend fun consultarTodasCarreras(): List<Carrera>

    @POST("/api/running_participant")
    suspend fun addParticipante(
        @Body participante: Participante
    ): Participante

}