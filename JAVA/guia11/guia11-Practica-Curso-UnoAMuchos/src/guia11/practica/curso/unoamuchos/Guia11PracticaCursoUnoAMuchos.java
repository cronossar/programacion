
package guia11.practica.curso.unoamuchos;

import Entidad.Alumno;
import Entidad.Curso;
import java.util.ArrayList;

public class Guia11PracticaCursoUnoAMuchos {

    public static void main(String[] args) {
        
////UNO A MUCHOS Por cada objeto tenemos una relación con muchos objetos de una clase.
//Ejemplo: para un curso //tengo muchos alumnos. En java para guardar varios objetos de una
//clase utilizamos colecciones. Y //como las listas son las colecciones más rápidas
//de llenar, utilizamos una lista. 
////   
    
    Alumno alumno1 = new Alumno();
    alumno1.setNombre("Agustina");
    alumno1.setApellido("Gado");
    
    ArrayList<Alumno> alu = new ArrayList();
    alu.add(alumno1);//cargamos el alumno a la lista
    Curso curso1 = new Curso();
    curso1.setAlumno(alu);//seteamos lista alumnos al curso
    
    }
    
}
