package dam.moviles.runnifydamdaw.modelo

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class User(
    val id: Int,
    val email: String,
    val roles: List<String>,
    val name: String,
    val banned: Boolean,
    val age: Int, // Añadido para coincidir con el JSON
    val gender: String, // Añadido para coincidir con el JSON
    val image: String // Añadido para coincidir con el JSON
) : Serializable