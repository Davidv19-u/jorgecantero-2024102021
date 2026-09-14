package com.mycompany.persona2;

public class Main {
    public static void main(String[] args) {
        Persona2 persona = new Persona2();
        
        persona.setNombre("Juan");
        persona.setEdad(25);
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
