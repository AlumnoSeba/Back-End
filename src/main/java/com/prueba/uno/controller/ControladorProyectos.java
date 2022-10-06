
package com.prueba.uno.controller;

import com.prueba.uno.dto.DtoProyectos;
import com.prueba.uno.ejem.Proyectos;
import com.prueba.uno.security.controller.Mensaje;
import com.prueba.uno.service.ProyectosService;
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
@CrossOrigin(origins="https://portfolio-sebastian.web.app")
public class ControladorProyectos {
   @Autowired
   ProyectosService sProyectos;
   
   @GetMapping("/verProyectos")
   public List<Proyectos> listarProyectos(){
       return sProyectos.listaProyectos();
   }
   @PostMapping("/guardarProyectos")
   public void guardarProyectos(@RequestBody Proyectos pro){
       sProyectos.guardarProyectos(pro);
   }
   @GetMapping("/buscarPro/{id}")
   public Proyectos buscarProyecId(@PathVariable ("id") int id){
       Proyectos pro=sProyectos.buscarProId(id);
       return pro;
   }
   @PutMapping("/actualizarProyectos/{id}")
    public ResponseEntity<Proyectos> editarEducacion(@PathVariable("id") int id, @RequestBody DtoProyectos proDto){
       Proyectos pro=sProyectos.buscarProId(id);
       pro.setNombreProyecto(proDto.getNombreProyecto());
       pro.setDescripcion(proDto.getDescripcion());
       pro.setPeriodo(proDto.getPeriodo());
       pro.setImage(proDto.getImage());
       
       
       sProyectos.guardarProyectos(pro);
       return new ResponseEntity(new Mensaje("Se actualizo Proyecto!!!"), HttpStatus.OK);
   } 
    @DeleteMapping("/borrarProyectos/{id}")
    public void eliminarProyecto(@PathVariable int id){
        sProyectos.borrarProyecto(id);
    }
}
