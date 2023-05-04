
package Entidad;
import java.util.Scanner;

public class Ahorcado {
    private char[] palabra;
    private boolean[] encontradas;
    private int intentosMaximos;
    private int intentosRestantes;

    public void crearJuego(String palabra, int intentosMaximos) {
        this.palabra = palabra.toCharArray();
        this.encontradas = new boolean[palabra.length()];
        this.intentosMaximos = intentosMaximos;
        this.intentosRestantes = intentosMaximos;
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    public boolean buscar(char letra) {
        boolean encontrado = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontradas[i] = true;
                encontrado = true;
            }
        }
        if (!encontrado) {
            intentosRestantes--;
        }
        return encontrado;
    }

    public void encontradas(char letra) {
        int encontradas = 0;
        int faltantes = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (this.encontradas[i]) {
                encontradas++;
            } else {
                faltantes++;
            }
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + encontradas + "," + faltantes + ")");
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + intentosRestantes);
    }

    public boolean juego() {
        Scanner scanner = new Scanner(System.in);
        while (intentosRestantes > 0) {
            System.out.println("Ingrese una letra:");
            char letra = scanner.nextLine().charAt(0);
            boolean encontrado = buscar(letra);
            if (encontrado) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
            } else {
                System.out.println("Mensaje: La letra no pertenece a la palabra");
            }
            encontradas(letra);
            intentos();
            if (ganado()) {
                System.out.println("¡Felicitaciones, has ganado!");
                return true;
            }
        }
        System.out.println("¡Has perdido! La palabra era: " + new String(palabra));
        return false;
    }

    private boolean ganado() {
        for (int i = 0; i < encontradas.length; i++) {
            if (!encontradas[i]) {
                return false;
            }
        }
        return true;
    }
}