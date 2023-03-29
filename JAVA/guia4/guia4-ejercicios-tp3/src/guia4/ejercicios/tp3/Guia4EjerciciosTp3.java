package guia4.ejercicios.tp3;

import java.util.Scanner;

/**
 *
 * @author Daniel Buiak Branchesi
 */
public class Guia4EjerciciosTp3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cantidad en euros: ");
        double euros = scanner.nextDouble();
        System.out.print("Introduce la moneda a la que quieres convertir (dolares/yenes/libras): ");
        String moneda = scanner.next();

        convertirMoneda(euros, moneda);
    }

    public static void convertirMoneda(double euros, String moneda) {
        double resultado = 0.0;
        String simbolo = "";

        switch (moneda.toLowerCase()) {
            case "dolares":
                resultado = euros * 1.28611; // Suponiendo un tipo de cambio de 1 euro = 1.28611 dólares
                simbolo = "$";
                break;
            case "yenes":
                resultado = euros * 129.852; // Suponiendo un tipo de cambio de 1 euro = 129.852 yenes
                simbolo = "¥";
                break;
            case "libras":
                resultado = euros * 0.86; // Suponiendo un tipo de cambio de 1 euro = 0.86 libras
                simbolo = "£";
                break;
            default:
                System.out.println("Moneda no válida");
                return;
        }

        System.out.println(euros + " euros son " + simbolo + resultado + " " + moneda);
    }
}

    
  