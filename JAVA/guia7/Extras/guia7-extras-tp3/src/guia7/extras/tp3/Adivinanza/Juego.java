package guia7.extras.tp3.Adivinanza;

import java.util.Random;
import java.util.Scanner;

public class Juego {

    private int jugador1;
    private int jugador2;

    public void iniciar_juego() {
        Scanner scanner = new Scanner(System.in, "ISO-8859-1");
        

        int intentosRestantes = 10;
        boolean jugador2Gano = false;

        System.out.println("�Bienvenidos al juego de adivinanza de n�meros!");
        /*System.out.println("Jugador 1, elige un n�mero entre 1 y 100:");*/
        System.out.println("El jugador 1 (la PC) cargara automaticamente un valor entre 1 y 100 para que adivines");
        Random random = new Random();
        int numeroElegido = random.nextInt(100) + 1;
        /*int numeroElegido = scanner.nextInt();*/

        while (intentosRestantes > 0 && !jugador2Gano) {
            System.out.println("Jugador 2, adivina el n�mero (tienes " + intentosRestantes + " intentos restantes):");
            int numeroAdivinado = scanner.nextInt();

            if (numeroAdivinado == numeroElegido) {
                System.out.println("�Felicitaciones, adivinaste el n�mero!");
                jugador2Gano = true;
            } else if (numeroAdivinado < numeroElegido) {
                System.out.println("El n�mero a adivinar es m�s alto");
            } else {
                System.out.println("El n�mero a adivinar es m�s bajo");
            }

            intentosRestantes--;
        }

        if (jugador2Gano) {
            jugador2++;
        } else {
            System.out.println("Lo siento, te quedaste sin intentos. El n�mero a adivinar era " + numeroElegido);
            jugador1++;
        }

        System.out.println("El n�mero de intentos necesarios fue: " + (10 - intentosRestantes));
        System.out.println("Jugador 1 ha ganado " + jugador1 + " veces y Jugador 2 ha ganado " + jugador2 + " veces.");
    }
}
