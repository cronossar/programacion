package Servicio;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import Entidades.Persona;

public class PersonaService {
    //private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public Persona crearPersona() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el nombre de la persona: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese la fecha de nacimiento de la persona (dd/mm/yyyy): ");
    String fechaNacimientoStr = scanner.nextLine();
    Date fechaNacimiento = null;
    try {
        fechaNacimiento = new Date(fechaNacimientoStr);
    } catch (Exception e) {
        System.out.println("Fecha de nacimiento inválida. La fecha debe estar en el formato dd/mm/yyyy.");
    }
    return new Persona(nombre, fechaNacimiento);
}

public int calcularEdad(Persona persona) {
    Date fechaNacimiento = persona.getFechaNacimiento();
    Calendar calendarNacimiento = Calendar.getInstance();
    calendarNacimiento.setTime(fechaNacimiento);
    Calendar calendarActual = Calendar.getInstance();
    int anios = calendarActual.get(Calendar.YEAR) - calendarNacimiento.get(Calendar.YEAR);
    if (calendarActual.get(Calendar.MONTH) < calendarNacimiento.get(Calendar.MONTH)) {
        anios--;
    } else if (calendarActual.get(Calendar.MONTH) == calendarNacimiento.get(Calendar.MONTH)
            && calendarActual.get(Calendar.DAY_OF_MONTH) < calendarNacimiento.get(Calendar.DAY_OF_MONTH)) {
        anios--;
    }
    return anios;
}

public boolean menorQue(Persona persona, int edad) {
    int edadPersona = calcularEdad(persona);
    return edadPersona < edad;
}

public void mostrarPersona(Persona persona) {
    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
}
}