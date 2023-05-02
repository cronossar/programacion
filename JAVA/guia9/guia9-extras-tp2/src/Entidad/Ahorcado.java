
package Entidad;

public class Ahorcado {
   
    private String[] palabra;
    private boolean[] encontradas;
    private int intentosMaximos;
    private int intentosActuales;

    public Ahorcado(String palabra, int intentosMaximos) {
        this.palabra = palabra.split("");
        this.encontradas = new boolean[palabra.length()];
        this.intentosMaximos = intentosMaximos;
        this.intentosActuales = intentosMaximos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public boolean[] getEncontradas() {
        return encontradas;
    }

    public int getIntentosMaximos() {
        return intentosMaximos;
    }

    public int getIntentosActuales() {
        return intentosActuales;
    }

    public void setIntentosActuales(int intentosActuales) {
        this.intentosActuales = intentosActuales;
    }
}