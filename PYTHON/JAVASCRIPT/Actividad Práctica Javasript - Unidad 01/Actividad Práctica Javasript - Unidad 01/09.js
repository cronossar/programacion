// Pedir una frase al usuario
let frase = prompt("Por favor, ingresa una frase:");

// Contar cuántas veces aparece la letra 'a' en la frase
let contador = 0;
for (let i = 0; i < frase.length; i++) {
  if (frase[i].toLowerCase() === 'a') {
    contador++;
  }
}

// Mostrar el resultado
alert("La letra 'a' aparece " + contador + " veces en la frase que ingresaste.");

// Primero, pedimos al usuario que ingrese una frase utilizando prompt y
// almacenamos la entrada en la variable frase.
// Luego, inicializamos un contador en 0 para contar cuántas veces 
//aparece la letra 'a' en la frase.
// Utilizamos un bucle for para recorrer cada carácter de la frase.
// Dentro del bucle, comparamos cada carácter con la letra 'a' (tanto en minúsculas como en mayúsculas, usando toLowerCase) y aumentamos el contador si encontramos una coincidencia.
// Finalmente, mostramos el resultado utilizando alert.


////////////////////////////////////////////////////////////////////////


// Pide al usuario que ingrese una frase
var frase2 = prompt("Por favor, ingresa una frase:");

// Función para contar la cantidad de veces que aparece la letra "a" en una cadena
function contarLetraA(texto) {
    var conteo = 0;
    for (var i = 0; i < texto.length; i++) {
        if (texto[i].toLowerCase() === 'a') {
            conteo++;
        }
    }
    return conteo;
}

// Llama a la función y muestra el resultado en consola
var cantidadA = contarLetraA(frase2);
console.log("La letra 'a' aparece " + cantidadA + " veces en la frase.");

// 1. Solicitamos al usuario que ingrese una frase utilizando `prompt()` 
//y almacenamos esa entrada en la variable `frase`.

// 2. Definimos una función llamada `contarLetraA()` 
//que toma una cadena de texto como argumento.

// 3. Dentro de la función, inicializamos una variable `conteo` para mantener el recuento de cuántas veces aparece la letra 'a'.

// 4. Usamos un bucle `for` para iterar sobre cada carácter en la cadena `texto`.

// 5. Dentro del bucle, verificamos si el carácter actual 
//(convertido a minúsculas para ser insensible a mayúsculas/minúsculas) es igual a 'a'.
// Si es así, incrementamos el contador `conteo`.

// 6. Una vez que hemos recorrido toda la cadena, devolvemos el valor de `conteo`.

// 7. Luego, llamamos a esta función con la frase ingresada por el usuario y 
//almacenamos el resultado en la variable `cantidadA`.
// 8. Finalmente, mostramos la cantidad de veces que aparece la letra 'a' 
//en la frase utilizando `console.log()`.