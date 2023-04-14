/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.arreglos.en.java;

import java.util.Arrays;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realice un programa que compruebe si una matriz dada es antisimétrica.
// Se dice que una matriz A es antisimétrica cuando ésta es igual a su
// propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
// A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
// obtiene cambiando sus filas por columnas (o viceversa).
    int matriz [][]= {{0,-2,4},{2,0,2},{-4,-2,0}};
    
    int matrizt [][]= new int [3][3]; 
    for (int i=0; i < matriz.length; i++) {
    for (int j=0; j < matriz[i].length; j++) {
    matrizt[j][i] = matriz[i][j];
    }
    }   

    int matrizat [][]= new int [3][3];
    for (int i=0; i < matriz.length; i++) {
    for (int j=0; j < matriz[i].length; j++) {
    matrizat[i][j] = -matrizt[i][j];
    }
    }   
    
    System.out.println("Matriz Original");
    System.out.println(" ");
    
    for ( int i = 0; i < 3; i++) {
    for ( int j = 0; j < 3; j++) {
    System.out.print("[" + matriz[i][j] + "]");}
    System.out.println(" ");
    }
    System.out.println(" ");
    
    System.out.println("Matriz Traspuesta");
    System.out.println(" ");
    for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
    System.out.print("[" + matrizt[i][j] + "]");}
    System.out.println(" ");
    }
    System.out.println(" ");
    
    System.out.println("Matriz Antisimétrica");
    System.out.println(" ");
    for ( int i = 0; i < 3; i++) {
    for ( int j = 0; j < 3; j++) {
    System.out.print("[" + matrizat[i][j] + "]");}
    System.out.println(" ");
    }
    System.out.println(" ");
    
    //Realiza comparación.
    // Importar: import java.util.Arrays;
    if (Arrays.deepEquals(matriz, matrizat)){
    System.out.println("Son iguales");     
    }else{
    System.out.println("No son iguales");
    }
    
    
    
    
    
    }
    
}