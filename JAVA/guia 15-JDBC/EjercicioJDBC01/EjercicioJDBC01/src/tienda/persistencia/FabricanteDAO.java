/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.sql.SQLIntegrityConstraintViolationException;
import tienda.entidades.Fabricante;

/**
 *
 * @author jorge
 */
public class FabricanteDAO extends DAO {

    public void ingresarFabricante(Fabricante F) throws Exception {
        try {
            String sql = "INSERT INTO tienda.fabricante (nombre) VALUES ("
                    + "'" + F.getNombre() + "'" + ")";

            insertarModificarEliminar(sql);
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error: Por favor, introduce un código de fabricante válido.");
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void mostrarFabricantes() throws Exception{
        try {
            String sql = "SELECT nombre FROM tienda.fabricante";
            consultarBase(sql);
            System.out.printf("%-6s %-35s\n", "CODIGO", "NOMBRE");
            System.out.println("-------------------------------------");
            while (resultado.next()) {
                System.out.printf("%-6d %-35s\n",
                        resultado.getInt("codigo"),
                        resultado.getString("nombre"));
            }
            System.out.println("-------------------------------------");
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }
}
