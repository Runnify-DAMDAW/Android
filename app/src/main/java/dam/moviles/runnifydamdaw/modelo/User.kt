package dam.moviles.runnifydamdaw.modelo

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class User(
    val id: Int,
    val email: String,
    val roles: List<String>,
    val name: String,
    val banned: Boolean
):Serializable