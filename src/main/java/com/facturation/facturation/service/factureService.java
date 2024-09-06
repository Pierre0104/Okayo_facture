package com.facturation.facturation.service;

import com.facturation.facturation.dto.factureDTO;
import com.facturation.facturation.dto.facture_produitDTO;
import com.facturation.facturation.entity.facture;
import com.facturation.facturation.entity.facture_produit;
import com.facturation.facturation.entity.facture_produitId;
import com.facturation.facturation.entity.produit;
import com.facturation.facturation.repository.factureRepository;
import com.facturation.facturation.repository.facture_produitRepository;
import com.facturation.facturation.repository.produitRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class factureService {

    @Autowired
    private factureRepository factureRepository;

    @Autowired
    private produitRepository produitRepository;

    @Autowired
    private facture_produitRepository facture_produitRepository;

    public List<factureDTO> getAllFactures() {
        return factureRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public factureDTO createFacture(factureDTO factureDTO) {
        facture facture = convertToEntity(factureDTO);
        facture = factureRepository.save(facture);
        return convertToDTO(facture);
    }

    // Ajout de produit à une facture
    public facture_produitDTO addProduitToFacture(Long factureId, Long produitId) {
        Optional<facture> optionalFacture = factureRepository.findById(factureId);
        Optional<produit> optionalProduit = produitRepository.findById(produitId);

        if (optionalFacture.isPresent() && optionalProduit.isPresent()) {
            facture facture = optionalFacture.get();
            produit produit = optionalProduit.get();

            facture_produitId id = new facture_produitId(factureId, produitId);

            facture_produit factureProduit = new facture_produit();
            factureProduit.setId(id);
            factureProduit.setFacture(facture);
            factureProduit.setProduit(produit);
            factureProduit.setPrix_ht_facture(produit.getPrix_ht());
            factureProduit.setTaux_tva_facture(produit.getTaux_tva());

            facture_produit savedFactureProduit = facture_produitRepository.save(factureProduit);
            return convertToFactureProduitDTO(savedFactureProduit);
        }
        return null;
    }

    private factureDTO convertToDTO(facture facture) {
        factureDTO dto = new factureDTO();
        dto.setId(facture.getId());
        dto.setReference(facture.getReference());
        dto.setDate_facturation(facture.getDate_facturation());
        dto.setTotal_ht(facture.getTotal_ht());
        dto.setTotal_tva(facture.getTotal_tva());
        dto.setTotal_ttc(facture.getTotal_ttc());
        return dto;
    }

    private facture convertToEntity(factureDTO factureDTO) {
        facture facture = new facture();
        facture.setReference(factureDTO.getReference());
        facture.setDate_facturation(factureDTO.getDate_facturation());
        facture.setTotal_ht(factureDTO.getTotal_ht());
        facture.setTotal_tva(factureDTO.getTotal_tva());
        facture.setTotal_ttc(factureDTO.getTotal_ttc());
        return facture;
    }

    private facture_produitDTO convertToFactureProduitDTO(facture_produit factureProduit) {
        facture_produitDTO dto = new facture_produitDTO();
        dto.setFacture_id(factureProduit.getId().getFacture_id());
        dto.setProduit_id(factureProduit.getId().getProduit_id());
        dto.setPrix_ht_facture(factureProduit.getPrix_ht_facture());
        dto.setTaux_tva_facture(factureProduit.getTaux_tva_facture());
        return dto;
    }
}