package com.al.model;


public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int COUNT = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.idPersona = ++COUNT;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
