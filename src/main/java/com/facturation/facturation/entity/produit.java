package com.facturation.facturation.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private BigDecimal prix_ht;
    private BigDecimal taux_tva;

    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<facture_produit> factures;


    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public BigDecimal getPrix_ht() {
        return prix_ht;
    }

    public BigDecimal getTaux_tva() {
        return taux_tva;
    }

    public List<facture_produit> getFactures() {
        return factures;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix_ht(BigDecimal prix_ht) {
        this.prix_ht = prix_ht;
    }

    public void setTaux_tva(BigDecimal taux_tva) {
        this.taux_tva = taux_tva;
    }

    public void setFactures(List<facture_produit> factures) {
        this.factures = factures;
    }
}
