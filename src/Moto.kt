class Moto(
    // appartient à Véhicule
    marque: String,
    anneeFabrication: Int,
    couleur: String,
    val avecSidecar: Boolean // Appartient à Moto. Elle a un sidecar ou pas, true ou false.

) : Vehicule(marque, anneeFabrication, couleur) {
    override fun afficherDetails() {
        super.afficherDetails() // affiche d'abord les 3 valeurs
        val sidecar = if (avecSidecar) "oui" else "non" // if traduit en oui ou non
        println("Sidecar: $sidecar")
    }

    override fun klaxonner() {
        println("Piw piw !")
    }
}