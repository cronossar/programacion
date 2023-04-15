package Password;

import java.util.Scanner;

public class Pass {
    private String pass;
    private String nombre;
    private String dni;

    public Pass() {
    }

    public Pass(String pass, String nombre, String dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = null;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    public void setPassword(String pass) {
        if (pass.length() == 10) {
            this.pass = pass;
        } else {
            System.out.println("La contraseña debe tener una longitud de 10 caracteres.");
        }
    }

    public void analizarPass() {
        if (pass.contains("z")) {
            if (pass.replaceAll("[^a]", "").length() >= 2) {
                System.out.println("El nivel de la contraseña es ALTO");
            } else {
                System.out.println("El nivel de la contraseña es MEDIO");
            }
        } else {
            System.out.println("El nivel de la contraseña es BAJO");
        }
    }

    public void modificarNombre() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su contraseña:");
        String pass = sc.nextLine();

        if (pass.equals(password)) {
            System.out.println("Ingrese su nuevo nombre:");
            String nombre = sc.nextLine();
            setNombre(nombre);
        } else {
            System.out.println("Contraseña incorrecta. No se permiten cambios.");
        }
    }

    public void modificarDni() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su contraseña:");
        String pass = sc.nextLine();

        if (pass.equals(password)) {
            System.out.println("Ingrese su nuevo DNI:");
            String dni = sc.nextLine();
            setDni(dni);
        } else {
            System.out.println("Contraseña incorrecta. No se permiten cambios.");
        }
    }
    
}
