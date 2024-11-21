/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller11;

/**
 *
 * @author asd
 */
public class Gerente extends Empleado {
    private final double salarioBase;
    private final double bono;

    public Gerente(String nombre, int id, double salarioBase, double bono) {
        super(nombre, id);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
