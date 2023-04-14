/*
 * Implementar un programa que le pida dos números enteros al usuario 
  y determine si ambos o alguno de ellos es mayor a 25.

 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class MatdeTrabajoEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese dos nomeros enteros");
        
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        if (num1>25 && num2<25){
            System.out.println("El primer numero ingresado es mayor a 25");
        } 
        else if (num1<25 && num2>25){
                System.out.println("El segundo numero ingresado es mayor a 25");
                    } 
        else {
                     System.out.println("Ninguno de los numeros ingresados es mayor a 25");  
            
                        }
            }
                
        }
        

    

