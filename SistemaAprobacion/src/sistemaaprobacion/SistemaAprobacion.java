/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaaprobacion;

import java.util.Scanner;

/**
 *
 * @author jaasi
 */
public class SistemaAprobacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

        String nombre;
        double examen1, examen2, promedio;

        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese la calificación del primer examen: ");
        examen1 = sc.nextDouble();

        System.out.print("Ingrese la calificación del segundo examen: ");
        examen2 = sc.nextDouble();

        promedio = (examen1 + examen2) / 2;

        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio final: " + promedio);

        if (promedio >= 65.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        sc.close();
    }
}