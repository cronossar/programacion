
package entidad;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private int id;
    private String apellido;
    private String nombre;
    private String dni;
    private List<Asignatura> asignaturasAdeudadas;

    public Alumno (int id, String apellido, String nombre, String dni) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.asignaturasAdeudadas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    

}
