
package servicios;

import entidades.Producto;
import java.util.Scanner;
import persistencia.productoDAO;

public class productoServicio {
    
  Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    productoDAO PDAO = new productoDAO();

    public void mostrarProducto() {
        try {
            PDAO.mostrarProducto();
        } catch (Exception e) {
            System.out.println("Error al intentar mostrar la lista de Fabricantes");
        }
    }

    public void modificarProducto() {
        System.out.println("Ingrese el codigo del Fabricante a modificar");
        int cod = leer.nextInt();
        System.out.println("Ingrese el nuevo nombre del Fabricante");
        String nombre = leer.next();
        try {
            PDAO.modificarProducto(cod, nombre);
        } catch (Exception e) {
            System.out.println("Error al intentar mostrar la lista de Fabricantes");
        }
    }
    
    public void agregarProducto(){
        Producto P = new Producto();
        System.out.println("Ingrese el nombre del nuevo Fabricante");
        P.setNombre(leer.next());
        try {
            PDAO.agregarProducto(P);
        } catch (Exception e) {
            System.out.println("Error al intentar agregar Fabricante");
        }
    }
}
