package com.example.jardin_explorer.moldes;

import java.io.Serializable;

public class Sitio implements Serializable {
    private String nombre;
    private String descripcion;
    private String telefono;
    private Integer fotografia;
    private Integer boton;

    public Sitio() {
    }

    public Sitio(String nombre, String descripcion, String telefono, Integer fotografia, Integer boton) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.fotografia = fotografia;
        this.boton = boton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getFotografia() {
        return fotografia;
    }

    public void setFotografia(Integer fotografia) {
        this.fotografia = fotografia;
    }

    public Integer getBoton() {
        return boton;
    }

    public void setBoton(Integer boton) {
        this.boton = boton;
    }
}
