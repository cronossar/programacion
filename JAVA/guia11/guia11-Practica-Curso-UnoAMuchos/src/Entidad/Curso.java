
package Entidad;

import java.util.List;

public class Curso {
    
    private int año;
    private char division;
    private List<Alumno> alumnos;
    
    public List<Alumno> getAlumnos() {
    return alumnos;
}
    public void setAlumno(List<Alumno> alumnos){
        this.alumnos = alumnos;
    }
  
}
