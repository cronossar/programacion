/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5.ejercicio.tp3;

/**
 *
 * @author cronossar1
 */
public class Guia5EjercicioTp3 {

    public static void main(String[] args) {
        int[] numeros = {123, 45, 6, 7890, 12, 34567};

        // Inicializar los contadores para cada categoría de dígitos
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        // Recorrer el vector de enteros y actualizar los contadores
        for (int numero : numeros) {
            int cantidadDigitos = contarDigitos(numero);
            switch (cantidadDigitos) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
                default:
                    // El número tiene más de 5 dígitos, no se cuenta
                    break;
            }
        }

        // Imprimir los resultados
        System.out.println("Cantidad de números de 1 dígito: " + contador1);
        System.out.println("Cantidad de números de 2 dígitos: " + contador2);
        System.out.println("Cantidad de números de 3 dígitos: " + contador3);
        System.out.println("Cantidad de números de 4 dígitos: " + contador4);
        System.out.println("Cantidad de números de 5 dígitos: " + contador5);
    }

    // Función para contar la cantidad de dígitos de un número entero
    private static int contarDigitos(int numero) {
        if (numero < 0) {
            numero = -numero; // Si el número es negativo, se convierte a positivo
        }
        if (numero == 0) {
            return 1; // El número 0 tiene un solo dígito
        }
        int cantidad = 0;
        while (numero > 0) {
            cantidad++;
            numero /= 10;
        }
        return cantidad;
    }
}