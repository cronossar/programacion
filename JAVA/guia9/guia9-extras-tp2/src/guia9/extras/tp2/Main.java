package guia9.extras.tp2;

import Entidad.Ahorcado;
import Servicio.AhorcadoService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ahorcado ahorcado = new Ahorcado();

        System.out.println("Ingrese la palabra a adivinar:");
        String palabra = scanner.nextLine();
        System.out.println("Ingrese la cantidad máxima de intentos:");
        int intentosMaximos = scanner.nextInt();

        ahorcado.crearJuego(palabra, intentosMaximos);
        ahorcado.longitud();
        ahorcado.intentos();

        while (!ahorcado.juego()) {
            System.out.println("¿Desea volver a jugar? (s/n)");
            char respuesta = scanner.next().charAt(0);
            if (respuesta != 's') {
                break;
            }
            scanner.nextLine(); // Limpiar el buffer del scanner
            System.out.println("Ingrese la palabra a adivinar:");
            palabra = scanner.nextLine();
        }
    }
}


       