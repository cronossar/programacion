package guia3.extras.tp12;

/**
 *Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E.
 * @author Daniel Buiak Branchesi
 */
public class Guia3ExtrasTp12 {
    public static void main(String[] args) {
         
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i == 3) {
                        System.out.print("E-");
                    } else {
                        System.out.print(i + "-");
                    }
                    if (j == 3) {
                        System.out.print("E-");
                    } else {
                        System.out.print(j + "-");
                    }
                    if (k == 3) {
                        System.out.println("E");
                    } else {
                        System.out.println(k);
                    }
                }
            }
        }
    }
}
/*Se usan tres bucles for anidados para recorrer los dígitos del contador.
Dentro del bucle más interno, se verifica si el dígito actual es igual a 3 y se imprime 
una E en lugar del dígito si es así. Si el dígito no es 3, se imprime el dígito normalmente.*/