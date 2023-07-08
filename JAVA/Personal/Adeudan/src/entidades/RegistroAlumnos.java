
package entidades;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class RegistroAlumnos {
    
    private static final String URL = "jdbc:mysql://localhost:3306/asig_pendientes";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public void registrarAlumno(Alumno alumno, List<Asignatura> asignaturasAdeudadas) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String insertAlumnoQuery = "INSERT INTO alumnos (apellido, nombre, dni) VALUES (?, ?, ?)";
            PreparedStatement insertAlumnoStatement = connection.prepareStatement(insertAlumnoQuery, Statement.RETURN_GENERATED_KEYS);
            insertAlumnoStatement.setString(1, alumno.getApellido());
            insertAlumnoStatement.setString(2, alumno.getNombre());
            insertAlumnoStatement.setString(3, alumno.getDni());

            int affectedRows = insertAlumnoStatement.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Error al registrar el alumno. No se insertaron filas.");
            }

            ResultSet generatedKeys = insertAlumnoStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int alumnoId = generatedKeys.getInt(1);
                for (Asignatura asignatura : asignaturasAdeudadas) {
                    String insertAdeudoQuery = "INSERT INTO adeudos (alumno_id, asignatura_id) VALUES (?, ?)";
                    PreparedStatement insertAdeudoStatement = connection.prepareStatement(insertAdeudoQuery);
                    insertAdeudoStatement.setInt(1, alumnoId);
                    insertAdeudoStatement.setInt(2, asignatura.getId());
                    insertAdeudoStatement.executeUpdate();
                }
            } else {
                throw new SQLException("Error al registrar el alumno. No se obtuvo el ID generado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Asignatura> obtenerAsignaturas() {
        List<Asignatura> asignaturas = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM asignaturas";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String anio = resultSet.getString("anio");
                Asignatura asignatura = new Asignatura(id, nombre, anio);
                asignaturas.add(asignatura);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return asignaturas;
    }
}