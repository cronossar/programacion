
package guia10;

import Entidad.Paises;
import Servicio.PaisesServicio;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PaisesServicio ps= new PaisesServicio();
        HashSet<Paises> conj_paises= new HashSet<>();
        //Se crea arralist auxiliar para cargar la conversion de hashset a lista
        //Se convierte el conjunto a lista
        ArrayList<Paises> pais_lista = new ArrayList();
        //Creamos los paises ESTAN EN UN CONJUNTO
        //ps.crearPais(conj_paises);
        System.out.println("%%%%%%%%%%%%%%%%%%%");
        
        //mostramos los paises
        ps.mostrarPaises(conj_paises);
        System.out.println("%%%%%%%%%%%%%%%%%%%");
        
        //transformamos nuestro conjunto a lista:
        ps.mostrarPaises2(pais_lista);
        System.out.println(pais_lista);
        
        System.out.println("////////////////");
        System.out.println("Se ordenan los paises en forma ascendente");
//        pais_lista=ps.ordenarAlfaXPais(conj_paises);
//        System.out.println("%%%%%%%%%%%%%%%%%%%");
        pais_lista=ps.ordenararrAlfaXPais(conj_paises);
        System.out.println("%%%%%%%%%%%%%%%%%%%");
        System.out.println("Se ordenan los paises en forma ascendente");
        pais_lista=ps.ordenarabaAlfaXPais(conj_paises);
        System.out.println("###################");
        System.out.println("Ingrese un pais para eliminar de la lista");
        ps.buscarEliminar(conj_paises);
        System.out.println("###################");
        System.out.println("La lista resultante es. ");
        ps.mostrarPaises(conj_paises);
    }
   
}
