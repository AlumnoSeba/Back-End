
package com.prueba.uno.controller;

import com.prueba.uno.dto.DtoPersona;
import com.prueba.uno.ejem.Persona;
import com.prueba.uno.security.controller.Mensaje;
import com.prueba.uno.service.IPersonaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
@CrossOrigin(origins="https://portfolio-113b8.web.app/portfolioweb")

public class ControladorUno {
    
    @Autowired
    private IPersonaService persoServy;
    
    
    @PostMapping("/crear")
    public void agregarPersonas(@RequestBody Persona pers){
        persoServy.crearPersona(pers);
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Persona> verPersonas(){
       return persoServy.verPersonas();
       
    }
    
   
    @DeleteMapping("/borrarPersona/{id}")
    public String borrarPersona(@PathVariable int id){
        persoServy.borrarPersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @GetMapping("/buscarPersona/{id}")
    public Persona buscarPersona(@PathVariable int id){
        Persona pers=persoServy.buscarPersona(id);
        return pers;
    }
    
    @PutMapping("/editarPersona/{id}")
     public ResponseEntity<Persona> editarEducacion(@PathVariable("id") int id, @RequestBody DtoPersona perDto){
       Persona per=persoServy.buscarPersona(id);
       per.setNombre(perDto.getNombre());
       per.setApellido(perDto.getApellido());
       per.setTitulo(perDto.getTitulo());
       per.setDescripcion(perDto.getDescripcion());
       per.setImag(perDto.getImag());
       
       persoServy.crearPersona(per);
       return new ResponseEntity(new Mensaje("Se actualizo correctamente!!!"), HttpStatus.OK);
   }
    
    @GetMapping("/perfil")
    public Persona buscarPersona(){
       return persoServy.buscarPersona((int) 1);
        
     
    }
}
