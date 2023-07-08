
package entidades;

public class Asignatura {
    
    private int id;
    private String nombre;
    private String anio;

    public Asignatura(int id, String nombre, String anio) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    
}