
package com.prueba.uno.dto;

import javax.validation.constraints.NotBlank;


public class DtoProyectos {
    @NotBlank
    private String nombreProyecto;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String periodo;
    @NotBlank
    private String image;

    public DtoProyectos() {
    }

    public DtoProyectos(String nombreProyecto, String descripcion, String periodo, String image) {
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.periodo = periodo;
        this.image = image;
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
