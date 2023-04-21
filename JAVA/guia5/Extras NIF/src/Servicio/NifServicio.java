
package Servicio;

import Entidad.Nif;
import java.util.Scanner;

public class NifServicio {
    private static final char[] LETRAS_NIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public Nif crearNif() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de DNI: ");
        long numero = scanner.nextLong();

        int posicion = (int) (numero % 23);
        char letra = LETRAS_NIF[posicion];

        return new Nif(numero, letra);
    }

    public void mostrar(Nif nif) {
        System.out.println(nif.toString());
    }
}

