
package entidad;

public class Televisor extends Electrodomesticos{
    
    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consE, Integer peso) {
        super(precio, color, consE, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Ahora indique las opciones para un TELEVISOR");
        System.out.println("------------------------");
        System.out.println("Ingrese la resolucion en pulgadas del televisor");
        this.resolucion = sc.nextInt();
        System.out.println("Ingrese S o N, si tiene sintonizador TDT");
        String auxTDT = sc.next();
        if (auxTDT.equalsIgnoreCase("S")) {
            this.TDT = false;
        }else{
            this.TDT = true;
        }
        }
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio = this.precio * .30 + this.precio;
        }
        if (this.TDT = true) {
            this.precio += 500;
        }
        //System.out.println("El precio final del televisor es: "+this.precio);
  
    }

    @Override
    public String toString() {
        return "Televisor{" + "precio=" + this.precio+ '}';
    }
    
    }
    
    
    

