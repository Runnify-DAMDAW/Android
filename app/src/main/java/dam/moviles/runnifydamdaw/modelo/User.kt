package dam.moviles.runnifydamdaw.modelo

import java.io.Serializable

data class User(
    val id: Int,
    val email: String,
    val roles: List<String>,
    val name: String,
    val banned: Boolean
):Serializable