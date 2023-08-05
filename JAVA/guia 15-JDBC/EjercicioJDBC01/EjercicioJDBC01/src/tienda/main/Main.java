/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.main;

import java.util.Scanner;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio PS = new ProductoServicio();
        FabricanteServicio FS = new FabricanteServicio();
        boolean salir = true;

        do {
            System.out.println("--------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("--------------");
            System.out.println("1- Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2- Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3- Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4- Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5- Listar el nombre y el precio del producto más barato.");
            System.out.println("6- Ingresar un producto a la base de datos.");
            System.out.println("7- Ingresar un fabricante a la base de datos");
            System.out.println("8- Listar Todos los Fabricantes");
            System.out.println("9- Editar un producto con datos a elección.");
            System.out.println("0- SALIR");
            System.out.println("--------------");

            System.out.println("Ingrese la opcion deseada: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    PS.seleccionarTodos();
                    break;
                case 2:
                    PS.seleccionarNombrePrecio();
                    break;
                case 3:
                    PS.seleccionarPorPrecio();
                    break;
                case 4:
                    PS.buscarPortatiles();
                    break;
                case 5:
                    PS.seleccionarProdMasBarato();
                    break;
                case 6:
                    PS.ingresarProducto();
                    break;
                case 7:
                    FS.ingresarFabricante();
                    break;
                case 8:
                    FS.mostrarFabricantes();
                    break;
                case 9:
                    PS.editarProducto();
                    break;
                case 0:
                    System.out.println("Usted ingresó SALIR, muchas gracias!!!");
                    salir = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
            }
        } while (salir);

    }
}
