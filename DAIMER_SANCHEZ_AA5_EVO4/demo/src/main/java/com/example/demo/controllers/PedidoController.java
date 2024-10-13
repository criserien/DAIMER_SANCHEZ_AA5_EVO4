package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @GetMapping("/info")
    public ResponseEntity<String> obtenerInfoPedido() {
        String info = "Bienvenido a la interfaz de pedidos. Actualmente ofrecemos arepas de queso, carne, y pollo. "
                + "Contáctanos para más detalles sobre cómo realizar pedidos.";
        return ResponseEntity.ok(info);
    }
}