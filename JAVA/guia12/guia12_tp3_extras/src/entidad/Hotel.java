
package entidad;

import java.util.Comparator;

public abstract class Hotel extends Alojamiento implements Comparator<Hotel>{
    
     protected int cantHabitaciones;
    protected int nroCamas;
    protected int cantPisos;
    protected Double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int nroCamas, int cantPisos, Double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
    }


    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantHabitaciones=" + cantHabitaciones + ", nroCamas=" + nroCamas + "\n, cantPisos=" + cantPisos + ", precioHabitaciones=" + precioHabitaciones + super.toString()+ '}';
    }
    
    public void calcularPrecio(){
        double capacidadHotel = cantHabitaciones * nroCamas * cantPisos;
        precioHabitaciones = 50 + capacidadHotel;
        //System.out.println("Valor Final Hotel Comun "+precioHabitaciones);
        
    }

    
}

     

    
 
