package calcularimc;

import Entidades.Persona;
import Servicio.PersonaServicio;

public class CalcularIMC {

    public static void main(String[] args) {
        double[] vectorImc = new double[4];
        boolean[] vectorMayorEdad = new boolean[4];

        PersonaServicio ps = new PersonaServicio();
        /*CuentaBancaria c1 = sc.crearCuenta();*/
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        ps.crearPersona(p1);
        vectorMayorEdad[0] = ps.esMayorDeEdad(p1);
        vectorImc[0] = ps.calcularIMC(p1);

        ps.crearPersona(p2);
        vectorMayorEdad[1] = ps.esMayorDeEdad(p2);
        vectorImc[1] = ps.calcularIMC(p2);

        ps.crearPersona(p3);
        vectorMayorEdad[2] = ps.esMayorDeEdad(p3);
        vectorImc[2] = ps.calcularIMC(p3);

        ps.crearPersona(p4);
        vectorMayorEdad[3] = ps.esMayorDeEdad(p4);
        vectorImc[3] = ps.calcularIMC(p4);

        double c = 0;
        double c1 = 0;
        double c2 = 0;
        for (int i = 0; i < 4; i++) {

            if (vectorImc[i] == -1) {
                c++;

            }
            if (vectorImc[i] == 0) {
                c1++;
            }

            if (vectorImc[i] == 1) {
                c2++;
            }

        }
        System.out.println(" el porcentaje de personas con bajo imc es:" + (c / 4) * 100);
        System.out.println(" el porcentaje de personas con peso normal es :" + (c1 / 4) * 100);
        System.out.println(" el porcentaje de personas con sobrepeso es :" + (c2 / 4) * 100);

        double m = 0;
        double m1 = 0;

        for (int i = 0; i < 4; i++) {

            if (vectorMayorEdad[i] == true) {
                m++;

            }
            if (vectorMayorEdad[i] == false) {
                m1++;
            }

        }
        System.out.println(" el porcentaje de personas mayores de edad es: " + (m / 4) * 100);
        System.out.println(" el porcentaje de personas menores de edad es: " + (m1 / 4) * 100);
    }

}
