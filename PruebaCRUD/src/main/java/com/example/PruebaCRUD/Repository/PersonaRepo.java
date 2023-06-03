package com.example.PruebaCRUD.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.PruebaCRUD.Entity.Persona;

public interface PersonaRepo extends CrudRepository <Persona,Integer>{
    
}
