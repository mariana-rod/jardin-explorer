package com.example.jardin_explorer.moldes;

public class Sitio {
    private String nombre;
    private String descripcion;
    private String direccion;
    private Integer fotografia;

    public Sitio() {
    }

    public Sitio(String nombre, String descripcion, String direccion, Integer fotografia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.fotografia = fotografia;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getFotografia() {
        return fotografia;
    }

    public void setFotografia(Integer fotografia) {
        this.fotografia = fotografia;
    }
}
