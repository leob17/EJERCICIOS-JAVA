/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre 1 y 10");
        int num=leer.nextInt();
        switch(num){
            case 1:
                System.out.println("El numero ingresado escrito es numeros romanos es: I");
                break;
            case 2:
                System.out.println("El numero ingresado escrito es numeros romanos es: II");
                break;
            case 3:
                System.out.println("El numero ingresado escrito es numeros romanos es: III");
                break;  
            case 4:
                System.out.println("El numero ingresado escrito es numeros romanos es: III");
                break;
            case 5:
                System.out.println("El numero ingresado escrito es numeros romanos es: IV");
                break;
            case 6:
                System.out.println("El numero ingresado escrito es numeros romanos es: VI");
                break;
            case 7:
                System.out.println("El numero ingresado escrito es numeros romanos es: VII");
                break;
            case 8:
                System.out.println("El numero ingresado escrito es numeros romanos es: VIII");
                break;
            case 9:
                System.out.println("El numero ingresado escrito es numeros romanos es: VIII");
                break;
            case 10:
                System.out.println("El numero ingresado escrito es numeros romanos es: VIII");
                break;
            default:
                System.out.println("La opcion ingresada no es correcta");
            
        }
        
    }
    
}
