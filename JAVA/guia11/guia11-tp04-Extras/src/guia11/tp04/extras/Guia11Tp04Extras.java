package guia11.tp04.extras;

import entidades.Alumno;
import java.util.List;
import servicio.Simulador;

public class Guia11Tp04Extras {

    public static void main(String[] args) {

        Simulador simulador = new Simulador();
        
        List<Alumno> alumnos = simulador.generarListadoAlumnos(20);
        List<Integer> dnis = simulador.generarListadoDnis(20, 10000000, 99999999);
        
        simulador.asignarDatosAlumnos(alumnos, dnis);
        
        System.out.println("Listado de alumnos:");
        simulador.imprimirListadoAlumnos(alumnos);
        
        simulador.votacion(alumnos);
        
        System.out.println("Resultados de la votación:");
        simulador.mostrarResultados(alumnos);
        
        simulador.contarVotos(alumnos);
        
        System.out.println("Facilitadores y facilitadores suplentes:");
        simulador.mostrarFacilitadores(alumnos);
    }
}