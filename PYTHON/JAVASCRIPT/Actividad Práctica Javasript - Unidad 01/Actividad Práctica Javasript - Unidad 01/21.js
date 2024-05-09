/*Realiza un script que pida números hasta que se pulse “cancelar”. Si no es un
número deberá indicarse con un «alert» y seguir pidiendo. Al salir con “cancelar”
deberá indicarse la suma total de los números introducidos.*/

let suma = 0;
let input;

do {
  input = prompt('Introduce un número:');
  if (input !== null) {
    if (!isNaN(input)) {
      suma += parseFloat(input);
    } else {
      alert('¡Error! Por favor, introduce un número válido.');
    }
  }
} while (input !== null);

alert('La suma total de los números introducidos es: ' + suma);


/* En este script, se utiliza un bucle `do-while` para pedir al usuario que introduzca
un número hasta que se pulsa "cancelar" (o se introduce un valor nulo).
Si el usuario introduce algo que no es un número, se muestra un mensaje de alerta.
Si el valor introducido es un número válido, se suma al total.
Al salir con "cancelar", se muestra un cuadro de alerta con la suma total de los números
introducidos.
 */

/************************************************************************************* */

let sumaZ = 0;

// Bucle infinito hasta que se pulse "cancelar"
while (true) {
  let input = prompt("Introduce un número (o pulsa 'cancelar' para salir):");

  // Si se pulsa "cancelar" o se deja el campo vacío, salir del bucle
  if (input === null || input === "") {
    break;
  }

  // Convertir la entrada a número
  let num = parseFloat(input);

  // Comprobar si la entrada es un número válido
  if (!isNaN(num)) {
    // Sumar el número a la suma total
    sumaZ += num;
  } else {
    // Mostrar alerta si la entrada no es un número válido
    alert("¡Por favor, introduce un número válido!");
  }
}

// Mostrar la suma total de los números introducidos
alert("La suma total de los números introducidos es: " + sumaZ);


/* Este script utiliza un bucle `while` que se ejecuta infinitamente hasta que se pulsa "cancelar".
En cada iteración del bucle,
 solicita al usuario un número utilizando la función `prompt()`.
 Si el usuario pulsa "cancelar" o deja el campo vacío,
 el script sale del bucle. Si el valor introducido es un número válido,
 se suma a la variable `suma`. Si el valor no es un número válido (por ejemplo,
    si el usuario introduce un texto), se muestra una alerta indicando que debe
     introducir un número válido.

Finalmente, cuando se sale del bucle, se muestra una alerta con la suma
 total de todos los números introducidos por el usuario. */