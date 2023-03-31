/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5.ejercicios.tp6;

import java.util.Scanner;

/**
 *
 * @author SEF
 */
public class Guia5EjerciciosTp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];

        // Leer los valores del cuadrado por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores del cuadrado mágico:");
        
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int valor = sc.nextInt();
                if (valor < 1 || valor > 9) {
                    System.out.println("Error: El valor debe estar entre 1 y 9");
                    return;
                }
                cuadrado[i][j] = valor;
            }
        }

        // Comprobar si el cuadrado es mágico
        boolean esMagico = true;
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        
        for (int i = 0; i < cuadrado.length; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < cuadrado[i].length; j++) {
                sumaFila += cuadrado[i][j];
                sumaColumna += cuadrado[j][i];
                if (i == j) {
                    sumaDiagonalPrincipal += cuadrado[i][j];
                }
                if (i + j == cuadrado.length - 1) {
                    sumaDiagonalSecundaria += cuadrado[i][j];
                }
            }
            if (sumaFila != 15 || sumaColumna != 15) {
                esMagico = false;
                break;
            }
        }
        if (sumaDiagonalPrincipal != 15 || sumaDiagonalSecundaria != 15) {
            esMagico = false;
        }

        // Mostrar el resultado
        if (esMagico) {
            System.out.println("El cuadrado es mágico");
        } else {
            System.out.println("El cuadrado no es mágico");
        }
    }
}

/*Este programa permite al usuario introducir los valores de un cuadrado mágico
por teclado y luego comprueba si el cuadrado es mágico o no. En este ejemplo 
se utiliza un cuadrado de tamaño 3x3 para simplificar el código, pero se puede
adaptar para trabajar con cuadrados de cualquier tamaño. El programa lee los 
valores del cuadrado por teclado y comprueba que sean válidos (es decir, estén
entre 1 y 9). Luego, calcula la suma de cada fila, cada columna y cada diagonal
del cuadrado y comprueba si son iguales a 15 (que es la constante mágica para 
un cuadrado 3x3). Si todas las sumas son iguales a 15, el cuadrado es mágico. 
Si alguna suma no es igual a 15, el cuadrado no es mágico. Finalmente, el programa
muestra el resultado en consola.*/