/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trayectoriabalistica;
import java.util.Scanner;

/**
 *
 * @author jaasi
 */
public class Trayectoriabalistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);

        // Declaracion de Variables
        final double GRAVEDAD = 9.81;

        double velocidadInicial = 0;
        double angulo = 0;
        double anguloRadianes = 0;
        double altura = 0;
        double alturaMaxima = 0;
        double tiempoAlturaMaxima = 0;

        boolean primeraLectura = true;

        System.out.println("Simulacion de Trayectoria Balistica");

        System.out.print("Ingrese la velocidad inicial (m/s): ");
        velocidadInicial = input.nextDouble();

        System.out.print("Ingrese el angulo de lanzamiento (grados): ");
        angulo = input.nextDouble();

        // Validacion
        if (velocidadInicial <= 0) {

            System.out.println("Error: La velocidad debe ser mayor que 0.");

        }
        else if (angulo <= 1 || angulo >= 89) {

            System.out.println("Error: El angulo debe estar entre 1 y 89 grados.");
              }
        else {

            anguloRadianes = Math.toRadians(angulo);

            System.out.println("");
            System.out.println(" TRAYECTORIA DEL PROYECTIL ");

            for (int tiempo = 1; tiempo <= 10; tiempo++) {

                altura = (velocidadInicial
                        * Math.sin(anguloRadianes)
                        * tiempo)
                        - (0.5 * GRAVEDAD * tiempo * tiempo);

                System.out.printf("Segundo %d: Altura = %.2f metros\n",
                        tiempo, altura);

                if (primeraLectura && altura >= 0) {

                    alturaMaxima = altura;
                    tiempoAlturaMaxima = tiempo;
                    primeraLectura = false;

                }
                else if (altura > alturaMaxima) {

                    alturaMaxima = altura;
                    tiempoAlturaMaxima = tiempo;

                }
                 if (altura < 0) {

                    System.out.printf(
                            "El proyectil impacto el suelo en el segundo %d.\n",
                            tiempo);

                    break;
                }
            }

            System.out.println("");
            System.out.println(" RESULTADOS ");

            System.out.printf("Altura maxima: %.2f metros\n",
                    alturaMaxima);

            System.out.printf("Segundo de altura maxima: %.0f\n",
                    tiempoAlturaMaxima);
        }
        
    }
    
}
