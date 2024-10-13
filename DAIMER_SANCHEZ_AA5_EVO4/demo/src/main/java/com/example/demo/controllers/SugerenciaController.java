package com.example.demo.controllers;

import com.example.demo.models.Sugerencia;
import com.example.demo.models.SugerenciaDTO;
import com.example.demo.services.SugerenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sugerencias")
public class SugerenciaController {

    @Autowired
    private SugerenciaService sugerenciaService;

    // Enviar una nueva sugerencia
    @PostMapping
    public ResponseEntity<Sugerencia> enviarSugerencia(@RequestBody SugerenciaDTO sugerenciaDTO) {
        Sugerencia sugerencia = sugerenciaService.enviarSugerencia(sugerenciaDTO);
        return new ResponseEntity<>(sugerencia, HttpStatus.CREATED);
    }

    // Obtener todas las sugerencias
    @GetMapping
    public ResponseEntity<List<Sugerencia>> obtenerSugerencias() {
        List<Sugerencia> sugerencias = sugerenciaService.obtenerTodasLasSugerencias();
        return new ResponseEntity<>(sugerencias, HttpStatus.OK);
    }
}