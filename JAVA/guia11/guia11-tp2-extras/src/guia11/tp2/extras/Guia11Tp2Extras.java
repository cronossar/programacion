
package guia11.tp2.extras;

import entidad.Espectador;
import entidad.Pelicula;
import entidad.CineSimulacion;
import java.util.Random;


public class Guia11Tp2Extras {

    public static void main(String[] args) {
        
        CineSimulacion view1 = new CineSimulacion();
        Pelicula peli1 = new Pelicula();
        
        // Inicializar el cine
        view1.inicializarSala();
        view1.peliculaActual = new Pelicula("La Película", 120, 12, "Director");
        view1.precioEntrada = 10.0;

        // Generar espectadores aleatoriamente
        Espectador[] espectadores = new Espectador[20];
        for (int i = 0; i < espectadores.length; i++) {
            String nombre = "Espectador" + (i + 1);
            int edad = new Random().nextInt(50) + 10; // Edad entre 10 y 59
            double dinero = new Random().nextDouble() * 50; // Dinero entre 0 y 50
            espectadores[i] = new Espectador(nombre, edad, dinero);
        }

        // Ubicar a los espectadores en la sala
        for (Espectador espectador : espectadores) {
            view1.ubicarEspectador(espectador);
        }

        // Mostrar la sala de cine final
        view1.mostrarSala();
    }
}