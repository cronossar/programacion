
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

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consE, int peso) {
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
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion en pulgadas del televisor");
        resolucion = sc.nextInt();
        System.out.println("Ingrese S o N, si tiene sintonizador TDT");
        String auxTDT = sc.next();
        if (auxTDT == "S") {
            TDT = true;
        }else{
            TDT = false;
        }
        }
    @Override
    public void precioFinal(){
        if (resolucion > 40) {
            precio = precio * .30;
        }
        if (TDT = true) {
            precio += 500;
        }
        System.out.println("El precio final del televisor es: "+precio);
  
    }
    
    }
    
    
    

