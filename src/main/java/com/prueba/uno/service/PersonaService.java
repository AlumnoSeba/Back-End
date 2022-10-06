
package com.prueba.uno.service;

import com.prueba.uno.ejem.Persona;
import com.prueba.uno.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        List<Persona> persona=persoRepo.findAll();
        return persona;
    }

    @Override
    public void crearPersona(Persona per) {
         persoRepo.save(per);
    }
    @Override
    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }
    @Override
    public Persona buscarPersona(int id) {
        Persona pers = persoRepo.findById(id).orElse(null);
        return pers;
    }

   
    

   
    
    
    
}
