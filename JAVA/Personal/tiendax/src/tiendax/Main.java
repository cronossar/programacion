
package tiendax;

import java.util.InputMismatchException;
import java.util.Scanner;
import servicios.fabricanteServicio;
import servicios.productoServicio;

public class Main {

    public static void main(String[] args) {
        productoServicio P = new productoServicio();
        fabricanteServicio F = new fabricanteServicio();
        
       Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2. Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3. Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4. Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5. Listar el nombre y el precio del producto más barato.");
            System.out.println("6. Ingresar un producto a la base de datos.");
            System.out.println("7. Ingresar un fabricante a la base de datos.");
            System.out.println("8. Editar un producto con datos a elección.");
            System.out.println("9. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        P.mostrarProducto();
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
               
              
    }
    
   }
}
 
