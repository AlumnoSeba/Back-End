
package com.prueba.uno.service;



import com.prueba.uno.ejem.Experiencia;
import com.prueba.uno.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService{
    @Autowired
    ExperienciaRepository rExperiencia;

     public List<Experiencia> listaExperiencia(){
        return  rExperiencia.findAll();
    }

    public Optional<Experiencia> getExpe(int id){
        return  rExperiencia.findById(id);
    }

    public Optional<Experiencia> getByNombreEmpresa(String nombreEmpresa){
        return rExperiencia.findByNombreEmpresa(nombreEmpresa);
    }

    public void saveExperiencia(Experiencia expe){
        rExperiencia.save(expe);
    }

    public void deleteExperiencia(int id){
        rExperiencia.deleteById(id);
    }

    public boolean existsByIdExperiencia(int id){
        return rExperiencia.existsById(id);
    }

    public boolean existsByNombreEmpresa(String nombreEmpresa){
        return rExperiencia.existsByNombreEmpresa(nombreEmpresa);
    }


    
  
    
}
