/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller11;

/**
 *
 * @author asd
 */
public abstract class Empleado {
    private final String nombre;
    private final int id;
    
    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }    
}
