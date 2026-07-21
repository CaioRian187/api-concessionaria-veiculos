package com.api.concessionaria_veiculos.services;

import com.api.concessionaria_veiculos.models.dtos.CarroRequestDTO;
import com.api.concessionaria_veiculos.models.dtos.CarroResponseDTO;
import com.api.concessionaria_veiculos.models.entities.CarroEntity;

import java.util.List;
import java.util.UUID;

public interface CarroService {

    CarroResponseDTO create(CarroRequestDTO dto);
    List<CarroResponseDTO> findAll();
    CarroResponseDTO findById(UUID id);
    CarroEntity findEntityById(UUID id);
    CarroResponseDTO update(UUID id, CarroRequestDTO dto);
    void deleteById(UUID id);
}
