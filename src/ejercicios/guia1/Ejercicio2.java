/*
 Escribir un programa que pida tu nombre,
lo guarde en una variable y lo muestre por pantalla.
 */
package ejercicios.guia1;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String nombre;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        
        nombre=leer.next();
        
        System.out.println("El nombre ingresado es: " + nombre);
    }
    
}
