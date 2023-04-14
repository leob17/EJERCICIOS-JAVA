/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
   introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
   La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que
   será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
*   0.86 libras es un 1 €
*    1.28611 $ es un 1 €
*   129.852 yenes es un 1 €

 */
package guia.encuentro.pkg7.y.pkg8;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        double monto=0;
        String moneda=null;
        
        System.out.println("Ingrese el monto de euros a convertir");
        monto=leer.nextDouble();
        System.out.println("Ingrese a que moneda desea convertir: libras, dolar o yenes");
        moneda=leer.next().toLowerCase();
        
        conversion(monto,moneda);
    }
    
    public static void conversion (double monto, String moneda){
        double nuevoMonto=0;
        boolean check=false;
        
        switch (moneda){
            case "libras": 
                nuevoMonto=monto*0.86;
                check=false;
                break;
            case "dolar":
                nuevoMonto=monto*1.28;
                break;
            case "yenes":
                nuevoMonto=monto*129.852;
                break;
            default:
                check=true;
                
                break;              
        }
   //     if (check=true){
   //         System.out.println("El valor ingresado es incorrecto");
    //    } else {
            
            System.out.println("El monto ingresado equivale a " + nuevoMonto + " " + moneda);

       // }
        
        
    }
    
    
}
