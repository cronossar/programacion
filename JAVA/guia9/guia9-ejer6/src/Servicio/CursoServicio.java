package Servicio;

import java.util.Scanner;
//import Entidad.Curso;
public class CursoServicio {
    
        
    // M�todo para cargar los nombres de los alumnos
    public String[] cargarAlumnos(String[] alumnos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los nombres de los 5 alumnos:");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Alumno " + (i+1) + ": ");
            alumnos[i] = sc.nextLine();
        }
    

    // M�todo para crear un curso
    public void crearCurso() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del curso: ");
        setNombreCurso(sc.nextLine());
        System.out.print("Ingrese la cantidad de horas por d�a: ");
        sx.setCantidadHorasPorDia(sc.nextInt());
        System.out.print("Ingrese la cantidad de d�as por semana: ");
        sx.setCantidadDiasPorSemana(sc.nextInt());
        System.out.print("Ingrese el turno (ma�ana o tarde): ");
        sx.setTurno(sc.next());
        System.out.print("Ingrese el precio por hora: ");
        sx.setPrecioPorHora(sc.nextDouble());

        // Cargamos los nombres de los alumnos
        cargarAlumnos();
    }

    // M�todo para calcular la ganancia semanal
    public double calcularGananciaSemanal() {
        double gananciaSemanal = sx.cantidadHorasPorDia() * sx.precioPorHora() * sx.cantidadDiasPorSemana() * sx.alumnos.length;
        return gananciaSemanal;
    }
}

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", cantidadHorasPorDia=" + cantidadHorasPorDia +
                ", cantidadDiasPorSemana=" + cantidadDiasPorSemana +
                ", turno='" + turno + '\'' +
                ", precioPorHora=" + precioPorHora +
                ", alumnos="

    
    }
