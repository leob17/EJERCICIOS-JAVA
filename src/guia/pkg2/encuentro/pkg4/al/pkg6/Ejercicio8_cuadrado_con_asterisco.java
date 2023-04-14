/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
   Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
   lo siguiente:
    * * * * *
    *       *
    *       *
    * * * * *

 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio8_cuadrado_con_asterisco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int i,j;
        System.out.println("Ingrese N");
        int N=leer.nextInt();
        
        for (i=1 ; i<=N ;i++){
            for (j=1 ; j<=N ; j++){
                if (i==1 || j==1 || i==N || j==N){
                System.out.print("* ");
            } else {
                    System.out.print("  ");
                }
                
        }
            System.out.println();
            
        }
    }
    }
    

