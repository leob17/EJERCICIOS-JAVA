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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
   int cuadrado [][]= new int [3][3]; 
        System.out.println("Ingrese los nueve numeros del cuadrado");
        System.out.println(" ");

    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el número en la posición [" + i + "][" + j + "]: ");
                int num = leer.nextInt();
                while (num < 1 || num > 9) {
                    System.out.println("El número ingresado no es válido. Ingrese un número entre 1 y 9.");
                    num = leer.nextInt();
                }
                cuadrado[i][j] = num;
            }
        }
        for ( int i = 0; i < 3; i++) {
        for ( int j = 0; j < 3; j++) {
          
        System.out.print("[" + cuadrado[i][j] + "]");}
        System.out.println(" "); 
 }
        //Sumar diagonales
        int diagp=0;
        int diags=0;
        
        for (int i = 0; i < 3; i++) {
            diagp=diagp+cuadrado[i][i];
            diags=diags+cuadrado[i][3-1-i];
            
        }
        System.out.println("La suma de la diagonal principal es " + diagp);
        System.out.println("La suma de la diagonal principal es " + diags);

        //Sumar filas y columnas
        int filas=0, colum=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            filas+=cuadrado[i][j];
            colum+=cuadrado[j][i];
                
            }
            
            
        }
        System.out.println("La suma de las filas es " + filas/3);
        System.out.println("La suma de las columnas es " + colum/3);
        
        //Validamos sumas
        
        if (diagp==diags && filas/3==colum/3 && diagp==filas/3) {
            System.out.println("La matriz es magica y la suma es "+ diagp);
        } else {
            System.out.println("La matriz no es magica");
        }
        
 }
}