/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorunidades;

import java.util.Scanner;

/**
 *
 * @author jaasi
 */
public class Conversorunidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);

        // Declaracion de variables
        int seleccion = 0;
        double valor = 0;
        double resultado = 0;

        do {

            System.out.println("");
            System.out.println(" CONVERSOR DE UNIDADES ");
            System.out.println("1. Metros a Pies");
            System.out.println("2. Kilogramos a Libras");
            System.out.println("3. Centimetros a Pulgadas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            seleccion = input.nextInt();

            switch (seleccion) {

                case 1:

                    do {
                        System.out.print("Ingrese los metros: ");
                        valor = input.nextDouble();

                        if (valor <= 0) {
                            System.out.println("Error: El valor debe ser mayor que cero.");
                        }
                        
                           } while (valor <= 0);

                    resultado = valor * 3.28084;

                    System.out.printf("%.2f metros = %.2f pies\n",
                            valor, resultado);

                    break;

                case 2:

                    do {
                        System.out.print("Ingrese los kilogramos: ");
                        valor = input.nextDouble();

                        if (valor <= 0) {
                            System.out.println("Error: El valor debe ser mayor que cero.");
                        }

                    } while (valor <= 0);

                    resultado = valor * 2.20462;

                    System.out.printf("%.2f kilogramos = %.2f libras\n",
                            valor, resultado);

                    break;
                      case 3:

                    do {
                        System.out.print("Ingrese los centimetros: ");
                        valor = input.nextDouble();

                        if (valor <= 0) {
                            System.out.println("Error: El valor debe ser mayor que cero.");
                        }

                    } while (valor <= 0);

                    resultado = valor / 2.54;

                    System.out.printf("%.2f centimetros = %.2f pulgadas\n",
                            valor, resultado);

                    break;

                case 4:

                    System.out.println("Saliendo del programa...");

                    break;

                default:

                    System.out.println("Opcion no valida.");

                    break;
            }

        } while (seleccion != 4);
    }
    
}
