package Servicio;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    private Scanner scanner;

    public PersonaService() {
        this.scanner = new Scanner(System.in);
    }

    public Persona crearPersona() {
        scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
        String fechaString = scanner.nextLine();
        Date fechaNacimiento = convertirFecha(fechaString);
        return new Persona(nombre, fechaNacimiento);
    }
    
    public int calcularEdad(Date fechaNacimiento) {
        LocalDate fechaNac = convertirFechaLocalDate(fechaNacimiento);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNac, fechaActual);
        return periodo.getYears();
    }
    
    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calcularEdad(persona.getFechaNacimiento());
        return edadPersona < edad;
    }
    
    public void mostrarPersona(Persona persona) {
        int edad = calcularEdad(persona.getFechaNacimiento());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + edad);
    }
    
    private Date convertirFecha(String fechaString) {
        String[] partes = fechaString.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]) - 1;
        int anio = Integer.parseInt(partes[2]) - 1900;
        return new Date(anio, mes, dia);
    }
    
    private LocalDate convertirFechaLocalDate(Date fecha) {
        return new java.sql.Date(fecha.getTime()).toLocalDate();
    }
}