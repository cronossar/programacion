package servicio;

import entidad.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class Promedio {

    private Estudiante[] estudiantes;

    public Promedio() {
        // Creamos los estudiantes con sus notas
        estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Juan", 8.5);
        estudiantes[1] = new Estudiante("Pedro", 7.8);
        estudiantes[2] = new Estudiante("María", 9.3);
        estudiantes[3] = new Estudiante("Ana", 6.5);
        estudiantes[4] = new Estudiante("Luis", 7.2);
        estudiantes[5] = new Estudiante("Sofía", 8.7);
        estudiantes[6] = new Estudiante("Carlos", 7.9);
        estudiantes[7] = new Estudiante("Laura", 9.1);
    }

    public double promedio() {
        double sumaNotas = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            sumaNotas += estudiantes[i].getNota();
        }
        return sumaNotas / estudiantes.length;
    }

    public void obtenerNombresNotasMayoresAlPromedio() {
        double promedio = promedio();
        List<String> nombresMayoresAlPromedio = new ArrayList<>();
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedio()) {
                nombresMayoresAlPromedio.add(estudiantes[i].getNombre());
            }
        }
        System.out.println("Nombres de estudiantes con calificacion mayor al promedio: " + nombresMayoresAlPromedio);
        System.out.println("#############");
   
    //public void mostrarEstudiantesNotasMayoresAlPromedio() {
        //double promedio = promedio();
        System.out.println("Los estudiantes con nota mayor al promedio son:");
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedio()) {

            }
            System.out.println(estudiantes[i].getNombre() + " - " + estudiantes[i].getNota());
        }
    }

}
