/*Haz un script que escriba una pirámide inversa de los números del 1 al
número que indique el usuario de la siguiente forma : (suponiendo que indica 6).
666666
55555
4444
333
22
1
*/

let numeroInv = prompt('Introduce un número:');
if (!isNaN(numeroInv) && numeroInv > 0) {
  for (let i = numeroInv; i >= 1; i--) {
    let lineaInv = '';
    for (let j = 1; j <= i; j++) {
      lineaInv += i;
    }
    console.log(lineaInv);
  }
} else {
  alert('¡Error! Por favor, introduce un número válido mayor que 0.');
}

/* En este script, se solicita al usuario que introduzca un número.
 Si el valor introducido es un número válido mayor que 0, 
 se utiliza un bucle `for` para iterar desde el número introducido hasta 1.
  Para cada número, se construye una cadena que contiene el número repetido
   el mismo número de veces que su valor (por ejemplo, para el número 3, 
    se concatenan tres veces el número 3). Luego, se imprime cada línea en la consola. */

/************************************************************************************* */

let numeroI2 = prompt("Introduce un número para la pirámide:");

// Verificar si el usuario ha ingresado un número válido
if (isNaN(numeroI2) || numeroI2 <= 0) {
    alert("Por favor, introduce un número válido mayor que cero.");
} else {
    let piramide2 = '';

    // Bucle para generar cada fila de la pirámide
    for (let i = parseInt(numeroI2); i >= 1; i--) {
        // Concatenar el número actual repetido i veces
        piramide2 += `${i}`.repeat(i) + '\n';
    }

    // Mostrar la pirámide en la consola
    console.log(piramide2);
}


/* Este script solicita al usuario que introduzca un número para generar la pirámide
 inversa. Luego, verifica si el número ingresado es válido 
 (mayor que cero y un número válido). Si el número es válido,
utiliza un bucle `for` para generar cada fila de la pirámide inversa. En cada iteración,
concatena el número actual repetido `i` veces, donde `i` es el valor actual del bucle.
Finalmente, muestra la pirámide inversa en la consola. */
