// Pedir una frase al usuario
let frase7 = prompt("Por favor, ingresa una frase:");

// Inicializar contadores para cada vocal
let contadorA = 0;
let contadorE = 0;
let contadorI = 0;
let contadorO = 0;
let contadorU = 0;

// Recorrer la frase para contar cada vocal
for (let i = 0; i < frase7.length; i++) {
  let letra = frase7[i].toLowerCase();
  switch (letra) {
    case 'a':
      contadorA++;
      break;
    case 'e':
      contadorE++;
      break;
    case 'i':
      contadorI++;
      break;
    case 'o':
      contadorO++;
      break;
    case 'u':
      contadorU++;
      break;
    default:
      // No hacer nada si no es una vocal
      break;
  }
}

// Mostrar el resultado
alert("La letra 'a' aparece " + contadorA + " veces.\nLa letra 'e' aparece " + 
contadorE + " veces.\nLa letra 'i' aparece " + contadorI +
 " veces.\nLa letra 'o' aparece " + contadorO + " veces.\nLa letra 'u' aparece "
  + contadorU + " veces.");

/* 
1. Primero, pedimos al usuario que ingrese una frase utilizando `prompt` y almacenamos la entrada en la variable `frase`.
2. Luego, inicializamos contadores para cada vocal ('a', 'e', 'i', 'o', 'u').
3. Utilizamos un bucle `for` para recorrer cada carácter de la frase.
4. Dentro del bucle, convertimos cada carácter a minúscula y utilizamos un `switch` 
para incrementar el contador correspondiente a la vocal encontrada.
5. Finalmente, mostramos el resultado utilizando `alert`.
 */


//////////////////////////////////////////////////////////////////////////////////////

// Pide al usuario que ingrese una frase
var frase8 = prompt("Por favor, ingresa una frase:");

// Función para inicializar un objeto con contadores de vocales
function inicializarContadores() {
    return {
        'a': 0,
        'e': 0,
        'i': 0,
        'o': 0,
        'u': 0
    };
}

// Función para contar la cantidad de veces que aparece cada vocal en una frase
function contarVocales(frase8) {
    // Inicializa los contadores de vocales
    var contadores = inicializarContadores();

    // Recorre cada carácter de la frase
    for (var i = 0; i < frase8.length; i++) {
        var caracter = frase8[i].toLowerCase(); // Convertimos a minúsculas para hacer la comparación
        if (contadores.hasOwnProperty(caracter)) { // Verifica si es una vocal
            contadores[caracter]++; // Incrementa el contador correspondiente
        }
    }

    return contadores;
}

// Llama a la función y muestra el resultado
var resultados = contarVocales(frase8);
console.log("Resultados de la cuenta de vocales:");
for (var vocal in resultados) {
    console.log(vocal + ": " + resultados[vocal]);
}

