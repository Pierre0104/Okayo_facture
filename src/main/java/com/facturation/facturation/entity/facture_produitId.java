package com.facturation.facturation.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class facture_produitId implements Serializable {

    private Long facture_id;
    private Long produit_id;


    public facture_produitId(Long facture_id, Long produit_id) {
        this.facture_id = facture_id;
        this.produit_id = produit_id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof facture_produitId)) return false;
        facture_produitId that = (facture_produitId) o;
        return Objects.equals(facture_id, that.facture_id) &&
                Objects.equals(produit_id, that.produit_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facture_id, produit_id);
    }
}
