package Entidad;

public class Paises {

    private String nomb_pais;
    private double cant_hab;

    public Paises() {
    }

    public Paises(String nomb_pais, Integer cant_hab) {
        this.nomb_pais = nomb_pais;
        this.cant_hab = cant_hab;
    }

    public double getCant_hab() {
        return cant_hab;
    }

    public void setCant_hab(Integer cant_hab) {
        this.cant_hab = cant_hab;
    }

    public String getNomb_pais() {
        return nomb_pais;
    }

    public void setNomb_pais(String nomb_pais) {
        this.nomb_pais = nomb_pais;
    }

    @Override
    public String toString() {
        return "Paises{" + "nomb_pais=" + nomb_pais + ", cant_hab=" + cant_hab + '}';
    }

}
