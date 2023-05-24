/*
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
 */
package revolverDeAgua;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RevolverDeAgua {
    
    private Integer posicion_actual;
    private Integer posicion_agua;
    //private ArrayList<Integer> p_act = new ArrayList();
    //private ArrayList<Integer> p_agua = new ArrayList();
    private HashMap<Integer,Integer> tambor = new HashMap();
    
    
    
    public void llenarRevolver(){
        Random r = new Random();
        posicion_actual = r.nextInt(0,2);
        //System.out.println(posicion_actual);
        posicion_agua = r.nextInt(0,2);
        //System.out.println(posicion_agua);
    }
    
    public Boolean mojar(){
        return (posicion_agua == posicion_actual);
    } 
    
    
    
    
    

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicion_actual, Integer posicion_agua) {
        this.posicion_actual = posicion_actual;
        this.posicion_agua = posicion_agua;
    }

    public Integer getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(Integer posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public Integer getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agua(Integer posicion_agua) {
        this.posicion_agua = posicion_agua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicion_actual=" + posicion_actual + ", posicion_agua=" + posicion_agua + '}';
    }
    
    
    
    
    
    
    
    
    
}
