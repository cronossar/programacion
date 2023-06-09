
package Entidad;

public class Estudiantes {
    
    private String nombre;
    private int nota;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
}