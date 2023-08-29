
package materias_adeudadas;
import entidad.Alumno;
import entidad.Asignatura;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entidad.ConexionMySQL;

public class Materias_Adeudadas {

    public class Main extends JFrame {
        
     private List<Alumno> listaAlumnos;
    private JComboBox<String> comboBoxAlumnos;
    private JComboBox<String> comboBoxAsignaturas;
    private JButton btnRegistrarAsignatura;

    public Main() {
        listaAlumnos = new ArrayList<>();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registro de Alumnos");
        setSize(400, 200);
        setLayout(new FlowLayout());

        comboBoxAlumnos = new JComboBox<>();
        comboBoxAsignaturas = new JComboBox<>();
        btnRegistrarAsignatura = new JButton("Registrar Asignatura");

        cargarAlumnosDesdeDB();
        cargarComboBoxAlumnos();
        cargarComboBoxAsignaturas();

        add(comboBoxAlumnos);
        add(comboBoxAsignaturas);
        add(btnRegistrarAsignatura);

        btnRegistrarAsignatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreAlumno = (String) comboBoxAlumnos.getSelectedItem();
                Alumno alumno = obtenerAlumnoPorNombre(nombreAlumno);

                if (alumno != null) {
                    String asignatura = (String) comboBoxAsignaturas.getSelectedItem();
                    alumno.agregarAsignaturaAdeudada(new Asignatura(asignatura));
                    registrarAsignaturaEnDB(alumno.getId(), asignatura);
                    JOptionPane.showMessageDialog(null, "Asignatura adeudada registrada correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el alumno seleccionado.");
                }
            }
        });
    }

    private void cargarAlumnosDesdeDB() {
        try (Connection conn = ConexionMySQL.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement("SELECT * FROM alumnos");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String apellido = resultSet.getString("apellido");
                String nombre = resultSet.getString("nombre");
                String dni = resultSet.getString("dni");
                Alumno alumno = new Alumno(id, apellido, nombre, dni);
                listaAlumnos.add(alumno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cargarComboBoxAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            comboBoxAlumnos.addItem(alumno.getApellido() + ", " + alumno.getNombre() + " (DNI: " + alumno.getDni() + ")");
        }
    }

    private void cargarComboBoxAsignaturas() {
        // Puedes agregar manualmente las asignaturas o cargarlas desde la base de datos
        comboBoxAsignaturas.addItem("Matemáticas");
        comboBoxAsignaturas.addItem("Historia");
        comboBoxAsignaturas.addItem("Física");
        // ...
    }

    private Alumno obtenerAlumnoPorNombre(String nombre) {
        for (Alumno alumno : listaAlumnos) {
            String nombreCompleto = alumno.getApellido() + ", " + alumno.getNombre() + " (DNI: " + alumno.getDni() + ")";
            if (nombreCompleto.equals(nombre)) {
                return alumno;
            }
        }
        return null;
    }

    private void registrarAsignaturaEnDB(int alumnoId, String asignatura) {
        try (Connection conn = ConexionMySQL.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement("INSERT INTO alumnos (id, asignatura) VALUES (?, ?)")) {

            statement.setInt(1, alumnoId);
            statement.setString(2, asignatura);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    }
}


