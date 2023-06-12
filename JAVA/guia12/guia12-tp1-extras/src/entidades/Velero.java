
package entidades;

public class Velero extends Barco {
    
   private int numeroMastiles;

    public Velero(String matricula, double eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numeroMastiles;
    }
}