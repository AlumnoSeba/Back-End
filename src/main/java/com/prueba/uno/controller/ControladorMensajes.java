
package com.prueba.uno.controller;

import com.prueba.uno.ejem.Mensajes;
import com.prueba.uno.service.MensajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins="https://portfolio-113b8.web.app/portfolioweb")
public class ControladorMensajes {
    @Autowired
    MensajeService sMensaje;
    
    @GetMapping("/verMensajes")
    public List<Mensajes> verMensajes(){
        return sMensaje.listaMensajes();
    }
    
    @PostMapping("/guardarMensaje")
    public void agregarMensaje(@RequestBody Mensajes msj){
        sMensaje.guardarMensaje(msj);
    }
    
    @DeleteMapping("/borrarMsj/{id}")
    public void borrarMensaje(@PathVariable int id){
        sMensaje.borrarMensaje(id);
    }
}
