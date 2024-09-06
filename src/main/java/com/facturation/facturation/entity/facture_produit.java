package com.facturation.facturation.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
public class facture_produit {

    @EmbeddedId
    private facture_produitId id;

    @ManyToOne
    @MapsId("facture_id") // Associe la clé composite
    @JoinColumn(name = "facture_id")
    private facture facture;

    @ManyToOne
    @MapsId("produit_id") // Associe la clé composite
    @JoinColumn(name = "produit_id")
    private produit produit;

    private BigDecimal prix_ht_facture;  // BigDecimal pour les valeurs financières
    private BigDecimal taux_tva_facture;

    public facture_produitId getId() {
        return id;
    }

    public void setId(facture_produitId id) {
        this.id = id;
    }

    public BigDecimal getPrix_ht_facture() {
        return prix_ht_facture;
    }

    public BigDecimal getTaux_tva_facture() {
        return taux_tva_facture;
    }

    public void setFacture(facture facture) {
        this.facture = facture;
    }

    public void setProduit(produit produit) {
        this.produit = produit;
    }

    public void setPrix_ht_facture(BigDecimal prix_ht_facture) {
        this.prix_ht_facture = prix_ht_facture;
    }

    public void setTaux_tva_facture(BigDecimal taux_tva_facture) {
        this.taux_tva_facture = taux_tva_facture;
    }
}
