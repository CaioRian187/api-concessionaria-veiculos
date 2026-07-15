package com.api.concessionaria_veiculos.repositories;

import com.api.concessionaria_veiculos.models.entities.CarroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarroRepository extends JpaRepository<CarroEntity, UUID> {
    CarroEntity findEntityById(UUID id);
}
