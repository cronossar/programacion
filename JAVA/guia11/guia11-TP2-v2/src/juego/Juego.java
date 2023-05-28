
package juego;

import java.util.ArrayList;
import jugador.Jugador;
import revolver.Revolver;

public class Juego {
    
   private ArrayList<Jugador> jugadores;
   private Revolver revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        boolean alguienSeMojo = false;
        int jugadorActual = 0;

        while (!alguienSeMojo) {
            Jugador jugador = jugadores.get(jugadorActual);
            alguienSeMojo = jugador.disparo(revolver);

            if (alguienSeMojo) {
                System.out.println("¡El jugador " + jugador + " se ha mojado!");
            } else {
                System.out.println("El jugador " + jugador + " ha tenido suerte y no se ha mojado.");
                jugadorActual = (jugadorActual + 1) % jugadores.size();
            }
        }
    }
}