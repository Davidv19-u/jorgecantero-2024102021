package com.mycompany.tarea8_herencia;

public class Persona {
    protected String nombre;
    protected String cedula;

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cédula: " + cedula;
    }
}
