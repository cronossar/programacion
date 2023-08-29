
package tienda.persistencia;

import java.sql.SQLIntegrityConstraintViolationException;
import tienda.entidades.Fabricante;

public class FabricanteDAO extends DAO{
    
    public void mostrarFabricantes() throws Exception{
        try {
        String sql = "SELECT * FROM tienda.fabricante";
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
        } finally {
            desconectarBase();
        }
    }
    
    public void modificarFabricante(int cod, String nombre){
        try {
            String sql = "UPDATE tienda.fabricante SET nombre='" + nombre
                    + "' WHERE codigo=" + cod;
            insertarModificarEliminar(sql);
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Error: El fabricante con el código " + cod + " no existe.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void agregarFabricante(Fabricante F) throws Exception{
         try {
            String sql = "INSERT INTO tienda.fabricante (nombre) VALUES ('" + F.getNombre()
                    + "' )";
            insertarModificarEliminar(sql);
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Error: No se pudo ingresar Fabricante");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
