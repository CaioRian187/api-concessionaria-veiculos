package com.api.concessionaria_veiculos.services;

import com.api.concessionaria_veiculos.models.dtos.CarroRequestDTO;
import com.api.concessionaria_veiculos.models.dtos.CarroResponseDTO;

import java.util.List;

public interface CarroService {

    List<CarroResponseDTO> findAll();
    CarroResponseDTO create(CarroRequestDTO dto);
}
