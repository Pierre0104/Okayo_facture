package com.facturation.facturation.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class factureDTO {

    private Long id;
    private String reference;
    private LocalDate date_facturation;
    private BigDecimal total_ht;
    private BigDecimal total_tva;
    private BigDecimal total_ttc;
    private clientDTO client;
    private List<produitDTO> produits;

    // Getters
    public Long getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public LocalDate getDate_facturation() {
        return date_facturation;
    }

    public BigDecimal getTotal_ht() {
        return total_ht;
    }

    public BigDecimal getTotal_tva() {
        return total_tva;
    }

    public BigDecimal getTotal_ttc() {
        return total_ttc;
    }

    public clientDTO getClient() {
        return client;
    }

    public List<produitDTO> getProduits() {
        return produits;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setDate_facturation(LocalDate date_facturation) {
        this.date_facturation = date_facturation;
    }

    public void setTotal_ht(BigDecimal total_ht) {
        this.total_ht = total_ht;
    }

    public void setTotal_tva(BigDecimal total_tva) {
        this.total_tva = total_tva;
    }

    public void setTotal_ttc(BigDecimal total_ttc) {
        this.total_ttc = total_ttc;
    }

    public void setClient(clientDTO client) {
        this.client = client;
    }

    public void setProduits(List<produitDTO> produits) {
        this.produits = produits;
    }
}
