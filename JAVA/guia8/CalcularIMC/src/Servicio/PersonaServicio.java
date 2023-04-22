package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public boolean esMayorDeEdad(Persona p) {
        boolean i = true;
        if (p.getEdad() >= 18) {
            i = true;
        } else {
            i = false;
        }
        return i;

    }

    public Persona crearPersona(Persona p) {
        System.out.println("Ingrese su nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        p.setEdad(leer.nextInt());

        String sexo;
        boolean tb = false;
        do {
            System.out.println("Ingrese el sexo de la persona (H/M/O)");
            sexo = leer.next();
            if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
                tb = true;
            } else {
                System.out.println("Sexo incorrecto, vuelva a intentar");
            }
        } while (tb == false);
        p.setSexo(sexo);

        System.out.println("Ingrese su peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura");
        p.setAltura(leer.nextDouble());

        return p;

    }

    public double calcularIMC(Persona imc) {
        double resultado = imc.getPeso() / (imc.getAltura() * imc.getAltura());
        System.out.println(String.format("%.0f", resultado));
        int i;
        if (resultado < 20) {
            i = -1;
        } else {
            if (resultado == 20) {
                i = 0;
            } else {
                i = 1;
            }

        }
        return i;

    }
}
