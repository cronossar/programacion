/*Pide una nota (número). Muestra la calificación según la nota:
● 0-3: Muy deficiente
● 3-5: Insuficiente
● 5-6: Suficiente
● 6-7: Bien
● 7-9: Notable
● 9-10: Sobresaliente*/

// Pedir la nota al usuario
let nota = prompt("Por favor, ingresa tu nota:");

// Convertir el input a un número decimal
nota = parseFloat(nota);

// Determinar la calificación
if (nota >= 0 && nota < 3) {
  alert("Tu calificación es Muy deficiente.");
} else if (nota >= 3 && nota < 5) {
  alert("Tu calificación es Insuficiente.");
} else if (nota >= 5 && nota < 6) {
  alert("Tu calificación es Suficiente.");
} else if (nota >= 6 && nota < 7) {
  alert("Tu calificación es Bien.");
} else if (nota >= 7 && nota < 9) {
  alert("Tu calificación es Notable.");
} else if (nota >= 9 && nota <= 10) {
  alert("¡Felicidades! Tu calificación es Sobresaliente.");
} else {
  alert("La nota ingresada no es válida. Por favor, ingresa una nota entre 0 y 10.");
}

/* 1. Primero, pedimos al usuario que ingrese su nota utilizando `prompt` y almacenamos la entrada en la variable `nota`.
2. Convertimos el input a un número decimal utilizando `parseFloat`.
3. Utilizamos una serie de declaraciones `if` y `else if` para determinar la calificación según el rango en el que cae la nota ingresada.
4. Dependiendo del rango, mostramos un mensaje utilizando `alert` indicando la calificación correspondiente.
5. Si la nota ingresada no cae en ninguno de los rangos válidos, mostramos un mensaje indicando que la nota no es válida y solicitamos una nota entre 0 y 10.

 */

//********************************************************************************** */

// Pide al usuario que ingrese la nota
var nota2 = parseFloat(prompt("Por favor, ingresa tu nota:"));

// Comprueba la nota y muestra la calificación correspondiente
if (nota2 >= 0 && nota2 <= 3) {
    console.log("Tu calificación es Muy deficiente.");
} else if (nota2 > 3 && nota2 <= 5) {
    console.log("Tu calificación es Insuficiente.");
} else if (nota2 > 5 && nota2 <= 6) {
    console.log("Tu calificación es Suficiente.");
} else if (nota2 > 6 && nota2 <= 7) {
    console.log("Tu calificación es Bien.");
} else if (nota2 > 7 && nota2 <= 9) {
    console.log("Tu calificación es Notable.");
} else if (nota2 > 9 && nota2 <= 10) {
    console.log("Tu calificación es Sobresaliente.");
} else {
    console.log("La nota ingresada no es válida.");
}
/* **Explicación:**

1. Solicitamos al usuario que ingrese su nota utilizando `prompt()` y convertimos la entrada en un número de punto flotante utilizando `parseFloat()`. Almacenamos este número en la variable `nota`.
2. Utilizamos una serie de declaraciones `if` y `else if` para verificar en qué rango de notas se encuentra la nota ingresada.
3. Cada declaración `if` verifica si la nota está dentro de un rango específico y, en caso afirmativo, muestra la calificación correspondiente en la consola.
4. Si la nota ingresada no se encuentra en ninguno de los rangos especificados, se muestra un mensaje indicando que la nota no es válida.
5. Este programa proporciona una forma clara y concisa de determinar la calificación correspondiente a una nota dada, siguiendo los rangos establecidos en el enunciado del problema. */