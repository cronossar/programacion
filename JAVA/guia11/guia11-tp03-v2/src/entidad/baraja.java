
package entidad;

import java.util.ArrayList;
import java.util.Collections;

public class baraja {
    
    private ArrayList<carta> cartas;

    
    public baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new carta(numero, palo));
                }
            }
        }
    }

    //cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(cartas);
    }

    //devuelve la siguiente carta que está en la baraja, cuando no haya más o
    //se haya llegado al final, se indica al usuario que no hay más cartas.
    public carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        return cartas.remove(0);
    }
    //indica el número de cartas que aún se puede repartir. 
    public int cartasDisponibles() {
        return cartas.size();
    }
    
    //dado un número de cartas que nos pidan, le devolveremos ese número de 
    //cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    //debemos indicárselo al usuario.
    public ArrayList<carta> darCartas(int numeroCartas) {
        if (numeroCartas > cartas.size()) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return null;
        }
        ArrayList<carta> mano = new ArrayList<>();
        for (int i = 0; i < numeroCartas; i++) {
            mano.add(cartas.remove(0));
        }
        return mano;
    }

        // mostramos aquellas cartas que ya han salido, si no ha salido ninguna
        //indicárselo al usuario
    public void cartasMonton() {
        if (cartas.isEmpty()) {
            System.out.println("No ha salido ninguna carta.");
            return;
        }
        for (carta carta : cartas) {
            System.out.println(carta);
        }
    }

        //muestra todas las cartas hasta el final. Es decir, si se saca una carta y
        //luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja() {
        for (carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
    

