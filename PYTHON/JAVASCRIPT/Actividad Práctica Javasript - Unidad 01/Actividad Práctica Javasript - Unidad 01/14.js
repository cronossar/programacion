// Pedir un número al usuario
let numerox = prompt("Por favor, ingresa un número:");

// Convertir el input a un número entero
numerox = parseInt(numerox);

// Inicializar un array para almacenar los divisores
let divisores = [];

// Comprobar si es divisible por 2, 3, 5 o 7
if (numerox % 2 === 0) {
  divisores.push(2);
}
if (numerox % 3 === 0) {
  divisores.push(3);
}
if (numerox % 5 === 0) {
  divisores.push(5);
}
if (numerox % 7 === 0) {
  divisores.push(7);
}

// Mostrar el resultado
if (divisores.length > 0) {
  alert(numerox + " es divisible por " + divisores.join(", "));
} else {
  alert(numerox + " no es divisible por 2, 3, 5 ni 7.");
}
 
/* 1. Primero, pedimos al usuario que ingrese un número utilizando `prompt` 
y almacenamos la entrada en la variable `numero`.

2. Convertimos el input a un número entero utilizando `parseInt`.

3. Inicializamos un array llamado `divisores` para almacenar los divisores del número.

4. Utilizamos declaraciones `if` para comprobar si el número es divisible
 por 2, 3, 5 o 7, y si lo es, añadimos el divisor al array `divisores`.

5. Finalmente, mostramos el resultado utilizando `alert`, indicando por cuáles de los cuatro números es divisible el número ingresado.

 */

///////////////*****************************************************************/////////


// Pide al usuario que ingrese un número
var numeroxx = parseInt(prompt("Por favor, ingresa un número:"));

// Función para comprobar si el número es divisible por 2, 3, 5 o 7
function comprobarDivisibilidad(numeroxx) {
    if (numeroxx % 2 === 0) {
        return "El número es divisible por 2.";
    } else if (numeroxx % 3 === 0) {
        return "El número es divisible por 3.";
    } else if (numeroxx % 5 === 0) {
        return "El número es divisible por 5.";
    } else if (numeroxx % 7 === 0) {
        return "El número es divisible por 7.";
    } else {
        return "El número no es divisible por 2, 3, 5 ni 7.";
    }
}

// Llama a la función y muestra el resultado
var resultado = comprobarDivisibilidad(numeroxx);
console.log(resultado);

/* 
1. Solicitamos al usuario que ingrese un número utilizando `prompt()` y convertimos la entrada en un número entero utilizando `parseInt()`. Almacenamos este número en la variable `numero`.
2. Definimos una función llamada `comprobarDivisibilidad()` que toma el número como argumento.
3. Dentro de esta función, utilizamos múltiples declaraciones `if` para comprobar si el número es divisible por 2, 3, 5 o 7.
4. Para verificar si es divisible por cada número, utilizamos el operador de módulo (`%`). Si el resultado de `numero % n` es igual a 0, significa que `numero` es divisible por `n`.
5. Si el número es divisible por alguno de estos números, la función devuelve un mensaje indicando por cuál de ellos es divisible.
6. Si no es divisible por ninguno de ellos, la función devuelve un mensaje indicando que no es divisible por ninguno de los cuatro.
7. Luego, llamamos a la función `comprobarDivisibilidad()` con el número ingresado por el usuario y almacenamos el resultado en la variable `resultado`.
8. Finalmente, mostramos el resultado utilizando `console.log()`. */