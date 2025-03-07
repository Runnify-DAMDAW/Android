package dam.moviles.runnifydamdaw.modelo

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Participante(
    val id: Int,
    val running_participant: User,
    val running: Carrera,
    val time: String?,
    val dorsal: Int?,
    val banned: Boolean?
):Serializable
