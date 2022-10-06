
package com.prueba.uno.ejem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    String nombreEmpresa;
    String periodo;
    String actividad;
    String puesto;
    String image;

    public Experiencia() {
    }

    public Experiencia(String nombreEmpresa, String periodo, String actividad, String puesto, String image) {
        this.nombreEmpresa = nombreEmpresa;
        this.periodo = periodo;
        this.actividad = actividad;
        this.puesto = puesto;
        this.image= image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
}
