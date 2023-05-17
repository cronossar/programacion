package Utilidades;

import Entidad.Paises;
import java.util.Comparator;


public class Comparadores {
    //  Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
    // pantalla.
    
    public static Comparator<Paises> ordenarDuracionDescendente = new Comparator<Paises>() {
        @Override
        public int compare(Paises t1, Paises t2) {
            return t2.getNombre().compareTo(t1.getNombre());
        }
    };
    
    
    //  Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
    // pantalla
    public static Comparator<Paises> ordenarDuracionAscendete = new Comparator<Paises> () {
        @Override
        public int compare(Paises t1, Paises t2) {
            return (t1.getNombre().compareTo(t2.getNombre()));
        }
    };
    
    // Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    
//    public static Comparator<Paises> ordenarAlfaXTitulo= new Comparator<Paises> () {
//        @Override
//        public int compare(Paises t1, Paises t2) {
//            return t1.getTitulo().compareTo(t2.getTitulo());
//        }
//    };
//    
//    //  Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
//    public static Comparator<Paises> ordenarAlfaXDirector= new Comparator<Paises> () {
//        @Override
//        public int compare(Paises t1, Paises t2) {
//            return t1.getDirector().compareTo(t2.getDirector());
//        }
//    };
}