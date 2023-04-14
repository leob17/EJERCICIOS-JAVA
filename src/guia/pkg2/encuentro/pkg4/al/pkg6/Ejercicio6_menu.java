/*
 * Realizar un programa que pida dos números enteros positivos por teclado y
   muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
   y el programa deberá mostrar el resultado por pantalla y luego volver al
   menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en
   cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
   programa directamente, se debe mostrar el siguiente mensaje de 
   confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el
   usuario selecciona el carácter ‘S’ se sale del programa, caso contrario 
   se vuelve a mostrar el menú.

 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio6_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int opcion;
        double resultado;
        boolean conf=false;
       
                
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        do {
        if (num1<0){
            System.out.println("Ingrese nuevamente el primer numero");
            num1=leer.nextInt();
        }
        if (num2<0){
            System.out.println("Ingrese nuevamente el segundo numero");
            num2=leer.nextInt();
        }
        } while (num1<0 && num2<0);
        
        do {
        resultado=0;  
            
        
        System.out.println("MENU");
        System.out.println("Elija opcion");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");
        
            
            opcion=leer.nextInt();
        
       
        switch (opcion){
            case 1: 
                resultado=num1+num2;
                System.out.println("La suma de ambos numeros es "+resultado);
            break;
            case 2: 
                resultado=num1-num2;
                System.out.println("La resta de ambos numeros es "+resultado);
            break;
            case 3: 
                resultado=num1*num2;
                System.out.println("La multiplicacion de ambos numeros es "+resultado);
            break;    
            case 4: 
                resultado=num1/num2;
                System.out.println("La division de ambos numeros es "+resultado);
            break;    
            case 5: 
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String salida=leer.next();
                if (salida.equalsIgnoreCase("S")){
                    conf=true;
                    break;
                    
                } else { break;}
            default:
                System.out.println("El valor ingresado no es valido");
        }
        } while (conf==false);
    }
}
    

