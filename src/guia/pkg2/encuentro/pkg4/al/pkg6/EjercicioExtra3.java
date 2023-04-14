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
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese una Letra");
        String Letra = leer.next().toLowerCase();
        
        if (Letra.equals("a")||Letra.equals("e")||Letra.equals("i")||Letra.equals("o")||Letra.equals("u")) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra no es una vocal");
        }
    }
    
}
