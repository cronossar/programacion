package guia7.extras.tp3;

import guia7.extras.tp3.Adivinanza.Juego;

/**
 * Crea una clase "Juego" que tenga un m�todo "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de n�meros. El primer jugador elige un
 * n�mero y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * n�mero limitado de intentos y recibe una pista de "m�s alto" o "m�s bajo"
 * despu�s de cada intento. El juego termina cuando el segundo jugador adivina
 * el n�mero o se queda sin intentos. Registra el n�mero de intentos necesarios
 * para adivinar el n�mero y el n�mero de veces que cada jugador ha ganado.
 *
 * @author cronossar1
 */
public class Guia7ExtrasTp3 {

    public static void main(String[] args) {

        Juego juego = new Juego();
        juego.iniciar_juego();
    }

}
