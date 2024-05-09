/*Escribir un programa que nos diga si un número dado es primo (no es divisible
por ninguno otro número que no sea él mismo o la unidad)*/

// Pedir un número al usuario
let numeroP = prompt("Por favor, ingresa un número:");

// Convertir el input a un número entero
numeroP = parseInt(numeroP);

let esPrimo = true;

// Verificar si el número es primo
if (numeroP <= 1) {
  esPrimo = false;
} else {
  for (let i = 2; i <= Math.sqrt(numeroP); i++) {
    if (numeroP % i === 0) {
      esPrimo = false;
      break;
    }
  }
}

// Mostrar el resultado
if (esPrimo) {
  alert(numeroP + " es un número primo.");
} else {
  alert(numeroP + " no es un número primo.");
}

/* 1. Primero, pedimos al usuario que ingrese un número utilizando `prompt` 
y almacenamos la entrada en la variable `numero`.
2. Convertimos el input a un número entero utilizando `parseInt`.
3. Inicializamos una variable `esPrimo` en `true` como suposición inicial.
4. Verificamos si el número es menor o igual a 1, en cuyo caso no sería primo.
5. Si el número es mayor que 1, utilizamos un bucle `for`
 para iterar desde 2 hasta la raíz cuadrada del número.
6. Dentro del bucle, verificamos si el número es divisible entre el contador del bucle.
 Si lo es, cambiamos `esPrimo` a `false` y salimos del bucle.
7. Finalmente, mostramos el resultado utilizando `alert`, 
indicando si el número ingresado es primo o no. */

////////////////////**********************************************************//////////

// Pide al usuario que ingrese un número
var numeroP2 = parseInt(prompt("Por favor, ingresa un número:"));

// Función para comprobar si un número es primo
function esPrimo2(numeroP2) {
    if (numeroP2 <= 1) {
        return false; // Los números menores o iguales a 1 no son primos
    }
    for (var i = 2; i <= Math.sqrt(numeroP2); i++) {
        if (numeroP2 % i === 0) {
            return false; // Si es divisible por algún número, no es primo
        }
    }
    return true; // Si no es divisible por ningún número, es primo
}

// Llama a la función y muestra el resultado
if (esPrimo2(numeroP2)) {
    console.log(numeroP2 + " es un número primo.");
} else {
    console.log(numeroP2 + " no es un número primo.");
}

/* 1. Solicitamos al usuario que ingrese un número utilizando `prompt()` y convertimos la entrada en un número entero utilizando `parseInt()`. Almacenamos este número en la variable `numero`.
2. Definimos una función llamada `esPrimo()` que toma el número como argumento.
3. Dentro de esta función, verificamos si el número es menor o igual a 1. Los números menores o iguales a 1 no son primos, por lo que devolvemos `false` en este caso.
4. Luego, iteramos desde 2 hasta la raíz cuadrada del número utilizando un bucle `for`.
5. En cada iteración, verificamos si el número es divisible por el valor actual del bucle utilizando el operador de módulo (`%`). Si es divisible, significa que no es primo y devolvemos `false`.
6. Si el número no es divisible por ningún número en el rango especificado, devolvemos `true`, lo que indica que es primo.
7. Luego, fuera de la función, llamamos a `esPrimo()` con el número ingresado por el usuario y almacenamos el resultado en una variable.
8. Dependiendo del resultado, mostramos un mensaje apropiado en la consola utilizando `console.log()`. Si el número es primo, mostramos que es primo; de lo contrario, mostramos que no es primo.
 */
