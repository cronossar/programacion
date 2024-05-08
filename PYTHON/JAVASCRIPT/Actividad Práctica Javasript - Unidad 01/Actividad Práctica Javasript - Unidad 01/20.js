/*Realiza un script que pida cadenas de texto hasta que se pulse “cancelar”. Al
salir con “cancelar” deben mostrarse todas las cadenas concatenadas con un guión
*/
let cadena = '';
let texto;

do {
  texto = prompt('Introduce una cadena de texto:');
  if (texto !== null) {
    cadena += texto + '-';
  }
} while (texto !== null);

alert('Cadenas concatenadas: ' + cadena);

/* Este script utiliza un bucle `do-while` para pedir al usuario que introduzca
 una cadena de texto hasta que se pulsa "cancelar" (o se introduce un valor nulo).
  Cada cadena de texto introducida se concatena a la variable `cadena` seguida de un guión.
   Cuando se pulsa "cancelar", el bucle termina y se muestra un cuadro de alerta con todas 
   las cadenas concatenadas.
 */

   //////////////////////************************************************************ */

let cadenaConcatenada = '';

// Bucle infinito hasta que se pulse "cancelar"
while (true) {
  let cadenaZ = prompt("Introduce una cadena de texto (o pulsa 'cancelar' para salir):");
  
  // Si se pulsa "cancelar" o se deja el campo vacío, salir del bucle
  if (cadenaZ === null || cadenaZ === '') {
    break;
  }
  
  // Concatenar la cadena introducida con la cadena acumulada, separadas por un guión
  if (cadenaConcatenada !== '') {
    cadenaConcatenada += '-';
  }
  cadenaConcatenada += cadenaZ;
}

// Mostrar todas las cadenas concatenadas
console.log("Cadenas concatenadas:", cadenaConcatenada);


/* Este script utiliza un bucle `while` que se ejecuta infinitamente hasta
que se pulsa "cancelar". En cada iteración del bucle, solicita al usuario
una cadena de texto utilizando la función `prompt()`. 
Si el usuario pulsa "cancelar" o deja el campo vacío,
el script sale del bucle. De lo contrario, la cadena introducida se concatena
con la cadena acumulada (`cadenaConcatenada`), separadas por un guión.

Finalmente, cuando se sale del bucle, se muestra en la consola la cadena resultante 
de la concatenación de todas las cadenas introducidas por el usuario. */