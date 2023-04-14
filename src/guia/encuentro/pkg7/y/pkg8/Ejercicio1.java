/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
   entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
   función para cada operación matemática y deben devolver sus resultados para
   imprimirlos en el main. 
 */
package guia.encuentro.pkg7.y.pkg8;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingrese dos numeros para evaluar");
        int num1,num2;
        double resultado=0;
        String opcion="";
        Scanner ingreso = new Scanner (System.in);
        num1= ingreso.nextInt();
        num2= ingreso.nextInt();
        
        System.out.println("Ingrese  alguna opcion: M - D - R - S");
        opcion=ingreso.next();
        
        switch(opcion){
            case "M": resultado = multiplicacion(num1,num2);
            break;
            
            case "D": resultado = division(num1,num2);
            break;
            
            case "R": resultado = resta(num1,num2);
            break;
            
            case "S": resultado = suma(num1,num2);
            break;
        
        
        }
        
        System.out.println(resultado);
        
    }
    
    public static int suma(int num1 , int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    
    
    public static int resta(int num1 , int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    
    public static double division(int num1 , int num2){
        double resultado = num1 / num2;
        return resultado;
    }
    
    public static int multiplicacion(int num1 , int num2){
        int resultado = num1 * num2;
        return resultado;
    }
}
    
    

