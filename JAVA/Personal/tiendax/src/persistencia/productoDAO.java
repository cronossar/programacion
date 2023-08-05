
package persistencia;


import entidades.Producto;
import java.sql.SQLIntegrityConstraintViolationException;

public class productoDAO extends DAO{
    
  public void mostrarProducto() throws Exception{
        try {
        String sql = "SELECT * FROM tienda.Producto";
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
    
    public void modificarProducto(int cod, String nombre){
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
    
    public void agregarProducto(Producto P) throws Exception{
         try {
            String sql = "INSERT INTO tienda.fabricante (nombre) VALUES ('" + P.getNombre()
                    + "' )";
            insertarModificarEliminar(sql);
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Error: No se pudo ingresar Fabricante");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
