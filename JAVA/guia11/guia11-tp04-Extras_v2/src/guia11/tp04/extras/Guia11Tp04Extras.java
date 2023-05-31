package guia11.tp04.extras;

import entidades.Alumno;
import java.util.List;
import servicio.Simulador;

public class Guia11Tp04Extras {

    public static void main(String[] args) {

        Simulador simulador = new Simulador();
        simulador.generarAlumnos(10);
        simulador.imprimirAlumnos();
        System.out.println("#######################");
        System.out.println("#######################");
        simulador.recuentoVotos();
    }
}
