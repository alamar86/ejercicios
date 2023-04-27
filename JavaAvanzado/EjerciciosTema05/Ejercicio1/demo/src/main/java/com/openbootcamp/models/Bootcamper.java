package com.openbootcamp.models;

// POJO -> Plain old java object
public class Bootcamper {
    private String nombre;
    private String apellido;
    private String lenguaje;
    private String dni;

    public Bootcamper() {
    }

    public Bootcamper(String nombre, String apellido, String lenguaje, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.lenguaje = lenguaje;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
}