package Servicio;

import java.util.Scanner;


public class CursoServicio {
    
    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
        }
    }

    public void crearCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = scanner.nextLine();

        System.out.print("Ingrese la cantidad de horas por día: ");
        cantidadHorasPorDia = scanner.nextInt();

        System.out.print("Ingrese la cantidad de días por semana: ");
        cantidadDiasPorSemana = scanner.nextInt();

        System.out.print("Ingrese el turno (mañana o tarde): ");
        turno = scanner.next();

        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = scanner.nextDouble();

        alumnos = new String[5];
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
