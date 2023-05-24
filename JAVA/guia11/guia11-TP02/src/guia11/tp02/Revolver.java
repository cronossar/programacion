/*
 Clase Revolver de agua: esta clase posee los siguientes atributos: posici�n actual (posici�n
del tambor que se dispara, puede que est� el agua o no) y posici�n agua (la posici�n del
tambor donde se encuentra el agua). Estas dos posiciones, se generar�n aleatoriamente.
 */
package guia11.tp02;

import java.util.Random;

public class Revolver {
    
    //Atributos
    private int posicionBalaActual;
    private int posicionBala;

    //Constructor
    public Revolver() {
        Random rand = new Random();
        posicionBalaActual = rand.nextInt(6)+1;
        posicionBala = rand.nextInt(6)+1;
    }

    //Metodos
    
    //Dispara el revolver
    public boolean disparar() {

        boolean exito = false;

        if (posicionBalaActual == posicionBala) {
            exito = true; //Alguien va a morir...
        }

        siguienteBala();

        return exito;

    }

    //Cambia a la siguiente posicion
    public void siguienteBala() {

        if (posicionBalaActual == 6) {
            posicionBalaActual = 1; //posicion inicial
        } else {
            posicionBalaActual++;
        }

    }

    public String toString() {
        return "Posicion Bala Actual: " + posicionBalaActual + ", Posicion bala: " + posicionBala;
    }

}