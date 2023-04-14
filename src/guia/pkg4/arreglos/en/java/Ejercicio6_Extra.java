/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con 
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().
 */
package guia.pkg4.arreglos.en.java;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio6_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String pal1,pal2,pal3,pal4,pal5;
        String [][] sopa= new String [20][20];
        
        
        System.out.println("Ingrese una palabra de entre 3 y 5 caracteres");
        pal1=leer.next();
        int longitud=pal1.length();
        while (longitud<3 || longitud>5){
            System.out.println("Ingrese una palabra de longitud valida");
             pal1=leer.next();
             longitud=pal1.length();
        }
                
            llenarsopa( sopa ,pal1);
        
    }
    
    public static void llenarsopa(String[][] sopa ,String pal) {
        int fila,columna;
        int longi= pal.length();
        
        
        fila=(int)(Math.random()*20+1);
        columna=(int)(Math.random()*20+1);
        do {            
            if (columna+longi>20){
            columna=(int)(Math.random()*20+1);
        }
        } while (columna+longi>20);
        
        System.out.println(fila);
        System.out.println(columna);
        for (int j = 0; j < pal.length(); j++) {
            String letra= pal.substring(j, j+1);
            System.out.println(letra);                   
            for (int i = 0; i < pal.length(); i++) {
            
            sopa[fila][columna+i]=letra;
        }
        }
    
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(" " + sopa[i][j] + " ");
            }
            System.out.println("");
        }
        
            
        }
        
        
    }

