package com.api.concessionaria_veiculos.models.entities;

import com.api.concessionaria_veiculos.models.enums.StatusCarroEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "carro")
@Table(name = "carro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", unique = true)
    private UUID id;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "cor", nullable = false)
    private String cor;

    @Column(name = "placa", nullable = false)
    private String placa;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @Column(name = "quilometragem", nullable = false)
    private BigDecimal quilometragem;

    @Column(name = "dataFabricacao", nullable = false)
    private LocalDate dataFabricacao;

    @Enumerated(EnumType.STRING)
    private StatusCarroEnum statusCarro;

    public CarroEntity(String marca, String modelo, String cor, String placa, BigDecimal preco, BigDecimal quilometragem, LocalDate dataFabricacao, StatusCarroEnum statusCarro) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.preco = preco;
        this.quilometragem = quilometragem;
        this.dataFabricacao = dataFabricacao;
        this.statusCarro = statusCarro;
    }
}
