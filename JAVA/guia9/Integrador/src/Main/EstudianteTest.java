package Main;

import Servicios.Escuela;

public class EstudianteTest {

    public static void main(String[] args) {

        Escuela escuela = new Escuela();
        double promedio = escuela.calcularPromedio();
        System.out.println("Promedio de notas del curso: " + promedio);

        String[] nombres = escuela.obtenerNombresNotasMayoresAlPromedio();
        System.out.println("Alumnos con notas mayores al promedio:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        escuela.mostrarEstudiantesNotasMayoresAlPromedio();
    }
}
