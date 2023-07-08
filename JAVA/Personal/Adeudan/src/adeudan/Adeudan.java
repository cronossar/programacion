
package adeudan;
import entidades.Alumno;
import entidades.Asignatura;
import entidades.RegistroAlumnos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Adeudan {

    public static void main(String[] args) {
        
       RegistroAlumnos registroAlumnos = new RegistroAlumnos();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el apellido del alumno: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el DNI del alumno: ");
        String dni = scanner.nextLine();

        Alumno alumno = new Alumno(apellido, nombre, dni);

        List<Asignatura> asignaturas = registroAlumnos.obtenerAsignaturas();
        System.out.println("Seleccione las asignaturas adeudadas (ingrese los números separados por comas):");

        for (int i = 0; i < asignaturas.size(); i++) {
            Asignatura asignatura = asignaturas.get(i);
            System.out.println((i + 1) + ". " + asignatura.getNombre()+ asignatura.getAnio());
        }

        String input = scanner.nextLine();
        String[] numeros = input.split(",");
        List<Asignatura> asignaturasAdeudadas = new ArrayList<>();

        for (String numero : numeros) {
            int index = Integer.parseInt(numero.trim()) - 1;
            if (index >= 0 && index < asignaturas.size()) {
                Asignatura asignatura = asignaturas.get(index);
                asignaturasAdeudadas.add(asignatura);
            }
        }

        registroAlumnos.registrarAlumno(alumno, asignaturasAdeudadas);

        System.out.println("Alumno registrado exitosamente.");
    }
}