
package guia10.tp6;

import Servicio.MercaderiaServicio;
import java.util.Scanner;

public class Guia10Tp6 {

    public static void main(String[] args) {
        
        MercaderiaServicio servicio = new MercaderiaServicio();
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
                    servicio.introducirProducto();
                    break;
                case 2:
                    servicio.modificarPrecioProducto();
                    break;
                case 3:
                    servicio.eliminarProducto();
                    break;
                case 4:
                    servicio.mostrarProductos();
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