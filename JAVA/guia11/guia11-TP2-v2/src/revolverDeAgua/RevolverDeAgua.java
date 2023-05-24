
package revolverDeAgua;

import java.util.Random;

public class RevolverDeAgua {
   private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6) + 1; // Genera un n�mero aleatorio entre 1 y 6
        posicionAgua = random.nextInt(6) + 1;
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual % 6) + 1;
    }

    public String toString() {
        return "Posici�n actual: " + posicionActual + ", Posici�n del agua: " + posicionAgua;
    }
}
