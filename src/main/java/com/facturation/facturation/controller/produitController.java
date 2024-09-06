package com.facturation.facturation.controller;

import com.facturation.facturation.dto.produitDTO;
import com.facturation.facturation.service.produitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produits")
public class produitController {

    @Autowired
    private produitService produitService;

    @GetMapping
    public List<produitDTO> getAllProduits() {
        return produitService.getAllProduits();
    }

    @PostMapping
    public produitDTO createProduit(@RequestBody produitDTO produitDTO) {
        return produitService.createProduit(produitDTO);
    }

    @GetMapping("/{id}")
    public produitDTO getProduitById(@PathVariable Long id) {
        return produitService.getProduitById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id) {
        produitService.deleteProduit(id);
    }
}
