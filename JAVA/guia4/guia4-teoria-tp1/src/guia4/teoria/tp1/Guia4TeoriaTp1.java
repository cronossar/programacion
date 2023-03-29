package guia4.teoria.tp1;
import java.util.Scanner;
/**
 *Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el car�cter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
* a e i o u
* @ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificaci�n correspondiente. Utilice la estructura ?seg�n? para la
transformaci�n.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa deber�a ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 * 
 * @author Daniel Buiak Branchesi
 */
public class Guia4TeoriaTp1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO8859-1");
        System.out.print("Ingresa una palabra o frase (terminada en punto): ");
        String entrada = leer.nextLine();

        String codificado = codificarVocales(entrada);

        System.out.println("Palabra o frase codificada: " + codificado);
    }

    public static String codificarVocales(String entrada) {
        String codificado = "";

        for (int i = 0; i < entrada.length(); i++) {
            char caracter = entrada.charAt(i);

            switch (caracter) {
                case 'a':
                case 'A':
                    codificado += '@';
                    break;
                case 'e':
                case 'E':
                    codificado += '#';
                    break;
                case 'i':
                case 'I':
                    codificado += '$';
                    break;
                case 'o':
                case 'O':
                    codificado += '%';
                    break;
                case 'u':
                case 'U':
                    codificado += '*';
                    break;
                default:
                    codificado += caracter;
                    break;
            }
        }

        return codificado;
    }
}

/*En este programa, la funci�n codificarVocales es un subprograma que recibe una secuencia
de caracteres y retorna la codificaci�n correspondiente. La funci�n utiliza la estructura
"seg�n" (switch) para la transformaci�n, reemplazando cada vocal por el n�mero correspondiente
seg�n la tabla proporcionada en el enunciado. El resto de los caracteres se mantienen sin cambios.
Finalmente, el programa principal utiliza la entrada del usuario como argumento para la funci�n
codificarVocales y muestra la versi�n codificada de la cadena de entrada.*/
