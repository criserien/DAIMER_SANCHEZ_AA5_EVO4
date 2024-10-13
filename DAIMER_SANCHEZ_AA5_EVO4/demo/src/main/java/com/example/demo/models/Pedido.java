package com.example.demo.models;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCliente;
    private String tipoArepa;
    private int cantidad;
    private String direccionEntrega;
    private LocalDateTime fechaPedido;
}
