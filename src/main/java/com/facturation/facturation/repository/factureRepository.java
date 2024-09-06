package com.facturation.facturation.repository;

import com.facturation.facturation.entity.facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface factureRepository extends JpaRepository<facture, Long> {
}
