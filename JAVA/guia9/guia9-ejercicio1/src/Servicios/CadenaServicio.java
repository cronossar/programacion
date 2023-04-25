
package servicios;

import Entidades.Cadena;

import java.util.Scanner;

public class CadenaServicio {

    private Scanner scanner;

    public CadenaServicio() {
        this.scanner = new Scanner(System.in);
        
    }

    public void mostrarVocales(Cadena cad) {
        int vocales = 0;
        String frase = cad.getFrase();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        System.out.println("La frase tiene " + vocales + " vocales.");
    }

    public void invertirFrase(Cadena cad) {
        String frase = cad.getFrase();
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();
        System.out.println("La frase invertida es: " + builder.toString());
    }

    public void vecesRepetido(Cadena cad, String letra) {
        String frase = cad.getFrase();
        int repeticiones = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                repeticiones++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + repeticiones + " veces.");
    }

    public void compararLongitud(Cadena cad, String frase) {
        int longitud1 = cad.getLongitud();
        int longitud2 = frase.length();
        if (longitud1 > longitud2) {
            System.out.println("La primera frase es más larga.");
        } else if (longitud1 < longitud2) {
            System.out.println("La segunda frase es más larga.");
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }

    public void unirFrases(Cadena cad, String frase) {
        String nuevaFrase = cad.getFrase() + " " + frase;
        System.out.println("La frase resultante es: " + nuevaFrase);
    }

    public void reemplazar(Cadena cad, String letra, char reemplazo) {
        String frase = cad.getFrase();
        String nuevaFrase = frase.replace(letra.charAt(0), reemplazo);
        System.out.println("La frase resultante es: " + nuevaFrase);
    }

    public boolean contiene(Cadena cad, String letra) {
        String frase = cad.getFrase();
        return frase.contains(letra);
      
    }
}
