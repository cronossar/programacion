// Pedir una frase al usuario
let frase5 = prompt("Por favor, ingresa una frase:");

// Inicializar un contador para contar las vocales
let contadorVocales = 0;

// Recorrer la frase para contar las vocales
for (let i = 0; i < frase5.length; i++) {
  let letra = frase5[i].toLowerCase();
  if (letra === 'a' || letra === 'e' || letra === 'i' || letra === 'o' || letra === 'u') {
    contadorVocales++;
  }
}

// Mostrar el resultado
alert("La frase que ingresaste tiene " + contadorVocales + " vocales.");

/* Primero, pedimos al usuario que ingrese una frase utilizando prompt y
 almacenamos la entrada en la variable frase.
Luego, inicializamos un contador llamado contadorVocales para contar las vocales 
en la frase.
Utilizamos un bucle for para recorrer cada carácter de la frase.
Dentro del bucle, convertimos cada carácter a minúscula y comprobamos 
si es una vocal ('a', 'e', 'i', 'o', 'u'). Si es una vocal, aumentamos el contador.
Finalmente, mostramos el resultado utilizando alert. */

//////////////////////////**********************************************///////////////

// Pide al usuario que ingrese una frase
var frase6 = prompt("Por favor, ingresa una frase:");

// Función para determinar si un carácter es una vocal
function esVocal(caracter) {
    caracter = caracter.toLowerCase();
    return (caracter === 'a' || caracter === 'e' || caracter === 'i' || caracter === 'o' || caracter === 'u');
}

// Función para contar la cantidad de vocales en una frase
function contarVocales(frase6) {
    var cantidadVocales = 0;
    for (var i = 0; i < frase6.length; i++) {
        if (esVocal(frase6[i])) {
            cantidadVocales++;
        }
    }
    return cantidadVocales;
}

// Llama a la función y muestra el resultado
var cantidadVocales = contarVocales(frase6);
console.log("La frase contiene " + cantidadVocales + " vocales.");

/* 1. Solicitamos al usuario que ingrese una frase utilizando `prompt()` y almacenamos esa entrada en la variable `frase`.
2. Definimos una función llamada `esVocal()` que toma un carácter como argumento y determina si es una vocal o no. Esta función devuelve `true` si el carácter es una vocal y `false` en caso contrario. Utilizamos `toLowerCase()` para asegurarnos de que el carácter sea evaluado correctamente, independientemente de si es mayúscula o minúscula.
3. Definimos otra función llamada `contarVocales()` que toma la frase como argumento.
4. Dentro de esta función, inicializamos una variable `cantidadVocales` para mantener el recuento de vocales encontradas.
5. Usamos un bucle `for` para iterar sobre cada carácter en la cadena `frase`.
6. Dentro del bucle, llamamos a la función `esVocal()` para determinar si el carácter actual es una vocal. Si lo es, incrementamos el contador `cantidadVocales`.
7. Una vez que hemos recorrido toda la frase, devolvemos el valor de `cantidadVocales`.
8. Luego, llamamos a la función `contarVocales()` con la frase ingresada por el usuario y almacenamos el resultado en la variable `cantidadVocales`.
9. Finalmente, mostramos la cantidad de vocales encontradas en la frase utilizando `console.log()`.
 */
