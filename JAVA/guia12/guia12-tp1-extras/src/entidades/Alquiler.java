
package entidades;

import java.time.LocalDate;

public class Alquiler {
    
    private String nombreCliente;
    private String documentoCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler(String nombreCliente, String documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public int calcularDiasOcupacion() {
        return (int) (fechaDevolucion.toEpochDay() - fechaAlquiler.toEpochDay());
    }

    public double calcularPrecioAlquiler() {
        int diasOcupacion = calcularDiasOcupacion();
        double moduloBarco = barco.calcularModulo();
        return diasOcupacion * moduloBarco;
    }
}