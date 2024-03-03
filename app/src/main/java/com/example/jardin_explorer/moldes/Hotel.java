package com.example.jardin_explorer.moldes;

import android.widget.Button;

public class Hotel {
    private String nombre;
    private String precio;
    private String precio2;
    private String precio3;
    private String descripcion;
    private String telefono;
    private String direccion;
    private Integer calificacion;
    private Integer fotografia;
    private Integer boton;

    public Hotel() {
    }

    public Hotel (String nombre, String precio, String precio2, String precio3, String descripcion, String telefono, String direccion, Integer calificacion, Integer fotografia, Integer boton) {
        this.nombre = nombre;
        this.precio = precio;
        this.precio2 = precio2;
        this.precio3 = precio3;
        this.descripcion = descripcion;
        this.telefono = telefono;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPrecio2() {
        return precio2;
    }

    public void setPrecio2(String precio2) {
        this.precio2 = precio2;
    }

    public String getPrecio3() {
        return precio3;
    }

    public void setPrecio3(String precio3) {
        this.precio3 = precio3;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
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
