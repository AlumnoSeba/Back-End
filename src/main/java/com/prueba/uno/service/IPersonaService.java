
package com.prueba.uno.service;

import com.prueba.uno.ejem.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(int id);
    
    public Persona buscarPersona(int id);
    
  
    
}
