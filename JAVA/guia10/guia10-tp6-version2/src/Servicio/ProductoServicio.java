
package Servicio;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {
    
    private HashMap<String, Double> productos;
    private Scanner scanner;

    public ProductoServicio() {
        this.productos = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void introducirProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        productos.put(nombre, precio);
        System.out.println("Producto agregado exitosamente.");
    }

    public void modificarPrecioProducto() {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();
        if (productos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio = scanner.nextDouble();
            scanner.nextLine();

            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio del producto modificado exitosamente.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    public void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    public void mostrarProductos() {
        System.out.println("----- PRODUCTOS -----");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String nombre = entry.getKey();
            double precio = entry.getValue();
            System.out.println("Producto: " + nombre + " - Precio: " + precio);
        }
        System.out.println("---------------------");
    }
}