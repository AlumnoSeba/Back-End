
package com.prueba.uno.repository;

import com.prueba.uno.ejem.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Integer>{
    
}
