class Voiture(
    // Les trois premières valeurs sont transmises à Véhicule
    marque: String,
    anneeFabrication: Int,
    couleur: String,
    val nombrePortes: Int // ici ça n'appartient que à Voiture donc c'est pour ça qu'on la déclare avec val.


) : Vehicule(marque, anneeFabrication, couleur) {
    // override indique que VOITURE donne sa propre version de la méthodé.
    override fun afficherDetails() {
        super.afficherDetails()// donne d'abord les informations globales et après ça affiche le nombre de porte.
        println("Nombre de portes : $nombrePortes")
    }

    override fun klaxonner() {
        println("Pinw Panw")
    }

}