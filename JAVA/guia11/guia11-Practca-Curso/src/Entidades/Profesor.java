
package Entidades;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Profesor {
    
    private String nombre;
    private String apellido;
    
    private List <Curso> curso; 

    public Profesor() {
    }
    
    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
