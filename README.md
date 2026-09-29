# Gestion des véhicules

Ce projet représente une voiture, un camion et une moto qui héritent de la classe Vehicule. Chaque classe ajoute sa propre caractéristique et son propre klaxon.

Le Garage conserve les véhicules dans une liste de Vehicule (polymorphisme). Il peut ainsi afficher leurs détails et les faire klaxonner avec les mêmes appels de méthodes.

## Difficulté rencontrée
J'avais un « Bip ! » en trop car `super.klaxonner()` appelait aussi le klaxon de `Vehicule`. Je l'ai retiré de `Voiture` pour ne garder que le son propre à la voiture.