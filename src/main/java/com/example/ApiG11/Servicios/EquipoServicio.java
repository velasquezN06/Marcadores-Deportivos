package com.example.ApiG11.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiG11.Modelos.EquipoModelo;
import com.example.ApiG11.Repositorios.EquipoRepositorio;

@Service
public class EquipoServicio {
    @Autowired
    EquipoRepositorio repositorio;

    public EquipoModelo guardaEquipo(EquipoModelo equipo){
        return repositorio.save(equipo);
    }
    
}
