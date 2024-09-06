package com.facturation.facturation.service;

import com.facturation.facturation.dto.produitDTO;
import com.facturation.facturation.entity.facture_produit;
import com.facturation.facturation.entity.produit;
import com.facturation.facturation.repository.produitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class produitService {

    @Autowired
    private produitRepository produitRepository;

    public List<produitDTO> getAllProduits() {
        return produitRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public produitDTO createProduit(produitDTO produitDTO) {
        produit produit = convertToEntity(produitDTO);
        produit = produitRepository.save(produit);
        return convertToDTO(produit);
    }

    public produitDTO getProduitById(Long id) {
        return produitRepository.findById(id)
                .map(this::convertToDTO)
                .orElse(null);
    }

    public void deleteProduit(Long id) {
        try {
            produit produit = produitRepository.findById(id).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
            produitRepository.delete(produit);
        } catch (Exception e) {
            // Afficher l'exception complète pour comprendre l'origine du problème
            e.printStackTrace();
            throw new RuntimeException("Erreur lors de la suppression du produit : " + e.getMessage());
        }
    }


    // Convert entity en DTO
    private produitDTO convertToDTO(produit produit) {
        produitDTO dto = new produitDTO();
        dto.setId(produit.getId());
        dto.setNom(produit.getNom());
        dto.setPrix_ht(produit.getPrix_ht());
        dto.setTaux_tva(produit.getTaux_tva());
        return dto;
    }

    // Convert DTO en entity
    private produit convertToEntity(produitDTO produitDTO) {
        produit produit = new produit();
        produit.setNom(produitDTO.getNom());
        produit.setPrix_ht(produitDTO.getPrix_ht());
        produit.setTaux_tva(produitDTO.getTaux_tva());
        return produit;
    }
}
