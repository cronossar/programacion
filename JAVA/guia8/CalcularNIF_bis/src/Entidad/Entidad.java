
package Entidad;

public class Entidad {
    private long dni;
    private char letra;

    public Entidad() {
    }

    public Entidad(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public String toString() {
       return String.format("%08d", dni) + "-" + letra;
    }
    
    
}
