
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoServicio {
    
     private List<Alumno> listaAlumnos;

    public AlumnoServicio() {
        listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = scanner.nextLine().toUpperCase();

        List<Integer> notas = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la nota " + i + " del alumno:");
            int nota = scanner.nextInt();
            notas.add(nota);
        }

        Alumno alumno = new Alumno(nombre, notas);
        listaAlumnos.add(alumno);

        System.out.println("Alumno agregado correctamente.");
    }

    public double notaFinal(String nombre) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equals(nombre)) {
                List<Integer> notas = alumno.getNotas();
                double promedio = (notas.get(0) + notas.get(1) + notas.get(2)) / 3.0;
                System.out.println("La nota final de " + nombre + " es " + promedio);
                return promedio;
            }
        }
        System.out.println("El alumno " + nombre + " no fue encontrado.");
        return -1;
    }
}