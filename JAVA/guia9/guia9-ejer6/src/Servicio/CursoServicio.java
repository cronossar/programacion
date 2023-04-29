package Servicio;

import java.util.Scanner;
import Entidad.Curso;

public class CursoServicio {
    
    private Scanner scanner;
    
    public CursoServicio(){
        this.scanner = new Scanner(System.in);
    }
    
    public void cargarAlumnos(Curso cx) {
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            cx.setAlumnos(i) = scanner.nextLine();
        }
    }

    public void crearCurso(Curso cx) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        cx.setNombreCurso(scanner.nextLine());

        System.out.print("Ingrese la cantidad de horas por día: ");
        cx.setCantidadHorasPorDia(0);

        System.out.print("Ingrese la cantidad de días por semana: ");
        cx.setCantidadDiasPorSemana(scanner.nextInt());

        System.out.print("Ingrese el turno (mañana o tarde): ");
        cx.setTurno(scanner.next());

        System.out.print("Ingrese el precio por hora: ");
        cx.setPrecioPorHora(0);
        
        cargarAlumnos();
    }

    public double calcularGananciaSemanal() {
        return cantidadHorasPorDia * precioPorHora * 5 * cantidadDiasPorSemana * alumnos.length;
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
