
package guia10.tp4;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;
import java.util.ArrayList;



public class Guia10Tp4 {

    public static void main(String[] args) {
        
        PeliculaServicio ps= new PeliculaServicio();
        ArrayList<Pelicula> conj_pelicula= new ArrayList<>();
        //ArrayList<Pelicula> pelicula_lista;
        Pelicula p1 = new Pelicula("La Casa Embrujada", "Raig Soton", 2);
        Pelicula p2 = new Pelicula("Rapidos y Furiosos", " Sheldon Luis", 1);
        Pelicula p3 = new Pelicula("El Silencio de los Inocentes", " Allanbourn Marcos", 1);
        Pelicula p4 = new Pelicula("Los Intocables", " Masters Allan", 3);
        conj_pelicula.add(p1);
        conj_pelicula.add(p2);
        conj_pelicula.add(p3);
        conj_pelicula.add(p4);
        
        //ps.crearPelicula(conj_pelicula);
        System.out.println("#####################################");
        ps.mostrarPeliculas(conj_pelicula);
        System.out.println("#####################################");
        //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
        //pantalla
        ps.mostrarMayorT(conj_pelicula);
        System.out.println("#####################################");
        //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
        //pantalla 
        ps.mostrarMenorT(conj_pelicula);
        System.out.println("#####################################");
        //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
        ps.ordenapTitulo(conj_pelicula);
        System.out.println("#####################################");
        //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
        ps.ordenarDirector(conj_pelicula);
    }
    
}
