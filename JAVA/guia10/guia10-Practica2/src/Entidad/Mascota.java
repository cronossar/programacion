
package Entidad;

import java.util.Comparator;

public class Mascota {
    
    private String nombre;
    private String raza;
    private String apodo;
    private double peso;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, String apodo, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.apodo = apodo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", raza=" + raza + ", apodo=" + apodo + ", peso=" + peso + '}';
    }
        
}
