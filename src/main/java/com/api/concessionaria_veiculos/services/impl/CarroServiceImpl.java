package com.api.concessionaria_veiculos.services.impl;

import com.api.concessionaria_veiculos.models.dtos.CarroRequestDTO;
import com.api.concessionaria_veiculos.models.dtos.CarroResponseDTO;
import com.api.concessionaria_veiculos.models.entities.CarroEntity;
import com.api.concessionaria_veiculos.models.enums.StatusCarroEnum;
import com.api.concessionaria_veiculos.models.mappers.CarroMapper;
import com.api.concessionaria_veiculos.repositories.CarroRepository;
import com.api.concessionaria_veiculos.services.CarroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarroServiceImpl implements CarroService {

    private final CarroRepository carroRepository;

    @Override
    public CarroResponseDTO create(CarroRequestDTO dto) {
        CarroEntity carro = CarroMapper.toEntityFromDto(dto, StatusCarroEnum.DISPONIVEL);
        this.carroRepository.save(carro);
        return CarroMapper.toDtoFromEntity(carro);
    }

    @Override
    public List<CarroResponseDTO> findAll() {
        return carroRepository.findAll().stream()
                .map(CarroMapper::toDtoFromEntity).toList();
    }

    @Override
    public CarroResponseDTO findById(UUID id) {
        CarroEntity carro = this.carroRepository.findById(id)
                .orElseThrow( () -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Carro de Id: " + id + " não encontrado."
                ));
        return CarroMapper.toDtoFromEntity(carro);
    }

    @Override
    public CarroEntity findEntityById(UUID id) {

        CarroEntity carro = this.carroRepository.findEntityById(id);

        if (carro == null){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Entity de Id: " + id + " não encontrada."
            );
        }

        return carro;
    }

    @Override
    public CarroResponseDTO update(UUID id, CarroRequestDTO dto) {

        CarroEntity carro = this.carroRepository.findEntityById(id);

        carro.setMarca(dto.marca());
        carro.setModelo(dto.modelo());
        carro.setCor(dto.cor());
        carro.setPlaca(dto.placa());
        carro.setPreco(dto.preco());
        carro.setQuilometragem(dto.quilometragem());
        carro.setDataFabricacao(dto.dataFabricacao());

        this.carroRepository.save(carro);
        return CarroMapper.toDtoFromEntity(carro);
    }


}
