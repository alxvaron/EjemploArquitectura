package com.al.model;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;


public class PersonaRepository {

    private static final Map<Integer, Persona> PERSONAS = new TreeMap<>();

    public static void add(Persona p) {
        PERSONAS.put(p.getIdPersona(), p);
    }

    public static Persona getById(int id) {
        return PERSONAS.get(id);
    }

    public static Collection<Persona> findAll() {
        return PERSONAS.values();
    }

    public static Persona addPersona(String nombre, int edad) {
        Persona p;
        add(p = new Persona(nombre, edad));
        return p;
    }

    public static Persona addPersona(String nombre, String edad) {
        int iEdad = (edad == null || edad.isEmpty()) ? 0 : Integer.parseInt(edad);
        return addPersona(nombre, iEdad);
    }
}
