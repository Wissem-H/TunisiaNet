#Author: Wissem
Feature: Home Page TunisiaNet
Scenario: Vérification des menus de la page d acceuil
Given utilisateur est sur la page d acceuil
When utilisateur survole la souris sur menus "Stockage" et clique sur submenu "Disque SSD"
Then utilisateur est dirigé vers la page des submenus "Disque SSD"