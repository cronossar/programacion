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

        // Inicializar los contadores para cada categor�a de d�gitos
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
                    // El n�mero tiene m�s de 5 d�gitos, no se cuenta
                    break;
            }
        }

        // Imprimir los resultados
        System.out.println("Cantidad de n�meros de 1 d�gito: " + contador1);
        System.out.println("Cantidad de n�meros de 2 d�gitos: " + contador2);
        System.out.println("Cantidad de n�meros de 3 d�gitos: " + contador3);
        System.out.println("Cantidad de n�meros de 4 d�gitos: " + contador4);
        System.out.println("Cantidad de n�meros de 5 d�gitos: " + contador5);
    }

    // Funci�n para contar la cantidad de d�gitos de un n�mero entero
    private static int contarDigitos(int numero) {
        if (numero < 0) {
            numero = -numero; // Si el n�mero es negativo, se convierte a positivo
        }
        if (numero == 0) {
            return 1; // El n�mero 0 tiene un solo d�gito
        }
        int cantidad = 0;
        while (numero > 0) {
            cantidad++;
            numero /= 10;
        }
        return cantidad;
    }
}