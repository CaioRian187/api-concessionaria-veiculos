package com.api.concessionaria_veiculos.controller.impl;

import com.api.concessionaria_veiculos.controller.CarroController;
import com.api.concessionaria_veiculos.models.dtos.CarroResponseDTO;
import com.api.concessionaria_veiculos.services.CarroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carros")
@RequiredArgsConstructor
public class CarroControllerImpl implements CarroController {

    private final CarroService carroService;

    @Override
    @GetMapping
    public ResponseEntity<List<CarroResponseDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(this.carroService.findAll());
    }
}
