
package com.prueba.uno.controller;

import com.prueba.uno.dto.DtoEducacion;
import com.prueba.uno.ejem.Educacion;
import com.prueba.uno.security.controller.Mensaje;
import com.prueba.uno.service.EducacionService;
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

import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/personas")
@CrossOrigin(origins="https://portfolio-113b8.web.app/portfolioweb")
public class ControladorEducacion {
    @Autowired
    EducacionService sEducacion;
    
    @GetMapping("/verEducacion")
    public List<Educacion> verEducacion(){
        return sEducacion.listaEducacion();
    }
    @GetMapping("/buscarEducacion/{id}")
    public Educacion buscarEduId(@PathVariable("id") int id){

       Educacion edu=sEducacion.bucarEduId(id);
       return edu;
    }
       
    
    @PostMapping("/guardarEducacion")
    public void agregarEducacion(@RequestBody Educacion edu){
        sEducacion.guardarEducacion(edu);
    }
    @DeleteMapping("/borrarEdu/{id}")
    public void borrarEducacion(@PathVariable int id){
        sEducacion.borrarEducacion(id);
    }
    
   @PutMapping("/actualizarEdu/{id}")
   public ResponseEntity<Educacion> editarEducacion(@PathVariable("id") int id, @RequestBody DtoEducacion eduDto){
       Educacion edu=sEducacion.bucarEduId(id);
       edu.setNombreInstitucion(eduDto.getNombreInstitucion());
       edu.setDireccion(eduDto.getDireccion());
       edu.setTitulo(eduDto.getTitulo());
       edu.setPeriodo(eduDto.getPeriodo());
       edu.setImag(eduDto.getImag());
       
       sEducacion.guardarEducacion(edu);
       return new ResponseEntity(new Mensaje("Se actualizo Educacion!!!"), HttpStatus.OK);
   }
}
     
   
    
 
