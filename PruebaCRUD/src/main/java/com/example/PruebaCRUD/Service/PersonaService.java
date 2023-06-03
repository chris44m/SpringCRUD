package com.example.PruebaCRUD.Service;

import java.util.List;

import com.example.PruebaCRUD.Entity.Persona;

public interface PersonaService {
    
    public List<Persona> ConsultarPersona();

    public Persona CrearPersona(Persona persona);
    public Persona modificarPersona(Persona persona);
    public Persona BuscarPersona(int id);

    public void EliminarPersona(int id);


    
}
