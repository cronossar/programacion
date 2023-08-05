/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.sql.SQLIntegrityConstraintViolationException;
import tienda.entidades.Producto;

/**
 *
 * @author jorge
 */
public class ProductoDAO extends DAO {

    public void seleccionarTodos() throws Exception {
        try {
            String sql = "SELECT * FROM tienda.producto";
            consultarBase(sql);
            System.out.printf("%-6s %-35s %-10s %-15s\n", "CODIGO", "NOMBRE", "PRECIO", "COD_FABRICANTE");
            System.out.println("------------------------------------------------------------------");
            while (resultado.next()) {
                System.out.printf("%-6d %-35s %-10.2f %-15d\n",
                        resultado.getInt("codigo"),
                        resultado.getString("nombre"),
                        resultado.getDouble("precio"),
                        resultado.getInt("codigo_fabricante"));
            }
            System.out.println("------------------------------------------------------------------");
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }

    public void seleccionarNombrePrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio from tienda.producto";
            consultarBase(sql);
            System.out.printf("%-35s %-10s\n", "NOMBRE", "PRECIO");
            System.out.println("------------------------------------------------------------------");
            while (resultado.next()) {
                System.out.printf("%-35s %-10.2f\n",
                        resultado.getString("nombre"),
                        resultado.getDouble("precio"));
            }
            System.out.println("------------------------------------------------------------------");
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void seleccionarPorPrecio(double precioMin, double precioMax) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN " + precioMin + " AND " + precioMax;
            consultarBase(sql);
            System.out.printf("%-6s %-35s %-10s %-15s\n", "CODIGO", "NOMBRE", "PRECIO", "COD_FABRICANTE");
            System.out.println("------------------------------------------------------------------");
            while (resultado.next()) {
                System.out.printf("%-6d %-35s %-10.2f %-15d\n",
                        resultado.getInt("codigo"),
                        resultado.getString("nombre"),
                        resultado.getDouble("precio"),
                        resultado.getInt("codigo_fabricante"));

              /*  System.out.println("Código: " + resultado.getInt("codigo")
                        + ", Nombre: " + resultado.getString("nombre")
                        + ", Precio: " + resultado.getDouble("precio")
                        + ", Código Fabricante: " + resultado.getInt("codigo_fabricante"));*/
            }
            System.out.println("------------------------------------------------------------------");
        } finally {
            desconectarBase();
        }
    }

    public void buscarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM tienda.producto WHERE nombre LIKE '%Portátil%'";
            consultarBase(sql);
            System.out.printf("%-6s %-35s %-10s %-15s\n", "CODIGO", "NOMBRE", "PRECIO", "COD_FABRICANTE");
            System.out.println("------------------------------------------------------------------");
            while (resultado.next()) {
                System.out.printf("%-6d %-35s %-10.2f %-15d\n",
                        resultado.getInt("codigo"),
                        resultado.getString("nombre"),
                        resultado.getDouble("precio"),
                        resultado.getInt("codigo_fabricante"));
            }
            System.out.println("------------------------------------------------------------------");
        } finally {
            desconectarBase();
        }
    }

    public void seleccionarProdMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM tienda.producto ORDER BY precio ASC LIMIT 1;";
            consultarBase(sql);
            System.out.printf("%-35s %-10s\n", "NOMBRE", "PRECIO");
            System.out.println("------------------------------------------------------------------");
            while (resultado.next()) {
                System.out.printf("%-35s %-10.2f\n",
                        resultado.getString("nombre"),
                        resultado.getDouble("precio"));
            }
            System.out.println("------------------------------------------------------------------");
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void ingresarProducto(Producto p) throws Exception {
        try {
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ("
                    + "'" + p.getNombre() + "',"
                    + p.getPrecio() + ","
                    + p.getCodigoFabricante() + ")";

            insertarModificarEliminar(sql);
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error: El código de fabricante no existe en la base de datos. Por favor, introduce un código de fabricante válido.");
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarProducto(Producto P) {
        try {
            String sql = "UPDATE producto SET nombre='" + P.getNombre()
                    + "', precio=" + P.getPrecio()
                    + ", codigo_fabricante=" + P.getCodigoFabricante()
                    + " WHERE codigo=" + P.getCodigo();
            insertarModificarEliminar(sql);
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error: El fabricante con el código " + P.getCodigoFabricante() + " no existe.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
