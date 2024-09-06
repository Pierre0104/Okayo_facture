package com.facturation.facturation.dto;

import java.math.BigDecimal;

public class produitDTO {

    private Long id;
    private String nom;
    private BigDecimal prix_ht;
    private BigDecimal taux_tva;

    // Getters
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

    // Setters
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
}
