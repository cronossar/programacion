
package guia3.tp.pkg03;

import Servicio.AlumnoServicio;
import java.util.Scanner;

public class Guia3Tp03 {

    public static void main(String[] args) {
        
        AlumnoServicio servicio = new AlumnoServicio();
        Scanner scanner = new Scanner(System.in);
        
        boolean seguirAgregando = true;//bandera

        while (seguirAgregando) {
            servicio.agregarAlumno();

            System.out.println("Desea agregar otro alumno? (S/N)");
            String respuesta = scanner.nextLine();
            seguirAgregando = respuesta.equalsIgnoreCase("S");
        }

        System.out.println("Ingrese el nombre del alumno a buscar:");
        String nombreBuscado = scanner.nextLine().toUpperCase();
        servicio.notaFinal(nombreBuscado);
    }
}






