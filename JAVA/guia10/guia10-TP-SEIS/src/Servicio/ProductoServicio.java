
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ProductoServicio {
    
    private HashMap<String, Double> productos;
    private Scanner read;
    
    public ProductoServicio() {
        this.productos = new HashMap<>();
        this.read = new Scanner(System.in);
    }
    
    public void cargaMerca (){
        
            System.out.println("Ingrese el nombre del producto a guardar");
            String nombre = read.nextLine();
          
            System.out.println("Ingrese el precio del producto");
            Double precio = read.nextDouble();
           
            productos.put(nombre, precio);
            System.out.println("Producto agregado exitosamente");
            
        }
    
    public void cambiarPrecio (){
    System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = read.nextLine();
        if (productos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio = read.nextDouble();
            read.nextLine();

            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio del producto modificado exitosamente");
        } else {
            System.out.println("El producto no existe");
        }
}
    
    public void mostrarProductos (){
        System.out.println("----- LISTA DE PRODUCTOS -----");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String nombre = entry.getKey();
            double precio = entry.getValue();
            System.out.println("Producto: " + nombre + " - Precio: " + precio);
            
        }
      }
    
    public void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = read.nextLine();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado exitosamente");
        } else {
            System.out.println("El producto no existe");
        }
    }
    
}
    

