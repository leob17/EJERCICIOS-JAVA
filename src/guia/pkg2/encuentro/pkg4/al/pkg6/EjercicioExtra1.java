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
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int tiempo=leer.nextInt();
        int dias = tiempo / 1440;
        int horas = (tiempo % 1440)/60;
        
        System.out.println(+ tiempo + " minutos equivale a " + dias + " dias " + horas + " horas" );
        
        
        
    }
    
}
