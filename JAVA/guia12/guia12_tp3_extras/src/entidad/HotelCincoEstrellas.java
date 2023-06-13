
package entidad;

public class HotelCincoEstrellas extends Hotel {
    
    private String gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private int cantidadSalonesConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public HotelCincoEstrellas(String nombre, String direccion, String localidad, String gerente,
                               int cantidadHabitaciones, int numeroCamas, int cantidadPisos,
                               String gimnasio, String nombreRestaurante, int capacidadRestaurante,
                               int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
        this.getPrecioHabitaciones();
    }

    @Override
     public double calcularPrecioHabitaciones() {
        double precio = super.calcularPrecioHabitaciones();
        precio += calcularValorAgregadoRestaurante();
        precio += calcularValorAgregadoGimnasio();
        precio += calcularValorAgregadoLimosinas();
        return precio;
    }

    private double calcularValorAgregadoRestaurante() {
        double valor = 0;
        if (capacidadRestaurante < 30) {
            valor = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valor = 30;
        } else {
            valor = 50;
        }
        return valor;
    }

    private double calcularValorAgregadoGimnasio() {
        double valor = 0;
        if (gimnasio.equals("A")) {
            valor = 50;
        } else if (gimnasio.equals("B")) {
            valor = 30;
        }
        return valor;
    }

    private double calcularValorAgregadoLimosinas() {
        double valor = 15 * cantidadLimosinas;
        return valor;
    }
}
