package com.example.ApiG11.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiG11.Modelos.EquipoModelo;
import com.example.ApiG11.Servicios.EquipoServicio;

@RestController
@RequestMapping("/equipo")
public class EquipoControlador {
    @Autowired
    EquipoServicio servicio;
    @PostMapping("/guardar")
    public EquipoModelo guardaEquipo(@RequestBody EquipoModelo equipo){
        return servicio.guardaEquipo(equipo);

    }

    
}
