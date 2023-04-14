/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
   le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
   se encuentra el numero y si se encuentra repetido

 */
package guia.pkg4.arreglos.en.java;
    
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio2_Vector_de_tamaño_N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random(System.currentTimeMillis());
        Scanner leer = new Scanner (System.in, "ISO-8859-1");
        
        
        System.out.println("Ingrese el valor del vector");
        int N = leer.nextInt();
        
        int [] vector = new int [N];
        
        for (int i=0 ; i<vector.length ; i++){
            vector[i] = aleatorio.nextInt(100);    
        }
        
        System.out.println("Ingrese el numero a buscar en el vector");
        int numero=leer.nextInt();
        
        int cont=0;
        for (int i=0 ; i<vector.length ; i++){
            if (vector[i]==numero &&  cont!=0){
                
                System.out.println("El numero buscado se encuentra repetido en la posicion "+ i);
                
            }
                if (vector[i]==numero && cont==0){
                    System.out.println("El numero buscado se encuentra en la posicion " + i);
                    cont++;
                }
        }
        
        
        
    }
    
}
