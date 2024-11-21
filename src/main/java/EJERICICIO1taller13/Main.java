/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERICICIO1taller13;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        Figura triangulo = new Triangulo(4, 6);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
    
}
