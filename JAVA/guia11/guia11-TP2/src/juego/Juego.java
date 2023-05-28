package juego;

import java.util.ArrayList;
import java.util.Scanner;
import jugador.Jugador;
import revolverdeagua.RevolverDeAgua;

public class Juego {

    ArrayList<Jugador> jugadores = new ArrayList();
    RevolverDeAgua r = new RevolverDeAgua();

    public void llenarJuego() {
        Scanner leer = new Scanner(System.in);

        System.out.println("JUGUEMOS A LA RULETA RUSA");
        System.out.println("Ingrese la cantidad de Jugadores MAX= 6");
        int cantJugadores = leer.nextInt();

        for (int i = 1; i <= cantJugadores; i++) {
            Jugador n = new Jugador(i);
            //System.out.println("Ingrese el nombre del Jugador :");
            //n.setNombre(leer.next());
            jugadores.add(n);
        }
        r.llenarRevolver();
    }

    public void ronda() {
        boolean alguienMojado = false;
        //System.out.println("----------");
        for (Jugador jugador : jugadores) {
            jugador.disparo(r);
            System.out.println(jugador);
            if (jugador.getMojado()) {
                alguienMojado = true;
                break;
            }
        }
        if (!alguienMojado) {
            System.out.println("¡Nadie se MURIO! Siguiente vuelta...");
            ronda();
        } else {
            System.out.println("¡Alguien ESPICHO!");

        }
    }
}
