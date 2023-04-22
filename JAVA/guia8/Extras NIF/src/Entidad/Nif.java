
package Entidad;

public class Nif {
   private long numero;
    private char letra;

    public Nif(long numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String toString() {
        return String.format("%08d", numero) + "-" + letra;
    }
}
