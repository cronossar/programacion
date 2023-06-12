
package entidad;

public class Lavadora extends Electrodomesticos{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consE, Integer peso) {
        super(precio, color, consE, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("Ahora indique las opciones para un LAVARROPAS");
        System.out.println("¿Que capacidad de carga tiene esta lavadora?");
        carga = sc.nextInt();
        sc.nextLine();
    }    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (carga > 30) {
            this.precio += 500;
        }
        
        //System.out.println("El precio final de la Lavadora es: "+this.precio);
        
    }

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + this.precio + '}';
    }
    
}

