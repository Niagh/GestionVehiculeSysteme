// Regroupe les caractéristiques communes aux voitures, camions et motos.

open class Vehicule(
    val marque: String,
    val anneeFabrication: Int,
    val couleur: String
) {
    open fun afficherDetails() {
        println("$marque, $anneeFabrication, $couleur")
    }

    open fun klaxonner() {
        println("Bip !")
    }
}