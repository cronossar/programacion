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
    public static Comparator<Paises> ordenarDuracionAscendente = new Comparator<Paises> () {
        @Override
        public int compare(Paises t1, Paises t2) {
            return (t1.getNombre().compareTo(t2.getNombre()));
        }
    };
    
    // Ordenar las pel�culas por t�tulo, alfab�ticamente y mostrarlo en pantalla.
    
    public static Comparator<Paises> ordenarascHab= new Comparator<Paises> () {
        @Override
        public int compare(Paises t1, Paises t2) {
            return t1.getCant_hab().compareTo(t2.getCant_hab());
        }
    };
//    
//    //  Ordenar las pel�culas por director, alfab�ticamente y mostrarlo en pantalla.
    public static Comparator<Paises> ordenardescHab= new Comparator<Paises> () {
        @Override
        public int compare(Paises t1, Paises t2) {
            return t1.getCant_hab().compareTo(t2.getCant_hab());
        }
    };
}