package com.api.concessionaria_veiculos.models.dtos;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CarroRequestDTO(

        @NotBlank(message = "A marca não pode ser nula ou vazia.")
        String marca,

        @NotBlank(message = "O modelo não pode ser nulo ou vazio.")
        String modelo,

        @NotBlank(message = "A cor não pode ser nula ou vazia.")
        String cor,

        @NotBlank(message = "A placa não pode ser nula ou vazia.")
        String placa,

        @NotNull(message = "O preço não pode ser nulo.")
        BigDecimal preco,

        @NotNull(message = "A quilômetragem não pode ser nula.")
        BigDecimal quilometragem,

        @NotNull(message = "A data de fabricação não pode ser nula.")
        @PastOrPresent(message = "A data de fabricação deve ser uma data passada ou a data de hoje.")
        LocalDate dataFabricacao
) {
}
