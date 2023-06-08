
package entidad;

public class Lavadora extends Electrodomesticos{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, char consE, int peso) {
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
        
        System.out.println("Ingrese los datos de la lavadora");
        crearElectrodomestico();
        System.out.println("¿Que capacidad de carga tiene esta lavadora?");
        carga = sc.nextInt();
    }
    
}
