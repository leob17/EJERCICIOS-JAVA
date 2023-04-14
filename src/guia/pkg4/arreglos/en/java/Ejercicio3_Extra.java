/*
Crear una función rellene un vector con números aleatorios, pasándole un 
arreglo por parámetro. Después haremos otra función o procedimiento que 
imprima el vector.

 */
package guia.pkg4.arreglos.en.java;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio3_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el tamaño del vector");
         int n=leer.nextInt();
         int vector []= new int [n];
         
         rellenarVector(vector);
         mostrarVector(vector);
        
             
            
        
    }
    public static void rellenarVector(int [] vector) {
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i]=(int) (Math.random()*100+1);
            
        }
        System.out.println("vector completo");
        
    }
    public static void mostrarVector(int [] vector) {
        
         for (int i = 0; i < vector.length; i++) {
            
            System.out.print("[ " + vector[i] + " ]");
            
        }
        System.out.println(" ");
        
    }
    
    
    
}
