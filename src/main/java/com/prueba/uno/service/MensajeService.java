
package com.prueba.uno.service;

import com.prueba.uno.ejem.Mensajes;
import com.prueba.uno.repository.MensajeRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MensajeService {
    @Autowired
    MensajeRepository rMensaje;
    
    public List<Mensajes> listaMensajes(){
        return rMensaje.findAll();
    }
    
    public void guardarMensaje(Mensajes msj){
        rMensaje.save(msj);
    }
    
    public Mensajes buscarMensaje(int id){
        return rMensaje.findById(id).orElse(null);
    }
    
    public void borrarMensaje(int id){
        rMensaje.deleteById(id);
    }
}
