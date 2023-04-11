package guia7.extras.tp4;

import guia7.extras.tp4.Dinero.Cuenta;
import java.util.Scanner;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
 * de realizar una transacción de retiro.
 *
 * @author cronossar1
 */
public class Guia7ExtrasTp4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cuenta cajero1 = new Cuenta(45120.00, "Jose Fernandez");
        System.out.println(cajero1.toString());
        System.out.println("------------------");
        System.out.println("¿Cuanto dinero va a sacar de su cuenta?");
        cajero1.sacarPlata(sc.nextDouble());
        System.out.println(cajero1.toString());

    }

}
