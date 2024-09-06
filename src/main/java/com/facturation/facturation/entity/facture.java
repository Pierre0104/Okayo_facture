package com.facturation.facturation.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reference;
    private LocalDate date_facturation;
    private BigDecimal total_ht;
    private BigDecimal total_tva;
    private BigDecimal total_ttc;

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
}
