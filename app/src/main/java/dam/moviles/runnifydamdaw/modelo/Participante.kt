package dam.moviles.runnifydamdaw.modelo

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Participante(
    val id: Int,
    val user: User, // Cambiado de running_participant a user
    val running: Carrera? = null, // Puede ser nulo si no se usa en el JSON
    val time: String?,
    val dorsal: Int?,
    val banned: Boolean?
) : Serializable