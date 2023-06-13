
package entidades;

public abstract class  Edificio {
    
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
 //_____________
    //Metodos
    
//    public void calcularSuperficie(){
//       double superficie; 
//       superficie = this.ancho * this.largo; 
//        System.out.println("La superficie es: "+superficie); 
//    }
    public abstract double calcularSuperficieConRetorno();
    
    
//    public void calcularVolumen(){
//        double volumen;
//        volumen = this.alto * this.ancho * this.largo;
//        System.out.println("El volumen es: "+volumen);
//    }
    
    public abstract double calcularVolumenConRetorno();
//_____________
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
}
