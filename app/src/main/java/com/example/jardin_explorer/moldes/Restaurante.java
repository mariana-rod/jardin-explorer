package com.example.jardin_explorer.moldes;

public class Restaurante {
    private String nombre;
    private String descripcion;
    private String direccion;
    private String calificacion;
    private Integer fotografia;
    private Integer boton;

    public Restaurante() {
    }

    public Restaurante(String nombre, String descripcion, String direccion, String calificacion, Integer fotografia, Integer boton) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.calificacion = calificacion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
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


