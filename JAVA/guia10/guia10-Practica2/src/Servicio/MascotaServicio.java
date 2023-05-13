package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MascotaServicio {
    private ArrayList<String> perros;
    private Scanner scanner;

    public MascotaServicio() {
        perros = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {
        boolean salir = false;

        while (!salir) {
            System.out.print("Introduce una raza de perro: ");
            String nombre = scanner.nextLine();
            perros.add(nombre);
            
            System.out.print("Introduce una raza de perro: ");
            String raza = scanner.nextLine();
            perros.add(raza);
            
            System.out.print("Introduce una raza de perro: ");
            String apodo = scanner.nextLine();
            perros.add(apodo);
            
            System.out.print("Introduce una raza de perro: ");
            String peso = scanner.nextLine();
            perros.add(peso);

            System.out.print("¿Quieres introducir otro perro? (s/n): ");
            String opcion = scanner.nextLine();

            if (opcion.equals("n")|opcion.equals("N")) {
                salir = true;
            }
        }

        System.out.println("Los perros que has introducido son: ");
        for (String perro : perros) {
            System.out.println("- " + perro);
        }

        System.out.print("Introduce el nombre de un perro para eliminar: ");
        String perroAEliminar = scanner.nextLine();

//        Recorre la lista perros con un Iterator, buscando el perro introducido por el usuario.
//        Si lo encuentra, lo elimina de la lista.
        Iterator<String> iterator = perros.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            String perro = iterator.next();
            if (perro.equals(perroAEliminar)) {
                iterator.remove();
                encontrado = true;
            }
        }

        Collections.sort(perros);//Ordena la lista

        if (encontrado) {
            System.out.println("La lista de perros actualizada es: ");
        } else {
            System.out.println("El perro introducido no está en la lista. La lista de perros es: ");
        }

        for (String perro : perros) {
            System.out.println("- " + perro);
        }
    }
}