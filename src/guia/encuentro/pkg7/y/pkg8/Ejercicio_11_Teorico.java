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
public class Ejercicio_11_Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String frase;
        Scanner ingreso=new Scanner(System.in);
        System.out.println("Ingrese la frase a codificar");
        frase=ingreso.nextLine().toLowerCase();
        
        
        System.out.println(descomponer(frase));    
    
}
public static String descomponer(String frase1){
    String frase2="";
    String letra="";
    for (int i = 0; i <= frase1.length()-1; i++) {
        
        
    letra=frase1.substring(i, i+1);
    
    switch(letra){
        case "a": 
            letra="@";
        break;
        
        case "e":
          letra="#";
          break;
          
        case "i":
          letra="$";
          break;
          
        case "o":
          letra="%";
          break;
          
       case "u":
          letra="*";
          break;}
     
    
    frase2= frase2.concat(letra);
    
    
    }
     return frase2;   
  
}
}

    

