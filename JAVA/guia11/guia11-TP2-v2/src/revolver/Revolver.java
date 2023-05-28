
package revolver;

import java.util.Random;

public class Revolver {
   private int posicionTambor;
    private int posicionBala;

    public void llenarRevolver() {
        Random random = new Random();
        posicionTambor = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
        posicionBala = random.nextInt(6) + 1;
    }

    public boolean mojar() {
        return posicionTambor == posicionBala;
    }

    public void siguienteChorro() {
        posicionTambor = (posicionTambor % 6) + 1;
    }

    public String toString() {
        return "Posición actual: " + posicionTambor + ", Posición del agua: " + posicionBala;
    }
}
