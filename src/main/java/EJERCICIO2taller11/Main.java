/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO2taller11;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Empleado gerente = new Gerente("Carlos Pérez", 101, 3000.0, 500.0);
        gerente.mostrarDetalles();

        Empleado vendedor = new Vendedor("Ana López", 102, 1200.0, 50.0, 20);
        vendedor.mostrarDetalles();
    }
    
}
