/*
 * Crear un programa que dado un número determine si es par o impar.
 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio1_Par_o_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        
        if (num%2==0){
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
    
}
