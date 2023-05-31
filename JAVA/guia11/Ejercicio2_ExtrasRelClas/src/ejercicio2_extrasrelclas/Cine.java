package ejercicio2_extrasrelclas;

import java.util.ArrayList;

public class Cine {

    private Pelicula P;

    //private Asiento A;
    private ArrayList<Asiento> A;
    private int precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula P, ArrayList<Asiento> A, int precioEntrada) {
        this.P = P;
        this.A = A;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getP() {
        return P;
    }

    public void setP(Pelicula P) {
        this.P = P;
    }

    public ArrayList<Asiento> getA() {
        return A;
    }

    public void setA(ArrayList<Asiento> A) {
        this.A = A;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    
    
    
    
}
