
package com.prueba.uno.dto;

import javax.validation.constraints.NotBlank;


public class DtoExperiencia {
     @NotBlank
    private String nombreEmpresa;
     @NotBlank
    private String actividad;
     @NotBlank
    private String puesto;
     @NotBlank
    private String periodo;
     @NotBlank
    private String image;

    public DtoExperiencia() {
    }

    public DtoExperiencia(String nombreEmpresa, String actividad, String puesto, String periodo, String image) {
        this.nombreEmpresa = nombreEmpresa;
        this.actividad = actividad;
        this.puesto = puesto;
        this.periodo = periodo;
        this.image= image;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
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
    
