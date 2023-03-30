package guia5.extras.tp4;
import java.util.Scanner;

/**
 *Crear un programa para llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 * @author Daniel Buiak Branchesi
 */
public class Guia5ExtrasTp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definimos el arreglo de notas para los 10 alumnos
        double[][] notas = new double[10][4];

        // Pedimos al usuario que ingrese las notas de cada alumno
        for (int i = 0; i < 10; i++) {
            System.out.println("Notas del alumno " + (i+1) + ":");
            System.out.print("Primer trabajo práctico evaluativo (10%): ");
            notas[i][0] = scanner.nextDouble();
            System.out.print("Segundo trabajo práctico evaluativo (15%): ");
            notas[i][1] = scanner.nextDouble();
            System.out.print("Primer Integrador (25%): ");
            notas[i][2] = scanner.nextDouble();
            System.out.print("Segundo integrador (50%): ");
            notas[i][3] = scanner.nextDouble();
            System.out.println();
        }

        // Calculamos el promedio de cada alumno y los almacenamos en otro arreglo
        double[] promedios = new double[10];
        for (int i = 0; i < 10; i++) {
            promedios[i] = (notas[i][0]*0.1 + notas[i][1]*0.15 + notas[i][2]*0.25 + notas[i][3]*0.5) / 4;
        }

        // Contamos la cantidad de aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (promedios[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Mostramos el resultado por pantalla
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}

/*Este programa utiliza un arreglo bidimensional (notas) para almacenar las notas
de los 10 alumnos, y un arreglo unidimensional (promedios) para almacenar los 
promedios de cada uno de ellos. Luego, utiliza un par de bucles for para calcular
los promedios y contar la cantidad de aprobados y desaprobados.*/