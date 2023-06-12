
package entidades;

public class Polideportivo extends Edificio {
    
    private String nombre;
    private char tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, char tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public Polideportivo(String nombre, char tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(char tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    //Metodos
    @Override
    public double calcularSuperficieConRetorno(){
       
       return  this.ancho * this.largo; 
        
    }
    
    @Override
    public double calcularVolumenConRetorno(){
        
        return this.alto * this.ancho * this.largo;
    }
    //TOstring
    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion + '}';
    }
    
    
}
