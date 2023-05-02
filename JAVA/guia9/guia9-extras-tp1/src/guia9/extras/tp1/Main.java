package guia9.extras.tp1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[9]; // El mes secreto es octubre

        Scanner leer = new Scanner(System.in);
        String respuesta;
        boolean acertado = false;

        while (!acertado) {
            System.out.print("ADIVINA EL MES SECRETO. eSCRIBI EL MES EN minúsculas: ");
            respuesta = leer.nextLine();

            if (respuesta.equals(mesSecreto)) {
                System.out.println("¡LE PEGASTE CARAJO!");
                acertado = true;
            } else {
                System.out.println("LE ERRASTE FEO. SEGUI JUGANDO, ESCRIBIENDO OTRO MES.");
            }
        }

        //leer.close();
    }
}
