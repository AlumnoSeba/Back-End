
package com.prueba.uno.repository;

import com.prueba.uno.ejem.Mensajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository<Mensajes, Integer> {
    
}
