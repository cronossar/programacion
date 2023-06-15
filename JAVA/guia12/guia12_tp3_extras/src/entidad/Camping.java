
package entidad;

public class Camping extends ExtraHotelero {
    
    private int capMaxCarpas;
    private int cantBa�osDisp;
    private boolean Restaurante;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int cantBa�osDisp, boolean Restaurante, boolean privado, int mtsCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mtsCuadrados, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBa�osDisp = cantBa�osDisp;
        this.Restaurante = Restaurante;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBa�osDisp() {
        return cantBa�osDisp;
    }

    public void setCantBa�osDisp(int cantBa�osDisp) {
        this.cantBa�osDisp = cantBa�osDisp;
    }

    public boolean isRestaurante() {
        return Restaurante;
    }

    public void setRestaurante(boolean Restaurante) {
        this.Restaurante = Restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capMaxCarpas=" + capMaxCarpas + ", cantBa\u00f1osDisp=" + cantBa�osDisp + "\n, Restaurante=" + Restaurante + " , "+super.toString()+'}';
    }
    
    
}