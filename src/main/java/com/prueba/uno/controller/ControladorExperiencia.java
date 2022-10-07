
package com.prueba.uno.controller;

import com.prueba.uno.dto.DtoExperiencia;
import com.prueba.uno.ejem.Experiencia;
import com.prueba.uno.security.controller.Mensaje;
import com.prueba.uno.service.ExperienciaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;


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


public class ControladorExperiencia {
    @Autowired
    ExperienciaService sExperiencia;
    
@GetMapping("/listaExperiencias")
    public ResponseEntity<List<Experiencia>> listaExperiencia(){

        List<Experiencia> expe = sExperiencia.listaExperiencia();
        return new ResponseEntity<List<Experiencia>>(expe, HttpStatus.OK);
    }
   
      @GetMapping("/buscarId/{id}")
    public ResponseEntity<Experiencia> experienciaById(@PathVariable("id") int id){

        if (!sExperiencia.existsByIdExperiencia(id))
            return new ResponseEntity(new Mensaje("No existe la Experiencia"), HttpStatus.NOT_FOUND);

        Experiencia expe = sExperiencia.getExpe(id).get();
        return new ResponseEntity(expe, HttpStatus.OK);
    }
    
      @GetMapping("/buscarNombre/{nombreEmpresa}")
    public ResponseEntity<Experiencia> experienciaByNombre(@PathVariable("nombreEmpresa") String nombreEmpresa){

        if (!sExperiencia.existsByNombreEmpresa(nombreEmpresa))
            return new ResponseEntity(new Mensaje("No existe la Experiencia"), HttpStatus.NOT_FOUND);

        Experiencia expe = sExperiencia.getByNombreEmpresa(nombreEmpresa).get();
        return new ResponseEntity(expe, HttpStatus.OK);
    }
    
    @PostMapping("/crearExperiencia")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody DtoExperiencia expeDto){

        if(StringUtils.isBlank(expeDto.getNombreEmpresa()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);

        if(sExperiencia.existsByNombreEmpresa(expeDto.getNombreEmpresa()))
            return new ResponseEntity(new Mensaje("La experiencia existe"), HttpStatus.BAD_REQUEST);

       

        Experiencia expe = new Experiencia(expeDto.getNombreEmpresa(), expeDto.getActividad(), expeDto.getPeriodo(), expeDto.getPuesto(), expeDto.getImage() );
        sExperiencia.saveExperiencia(expe);
        return new ResponseEntity(new Mensaje ("Experiencia creada"), HttpStatus.OK);
    }
    
   @PutMapping("/actualizarExperiencia/{id}")
   public ResponseEntity<Experiencia> acualizarExperiencia(@PathVariable("id") int id, @RequestBody DtoExperiencia expeDto){
       Experiencia expe=sExperiencia.getExpe(id).get();
       expe.setNombreEmpresa(expeDto.getNombreEmpresa());
       expe.setActividad(expeDto.getActividad());
       expe.setPeriodo(expeDto.getPeriodo());
       expe.setPuesto(expeDto.getPuesto());
       expe.setImage(expeDto.getImage());
       
       sExperiencia.saveExperiencia(expe);
       return new ResponseEntity(new Mensaje("Se actualizo Experiencia!!!"), HttpStatus.OK);
   }
    
    @DeleteMapping("/borrarExperiencia/{id}")
    public ResponseEntity<Experiencia> borrarExperiencia(@PathVariable("id") int id){
        if (!sExperiencia.existsByIdExperiencia(id))
            return new ResponseEntity(new Mensaje("No existe la experiencia"), HttpStatus.NOT_FOUND);
        sExperiencia.deleteExperiencia(id);
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
}
