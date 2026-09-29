class Garage {
    // Une même liste avec un seul tyype Véhicule vu qu'on a fait hériter les trois classes elles pourront toutes y bénéficier #Polymorphisme.
    private val vehicules = mutableListOf<Vehicule>()

    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules.add(vehicule) // Véhicules entre () est la liste du garage et add y range le vehicule en question.

        // Grâce à l'héritage cette méthode acceptera voiture moto ou camion.
    }

    fun afficherGarage() {
        // la boucle parcourt la liste et à chaque passage véhicule prend un objet du garage.
        for (vehicule in vehicules) {
            vehicule.afficherDetails()
            println()// c'est pour séparer à l'écran
        }
    }

    fun faireKlaxonnerTous() {
        for (vehicule in vehicules) {
            vehicule.klaxonner()
        }
    }
}