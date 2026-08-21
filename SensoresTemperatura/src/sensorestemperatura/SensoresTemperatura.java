/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensorestemperatura;
import java.util.Scanner;


/**
 *
 * @author jaasi
 */
public class SensoresTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Declaracion de Variables
        double temperatura = 0;
        double temperaturaMayor = 0;
        double temperaturaMenor = 0;
        double acumulador = 0;
        double promedio = 0;
        double diferencia = 0;

        int cantidadTemperaturas = 0;
        boolean primeraTemperatura = true;

        System.out.println("Analisis de Sensores de Temperatura");
        System.out.println("Ingrese -999 para finalizar");

        while (temperatura != -999) {

            System.out.print("Ingrese la temperatura: ");
            temperatura = input.nextDouble();

            if (temperatura == -999) {

                System.out.println("Finalizando lectura...");

            } else if (temperatura < -273.15) {

                System.out.println("Error: Temperatura no valida");
                System.out.println("No puede ser menor a -273.15 C");

            } else {

                acumulador += temperatura;
                cantidadTemperaturas++;
                
                 if (primeraTemperatura) {

                    temperaturaMayor = temperatura;
                    temperaturaMenor = temperatura;

                    primeraTemperatura = false;

                } else {

                    temperaturaMayor = Math.max(temperaturaMayor, temperatura);
                    temperaturaMenor = Math.min(temperaturaMenor, temperatura);

                }
            }
        }

         if (cantidadTemperaturas > 0) {

            promedio = acumulador / cantidadTemperaturas;
            diferencia = temperaturaMayor - temperaturaMenor;

            System.out.println("");
            System.out.println(" ESTOS SON LOS RESULTADOS ");

            System.out.printf("Promedio: %.2f C\n", promedio);
            System.out.printf("Temperatura mas alta: %.2f C\n",
                    temperaturaMayor);
            System.out.printf("Temperatura mas baja: %.2f C\n",
                    temperaturaMenor);
            System.out.printf("Diferencia termica: %.2f C\n",
                    diferencia);

        } else {

            System.out.println("No se ingresaron temperaturas validas.");

        
    }
    
 }
}

