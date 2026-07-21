package com.api.concessionaria_veiculos.models.dtos;

import com.api.concessionaria_veiculos.models.enums.StatusCarroEnum;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record CarroResponseDTO(
        UUID id,
        String marca,
        String modelo,
        String cor,
        String placa,
        BigDecimal preco,
        BigDecimal quilometragem,
        LocalDate dataFabricacao,
        StatusCarroEnum statusCarro
) {
}
