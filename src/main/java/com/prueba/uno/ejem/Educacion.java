
package com.prueba.uno.ejem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)        
    int id;
    String nombreInstitucion;
    String direccion;
    String titulo;
    String periodo;
    String imag;

    public Educacion() {
    }

    public Educacion(String nombreInstitucion, String direccion, String titulo, String periodo, String imag) {
        this.nombreInstitucion = nombreInstitucion;
        this.direccion = direccion;
        this.titulo = titulo;
        this.periodo = periodo;
        this.imag= imag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
