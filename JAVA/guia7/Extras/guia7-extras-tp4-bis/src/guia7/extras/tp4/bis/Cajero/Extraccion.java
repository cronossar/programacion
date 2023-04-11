package guia7.extras.tp4.bis.Cajero;
import java.util.Scanner;
/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 * @author cronossar1
 */
public class Extraccion {
    
    private Double saldo;
    private String titular;
    private Double retiro;
    private Double saldoInicial;
    
    public Extraccion() {
    }

    public Extraccion(double saldo, String titular, double retiro) {
        this.saldo = saldo;
        this.titular = titular;
        this.retiro = retiro;
        this.saldoInicial = saldoInicial;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Double getRetiro() {
        return retiro;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setRetiro(Double retiro) {
        this.retiro = retiro;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    
    //Metodo carga Inicial
    public void cargaInicial(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el monto inicial de dinero para la cuenta de: "+this.titular);
        this.saldoInicial = sc.nextDouble();
    }   

//Metodo retirar dinero   
    public Double retirarDinero(){
    
        if (this.retiro > this.saldoInicial){
    }
    
    
    }

    @Override
    public String toString() {
        return "Extraccion{" + "saldo=" + saldo + ", titular=" + titular + ", retiro=" + retiro + ", saldoInicial=" + saldoInicial + '}';
    }
    
    
    
    
    
    
            
            
    
}
