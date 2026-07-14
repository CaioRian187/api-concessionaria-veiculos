package com.api.concessionaria_veiculos.controller;

import com.api.concessionaria_veiculos.models.dtos.CarroRequestDTO;
import com.api.concessionaria_veiculos.models.dtos.CarroResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CarroController {


    @Operation(
            summary = "Buscar todos os Carros.",
            responses = {
                    @ApiResponse(responseCode = "200")
            }
    )
    ResponseEntity<List<CarroResponseDTO>> findAll();

    @Operation(
            summary = "Cadastrar Carro.",
            responses = {
                    @ApiResponse(responseCode = "201"),
                    @ApiResponse(responseCode =  "400")
            }
    )
    ResponseEntity<CarroResponseDTO> create(CarroRequestDTO dto);
}
