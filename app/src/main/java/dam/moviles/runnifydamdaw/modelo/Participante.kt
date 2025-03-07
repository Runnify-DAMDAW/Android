package dam.moviles.runnifydamdaw.modelo

import java.io.Serializable

data class Participante(
    val id: Int,
    val user: User,
    val time: String,
    val dorsal: Int,
    val banned: Boolean
):Serializable
