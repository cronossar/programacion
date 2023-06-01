package guia11.tp04.extras;

import entidades.Alumno;
import java.util.List;
import servicio.Simulador;
import entidades.Voto;

public class Guia11Tp04Extras {

    public static void main(String[] args) {

        Simulador simulador = new Simulador();

        simulador.generarNombres();
        simulador.generarApellidos();
        simulador.generarAlumnos(20);

        System.out.println("Listado de alumnos:");
        simulador.imprimirListadoAlumnos();

        simulador.realizarVotacion();

        System.out.println("Resultados de la votación:");
        simulador.mostrarResultadosVotacion();

        System.out.println("Recuento de votos:");
        simulador.realizarRecuentoVotos();
    }
}