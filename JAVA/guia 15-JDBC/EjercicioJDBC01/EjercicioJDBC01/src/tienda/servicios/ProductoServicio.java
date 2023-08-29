/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author jorge
 */
public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ProductoDAO PDAO = new ProductoDAO();

    public void seleccionarTodos() {
        System.out.println("LISTA DE PRODUCTOS");
        try {
            PDAO.seleccionarTodos();
        } catch (Exception e) {
            System.out.println("Error al intentar listar todos los productos: " + e.getMessage());
        }
    }

    public void seleccionarNombrePrecio() {
        try {
            PDAO.seleccionarNombrePrecio();
        } catch (Exception e) {
            System.out.println("Error al intentar listar los productos: " + e.getMessage());
        }
    }

    public void seleccionarPorPrecio() throws Exception {
        try {
            System.out.println("Seleccione el precio Mínimo");
            double precioMin = leer.nextDouble();
            System.out.println("Seleccione el precio Máximo");
            double precioMax = leer.nextDouble();
            PDAO.seleccionarPorPrecio(precioMin, precioMax);
        } catch (Exception e) {
            System.out.println("Error al intentar listar los productos: " + e.getMessage());
        }
    }

    public void buscarPortatiles() {
        try {
            PDAO.buscarPortatiles();
        } catch (Exception e) {
            System.out.println("Error al intentar listar los productos: " + e.getMessage());
        }
    }

    public void seleccionarProdMasBarato() {
        try {
            PDAO.seleccionarProdMasBarato();
        } catch (Exception e) {
            System.out.println("Error al intentar listar los productos: " + e.getMessage());
        }
    }

    public void ingresarProducto() throws Exception {
        System.out.println("CARGAR UN PRODUCTO NUEVO");
        Producto P = new Producto();
        System.out.println("Ingrese nombre del Producto");
        P.setNombre(leer.next());
        System.out.println("Ingrese el Precio");
        P.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el Codigo del Fabricante");
        P.setCodigoFabricante(leer.nextInt());
        try {
            PDAO.ingresarProducto(P);
        } catch (Exception e) {
            System.out.println("Error al intentar ingresar el producto: " + e.getMessage());
        }
    }

    public void editarProducto() {
        System.out.println("EDITAR UN PRODUCTO");
        Producto P = new Producto();
        System.out.println("Seleccione el Codigo del Producto a Editar");
        P.setCodigo(leer.nextInt());
        System.out.println("Ingrese el Nombre del Producto");
        P.setNombre(leer.next());
        System.out.println("Ingrese el Precio");
        P.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el Código del Fabricante");
        P.setCodigoFabricante(leer.nextInt());
        try {
            PDAO.editarProducto(P);
        } catch (Exception e) {
            System.out.println("Error al intentar editar el producto: " + e.getMessage());
        }
    }
}
