package entidad;



public class HotelCuatroEstrellas extends Hotel {
    
   private java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
       
    protected String gimnasio;
    protected String nombreRestaurante;
    protected int capRestaurante;

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(String gimnasio, String nombreRestaurante, int capRestaurante, int cantHabitaciones, int nroCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capRestaurante = capRestaurante;
    }

   

    public String isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(int capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "HotelCuatroEstrellas{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capRestaurante=" + capRestaurante + super.toString() + '}';
=======
        return "HotelCuatroE{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + "\n, capRestaurante=" + capRestaurante + super.toString() + '}';
>>>>>>> 5c9792242a775e8c2828205c3d7e88d724708ffa
    }
    
    //Metodos
    
    
    public void crearHotel4() {
        
        System.out.println("Hotel 4 Estrellas");
        
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
        
    }

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        if (capRestaurante > 0 && capRestaurante <= 30) {
            super.setPrecioHabitaciones(super.getPrecioHabitaciones() + 10);
        } else if (capRestaurante > 30 && capRestaurante <= 50) {
            super.setPrecioHabitaciones(super.getPrecioHabitaciones() + 30);
        } else if (capRestaurante > 50) {
            super.setPrecioHabitaciones(super.getPrecioHabitaciones() + 50);
        }

        if (gimnasio.equalsIgnoreCase("A")) {
            super.setPrecioHabitaciones(super.getPrecioHabitaciones() + 50);
        } else if (gimnasio.equalsIgnoreCase("B")) {
            super.setPrecioHabitaciones(super.getPrecioHabitaciones() + 30);
        }
        //System.out.println("Valor Final 4 Estrellas: "+precioHabitaciones);
    }

    }
