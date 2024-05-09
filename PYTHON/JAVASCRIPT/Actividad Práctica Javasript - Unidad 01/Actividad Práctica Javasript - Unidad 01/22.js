/*Realizar una página con un script que calcule el valor de la letra de un número
de DNI (Documento Nacional de Identidad).
El algoritmo para calcular la letra del dni es el siguiente :
● El número debe ser entre 0 y 99999999
● Debemos calcular el resto de la división entera entre el número y el número
23.
● Según el resultado, de 0 a 22, le corresponderá una letra de las siguientes:
(T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E)
● Si lo introducido no es un número deberá indicarse con un alert y volver a
preguntar.
● Deberá de repetirse el proceso hasta que el usuario pulse «cancelar».
*/

let numeroDNI;

do {
  numeroDNI = prompt('Introduce el número de DNI (Documento Nacional de Identidad):');

  if (numeroDNI !== null) {
    if (!isNaN(numeroDNI) && numeroDNI >= 0 && numeroDNI <= 99999999) {
      let letras = 'TRWAGMYFPDXBNJZSQVHLCKE';
      let resto = numeroDNI % 23;
      let letraDNI = letras.charAt(resto);
      alert('La letra correspondiente al número de DNI ' + numeroDNI + ' es: ' + letraDNI);
    } else {
      alert('¡Error! Por favor, introduce un número válido entre 0 y 99999999.');
    }
  }
} while (numeroDNI !== null);


/* En este script, se utiliza un bucle `do-while` para pedir al usuario que
 introduzca un número de DNI hasta que se pulsa "cancelar" (o se introduce un valor nulo).
  Si el usuario introduce algo que no es un número válido o
   está fuera del rango especificado, se muestra un mensaje de alerta.
    Si el valor introducido es válido,
     se calcula la letra correspondiente al número de DNI según el algoritmo
      y se muestra en un cuadro de alerta. */

/***************************************************************************************** */

while (true) {
  let numeroDNI2 = prompt("Introduce tu número de DNI (o pulsa 'cancelar' para salir):");

  // Si el usuario pulsa "cancelar" o deja el campo vacío, salir del bucle
  if (numeroDNI2 === null || numeroDNI2 === "") {
    break;
  }

  // Convertir la entrada a número
  numeroDNI2 = parseInt(numeroDNI2);

  // Verificar que el número esté en el rango válido
  if (isNaN(numeroDNI2) || numeroDNI2 < 0 || numeroDNI2 > 99999999) {
    // Mostrar alerta si el número no es válido
    alert("¡Por favor, introduce un número de DNI válido!");
    continue;
  }

  // Calcular la letra del DNI
  const letrasDNI = 'TRWAGMYFPDXBNJZSQVHLCKE';
  const resto = numeroDNI2 % 23;
  const letraDNI = letrasDNI.charAt(resto);

  // Mostrar la letra del DNI
  alert("La letra de tu DNI es: " + letraDNI);
}


/* Este script utiliza un bucle `while` que se ejecuta hasta que se pulsa "cancelar". En cada iteración del bucle, solicita al usuario un número de DNI utilizando la función `prompt()`. Si el usuario pulsa "cancelar" o deja el campo vacío, el script sale del bucle. Si el valor introducido no es un número válido (por ejemplo, si el usuario introduce un texto o un número fuera del rango válido), se muestra una alerta indicando que debe introducir un número de DNI válido y se solicita nuevamente.

Si el número de DNI es válido, se calcula la letra correspondiente según el algoritmo dado y se muestra en una alerta. El proceso se repite hasta que el usuario pulse "cancelar". */