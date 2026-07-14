package com.api.concessionaria_veiculos.models.mappers;

import com.api.concessionaria_veiculos.models.dtos.CarroResponseDTO;
import com.api.concessionaria_veiculos.models.entities.CarroEntity;

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
}
