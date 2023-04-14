/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas 
 y después toda en minúsculas.
 Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicios.guia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author PC-Leonardo
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        String frase, frase1,frase2;
        
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        
        frase1=toLowerCase(frase);
        frase2=toUpperCase(frase);
        
        System.out.println("La frsase en minusculas es " + frase1);
        System.out.println("La frase en mayusculas es " + frase2);
    }
    
}
