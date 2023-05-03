package Servicio;

import Entidad.Juego;
import java.util.Scanner;

public class JuegoServicio {
Scanner leer = new Scanner(System.in);

    public void adivinar(Juego j) {
        String opcion = "";
        do {
            System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas");
            opcion = leer.next().toLowerCase();

            if (opcion.equals(j.getMesSecreto())) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: " + opcion);
            }

        } while (!opcion.equals(j.getMesSecreto()));
    }
}
