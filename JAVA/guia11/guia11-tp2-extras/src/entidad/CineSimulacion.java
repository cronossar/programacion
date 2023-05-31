package entidad;

import java.util.Random;

public class CineSimulacion {

    // Constantes del cine
    public  Integer FILAS = 8;
    public  Integer COLUMNAS = 6;

    // Variables del cine
    public  String[][] sala;
    public  Pelicula peliculaActual;
    public  Double precioEntrada;

    // Método para inicializar la sala de cine vacía
    public  void inicializarSala() {
        sala = new String[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                sala[i][j] = " ";
            }
        }
    }

    // Método para mostrar la sala de cine con los espectadores
    public  void mostrarSala() {
        System.out.println("Estado actual de la sala de cine:");
        System.out.println("---------------------------------");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print((FILAS - i) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    // Método para ubicar a un espectador en un asiento libre
    public  void ubicarEspectador(Espectador espectador) {
        Random random = new Random();
        int fila = random.nextInt(FILAS);
        int columna = random.nextInt(COLUMNAS);

        while (!sala[fila][columna].equals(" ")) {
            fila = random.nextInt(FILAS);
            columna = random.nextInt(COLUMNAS);
        }

        if (espectador.getDinero() >= precioEntrada && espectador.getEdad() >= peliculaActual.getEdadMinima()) {
            sala[fila][columna] = "X";
            System.out.println("¡" + espectador.getNombre() + " ha ocupado el asiento " + (FILAS - fila) + " " + (char) ('A' + columna) + "!");
        } else {
            System.out.println(espectador.getNombre() + " no cumple los requisitos para ver la película.");
        }
    }
}
