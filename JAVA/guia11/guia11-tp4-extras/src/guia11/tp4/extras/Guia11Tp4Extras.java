
package guia11.tp4.extras;

import entidad.Alumno;
import java.util.List;
import servicio.Simulador;

public class Guia11Tp4Extras {

    public static void main(String[] args) {
        
        Simulador simulador = new Simulador();

        List<Alumno> alumnos = simulador.generarListadoAlumnos(20);
        simulador.imprimirListadoAlumnos(alumnos);

        simulador.votacion(alumnos);

        System.out.println("\nResultados de la votación:");
        simulador.recuentoVotos(alumnos);
    }
}