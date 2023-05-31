package ejercicio2_extrasrelclas;

public class Asiento {

    private int fila;

    private int columna;

    private Espectador e;

    public Asiento(int fila, int columna, Espectador e) {
        this.fila = fila;
        this.columna = columna;
        this.e = e;
    }

    public Asiento() {
    }
    

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public Espectador getE() {
        return e;
    }

    public void setE(Espectador e) {
        this.e = e;
    }
    
    
    
}
