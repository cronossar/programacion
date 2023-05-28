
package entidades;

public class Carta {
    
    //Atributos
    private Integer numero;
    private String palo;
     
    //Constantes
    public static final String[] PALOS={"ESPADAS", "OROS", "COPAS", "BASTOS"};
    public static final Integer MAX_CARTA_PALO=12;
 
    //Constructor

    public Carta() {
    }

    public Carta(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
 
    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo;
    }
     
}
    

