
package entidad;

import java.util.Scanner;

public class HotelCincoEstrellas extends HotelCuatroEstrellas {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int cantSalonesConf;
    private int cantSuites;
    private int cantLimosinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(int cantSalonesConf, int cantSuites, int cantLimosinas, String gimnasio, String nombreRestaurante, int capRestaurante, int cantHabitaciones, int nroCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capRestaurante, cantHabitaciones, nroCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }


    public int getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(int cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "HotelCincoE{" + "cantSalonesConf=" + cantSalonesConf + ", cantSuites=" + cantSuites + "\n, cantLimosinas=" + cantLimosinas + super.toString()+ '}';
    }
    //Metodos
    
    public void crearHotel5() {
        
        System.out.println("Hotel 5 Estrellas");
        
        System.out.println("Nombre:");
        this.setNombre(leer.next());
        System.out.println("Direccion:");
        this.setDireccion(leer.next());
        System.out.println("Localidad:");
        this.setLocalidad(leer.next());
        System.out.println("Nombre del Gerente:");
        this.setGerente(leer.next());

        System.out.println("Cantidad de Habitaciones:");
        this.setCantHabitaciones(leer.nextInt());
        System.out.println("Numero de camas:");
        this.setNroCamas(leer.nextInt());
        System.out.println("Cantidad de pisos:");
        this.setCantPisos(leer.nextInt());

        System.out.println("Tiene gimnasio? (A/B)");
        this.setGimnasio(leer.next());
        System.out.println("Ingrese el nombre del Restaurante:");
        this.setNombreRestaurante(leer.next());
        System.out.println("Ingrese la capacidad del Restaurante");
        this.setCapRestaurante(leer.nextInt());
        

        System.out.println("Ingrese la cantitad de Salones de Conferencias:");
        this.setCantSalonesConf(leer.nextInt());
        System.out.println("Ingrese la cantidad de Suites:");
        this.setCantSuites(leer.nextInt());
        System.out.println("Ingrese la cantidad de Limosinas:");
        this.setCantLimosinas(leer.nextInt());
       
    }

    
    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        super.setPrecioHabitaciones(super.getPrecioHabitaciones() + (cantLimosinas * 15));
        //System.out.println("Valor Final 5 estrellas: "+precioHabitaciones);
    }
    
    
}