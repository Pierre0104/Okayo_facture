package com.facturation.facturation.controller;

import com.facturation.facturation.dto.factureDTO;
import com.facturation.facturation.dto.facture_produitDTO;
import com.facturation.facturation.service.factureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/factures")
public class factureController {

    @Autowired
    private factureService factureService;

    @GetMapping
    public List<factureDTO> getAllFactures() {
        return factureService.getAllFactures();
    }

    @PostMapping
    public factureDTO createFacture(@RequestBody factureDTO factureDTO) {
        return factureService.createFacture(factureDTO);
    }


    @PostMapping("/{factureId}/produits/{produitId}")
    public facture_produitDTO addProduitToFacture(@PathVariable Long factureId, @PathVariable Long produitId) {
        return factureService.addProduitToFacture(factureId, produitId);
    }
}
