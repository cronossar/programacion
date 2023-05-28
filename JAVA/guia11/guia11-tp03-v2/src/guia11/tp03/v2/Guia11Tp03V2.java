
package guia11.tp03.v2;

import entidad.baraja;
import entidad.carta;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia11Tp03V2 {

    public static void main(String[] args) {
        
        baraja baraja = new baraja();
        baraja.barajar();
        
        System.out.println("Número de cartas disponibles: " + baraja.cartasDisponibles());
        
        carta carta1 = baraja.siguienteCarta();
        System.out.println("Siguiente carta: " + carta1);
        
        carta carta2 = baraja.siguienteCarta();
        System.out.println("Siguiente carta: " + carta2);
        
        System.out.println("Número de cartas disponibles: " + baraja.cartasDisponibles());
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuantas cartas quieres?");        
        ArrayList<carta> mano = baraja.darCartas(scan.nextInt());
        if (mano != null) {
            System.out.println("Cartas repartidas:");
            for (carta carta : mano) {
                System.out.println(carta);
            }
        }
        
        System.out.println("Número de cartas disponibles: " + baraja.cartasDisponibles());
        
        System.out.println("Cartas en el montón:");
        baraja.cartasMonton();
        
        System.out.println("Mostrar baraja completa:");
        baraja.mostrarBaraja();
    }
}