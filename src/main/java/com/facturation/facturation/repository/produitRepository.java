package com.facturation.facturation.repository;

import com.facturation.facturation.entity.produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produitRepository extends JpaRepository<produit, Long> {
}
