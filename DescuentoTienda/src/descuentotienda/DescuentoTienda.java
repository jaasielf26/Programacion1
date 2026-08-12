/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentotienda;

import java.util.Scanner;

/**
 *
 * @author jaasi
 */
public class DescuentoTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);

        int edad;
        char membresia;
        double precio, descuento, montoDescuento, totalPagar;

        System.out.print("Ingrese la edad del cliente: ");
        edad = sc.nextInt();

        System.out.print("¿Tiene membresía premium? (S/N): ");
        membresia = sc.next().charAt(0);

        System.out.print("Ingrese el precio del juego: ");
        precio = sc.nextDouble();

        descuento = 0;

        if (edad >= 18) {

            if (edad >= 65 || membresia == 'S' || membresia == 's') {
                descuento = 20;
            } else {
                descuento = 10;
            }

        } else {

            if (membresia == 'S' || membresia == 's') {

                if (edad > 12) {
                    descuento = 15;
                } else {
                    descuento = 0;
                }

            } else {
                descuento = 0;
            }
        }

        montoDescuento = precio * descuento / 100;
        totalPagar = precio - montoDescuento;

        System.out.println("----- RESULTADO -----");
        System.out.println("Precio original: L. " + precio);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Monto del descuento: L. " + montoDescuento);
        System.out.println("Total a pagar: L. " + totalPagar);

        sc.close();
    }
}