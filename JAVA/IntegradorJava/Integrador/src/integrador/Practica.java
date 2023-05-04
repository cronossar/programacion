package integrador;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.List;
import java.util.Map;

public class Practica {

//    La función recibirá un numero x y deberá determinar si es capicúa o no. 
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
//    Además deberemos contemplar los siguientes escenarios: 
//    Contemplar que el numero que llega puede ser negativo. 
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true. 
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo
    
    public Boolean numeroCapicua(Integer num) {
        // Si el número es null, no es capicúa
        if (num == null) {
            return false;
        }

        // Si el número es de un dígito, es capicúa
        if (Math.abs(num) < 10) {
            return true;
        }

        // Convertimos el número a una cadena de caracteres para poder comparar los dígitos
        String numStr = Integer.toString(Math.abs(num));
        int len = numStr.length();
        for (int i = 0; i < len / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }

//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
    
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        // Si solo hay un preso, el caramelo podrido será para él
        if (cantidadLadrones == 1) {
            return 0;
        }

        // Calculamos la posición del preso que recibirá el último caramelo (podrido)
        int ultimaPosicion = (inicio + cantidadCaramelos - 1) % cantidadLadrones;

        return ultimaPosicion;
    }
    
    //    En un universo paralelo, donde los habitantes son medias, existe un crucero 
//    de medias donde se sube una lista de medias. 
//    Esta lista de medias del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas

    public static List<Character> mediasAmigas(Collection<Character> medias) {
        // Creamos un mapa para contabilizar el número de veces que aparece cada letra
        Map<Character, Integer> contador = new HashMap<>();
        for (Character media : medias) {
            contador.put(media, contador.getOrDefault(media, 0) + 1);
        }
        
        // Creamos una lista para almacenar las medias que tienen par
        List<Character> mediasPares = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : contador.entrySet()) {
            if (entry.getValue() >= 2) { // Si la media aparece al menos dos veces, la agregamos a la lista de pares
                mediasPares.add(entry.getKey());
            }
        }
        
        // Ordenamos la lista de medias pares de menor a mayor y la retornamos
        Collections.sort(mediasPares);
        return mediasPares;
    }
    
}






    //public List<String> mediasAmigas(List<String> pasajeros) {
        //Aca escribir la logica necesaria
    //    return null;
   // }
//}

