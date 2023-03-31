package guia5.ejercicio.tp4;

import java.util.Random;

/**
 *
 * @author cronossar1
 */
public class Guia5EjercicioTp4 {
    public static void main(String[] args) {
         int [][] matriz = new int [4][4];
        int [][] traspuesta = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int aleatorio = (int) (Math.random() * 10);
                matriz[i][j] = aleatorio;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " +matriz[i][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println("- - - - - - - - - - -");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[j][i] = matriz[j][i];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " +traspuesta[j][i]);
            }
            System.out.println(" ");
        }
    }
}
