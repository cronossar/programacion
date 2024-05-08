
// Pedir un número al usuario
let numeroz = prompt("Por favor, ingresa un número:");

// Convertir el input a un número entero
numeroz = parseInt(numeroz);

// Inicializar un array para almacenar los divisores
let divisoresZ = [];

// Encontrar los divisores del número
for (let i = 1; i <= numeroz; i++) {
  if (numeroz % i === 0) {
    divisoresZ.push(i);
  }
}

// Mostrar el resultado
alert("Los divisores de " + numeroz + " son: " + divisoresZ.join(", "));

/* 1. Primero, pedimos al usuario que ingrese un número utilizando `prompt` 
y almacenamos la entrada en la variable `numero`.

2. Convertimos el input a un número entero utilizando `parseInt`.

3. Inicializamos un array llamado `divisores` para almacenar los divisores del número.

4. Utilizamos un bucle `for` para iterar desde 1 hasta el número ingresado.

5. Dentro del bucle, verificamos si el número es divisible entre el contador del bucle.
 Si lo es, añadimos ese número al array `divisores`.
6. Finalmente, mostramos el resultado utilizando `alert`, 
indicando los divisores del número ingresado.
 */

/////////////////////*******************************************//////////////////////////

// Pide al usuario que ingrese un número
var numeroZ2 = parseInt(prompt("Por favor, ingresa un número:"));

// Función para encontrar y mostrar los divisores de un número dado
function encontrarDivisores(numeroZ2) {
    console.log("Los divisores de " + numeroZ2 + " son:");
    for (var i = 1; i <= numeroZ2; i++) {
        if (numeroZ2 % i === 0) {
            console.log(i);
        }
    }
}

// Llama a la función para encontrar y mostrar los divisores
encontrarDivisores(numeroZ2);


/* 
1. Solicitamos al usuario que ingrese un número utilizando `prompt()` y convertimos la entrada en un número entero utilizando `parseInt()`. Almacenamos este número en la variable `numero`.
2. Definimos una función llamada `encontrarDivisores()` que toma el número como argumento.
3. Dentro de esta función, utilizamos un bucle `for` para iterar desde 1 hasta el número ingresado por el usuario.
4. En cada iteración, verificamos si el número ingresado es divisible por el número actual del bucle (`i`) utilizando el operador de módulo (`%`). Si el resultado es 0, significa que `i` es un divisor del número ingresado.
5. Si `i` es un divisor, lo mostramos en la consola utilizando `console.log()`.
6. La función continúa iterando hasta que `i` alcance el número ingresado por el usuario.
7. Luego, llamamos a la función `encontrarDivisores()` con el número ingresado por el usuario para mostrar los divisores en pantalla.
8. Cada divisor se imprime en una nueva línea en la consola para una mejor legibilidad. */