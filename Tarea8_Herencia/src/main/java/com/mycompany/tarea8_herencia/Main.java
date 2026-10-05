package com.mycompany.tarea8_herencia;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(
            "jo", 
            "6196082", 
            "2024102021", 
            "Ingeniería Informática"
        );

        System.out.println("=== DATOS DEL ESTUDIANTE ===");
        System.out.println(estudiante1.toString());
    }
}