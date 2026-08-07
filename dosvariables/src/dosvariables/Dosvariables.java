/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosvariables;

import java.util.Scanner;

/**
 *
 * @author jaasi
 */
public class Dosvariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        double base, altura, area, perimetro;

        // Solicitar datos al usuario
        System.out.print("Ingrese la base del rectangulo: ");
        base = entrada.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        altura = entrada.nextDouble();

        // Cálculos
        area = base * altura;
        perimetro = 2 * (base + altura);

        // Mostrar resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Area del rectangulo: " + area);
        System.out.println("Perimetro del rectangulo: " + perimetro);

        entrada.close();
    }
    
}
