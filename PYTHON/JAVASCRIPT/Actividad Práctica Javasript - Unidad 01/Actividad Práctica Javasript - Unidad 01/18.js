
// Pedir la edad al usuario
let edad = prompt("Por favor, ingresa tu edad:");

// Convertir el input a un número entero
edad = parseInt(edad);

// Verificar si la persona puede conducir
if (edad >= 18) {
  alert("¡Felicidades! Con " + edad + " años, ya puedes conducir.");
} else {
  alert("Lo siento, con " + edad + " años, aún no puedes conducir.");
}

/* 1. Primero, pedimos al usuario que ingrese su edad utilizando `prompt` 
y almacenamos la entrada en la variable `edad`.
2. Convertimos el input a un número entero utilizando `parseInt`.
3. Utilizamos una declaración `if` para verificar si la edad es mayor o igual a 18.
4. Si la condición se cumple, mostramos un mensaje utilizando `alert`
 indicando que la persona puede conducir.
5. Si la condición no se cumple, mostramos un mensaje indicando que la persona 
aún no puede conducir.
 */

/***********************************************************************************/

// Pide al usuario que ingrese su edad
var edad2 = parseInt(prompt("Por favor, ingresa tu edad:"));

// Comprueba si la edad es mayor o igual a 18 y muestra un mensaje apropiado
if (edad2 >= 18) {
    console.log("¡Felicidades! Ya puedes conducir.");
} else {
    console.log("Lo siento, aún no puedes conducir.");
}


/* **Explicación:**

1. Solicitamos al usuario que ingrese su edad utilizando `prompt()` y convertimos la entrada en un número entero utilizando `parseInt()`. Almacenamos este número en la variable `edad`.
2. Luego, utilizamos una declaración `if` para verificar si la edad ingresada es mayor o igual a 18.
3. Si la condición es verdadera (es decir, si la edad es mayor o igual a 18), mostramos un mensaje en la consola que indica que ya puede conducir.
4. Si la condición es falsa (es decir, si la edad es menor de 18), mostramos un mensaje en la consola que indica que aún no puede conducir.
5. Este programa proporciona una respuesta clara y simple basada en la edad ingresada por el usuario, ayudando a determinar si pueden conducir o no.
 */