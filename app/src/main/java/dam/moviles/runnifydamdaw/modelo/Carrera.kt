package dam.moviles.runnifydamdaw.modelo

import java.io.Serializable

data class Carrera(
    val id: Int,
    val name: String,
    val description: String,
    val date: String,
    val distance_km: Int,
    val location: String,
    val coordinates: String,
    val entry_fee: Int,
    val available_slots: Int,
    val status: String,
    val category: String,
    val image: String,
    val runningParticipants: List<Participante>
):Serializable
