/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package guia3.extras.tp1;
/**
 * @author Daniel Buiak Branchesi
 */
import java.util.Scanner;
public class Guia3ExtrasTp1 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un valor (Entero) de tiempo en minutos");
        int tiempo=leer.nextInt();
        
        int dias=0;
        int horas=0;
        int minutos=0;
        
            dias = tiempo/1140;
            tiempo %= 1140;
            horas = tiempo/60;
            tiempo %= 60;
            minutos = tiempo;
            System.out.println("---------------------");
            System.out.println("El total de minutos ingresados equivale a: ");
            
            System.out.println("Dias: "+dias);
            System.out.println("Horas: "+horas);
            System.out.println("Minutos: "+minutos);
         
        
    }
    
}
