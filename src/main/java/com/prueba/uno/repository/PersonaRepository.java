
package com.prueba.uno.repository;

import com.prueba.uno.ejem.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Integer>{
    
}
