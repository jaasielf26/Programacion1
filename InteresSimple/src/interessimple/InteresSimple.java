/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessimple;

import java.util.Scanner;

/**
 *
 * @author jaasi
 */
public class InteresSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        double capital, interes;
        int tasa, tiempo;

        // Solicitar datos al usuario
        System.out.print("Ingrese el capital inicial: ");
        capital = entrada.nextDouble();

        System.out.print("Ingrese la tasa de interes anual (%): ");
        tasa = entrada.nextInt();

        System.out.print("Ingrese el tiempo en años: ");
        tiempo = entrada.nextInt();

        // Cálculo del interés simple
        interes = (capital * tasa * tiempo) / 100;

        // Mostrar resultado
        System.out.println("\n===== RESULTADO =====");
        System.out.println("El interes simple generado es: " + interes);

        entrada.close();
    }
    
}
