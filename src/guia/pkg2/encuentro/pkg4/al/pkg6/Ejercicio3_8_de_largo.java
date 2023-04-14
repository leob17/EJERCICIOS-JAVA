/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 
   8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
   deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso 
   contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
   la función Lenght() en Java.
 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio3_8_de_largo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String frase = null;
        
        System.out.println("Ingrese una frase o palabra de 8 caracteres");
        frase=leer.nextLine();
        int largo=frase.length();
        
        if (largo==8){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
        
    }
    
}
