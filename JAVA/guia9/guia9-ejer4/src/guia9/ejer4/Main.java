package guia9.ejer4;

import Servicio.FechaService;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
       
        FechaService servicio = new FechaService();

        System.out.println("Ingrese su fecha de nacimiento");
        Date fechaNacimiento = servicio.fechaNacimiento();

        System.out.println("Su fecha de nacimiento es: " + fechaNacimiento);

        Date fechaActual = servicio.fechaActual();

        System.out.println("La fecha actual es: " + fechaActual);

        int edad = servicio.diferencia(fechaActual, fechaNacimiento);

        System.out.println("Su edad es: " + edad + " años");
        
        
        
    }
}