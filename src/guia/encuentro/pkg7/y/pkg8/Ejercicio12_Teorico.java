/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.encuentro.pkg7.y.pkg8;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio12_Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros multiplos");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        chequearmultiplo(num1,num2);
        
        
        
    }
    public static void chequearmultiplo(int num1, int num2){
        if (num1%num2==0){
            System.out.println("Los numeros son multiplos");
        } else {
            System.out.println("Los numeros no son multiplos");
        }
        
        
    }
    
}
