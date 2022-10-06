
package com.prueba.uno.dto;

import javax.validation.constraints.NotBlank;


public class DtoEducacion {
    @NotBlank
    private String nombreInstitucion;
    @NotBlank
    private String direccion;
    @NotBlank
    private String titulo;
    @NotBlank
    private String periodo;
    @NotBlank
    private String imag;

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreInstitucion, String direccion, String titulo, String periodo, String imag) {
        this.nombreInstitucion = nombreInstitucion;
        this.direccion = direccion;
        this.titulo = titulo;
        this.periodo = periodo;
        this.imag = imag;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getImag() {
        return imag;
    }

    public void setImag(String imag) {
        this.imag = imag;
    }

  
    
    
}
