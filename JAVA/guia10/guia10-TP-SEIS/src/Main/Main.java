package Main;

import Servicio.ProductoServicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ProductoServicio p = new ProductoServicio();
        Scanner read = new Scanner(System.in);
        
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
            opcion = read.nextInt();
            read.nextLine();

            switch (opcion) {
                case 1:
                    p.cargaMerca();
                    break;
                case 2:
                    p.cambiarPrecio();
                    break;
                case 3:
                    p.eliminarProducto();
                    break;
                case 4:
                    p.mostrarProductos();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
        
    }
    
}
