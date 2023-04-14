/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.arreglos.en.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio6_Extra_chatgpt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        // leer 5 palabras del usuario
        String[] palabras = new String[5];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
            palabras[i] = sc.nextLine().toLowerCase();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("La palabra debe tener de 3 a 5 caracteres. Ingrese otra palabra: ");
                palabras[i] = sc.nextLine().toLowerCase();
            }
        }
        
        // crear la matriz de la sopa de letras
        char[][] sopa = new char[20][20];
        Random rand = new Random();
        int filaAleatoria = rand.nextInt(sopa.length);
        int colInicial = rand.nextInt(sopa.length - palabras[0].length());
        for (int i = 0; i < palabras[i].length(); i++) {
            sopa[filaAleatoria][colInicial + i] = palabras[0].charAt(i);
        }
        
        // ubicar las palabras en la sopa de letras
        for (int i = 1; i < palabras.length; i++) {
            boolean ubicada = false;
            while (!ubicada) {
                filaAleatoria = rand.nextInt(sopa.length);
                colInicial = rand.nextInt(sopa.length - palabras[i].length());
                if (sopa[filaAleatoria][colInicial] == 0) {
                    boolean coincidencia = true;
                    for (int j = 0; j < palabras[i].length(); j++) {
                        if (sopa[filaAleatoria][colInicial + j] != 0 && sopa[filaAleatoria][colInicial + j] != palabras[i].charAt(j)) {
                            coincidencia = false;
                            break;
                        }
                    }
                    if (coincidencia) {
                        for (int j = 0; j < palabras[i].length(); j++) {
                            sopa[filaAleatoria][colInicial + j] = palabras[i].charAt(j);
                        }
                        ubicada = true;
                    }
                }
            }
        }
        
        // rellenar los espacios no utilizados con un número aleatorio del 0 al 9
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char)(rand.nextInt(10) + '0');
                }
            }
        }
        
        // imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
    

