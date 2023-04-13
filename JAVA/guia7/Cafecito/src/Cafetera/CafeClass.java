package Cafetera;
import java.util.Scanner;
public class CafeClass {
    private int capacidadMaxima;
    private int cantidadActual;

    // Constructor predeterminado
    public CafeClass() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    // Constructor con la capacidad máxima
    public CafeClass(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        cantidadActual = capacidadMaxima;
    }

    // Constructor con la capacidad máxima y la cantidad actual
    public CafeClass(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    // Accesor para la capacidad máxima
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    // Mutador para la capacidad máxima
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    // Accesor para la cantidad actual
    public int getCantidadActual() {
        return cantidadActual;
    }

    // Mutador para la cantidad actual
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // Llenar la cafetera
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }
    Scanner leer = new Scanner(System.in);
            
    // Servir una taza
    public int servirTaza() {
        //int cantidad;
        System.out.println("Ingrese la cantidad de café a servir");
            
            int cantidad = leer.nextInt();
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
            System.out.println("Se ha servido una taza de " + cantidad + " c.c. de café.");
        } else {
            System.out.println("No hay suficiente café para llenar la taza.");
            System.out.println("Se ha servido una taza de " + cantidadActual + " c.c. de café.");
            cantidadActual = 0;
            
        }
        return cantidadActual;
    }

    // Vaciar la cafetera
    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    // Agregar café a la cafetera
    public void agregarCafe(int cantidad) {
        cantidadActual += cantidad;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }
}


