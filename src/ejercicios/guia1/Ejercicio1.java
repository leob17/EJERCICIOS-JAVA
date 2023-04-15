/*
 Escribir un programa que pida dos números enteros por teclado y calcule la
suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicios.guia1;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma;
        int entero1;
        int entero2;

        System.out.println("Ingrese dos numeros enteros");
        Scanner leer = new Scanner(System.in);

        entero1 = leer.nextInt();
        entero2 = leer.nextInt();

        suma = entero1 + entero2;

        System.out.println("La suma de los numeros es " + suma);
    }

}
