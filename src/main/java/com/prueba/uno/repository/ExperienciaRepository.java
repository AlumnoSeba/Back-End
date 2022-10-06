
package com.prueba.uno.repository;

import com.prueba.uno.ejem.Experiencia;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    
   
    Optional<Experiencia> findByNombreEmpresa(String nombreEmpresa);

    boolean existsByNombreEmpresa(String nombreEmpresa);
    
}

    
   
                        