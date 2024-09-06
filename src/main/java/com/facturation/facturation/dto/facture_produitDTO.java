package com.facturation.facturation.dto;

import java.math.BigDecimal;

public class facture_produitDTO {

    private Long facture_id;
    private Long produit_id;
    private BigDecimal prix_ht_facture;
    private BigDecimal taux_tva_facture;

    // Getters et setters
    public Long getFacture_id() {
        return facture_id;
    }

    public void setFacture_id(Long facture_id) {
        this.facture_id = facture_id;
    }

    public Long getProduit_id() {
        return produit_id;
    }

    public void setProduit_id(Long produit_id) {
        this.produit_id = produit_id;
    }

    public BigDecimal getPrix_ht_facture() {
        return prix_ht_facture;
    }

    public void setPrix_ht_facture(BigDecimal prix_ht_facture) {
        this.prix_ht_facture = prix_ht_facture;
    }

    public BigDecimal getTaux_tva_facture() {
        return taux_tva_facture;
    }

    public void setTaux_tva_facture(BigDecimal taux_tva_facture) {
        this.taux_tva_facture = taux_tva_facture;
    }
}
