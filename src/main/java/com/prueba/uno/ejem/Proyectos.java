
package com.prueba.uno.ejem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)        
    int id;
    String nombreProyecto;
    String descripcion;
    String periodo;
    String image;

    public Proyectos() {
    }

    public Proyectos(String nombreProyecto, String descripcion, String periodo, String image) {
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.periodo = periodo;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
