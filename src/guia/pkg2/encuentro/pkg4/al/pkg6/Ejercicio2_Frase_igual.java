/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka”
   el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
   Incorrecto. Nota: investigar la función equals() en Java.

 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio2_Frase_igual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String frase= "eureka";
        System.out.println("Ingrese una frase");
        String frase2=leer.nextLine();
        if (frase.equals(frase2)) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
            
        }
    }

    
    
}
