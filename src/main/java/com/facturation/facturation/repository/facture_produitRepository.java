package com.facturation.facturation.repository;

import com.facturation.facturation.entity.facture_produit;
import com.facturation.facturation.entity.facture_produitId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface facture_produitRepository extends JpaRepository<facture_produit, facture_produitId> {
}
