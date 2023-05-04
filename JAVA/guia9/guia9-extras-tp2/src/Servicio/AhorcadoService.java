package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    private Ahorcado ahorcado;

    public void crearJuego() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra a buscar:");
        String palabra = sc.nextLine();
        int longitudPalabra = palabra.length();
        int intentosMaximos;
        do {
            System.out.println("Ingrese la cantidad máxima de intentos:");
            intentosMaximos = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
        } while (intentosMaximos <= 0);
        ahorcado = new Ahorcado(longitudPalabra, intentosMaximos);
        for (int i = 0; i < longitudPalabra; i++) {
            ahorcado.setLetra(i, palabra.charAt(i));
        }
        System.out.println("Juego creado con éxito.");
    }

    public void longitud() {
        System.out.println("La longitud de la palabra a buscar es " + ahorcado.longitudPalabra() + ".");
    }

    public boolean buscar(char letra) {
        boolean encontrada = ahorcado.buscar(letra);
        if (encontrada) {
            System.out.println("La letra '" + letra + "' está en la palabra.");
        } else {
            System.out.println("La letra '" + letra + "' no está en la palabra.");
        }
        return encontrada;
    }

    public void encontradas(char letra) {
        int letrasEncontradas = ahorcado.getLetrasEncontradas();
        int letrasFaltantes = ahorcado.longitudPalabra() - letrasEncontradas;
        System.out.println("Se han encontrado " + letrasEncontradas + " letras y faltan " + letrasFaltantes + ".");
        if (!buscar(letra)) {
            int intentosRestantes = ahorcado.getIntentosRestantes();
            System.out.println("Te quedan " + intentosRestantes + " intentos.");
        }
    }

    public void intentos() {
        System.out.println("Te quedan " + ahorcado.getIntentosRestantes() + " intentos.");
    }
}
