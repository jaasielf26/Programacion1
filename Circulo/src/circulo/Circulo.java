/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulo;

import java.util.Scanner;

/**
 *
 * @author jaasi
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner(System.in);

        //Declaración de variables
        double radio, area, circunferencia;

        // Solicitar el radio al usuario
        System.out.print("Ingrese el radio del circulo: ");
        radio = entrada.nextDouble();

        // Cálculos utilizando la librería Math
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;

        // Mostrar resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Area del circulo: " + area);
        System.out.println("Circunferencia del circulo: " + circunferencia);

        entrada.close();
    }
    
}
