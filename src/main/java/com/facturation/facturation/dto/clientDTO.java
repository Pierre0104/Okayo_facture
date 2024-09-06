package com.facturation.facturation.dto;

public class clientDTO {

    private Long id;
    private String code_client;
    private String nom;
    private String adresse;
    private String contact;

    // Getters
    public Long getId() {
        return id;
    }

    public String getCode_client() {
        return code_client;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getContact() {
        return contact;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCode_client(String code_client) {
        this.code_client = code_client;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
