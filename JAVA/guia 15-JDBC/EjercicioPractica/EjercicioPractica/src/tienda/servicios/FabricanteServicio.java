
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    FabricanteDAO FDAO = new FabricanteDAO();

    public void mostrarFabricantes() {
        try {
            FDAO.mostrarFabricantes();
        } catch (Exception e) {
            System.out.println("Error al intentar mostrar la lista de Fabricantes");
        }
    }

    public void modificarFabricante() {
        System.out.println("Ingrese el codigo del Fabricante a modificar");
        int cod = leer.nextInt();
        System.out.println("Ingrese el nuevo nombre del Fabricante");
        String nombre = leer.next();
        try {
            FDAO.modificarFabricante(cod, nombre);
        } catch (Exception e) {
            System.out.println("Error al intentar mostrar la lista de Fabricantes");
        }
    }
    
    public void agregarFabricante(){
        Fabricante F = new Fabricante();
        System.out.println("Ingrese el nombre del nuevo Fabricante");
        F.setNombre(leer.next());
        try {
            FDAO.agregarFabricante(F);
        } catch (Exception e) {
            System.out.println("Error al intentar agregar Fabricante");
        }
    }
}
