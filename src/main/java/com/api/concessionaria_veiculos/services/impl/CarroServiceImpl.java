package com.api.concessionaria_veiculos.services.impl;

import com.api.concessionaria_veiculos.models.dtos.CarroResponseDTO;
import com.api.concessionaria_veiculos.models.entities.CarroEntity;
import com.api.concessionaria_veiculos.models.mappers.CarroMapper;
import com.api.concessionaria_veiculos.repositories.CarroRepository;
import com.api.concessionaria_veiculos.services.CarroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarroServiceImpl implements CarroService {

    private final CarroRepository carroRepository;

    @Override
    public List<CarroResponseDTO> findAll() {
        return carroRepository.findAll().stream()
                .map(CarroMapper::toDtoFromEntity).toList();
    }
}
