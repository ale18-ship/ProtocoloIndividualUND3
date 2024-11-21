/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO1taller11;

/**
 *
 * @author asd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        circulo.mostrarArea(); // Muestra el área del círculo

        Figura rectangulo = new Rectangulo(4, 6);
        rectangulo.mostrarArea(); // Muestra el área del rectángulo
    }
}
