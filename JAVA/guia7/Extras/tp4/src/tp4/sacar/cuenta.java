package tp4.sacar;
import java.util.Scanner;
public class cuenta {
    
    /*
    Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
    Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
    dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
    después de realizar una transacción de retiro.
     */
    Scanner leer = new Scanner(System.in);
    private double saldo;
    private String titular;

    public cuenta() {
    }

    public cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirar_dinero() {
        System.out.println("Ingresar nombre del titular...");
        this.titular = leer.nextLine();
        System.out.println("- - - - - - - - - - - - - -");
        
        System.out.println("[titular] " +this.titular);
        this.saldo = (int)(Math.random()*(140000-80000+1)+80000);
        System.out.println("[saldo] " +this.saldo);
        System.out.println("- - - - - - - - - - - - - -");
        
        int retira = 0;
        
        System.out.print("Cuánto dinero deseas retirar?: $");
        
        do {
          
           retira = leer.nextInt();
           
            if (retira > this.saldo || this.saldo < 0) {
                System.out.println("SALDO INSUFICIENTE.");
                System.out.print("Ingresar un monto válido: $");
            }
        } while (retira > this.saldo || this.saldo < 0);  
        
        System.out.println("- - - - - - - - - - - - - -");
        
        System.out.println("Retiraste...");
        double dosal = this.saldo - retira;
        System.out.println("$" +retira);
        
        System.out.println("- - - - - - - - - - - - - -");
        System.out.println("[titular] " +this.titular);
        this.saldo = (int)(Math.random()*(140000-80000+1)+80000);
        System.out.println("[saldo] " +dosal);
        System.out.println("- - - - - - - - - - - - - -");
}
}
