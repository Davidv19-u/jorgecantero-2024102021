package com.mycompany.menulaboratorio;

import java.util.Scanner;

public class MenuLaboratorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===============================");
            System.out.println("       MENÚ INTERACTIVO        ");
            System.out.println("===============================");
            System.out.println("1. Acción 1: Mostrar saludo");
            System.out.println("2. Acción 2: Mostrar información");
            System.out.println("3. Salir");
            System.out.print("Por favor, seleccione una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n-> ¡Hola! Has seleccionado la opción 1.");
                    break;
                    
                case 2:
                    System.out.println("\n-> Estás ejecutando el laboratorio de Java con do-while y switch.");
                    break;
                    
                case 3:
                    System.out.println("\n-> Saliendo del programa. ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("\n[Error] Opción no válida. Por favor, ingrese un número del 1 al 3.");
            }

        } while (opcion != 3);

        scanner.close(); 
    }
}
