package com.api.concessionaria_veiculos.controller.impl;

import com.api.concessionaria_veiculos.controller.CarroController;
import com.api.concessionaria_veiculos.models.dtos.CarroRequestDTO;
import com.api.concessionaria_veiculos.models.dtos.CarroResponseDTO;
import com.api.concessionaria_veiculos.models.entities.CarroEntity;
import com.api.concessionaria_veiculos.services.CarroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @Override
    @PostMapping
    public ResponseEntity<CarroResponseDTO> create(@RequestBody @Valid CarroRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.carroService.create(dto));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<CarroResponseDTO> findById(@PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.carroService.findById(id));
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<CarroResponseDTO> update(@PathVariable UUID id, @RequestBody @Valid CarroRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.OK).body(this.carroService.update(id, dto));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(UUID id) {
        this.carroService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
