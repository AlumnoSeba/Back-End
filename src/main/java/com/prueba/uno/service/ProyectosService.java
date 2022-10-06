
package com.prueba.uno.service;

import com.prueba.uno.ejem.Proyectos;
import com.prueba.uno.repository.ProyectosRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService {
    @Autowired
    ProyectosRepository rProyectos;
    
    public List<Proyectos> listaProyectos(){
        return rProyectos.findAll();
    }
    public void guardarProyectos(Proyectos pro){
        rProyectos.save(pro);
    }
    public Proyectos buscarProId(int id){
        return rProyectos.findById(id).orElse(null);
    }
    public void borrarProyecto(int id){
        rProyectos.deleteById(id);
    }
    
}
