package com.mycompany.empleado;

public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double valorPorHora;

    public EmpleadoPorHora(String nombre, int horasTrabajadas, double valorPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSueldo() {
        return this.horasTrabajadas * this.valorPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
