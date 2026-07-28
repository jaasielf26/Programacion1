/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola_mundo;

import java.util.Scanner;

/**
 *
 * @author jaasi
 */
public class conversiones {
     public static void main(String[] args){
         
         Scanner teclado = new Scanner(System.in);

    //Declaracion Variables
int pulgada = 0; //->Asignando un valor por el signo =
double resultadoCM = 0;
double kilometros = 100;
double millas = 0;
double gcelsius = 0;
double gfarenheit = 0;

System.out.println("Tenemos 5 pulgadas");
System.out.println("Cuanto es eso en CM?");
pulgada = 5;
resultadoCM = pulgada * 2.54;
System.out.printf("%d pulgadas es equivalente a %.2f cm",pulgada,resultadoCM);
    
pulgada = 12;
resultadoCM = pulgada * 2.54;
System.out.printf("\n %.2f cm es equivalente a %d pulgadas",resultadoCM,pulgada);

System. out.println ("\n Dime cuantos kilomentros son?");
kilometros = teclado.nextDouble();
millas = kilometros / 1.6; System. out.printf ("%.2f km es = a %.3f millas", kilometros,millas);

System. out.println("\n dime cuando grados celsius son"); gcelsius = teclado.nextDouble () ; gfarenheit = (gcelsius * 1.8) + 32;
System. out.printf ("%.2f Grados Celsius es = a %.3f Grados Farenheit", gcelsius, gfarenheit);
}
}

