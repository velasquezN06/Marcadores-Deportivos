package com.example.ApiG11.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ApiG11.Modelos.EquipoModelo;
@Repository
public interface EquipoRepositorio extends MongoRepository<EquipoModelo,Integer> {
    
}
