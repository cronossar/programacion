package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    private Ahorcado ahorcado;

    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la palabra a buscar: ");
        String palabra = scanner.nextLine().toLowerCase();

        System.out.print("Ingresa la cantidad máxima de intentos: ");
        int intentosMaximos = scanner.nextInt();

        ahorcado = new Ahorcado(palabra, intentosMaximos);
    }

    public void longitud() {
        System.out.println("La longitud de la palabra es: " + ahorcado.getPalabra().length);
    }

    public boolean buscar(String letra) {
        boolean encontrada = false;

        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (ahorcado.getPalabra()[i].equals(letra)) {
                ahorcado.getEncontradas()[i] = true;
                encontrada = true;
            }
        }

        if (!encontrada) {
            ahorcado.setIntentosActuales(ahorcado.getIntentosActuales() - 1);
        }

        return encontrada;
    }

    public void encontradas() {
        int encontradas = 0;

        for (boolean b : ahorcado.getEncontradas()) {
            if (b) {
                encontradas++;
            }
        }

        System.out.println("Letras encontradas: " + encontradas);
        System.out.println("Letras faltantes: " + (ahorcado.getPalabra().length - encontradas));
    }

    public void intentos() {
        System.out.println("Te quedan " + ahorcado.getIntentosActuales() + " intentos.");
    }

    public void juego() {
        Scanner scanner = new Scanner(System.in);

        while (ahorcado.getIntentosActuales() > 0) {
            System.out.print("Ingresa una letra: ");
            String letra = scanner.nextLine().toLowerCase();

            if (buscar(letra)) {
                System.out.println("La letra está en la palabra.");
            } else {
                System.out.println("La letra no está en la palabra.");
            }

            encontradas();

            if (ahorcado.getEncontradas().length == ahorcado.getPalabra().length) {
                System.out.println("¡Felicidades! Has encontrado la palabra.");
                break;
            }

            intentos();
        }
    }
}
