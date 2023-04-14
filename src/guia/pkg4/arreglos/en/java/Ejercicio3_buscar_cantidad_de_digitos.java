/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia.pkg4.arreglos.en.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio3_buscar_cantidad_de_digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random(System.currentTimeMillis());
        Scanner leer = new Scanner (System.in, "ISO-8859-1");
        int uno=0, dos=0, tres=0, cuatro=0,cinco= 0;
        System.out.println("Ingrese el valor del vector");
        int N = leer.nextInt();
        
        int [] vector = new int [N];
        
         for (int i=0 ; i<vector.length ; i++){
            vector[i] = aleatorio.nextInt(99999);    
        }
         //for (int i=0 ; i<vector.length ; i++){
          //   System.out.print(vector[i] + " "); 
             
         //}
        
         for (int i=0 ; i<vector.length ; i++){
             String cadena = Integer.toString(vector[i]);
             int longitud=cadena.length();
             if (longitud==1){
                 uno++;                 
             }
             if(longitud==2){
                 dos++;
             }
             if(longitud==3){
                 tres++;
             }
             if(longitud==4){
                 cuatro++;
             }
             if(longitud==5){
                 cinco++;
             }
         }
         System.out.println("En el arreglo existen: ");
         System.out.println ( uno + " numeros de 1 digito");
         System.out.println ( dos + " numeros de 2 digito");
         System.out.println ( tres + " numeros de 3 digito");
         System.out.println ( cuatro + " numeros de 4 digito");
         System.out.println ( cinco + " numeros de 5 digito");
    }
    
}
