package guia7.extras.tp4.bis.cajero;

import java.util.Scanner;

public class Cuenta {

    private float saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(float saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    //Metodo
    public void retirarDinero() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular");
        this.titular = sc.next();
        System.out.println("Ingrese el saldo inicial de la cuenta");
        this.saldo = sc.nextFloat();

        float sacar = 0;

        System.out.println("Cuanto dinero sacará");

        do {
            sacar = sc.nextFloat();

            if (sacar > this.saldo || this.saldo < 0) {
                System.out.println("Su saldo no le permite esa cantidad");
                System.out.println("Ingrese un monto menor");
            }
        } while (sacar > this.saldo || this.saldo < 0);

        System.out.println("- - - - - - - - - - - - - -");

        System.out.println("Retiraste...");
        this.saldo = this.saldo - sacar;
        System.out.println("$" + sacar);

        System.out.println("- - - - - - - - - - - - - -");
        System.out.println("[titular] " + this.titular);

        System.out.println("[saldo] " + this.saldo);
        System.out.println("- - - - - - - - - - - - - -");
    }
}
