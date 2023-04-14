/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
   cada una. A continuación, realizar las instrucciones necesarias para que: B tome el valor 
   de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los
   valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia.pkg2.encuentro.pkg4.al.pkg6;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int A,B,C,D,Aux;
        
        System.out.println("Ingrese 4 Valores");
        A=leer.nextInt();
        B=leer.nextInt();
        C=leer.nextInt();
        D=leer.nextInt();
        System.out.println("ANTES");
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        System.out.println("D="+D);
        Aux=B;
        A=D;
        B=C;
        C=D;
        D=Aux;
        System.out.println("DESPUES");
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        System.out.println("D="+D);
        
        
    }
    
}
