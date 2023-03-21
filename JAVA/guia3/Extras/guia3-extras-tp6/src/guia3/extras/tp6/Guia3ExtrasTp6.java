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
        Scanner in = new Scanner(System.in);
        int cantidad;
        double estatura, promedio;
        String tecla_repetir;
        cantidad = 0;
        promedio = 0;
        do {
            System.out.print("Ingresa el valor de estatura: ");
            estatura = in.nextDouble();
            in.nextLine();
            promedio=promedio+estatura;
            cantidad=cantidad+1;
            System.out.println();
            do {
                System.out.print("\u00BFDeseas repetir el proceso? (S/N): ");
                tecla_repetir = in.nextLine();
            } while (!tecla_repetir.equalsIgnoreCase("s") && !tecla_repetir.equalsIgnoreCase("n"));
        } while (tecla_repetir.equalsIgnoreCase("s"));
        if (cantidad == 0) {
            promedio = 0;
        } else {
            promedio=promedio/cantidad;
        }
        System.out.println("Valor de cantidad: " + cantidad);
        System.out.println("Valor de promedio: " + promedio);
    }

}