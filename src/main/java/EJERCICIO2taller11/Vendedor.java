/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2taller11;

/**
 *
 * @author asd
 */
public class Vendedor extends Empleado {
    private final double salarioBase;
    private final double comision;
    private final int ventas;

    public Vendedor(String nombre, int id, double salarioBase, double comision, int ventas) {
        super(nombre, id);
        this.salarioBase = salarioBase;
        this.comision = comision;
        this.ventas = ventas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (comision * ventas);
    }
}
