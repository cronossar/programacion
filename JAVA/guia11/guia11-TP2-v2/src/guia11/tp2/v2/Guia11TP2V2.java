
package guia11.tp2.v2;

import java.util.ArrayList;
import juego.Juego;
import jugador.Jugador;
import revolverDeAgua.RevolverDeAgua;

public class Guia11TP2V2 {

    public static void main(String[] args) {
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        RevolverDeAgua revolver = new RevolverDeAgua();

        // Agregar jugadores (m�ximo 6 jugadores, por defecto 6 si el n�mero no est� en el rango)
        int numeroJugadores = 4; // Puedes modificar este n�mero seg�n tus necesidades

        if (numeroJugadores < 1 || numeroJugadores > 6) {
            numeroJugadores = 6;
        }

        for (int i = 1; i <= numeroJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        revolver.llenarRevolver();

        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
    }
}