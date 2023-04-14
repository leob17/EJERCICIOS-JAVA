/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
   este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
   deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
   de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
   Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
   especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
   distinta de FDE, que no respete el formato se considera incorrecta.
   Al finalizar el proceso, se imprime un informe indicando la cantidad de
   lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá
   investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Ejercicio7_RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contadorok=0, contadornook=0;
        String cadena;
         Scanner leer=new Scanner(System.in);
         
         do {
             System.out.println("Ingrese una cadena de 5 caracteres de largo");
             cadena=leer.next();
             if (cadena.equals("&&&&&")){
                 break;
             }
             if (cadena.length()==5 && cadena.toUpperCase().substring(0,1).equals("X")&& cadena.toUpperCase().substring(4,5).equals("O")) {
             contadorok++;       
             
             } else { 
                 contadornook++;
             }
          
         } while(!cadena.equals("&&&&&"));
             
         System.out.println("La cantidad de cadenas correctas es: "+contadorok);
         System.out.println("La cantidad de cadenas incorrectas es: "+contadornook);
             
             
             
         
         
         
         
    
    }  
}
