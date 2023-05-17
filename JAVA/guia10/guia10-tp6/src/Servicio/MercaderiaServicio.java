
package Servicio;

import Entidad.Mercaderia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MercaderiaServicio {
    
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    private HashMap<String, Mercaderia> listaProd = new HashMap();
    public MercaderiaServicio() {
        listaProd = new HashMap<>();
    }
    
    public void crearProductos() {
        String sal = "s";
        do {
            Mercaderia aux = new Mercaderia();
            System.out.println("Ingrese el nombre del Producto");
            aux.setProducto(read.nextLine());
            read.delimiter();
            System.out.println("Ingrese el precio del producto");
            aux.setPrecio(read.nextDouble());
            read.delimiter();
            System.out.println("Desea agregar otro Producto? (s/n)");
            sal = read.nextLine();

        } while (sal.equalsIgnoreCase("s"));
}
}
