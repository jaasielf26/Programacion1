/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author jaasi
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;
        char operacion;
        double resultado;

        System.out.print("Ingrese el primer número: ");
        numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        numero2 = sc.nextInt();

        System.out.print("Ingrese la operación (+, -, /, *, %): ");
        operacion = sc.next().charAt(0);

        switch (operacion) {

            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (numero2 != 0) {
                    resultado = (double) numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;

            case '%':
                if (numero2 != 0) {
                    resultado = numero1 % numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede calcular el módulo entre cero.");
                }
                break;

            default:
                System.out.println("Operador no reconocido.");
        }

        sc.close();
    } 
}