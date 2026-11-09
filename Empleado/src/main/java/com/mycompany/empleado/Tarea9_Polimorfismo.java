package com.mycompany.empleado;

public class Tarea9_Polimorfismo {
    public static void main(String[] args) {
        // Creamos un arreglo de tipo Empleado con una capacidad de 4 elementos
        Empleado[] empleados = new Empleado[4];

        // Instanciamos empleados fijos y por hora
        empleados[0] = new EmpleadoFijo("Ana Gómez", 2500.00);
        empleados[1] = new EmpleadoPorHora("Carlos Pérez", 160, 15.50);
        empleados[2] = new EmpleadoFijo("María Rodríguez", 3200.50);
        empleados[3] = new EmpleadoPorHora("Juan López", 120, 18.00);

        // Recorremos el arreglo demostrando polimorfismo
        System.out.println("=== LISTADO DE SUELDOS DE EMPLEADOS ===");
        for (Empleado emp : empleados) {
            System.out.println("Empleado: " + emp.getNombre());
            System.out.println("Sueldo: $" + emp.calcularSueldo());
            System.out.println("-----------------------------------");
        }
    }
}