package guia5.ejercicios.tp5;

import java.util.Scanner;

/**
 *
 * @author cronossar1
 */
public class Guia5EjerciciosTp5 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
         int [][] matriz = new int [3][3];
        int [][] traspuesta = new int [3][3];
        
        System.out.println("Completar la matriz con 9 numeros");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3;j++) {
                System.out.print("[  " +matriz[i][j]+ "  ]");
            }
            System.out.println("  ");
        }
        
        System.out.println("- - - - - - - - - - -");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                traspuesta[j][i] = matriz[j][i];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[  " +traspuesta[j][i]+ "  ]");
            }
            System.out.println("  ");
        }
    

  
        
       int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
               if(matriz[i][j]==(-traspuesta[j][i])){
                   cont++;
               }
                   
            }
        }
        if (cont==9){
            System.out.println("La matriz es antisimétrica");
        }else{
            System.out.println("La matriz es no antisimétrica");
        }
    }
    
}
