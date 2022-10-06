
package com.prueba.uno.dto;

import javax.validation.constraints.NotBlank;


public class DtoMensajes {
    @NotBlank
    private String nombre;
    @NotBlank
    private String email;
    @NotBlank
    private String asunto;
    @NotBlank
    private String mensaje;

    public DtoMensajes() {
    }

    public DtoMensajes(String nombre, String email, String asunto, String mensaje) {
        this.nombre = nombre;
        this.email = email;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
