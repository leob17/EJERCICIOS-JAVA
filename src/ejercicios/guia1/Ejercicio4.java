/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
 grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicios.guia1;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int f, c;
         Scanner leer=new Scanner(System.in);
         System.out.println("Ingrese temperatura en grados centigrados");
         c=leer.nextInt();
         f=32+(9*c/5);
         System.out.println("La temperatura ingresada expresada en Fahrenheit es igual a " + f);
    }
    
}
