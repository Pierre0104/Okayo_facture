# Projet de Facturation

## Introduction

Projet Pour Okayo de gestion de Facture 

## Fonctionnalités

1. **Gestion des factures** :
    - Création de factures pour des clients.
    - Association de produits à une facture.
    - Gestion des prix HT, des taux de TVA et calcul automatique du montant TTC.
    - Sauvegarde des informations de facturation pour garantir l'immuabilité des données historiques.

2. **Gestion des produits** :
    - Création et gestion des produits dans le catalogue.
    - Association de produits à des factures.
    - Stockage des informations liées au prix HT et au taux de TVA.

3. **Gestion des clients** :
    - Création et gestion des clients.
    - Attribution des factures à des clients spécifiques.

4. **Historique des données** :
    - Une fois une facture générée, les informations (prix, taux de TVA) restent inchangées, même si les produits ou les taux de TVA évoluent dans le temps.

## Structure du Projet

- **facture** : Représente une facture générée pour un client.
- **facture_produit** : Représente la relation entre une facture et les produits (ou prestations) qui lui sont associés.
- **produit** : Représente un produit ou une prestation avec un prix HT et un taux de TVA.
- **client** : Représente un client à qui des factures sont adressées.

## Modèle de données relationnel

### Tables principales :
- **facture** : Contient les informations liées à une facture (date, total HT, total TVA, total TTC, client).
- **produit** : Contient les informations sur les produits (nom, prix HT, taux de TVA).
- **facture_produit** : Représente les associations entre une facture et ses produits avec les prix HT et taux de TVA fixés au moment de la facturation.
- **client** : Contient les informations sur les clients (nom, adresse, contact).

### Hypothèses de fonctionnement :
- Une fois qu'une facture est créée, les informations sur les produits (prix HT, taux de TVA) sont enregistrées définitivement dans la table `facture_produit` pour garantir que les consultations futures ne sont pas affectées par des changements dans le catalogue ou la TVA.
- Le montant TTC d'une facture est calculé au moment de la création de la facture et ne change pas même si les taux de TVA ou les prix des produits sont modifiés par la suite.
- Les taux de TVA peuvent changer au fil du temps, et le système doit pouvoir gérer ces changements à des dates précises.

## Technologies utilisées

- **Spring Boot** : Framework utilisé pour développer l'application.
- **Hibernate/JPA** : Gestion de la persistance des données.

