fun main(){
    val garage = Garage()
    val voiture = Voiture("Mercedez", 2020, "verte", 5)// ça crée la voiture mais ça range pas encore dans le garage.
    val camion = Camion("Volvo", 2018, "blanche", 12000)
    val moto = Moto("Yamaha", 2022, "noir", false)

    // ici chaque appel ajoute un objet déjà créé à la liste du garage. d'ou l'intérêt de ajouterVehicule(cehicule: Vehicule).
    garage.ajouterVehicule(voiture)
    garage.ajouterVehicule(camion)
    garage.ajouterVehicule(moto)

    garage.afficherGarage()

    garage.faireKlaxonnerTous()
}