/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.arreglos.en.java;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio5_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese el tamaño de la matriz (cuadrada");
        int tam= sc.nextInt();
        int[][] matriz = new int[tam][tam]; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("ingrese valor en la posicion " + i +"," + j);
               matriz[i][j] =  sc.nextInt();
            }
           } System.out.println("matriz original");
           for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }System.out.println();
    }       System.out.println("matriz transpuesta");
             for (int i = 0; i < matriz.length; i++) {
                 for (int j = 0; j < matriz.length; j++) {
                     System.out.print(matriz[j][i] + " ");
            }System.out.println();
             }
             boolean log = false;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                 if (matriz[i][j]!= (-matriz [j][i])){
                    log= true;
                }
            }
}       if (log) {
        System.out.println("La matriz no es antisemetrica");
        } else 
            System.out.println("la matriz es antisimetrica");
    }
    
}
