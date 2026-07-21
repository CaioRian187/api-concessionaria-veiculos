package com.api.concessionaria_veiculos.models.mappers;

import com.api.concessionaria_veiculos.models.dtos.CarroRequestDTO;
import com.api.concessionaria_veiculos.models.dtos.CarroResponseDTO;
import com.api.concessionaria_veiculos.models.entities.CarroEntity;
import com.api.concessionaria_veiculos.models.enums.StatusCarroEnum;

public abstract class CarroMapper {

    public static CarroResponseDTO toDtoFromEntity(CarroEntity carro){
        return new CarroResponseDTO(
                carro.getId(),
                carro.getMarca(),
                carro.getModelo(),
                carro.getCor(),
                carro.getPlaca(),
                carro.getPreco(),
                carro.getQuilometragem(),
                carro.getDataFabricacao(),
                carro.getStatusCarro()
        );
    }

    public static CarroEntity toEntityFromDto(CarroRequestDTO dto, StatusCarroEnum statusCarro){
        return new CarroEntity(
                dto.marca(),
                dto.modelo(),
                dto.cor(),
                dto.placa(),
                dto.preco(),
                dto.quilometragem(),
                dto.dataFabricacao(),
                statusCarro
        );
    }
}
