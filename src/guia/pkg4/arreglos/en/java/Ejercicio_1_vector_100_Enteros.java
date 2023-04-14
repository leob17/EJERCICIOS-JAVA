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
public class Ejercicio_1_vector_100_Enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Scanner ingreso= new Scanner (System.in, "ISO-8859-1");
        
        int [] vector= new int [100];
        
        for(int i=0 ; i<vector.length ; i++){
            vector [i] = i; 
        }
        
        
        for(int i=vector.length-1 ; i>=0 ; i--){
            System.out.println(vector[i]);
            
        }
        
    }
    
}
