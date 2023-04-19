
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
        
    //Metodos
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public void crearPersona(Persona persona) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        persona.setNombre(scanner.nextLine());
        System.out.print("Introduce la edad: ");
        persona.setEdad(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Introduce el sexo (H/M/O): ");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.print("Sexo no válido, introduce H, M o O: ");
            sexo = scanner.nextLine().toUpperCase().charAt(0);
        }
        persona.setSexo(sexo);
        System.out.print("Introduce el peso (en kg): ");
        persona.setPeso(scanner.nextDouble());
        System.out.print("Introduce la altura (en m): ");
        persona.setAltura(scanner.nextDouble());
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1; // Por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // En el peso ideal
        } else {
            return 1; // Con sobrepeso
        }
    }
}