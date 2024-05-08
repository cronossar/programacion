// Pedir un número al usuario
let numero = prompt("Por favor, ingresa un número:");

// Convertir el input a un número entero
numero = parseInt(numero);

// Comprobar si es divisible por 2, 3, 5 o 7
if (numero % 2 === 0) {
  alert(numero + " es divisible por 2.");
} else if (numero % 3 === 0) {
  alert(numero + " es divisible por 3.");
} else if (numero % 5 === 0) {
  alert(numero + " es divisible por 5.");
} else if (numero % 7 === 0) {
  alert(numero + " es divisible por 7.");
} else {
  alert(numero + " no es divisible por 2, 3, 5 ni 7.");
}

/* 1. Primero, pedimos al usuario que ingrese un número utilizando `prompt`
 y almacenamos la entrada en la variable `numero`.
2. Convertimos el input a un número entero utilizando `parseInt`.
3. Utilizamos una serie de declaraciones `if` y `else if` 
para comprobar si el número es divisible por 2, 3, 5 o 7,
 utilizando el operador de módulo `%`.
4. Si el número es divisible por alguno de los números mencionados,
 mostramos un mensaje indicando la divisibilidad. Si no es divisible por ninguno,
 mostramos un mensaje indicando que no es divisible por ninguno de los cuatro.
 */

 ///////////////////////////////////////////////////////////////////////////////////////


 
// Pide al usuario que ingrese un número
var numero2 = parseInt(prompt("Por favor, ingresa un número:"));

// Función para comprobar si el número es divisible por 2, 3, 5 o 7
function comprobarDivisibilidad(numero2) {
    if (numero2 % 2 === 0) {
        return "El número es divisible por 2.";
    } else if (numero2 % 3 === 0) {
        return "El número es divisible por 3.";
    } else if (numero2 % 5 === 0) {
        return "El número es divisible por 5.";
    } else if (numero2 % 7 === 0) {
        return "El número es divisible por 7.";
    } else {
        return "El número no es divisible por 2, 3, 5 ni 7.";
    }
}

// Llama a la función y muestra el resultado por consola
var resultado = comprobarDivisibilidad(numero2);
console.log(resultado);

/* **Explicación:**

1. Solicitamos al usuario que ingrese un número utilizando `prompt()` y convertimos la entrada en un número entero utilizando `parseInt()`. Almacenamos este número en la variable `numero`.
2. Definimos una función llamada `comprobarDivisibilidad()` que toma el número como argumento.
3. Dentro de esta función, utilizamos múltiples declaraciones `if` para comprobar si el número es divisible por 2, 3, 5 o 7.
4. Para verificar si es divisible por cada número, utilizamos el operador de módulo (`%`). Si el resultado de `numero % n` es igual a 0, significa que `numero` es divisible por `n`.
5. Si el número es divisible por alguno de estos números, la función devuelve un mensaje indicando por cuál de ellos es divisible.
6. Si no es divisible por ninguno de ellos, la función devuelve un mensaje indicando que no es divisible por ninguno de los cuatro.
7. Luego, llamamos a la función `comprobarDivisibilidad()` con el número ingresado por el usuario y almacenamos el resultado en la variable `resultado`.
8. Finalmente, mostramos el resultado utilizando `console.log()`. */

