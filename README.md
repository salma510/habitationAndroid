
https://github.com/user-attachments/assets/3ee5a65f-f84b-494b-b4a5-4023a27a0450

Application de Calcul des Impôts Locaux
Cette application Android permet de calculer les impôts locaux en fonction de la surface de l'habitation, du nombre de pièces et de la présence éventuelle d'une piscine. L'utilisateur saisit ses informations dans des champs de texte et peut obtenir les impôts de base ainsi que des impôts supplémentaires.

Fonctionnalités
Saisie d'informations : L'utilisateur peut saisir son nom, son adresse, la surface de son habitation et le nombre de pièces.
Option Piscine : Une case à cocher permet d'indiquer la présence d'une piscine, qui augmente le montant des impôts.
Calcul des impôts :
Impôt de base : Calculé en fonction de la surface (Surface * 2).
Impôt : Calculé en fonction du nombre de pièces (Nombre de pièces * 50) avec un supplément de 100 si une piscine est présente.
Affichage des résultats : L'application affiche les montants calculés pour l'impôt de base et l'impôt supplémentaire.
Structure de l'application
Interface utilisateur (UI)
L'interface utilisateur est construite avec les éléments suivants :

EditText pour les champs de saisie (nom, adresse, surface, nombre de pièces).
TextView pour afficher les étiquettes et les résultats des calculs.
CheckBox pour indiquer la présence d'une piscine.
Bouton pour lancer le calcul.
Logique de calcul
Impôt de base : surface * 2.
Impôt supplémentaire : nombre_de_pieces * 50 + 100 (si la case "Piscine" est cochée)
Technologies utilisées
Java pour la logique de l'application.
XML pour la conception de l'interface utilisateur.
Android Studio pour le développement de l'application.
Auteur:
ELBAHLOULI SALMA
