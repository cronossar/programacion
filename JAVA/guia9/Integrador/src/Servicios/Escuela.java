package Servicios;

import Entidades.Estudiante;
import java.util.ArrayList;

public class Escuela {

    private Estudiante[] estudiantes;

    public Escuela() {
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
    //ForEach
    public double calcularPromedio() {
        double sumatoria = 0;
        for (Estudiante e : estudiantes) {
            sumatoria += e.getNota();
        }
        return sumatoria / estudiantes.length;
    }

    public String[] obtenerNombresNotasMayoresAlPromedio() {
        double promedio = calcularPromedio();
        ArrayList<String> nombres = new ArrayList<>();
        for (Estudiante e : estudiantes) {
            if (e.getNota() > promedio) {
                nombres.add(e.getNombre());
            }
        }
        return nombres.toArray(new String[nombres.size()]);
    }

    public void mostrarEstudiantesNotasMayoresAlPromedio() {
        double promedio = calcularPromedio();
        System.out.println("Estudiantes con notas mayores al promedio:");
        for (Estudiante e : estudiantes) {
            if (e.getNota() > promedio) {
                System.out.println(e.getNombre() + " - " + e.getNota());
            }
        }
    }
}
