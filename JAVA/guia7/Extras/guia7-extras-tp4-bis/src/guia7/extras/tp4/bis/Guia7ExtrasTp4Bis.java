package guia7.extras.tp4.bis;

import guia7.extras.tp4.bis.cajero.Cuenta;

/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
 * Luego, crea un método "retirar_dinero" que permita retirar una 
 * cantidad de dinero del saldo de la cuenta. Asegúrate de que el 
 * saldo nunca sea negativo después de realizar una transacción de retiro.

 * @author cronossar1
 */
public class Guia7ExtrasTp4Bis {

    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.retirarDinero();
        c2.retirarDinero();
        
        
        
    }
    
}
