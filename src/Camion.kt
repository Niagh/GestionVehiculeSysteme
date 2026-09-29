class Camion (
    // pareil ici aussi les trois valeurs vont à Véhicule
    marque: String,
    anneeFabrication: Int,
    couleur: String,
    val capaciteChargementKg: Int // et là ça appartient à Camion

) : Vehicule(marque, anneeFabrication, couleur)
{
    override fun afficherDetails() {
        super.afficherDetails()
        println("Capacité de chargement : $capaciteChargementKg Kg")
    } // on a utilisé ici les trois infos globales avec super

    override fun klaxonner() {
        println("Pouuuum !")
    }
}