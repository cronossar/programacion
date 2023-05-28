
package entidad;

public class carta {
    
    private int numero;
    private String palo;

    public carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public String toString() {
        return numero + " de " + palo;
    }
}
    

