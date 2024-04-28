package com.explorenest.servicio.repository;

import com.explorenest.servicio.domain.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
    Service findByOneById(int id);
}
