package Servicios;

import Entidad.Cadena;

import java.util.Scanner;

public class CadenaServicio {

    private Scanner scanner;

    public CadenaServicio() {
        this.scanner = new Scanner(System.in);
        
    }

    public void mostrarVocales(Cadena cad) {
        int vocales = 0;
        System.out.println("Escriba una frase");
        String frase = scanner.nextLine();
        cad.setFrase(frase);
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                  letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ) {
                vocales++;
            }
        }
        System.out.println("La frase tiene " + vocales + " vocales.");
    }

    public void invertirFrase(Cadena cad) {
        String frase = cad.getFrase();
        String resultado = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
        resultado += frase.charAt(i);
    }
    //return resultado;
    System.out.println("La frase invertida es: " + resultado);
}
        
    

    public void vecesRepetido(Cadena cad) {
        System.out.println("Ingrese una letra para buscar en la frase");
        String letra = scanner.next();
        String frase = cad.getFrase();
        int repeticiones = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                repeticiones++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + repeticiones + " veces.");
    }

    public void compararLongitud(Cadena cad) {
        
        System.out.println("Ingrese una nueva frase para comparar");
        String frase = scanner.nextLine();
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

    public void unirFrases(Cadena cad) {
        System.out.println("Ingrese una nueva frase para unirla a la anterior");
        String frase3 = scanner.nextLine();
        
        System.out.println("La frase resultante es: " + cad.getFrase() + " " + frase3);
    }

    public void reemplazar(Cadena cad, String letra, char reemplazo) {
        System.out.println("Escriba una letra");
        letra = scanner.nextLine();
        String frase = cad.getFrase();
        String nuevaFrase = frase.replace(letra.charAt(0), reemplazo);
        System.out.println("La frase resultante es: " + nuevaFrase);
    }

    public boolean contiene(Cadena cad, String letra) {
        System.out.println("Escriba una letra");
        letra = scanner.nextLine();
        String frase = cad.getFrase();
        return frase.contains(letra);
      
    }
}
