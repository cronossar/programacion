package ejemplolecturayentrada;

import static com.sun.tools.javac.util.StringUtils.toLowerCase;
import static com.sun.tools.javac.util.StringUtils.toUpperCase;
import java.util.Scanner; // Este es el importe de la clase Scanner

public class EjemploScanner {

    public static void main(String[] args) {

        //función toUpperCase() y toLowerCase() en Java
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        System.out.println("INGRESA UNA FRASE"); //lee el ingreso de teclado
        String frase = leer.nextLine(); 
        System.out.println("La frase ingresada, pasa toda a MAYUSCULAS ");
        System.out.println("USAMOS LA FUNCIÓN: Uppercase ");
        frase = toUpperCase(frase);
        System.out.println(frase);
        System.out.println("La frase ingresada, pasa toda a MINUSCULAS ");
        System.out.println("USAMOS LA FUNCION: LowerCase ");
        frase = toLowerCase(frase);
        System.out.println(frase);

    }

}
