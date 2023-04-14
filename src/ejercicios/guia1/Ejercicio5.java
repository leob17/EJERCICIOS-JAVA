/*
 Escribir un programa que lea un número entero por teclado y muestre por 
 pantalla el doble, el triple y la raíz cuadrada de ese número. 
 Nota: investigar la función Math.sqrt().
 */
package ejercicios.guia1;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num=leer.nextInt();
        
        int doble = 2*num;
        int triple= 3*num;
        double raiz= Math.sqrt(num);
        System.out.println("El doble del numero ingrasado es: " + doble);
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);
    }
    
}
