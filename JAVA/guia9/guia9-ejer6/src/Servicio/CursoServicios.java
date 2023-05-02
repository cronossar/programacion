package Servicio;

import Entidad.Curso;
import Entidad.Curso;
import java.util.Scanner;


public class CursoServicios {
    
    Scanner leer = new Scanner(System.in);
    

    public String[] cargarAlumnos(int cantAlumnos) {
        String[] alumno = new String[cantAlumnos];
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("ingrese el nombre del alumno "+ (i+1));
            alumno[i] = leer.nextLine();
        }
        return alumno;
    }

    public Curso crearCurso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, char turno, double precioPorHora,int cantalumnos) {

        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, cargarAlumnos(cantalumnos));
    }
    
    public double calcularGananciaSemanal(Curso curso){
        
       return curso.getCantidadHorasPorDia()*curso.getCantidadDiasPorSemana()*
                curso.getAlumnos().length*curso.getPrecioPorHora();        
    }

}
