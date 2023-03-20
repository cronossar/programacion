/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas
 */
package guia3.extras.tp1;
/**
 * @author Daniel Buiak Branchesi
 */
import java.util.Scanner;
public class Guia3ExtrasTp1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int dias=0;
        int horas=0;
        int emin=0;
        System.out.println("Ingrese un valor en minutos");
        emin=leer.nextInt();
        dias=emin /1440;
        horas=emin /60;
        System.out.println("---------------");
        
        System.out.println(emin +" Minutos, equivalen a:  ");
        System.out.println(dias+" Dias ");
        System.out.println(horas+" Horas ");
        
        
    }
    
}
