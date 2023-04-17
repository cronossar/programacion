package guia7extras.extras.tp3;

import Password.Pass;
import java.util.Scanner;

public class Guia7extrasExtrasTp3 {

    public static void main(String[] args) {
        Pass u = new Pass("123456789z", "Carlos", "23456789");
        

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("A) Ingresar contraseña");
            System.out.println("B) Analizar contraseña");
            System.out.println("C) Modificar contraseña");
            System.out.println("D) Modificar nombre");
            System.out.println("E) Modificar DNI");
            System.out.println("F) Salir");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "A":
                    System.out.println("Ingrese su contraseña:");
                    String pass = sc.nextLine();
                    u.setPass(pass);
                    break;
                case "B":
                    u.analizarPass();
                    break;
                case "C":
                    u.modificarPass();
                    break;
                case "D":
                    u.modificarNombre();
                    break;
                case "E":
                    u.modificarDni();
                    break;
                case "F":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            System.out.println();
        }
    }
}
    
    
