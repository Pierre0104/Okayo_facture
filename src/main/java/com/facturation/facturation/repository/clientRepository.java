package com.facturation.facturation.repository;

import com.facturation.facturation.entity.client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository<client, Long> {
}
