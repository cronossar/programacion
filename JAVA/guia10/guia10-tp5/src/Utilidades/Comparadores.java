package Utilidades;

import Entidad.Paises;
import java.util.Comparator;


public class Comparadores {
    //  Ordenar las pel�culas de acuerdo a su duraci�n (de mayor a menor) y mostrarlo en 
    // pantalla.
    
    public static Comparator<Paises> ordenarDuracionDescendente = new Comparator<Paises>() {
        @Override
        public int compare(Paises t1, Paises t2) {
            return t2.getNombre().compareTo(t1.getNombre());
        }
    };
    
    
    //  Ordenar las pel�culas de acuerdo a su duraci�n (de menor a mayor) y mostrarlo en 
    // pantalla
    public static Comparator<Paises> ordenarDuracionAscendete = new Comparator<Paises> () {
        @Override
        public int compare(Paises t1, Paises t2) {
            return (t1.getNombre().compareTo(t2.getNombre()));
        }
    };
    
    // Ordenar las pel�culas por t�tulo, alfab�ticamente y mostrarlo en pantalla.
    
//    public static Comparator<Paises> ordenarAlfaXTitulo= new Comparator<Paises> () {
//        @Override
//        public int compare(Paises t1, Paises t2) {
//            return t1.getTitulo().compareTo(t2.getTitulo());
//        }
//    };
//    
//    //  Ordenar las pel�culas por director, alfab�ticamente y mostrarlo en pantalla.
//    public static Comparator<Paises> ordenarAlfaXDirector= new Comparator<Paises> () {
//        @Override
//        public int compare(Paises t1, Paises t2) {
//            return t1.getDirector().compareTo(t2.getDirector());
//        }
//    };
}