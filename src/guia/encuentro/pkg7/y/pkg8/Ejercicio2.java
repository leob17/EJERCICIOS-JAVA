/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las
   personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada
   persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar
   cuando el usuario ingrese la palabra “No”.
 */
package guia.encuentro.pkg7.y.pkg8;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String opcion="";
        int edad;       
        Scanner ingreso= new Scanner (System.in, "ISO-8859-1");
        //, "ISO-8859-1"
        
        do{
            System.out.println("Ingrese un nombre y edad");
            
            nombre=ingreso.next();
            edad=ingreso.nextInt();
            
            acceso(edad,nombre);
            System.out.println("*********");
            System.out.println("Desea continuar? ingrese 'No' si desea salir.");
            opcion=ingreso.next();
            
        }while(!(opcion.equals("No")));
      
    }
 
  public static void acceso(int edad, String nombre){
      System.out.println("El nombre de la persona es: " + nombre);
      System.out.println("La edad ingresada es de: " + edad + " años");
      
      if(edad<18){
          System.out.println("La persona es menor de edad");
      }else{
          System.out.println("La persona es mayor de edad");
      }
      
  }
  }
    
