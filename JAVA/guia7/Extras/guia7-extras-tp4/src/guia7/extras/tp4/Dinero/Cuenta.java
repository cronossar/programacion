package guia7.extras.tp4.Dinero;

public class Cuenta {

    private Double Saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(Double saldoInicial, String titular) {
        this.Saldo = saldoInicial;
        this.titular = titular;
    }

    //Geter y Setter
    public Double getSaldo() {
        return Saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(Double saldo) {
        this.Saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
   
    public void sacarPlata(double cantidad) {
               
        if (cantidad > Saldo) {
            System.out.println("No hay suficiente saldo en la cuenta.");
        } else {
            Saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " pesos de la cuenta de " + titular + ".");
        }
        
    }
     
    @Override
    public String toString() {
        return "Cuenta{" + "Saldo=" + Saldo + ", Titular=" + titular + '}';
    }
}
