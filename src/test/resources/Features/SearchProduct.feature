#Author: Wissem

Feature: recherche produit TunisiaNET
Scenario: Effectuer une recherche de produit

Given utilisateur est sur la page dacceuil
When utilisateur écrit le nom de produit "film de protection nano glass 9h pour samsung a12" dans la barre de recherche
Then utilisateur vérifie le résultat de recherche "film de protection nano glass 9h pour samsung a12"