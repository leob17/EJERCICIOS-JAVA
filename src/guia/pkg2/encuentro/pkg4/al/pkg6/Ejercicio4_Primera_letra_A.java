/*
 * Escriba un programa que pida una frase o palabra y valide si la
   primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, 
   se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
   caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la 
   función Substring y equals() de Java.

 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio4_Primera_letra_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String primera;
        String frase;
        
        System.out.println("Ingrese una frase o palabra que empiece con la letra A");
        frase=leer.nextLine();
        
        primera=frase.substring(0,1);
        
        
        if (primera.equals("A")||primera.equals("a")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    
    }
}
    
