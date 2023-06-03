package com.example.PruebaCRUD.Service.PersonaServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PruebaCRUD.Entity.Persona;
import com.example.PruebaCRUD.Repository.PersonaRepo;
import com.example.PruebaCRUD.Service.PersonaService;

@Service
public class PSIMPL implements PersonaService {


    @Autowired
    private PersonaRepo repo;
    

    @Override
    public List<Persona> ConsultarPersona() {
        // TODO Auto-generated method stub
        return (List<Persona>) this.repo.findAll(); 

    }

    @Override
    public Persona CrearPersona(Persona persona) {
        // TODO Auto-generated method stub
        persona.setEmail(persona.getEmail());
        return this.repo.save(persona);  
            
    }

    @Override
    public Persona modificarPersona(Persona persona) {
        // TODO Auto-generated method stub
        return this.repo.save(persona); 
    }

    @Override
    public Persona BuscarPersona(int id) {
        // TODO Auto-generated method stub
        return this.repo.findById(id).get();
    }

    @Override
    public void EliminarPersona(int id) {
        // TODO Auto-generated method stub
        this.repo.deleteById(id);
    }
    
}
