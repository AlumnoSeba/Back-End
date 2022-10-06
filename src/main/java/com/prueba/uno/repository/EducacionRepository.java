
package com.prueba.uno.repository;

import com.prueba.uno.ejem.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer>{
    
}
