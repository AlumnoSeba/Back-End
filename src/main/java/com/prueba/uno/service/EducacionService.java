
package com.prueba.uno.service;

import com.prueba.uno.ejem.Educacion;
import com.prueba.uno.ejem.Experiencia;
import com.prueba.uno.repository.EducacionRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    @Autowired
    EducacionRepository rEducacion;
    
    public List<Educacion> listaEducacion(){
        return rEducacion.findAll();
    }
    public void guardarEducacion(Educacion expe){
        rEducacion.save(expe);
    }
    public Educacion bucarEduId(int id){
        return rEducacion.findById(id).orElse(null);
    }
   
    public void borrarEducacion(int id){
        rEducacion.deleteById(id);
    }
}
