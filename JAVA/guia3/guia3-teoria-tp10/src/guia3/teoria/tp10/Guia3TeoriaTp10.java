/*
 Escriba un programa que lea 20 n�meros. Si el n�mero le�do es igual a cero se
debe salir del bucle y mostrar el mensaje "Se captur� el numero cero". El
programa deber� calcular y mostrar el resultado de la suma de los n�meros
le�dos, pero si el n�mero es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package guia3.teoria.tp10;

import java.util.Scanner;

/**
 * @author Daniel Buiak Branchesi
 */
public class Guia3TeoriaTp10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int vector[] = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            if (num > 1 && num < 20) {
                vector[i] = num;
            } else {
                System.out.println("por favor ingrese un numero entre el 1 y el 20");
                num = leer.nextInt();
                vector[i] = num;
            }
        }
        System.out.println("*****************************************");
        for (int i = 0; i < 4; i++) {

            System.out.print(+vector[i] + " = ");
            for (int j = 0; j < vector[i]; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        System.out.println("**********************************************");
    }

}
