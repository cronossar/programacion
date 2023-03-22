/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
*/
package guia3.extras.tp6;
import java.util.Scanner;
/**
 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "ISO8859-1");
        int cantidad;
        double estatura, cantidad160, suma, suma160;
        String tecla_repetir;
        cantidad = 0;
        cantidad160=0;
        suma=0;
        suma160=0;
        
        do {
            System.out.print("Ingresa el valor de estatura: ");
            estatura = in.nextDouble();
            in.nextLine();
            
            if (estatura > 1.60 ){
            suma = suma+estatura;
            cantidad=cantidad+1;
            }if(estatura < 1.60 ){
            suma160=suma160+estatura;
            cantidad160=cantidad160+1;}
       
            
            System.out.println();
            do {
                System.out.print("Deseas repetir el proceso? (S/N): ");
                tecla_repetir = in.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        
        } while (tecla_repetir.equalsIgnoreCase("s"));
        
        
        System.out.println("Valor de cantidad: " + cantidad);
        System.out.println("Valor de promedio: " + suma/cantidad);
        System.out.println("Valor de cantidad 160: " + cantidad160);
        System.out.println("Valor de promedio 160: " + suma160/cantidad160);
        
    }

}