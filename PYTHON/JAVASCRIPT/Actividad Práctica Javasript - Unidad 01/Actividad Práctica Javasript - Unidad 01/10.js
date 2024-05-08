// Pedir una frase al usuario
let frase3 = prompt("Por favor, ingresa una frase:");

// Inicializar un array para almacenar las vocales que aparecen
let vocales = [];

// Recorrer la frase para encontrar las vocales
for (let i = 0; i < frase3.length; i++) {
  let letra = frase3[i].toLowerCase();
  if (letra === 'a' || letra === 'e' || letra === 'i' || letra === 'o' || letra === 'u') {
    if (!vocales.includes(letra)) {
      vocales.push(letra);
    }
  }
}

// Mostrar el resultado
alert("Las vocales que aparecen en la frase que ingresaste son: " + vocales.join(", "));

// 1. Primero, pedimos al usuario que ingrese una frase utilizando `prompt` 
//y almacenamos la entrada en la variable `frase`.

// 2. Luego, inicializamos un array llamado `vocales` para almacenar las vocales que
// aparecen en la frase.

// 3. Utilizamos un bucle `for` para recorrer cada carácter de la frase.

// 4. Dentro del bucle, convertimos cada carácter a minúscula y comprobamos 
//si es una vocal ('a', 'e', 'i', 'o', 'u'). 
//Si es una vocal y no está en el array `vocales`, la agregamos al array.

// 5. Finalmente, mostramos el resultado utilizando `alert`.

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////

// Pide al usuario que ingrese una frase
var frase4 = prompt("Por favor, ingresa una frase:");

// Función para encontrar y devolver las vocales de una cadena
function encontrarVocales(texto) {
    var vocales = "";
    for (var i = 0; i < texto.length; i++) {
        var caracter = texto[i].toLowerCase();
        if (caracter === 'a' || caracter === 'e' || caracter === 'i' || caracter === 'o' || caracter === 'u') {
            vocales += caracter + " ";
        }
    }
    return vocales.trim(); // Elimina el espacio en blanco extra al final
}

// Llama a la función y muestra el resultado
var vocalesEncontradas = encontrarVocales(frase4);
console.log("Las vocales que aparecen en la frase son: " + vocalesEncontradas);

/* 
Solicitamos al usuario que ingrese una frase utilizando prompt() 
y almacenamos esa entrada en la variable frase.
Definimos una función llamada encontrarVocales() 
que toma una cadena de texto como argumento.
Dentro de la función, inicializamos una variable vocales 
para almacenar las vocales encontradas en la frase.
Usamos un bucle for para iterar sobre cada carácter en la cadena texto.
Dentro del bucle, convertimos el carácter actual a minúsculas utilizando toLowerCase()
 para asegurarnos de que coincida con las vocales en minúsculas.
Comparamos el carácter con cada vocal ('a', 'e', 'i', 'o', 'u'). 
Si el carácter es una vocal, lo agregamos a la cadena vocales.
Una vez que hemos recorrido toda la cadena, devolvemos las vocales encontradas,
 eliminando cualquier espacio en blanco adicional al final mediante trim().
Luego, llamamos a esta función con la frase ingresada por el usuario
 y almacenamos el resultado en la variable vocalesEncontradas.
Finalmente, mostramos las vocales encontradas utilizando console.log(). */
