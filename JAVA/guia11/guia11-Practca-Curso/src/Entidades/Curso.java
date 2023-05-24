
package Entidades;

import java.util.Locale;
import java.util.Scanner;

public class Curso {
    
    private int curso;
    private char division;
    private Profesor profesor;
    
    
    public Curso() {
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        this.profesor = p;
    }
    
    // Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
}
    
    