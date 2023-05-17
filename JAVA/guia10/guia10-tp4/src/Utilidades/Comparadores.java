
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;


public class Comparadores {
    //  Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
    // pantalla.
    
    public static Comparator<Pelicula> ordenarDuracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    
    //  Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
    // pantalla
    public static Comparator<Pelicula> ordenarDuracionAscendente = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return (t1.getDuracion().compareTo(t2.getDuracion()));
        }
    };
    
    // Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    
    public static Comparator<Pelicula> ordenarAlfaXTitulo= new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t1.getTitulo().compareTo(t2.getTitulo());
        }
    };
//    
//    //  Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public static Comparator<Pelicula> ordenarAlfaXDirector= new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
}