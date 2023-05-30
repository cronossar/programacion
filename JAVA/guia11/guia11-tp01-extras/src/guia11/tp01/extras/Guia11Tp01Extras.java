package guia11.tp01.extras;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.perroServicio;
import servicio.personaServicio;

public class Guia11Tp01Extras {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Perro> muchos_guau = new ArrayList();
        ArrayList<Persona> muchas_perso = new ArrayList();

        perroServicio p1 = new perroServicio();
        personaServicio per1 = new personaServicio();

        boolean salir = true;

        //Crear tantos perros como quieras
        do {
            Perro guau1 = p1.crearperro();
            muchos_guau.add(guau1);
            System.out.println("Quiere agregar otro guauguau? S/N");
            if (scan.next().equalsIgnoreCase("N")) {
                salir = false;
            }
        } while (salir);

        System.out.println("%%%%%%%%%%%%%%%%%%%");
        boolean salir1 = true;
        //Crear tantas personas como quieras
        do {
            Persona person1 = per1.crearpersona();
            muchas_perso.add(person1);
            System.out.println("Quiere agregar otra persona? S/N");
            if (scan.next().equalsIgnoreCase("N")) {
                salir1 = false;
            }
        } while (salir1);
        System.out.println("Lista de animales");
        System.out.println(muchos_guau);
        System.out.println("Lista de personas");
        System.out.println(muchas_perso);
        System.out.println("%%%%%%%%%%");
        for (Persona persona : muchas_perso) {
            if (muchos_guau.isEmpty()) {
                System.out.println("No hay guauces para adoptar");
            } else {
                System.out.println("Podes adoptar los de la lista");
                System.out.println(muchos_guau);
                System.out.println("A cual guau elegis???");
                String adoptado = scan.next();
                //recorrer los perros para buscar el seleccionado
                for (Perro adop_pe : muchos_guau) {
                    if (adoptado.equalsIgnoreCase(adop_pe.getNombre())) {
                        persona.setPerro(adop_pe);
                        muchos_guau.remove(adop_pe);
                        System.out.println("Felicitaciones "+persona.getNombre()+" , adopto a su querido GUAU: "+adop_pe.getNombre());
                        break;
                    }else{
                        System.out.println("El guau que quiere ya no esta");
                    }
                }
            }

        }
        System.out.println("Lista de animales");
        System.out.println(muchos_guau);
        System.out.println("Lista de personas");
        System.out.println(muchas_perso);
    }
}
