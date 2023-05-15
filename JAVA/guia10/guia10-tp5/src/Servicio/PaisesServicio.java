package Servicio;

import Entidad.Paises;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import static java.util.Spliterators.iterator;

public class PaisesServicio {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearPais(HashSet<Paises> paises) {
        String sal = "s";
        do {
            Paises aux = new Paises();
            System.out.println("Ingrese el nombre del País");
            aux.setNomb_pais(read.nextLine());
            System.out.println("Ingrese la cantidad de habitantes");
            aux.setCant_hab(read.nextInt());
            read.nextLine();
            paises.add(aux);

            System.out.println("Desea agregar otro País? (s/n)");
            sal = read.nextLine();

        } while (sal.equalsIgnoreCase("s"));

    }

    public void mostrarPaises(HashSet<Paises> paises) {
        for (Paises v : paises) {
            System.out.println(v.toString());
        }
    }

    //Pasar a lista el conjunto
    public void mostrarPaises2(ArrayList<Paises> paises) {
        for (Paises v2 : paises) {
            System.out.println(v2.toString());
        }
    }

    public ArrayList<Paises> ordenarAlfaXPais(HashSet<Paises> paises) {
        ArrayList<Paises> listaPaises = new ArrayList(paises);
        listaPaises.sort(Comparadores.ordenarAlfaXPais);
        mostrarPaises2(listaPaises);
        return listaPaises;
    }

    public void buscarEliminar(HashSet<Paises> paisEliminar) {
        // Uso el iterador, porque si uso FOREACH da error
        Iterator<Paises> it = paisEliminar.iterator();
        while (it.hasNext()) {
            if (it.next().getNomb_pais().equals(read.nextLine())) { // Si se cumple la condicion de encontrar "Ese apellido elegido,lo elimina)
                it.remove();
                System.out.println("El país ha sido eliminado.");
                break;

            }
        }
    }
}
