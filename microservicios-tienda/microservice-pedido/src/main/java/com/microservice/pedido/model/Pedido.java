package com.microservice.pedido.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

    @Entity
    @Builder
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long usuario;
    private LocalDate fecha_pedido;
    private boolean estado;

}
