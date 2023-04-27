package Servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    public Date fechaNacimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primero: Ingrese su año de nacimiento: ");
        int anio = scanner.nextInt();
        System.out.print("Segundo: Ingrese su mes de nacimiento: ");
        int mes = scanner.nextInt() - 1; // Restamos 1 porque en la clase Date, los meses van de 0 a 11.
        System.out.print("Tercero: Ingrese su día de nacimiento: ");
        int dia = scanner.nextInt();
        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int diferencia(Date fecha1, Date fecha2) {
        long diff = fecha1.getTime() - fecha2.getTime();
        long millisPorAnio = 1000L * 60 * 60 * 24 * 365; // Milisegundos por año
        return (int) (diff / millisPorAnio);
    }
}
