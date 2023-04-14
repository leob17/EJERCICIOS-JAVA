/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a 
   continuación solicite números al usuario hasta que la suma de los números
   introducidos supere el límite inicial.
 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio5_suma_de_numeros_con_limite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double limite;
        double suma;
        suma=0;
        
        System.out.println("Ingrese un numero positivo limite");
        do {
        limite=leer.nextDouble();
        
        } while (limite<0);
           
        while (suma<limite) {
            System.out.println("Ingrese un numero para sumar");
            double num=leer.nextDouble();
            suma=suma+num;
    }
        
        System.out.println("La suma total es "+suma);
    }
    
}
