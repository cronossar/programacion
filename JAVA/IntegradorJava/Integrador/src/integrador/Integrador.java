package integrador;

import static integrador.Practica.mediasAmigas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Integrador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Practica practica = new Practica();
        //Generar las variables necesarias para probar
        //System.out.println( (int) Math.log10(1000)+1);
        System.out.println(" PALINDROMO O CAPICUA ");
        System.out.println("Verificamos si el numero igresado el palindromo");
        System.out.println("Escribe un numero entero cualquiera, puede ser negativo: ");
        boolean capicua = practica.numeroCapicua(sc.nextInt());
        if (capicua == true) {
            System.out.println("El numero ingresado es palindromo");  
        }else{
            System.out.println("El numero ingresado NO es palindromo"); 
        }
        System.out.println("############################");
        
        
        
        List<Character> medias = Arrays.asList('A', 'B', 'A', 'B', 'C', 'A', 'F', 'Z', 'C', 'H');
        List<Character> mediasPares = mediasAmigas(medias);
        System.out.println(mediasPares); // Imprime [A, B, C]
    

        
        
        System.out.println("############################");
        //Calculamos la posición del preso que recibirá el último caramelo (podrido)
        System.out.println(" RONDA DE PRESOS ");
        System.out.println("Ingrese la cantidad de presos que integran la ronda: ");
        int presos = sc.nextInt();
        System.out.println("Para repartir los caramelos se inicia en el numero. ???");
        int ini = sc.nextInt();
        System.out.println("Ingrese la cantidad de caramelos que se repartira: ");
        int cant = sc.nextInt();
        System.out.println("---------");
        System.out.println("Despues de repartir los: "+cant+" de caramelos\n"
        + " a cada uno de los "+presos+" presos, le toco el caramelo\n"
        + " podrido al preso que esta en la ubicación "+practica.prisioneroDulce(ini,cant,presos)+" de la ronda ");
        
        
    }
}
