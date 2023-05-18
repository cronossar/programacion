
package guia10.tp6.version2;

import Servicio.ProductoServicio;
import java.util.Scanner;

public class Guia10Tp6Version2 {

    public static void main(String[] args) {
        
    ProductoServicio producto = new ProductoServicio();
    Scanner scanner = new Scanner(System.in);
    
    boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("----- MENU -----");
            System.out.println("1. Introducir un producto");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    producto.introducirProducto();
                    break;
                case 2:
                    producto.modificarPrecioProducto();
                    break;
                case 3:
                    producto.eliminarProducto();
                    break;
                case 4:
                    producto.mostrarProductos();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }

        System.out.println("¡Hasta luego!");
    }
 
}
