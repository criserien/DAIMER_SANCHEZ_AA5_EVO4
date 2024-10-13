package com.example.demo.services;

import com.example.demo.models.Sugerencia;
import com.example.demo.models.SugerenciaDTO;
import com.example.demo.repositories.SugerenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SugerenciaService {

    @Autowired
    private SugerenciaRepository sugerenciaRepository;

    public Sugerencia enviarSugerencia(SugerenciaDTO sugerenciaDTO) {
        Sugerencia sugerencia = new Sugerencia();
        sugerencia.setNombreCliente(sugerenciaDTO.getNombreCliente());
        sugerencia.setSugerencia(sugerenciaDTO.getSugerencia());
        sugerencia.setFechaEnvio(LocalDateTime.now());
        return sugerenciaRepository.save(sugerencia);
    }

    public List<Sugerencia> obtenerTodasLasSugerencias() {
        return sugerenciaRepository.findAll();
    }
}