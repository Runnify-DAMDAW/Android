package dam.moviles.runnifydamdaw.modelo

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Participante(
    val id: Int,
    val user: User,
    val time: String?,
    val dorsal: Int,
    val banned: Boolean
):Serializable
