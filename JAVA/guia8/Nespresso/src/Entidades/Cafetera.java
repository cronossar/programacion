package Entidades;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
