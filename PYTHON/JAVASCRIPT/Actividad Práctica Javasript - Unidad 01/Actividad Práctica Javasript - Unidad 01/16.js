
/*Programa en JavaScript que escribe en pantalla los divisores comunes de dos números dados:*/
 
// Pedir dos números al usuario
let numeroD1 = prompt("Por favor, ingresa el primer número:");
let numeroD2 = prompt("Ahora, ingresa el segundo número:");

// Convertir los inputs a números enteros
numeroD1 = parseInt(numeroD1);
numeroD2 = parseInt(numeroD2);

// Inicializar un array para almacenar los divisores comunes
let divisoresComunes = [];

// Encontrar los divisores del primer número
for (let i = 1; i <= numeroD1; i++) {
  if (numeroD1 % i === 0 && numeroD2 % i === 0) {
    divisoresComunes.push(i);
  }
}

// Mostrar el resultado
alert("Los divisores comunes de " + numeroD1 + " y " + numeroD2 + " son: "
 + divisoresComunes.join(", "));

/* 1. Primero, pedimos al usuario que ingrese dos números utilizando `prompt` 
y almacenamos las entradas en las variables `numero1` y `numero2`.
2. Convertimos los inputs a números enteros utilizando `parseInt`.
3. Inicializamos un array llamado `divisoresComunes` para almacenar 
los divisores comunes de los dos números.
4. Utilizamos un bucle `for` para iterar desde 1 hasta el menor de los dos números.
5. Dentro del bucle, verificamos si ambos números son divisibles entre el contador 
del bucle. Si lo son, añadimos ese número al array `divisoresComunes`.
6. Finalmente, mostramos el resultado utilizando `alert`, 
indicando los divisores comunes de los dos números ingresados.
 */

///////////////*************************////////////////////////////////////////////////////

var numeroDZ1 = parseInt(prompt("Por favor, ingresa el primer número:"));
var numeroDZ2 = parseInt(prompt("Por favor, ingresa el segundo número:"));

// Función para encontrar y mostrar los divisores comunes de dos números dados
function encontrarDivisoresComunes(num1, num2) {
    console.log("Los divisores comunes de " + num1 + " y " + num2 + " son:");
    for (var i = 1; i <= Math.min(num1, num2); i++) {
        if (num1 % i === 0 && num2 % i === 0) {
            console.log(i);
        }
    }
}

// Llama a la función para encontrar y mostrar los divisores comunes
encontrarDivisoresComunes(numeroDZ1, numeroDZ2);

/* 1. Solicitamos al usuario que ingrese dos números utilizando `prompt()` y convertimos las entradas en números enteros utilizando `parseInt()`. Almacenamos estos números en las variables `numero1` y `numero2`.
2. Definimos una función llamada `encontrarDivisoresComunes()` que toma los dos números como argumentos.
3. Dentro de esta función, utilizamos un bucle `for` para iterar desde 1 hasta el mínimo de los dos números ingresados (`Math.min(num1, num2)`).
4. En cada iteración, verificamos si ambos números ingresados son divisibles por el número actual del bucle (`i`) utilizando el operador de módulo (`%`). Si el resultado es 0 para ambos números, significa que `i` es un divisor común de ambos números.
5. Si `i` es un divisor común, lo mostramos en la consola utilizando `console.log()`.
6. La función continúa iterando hasta que `i` alcance el mínimo de los dos números ingresados.
7. Luego, llamamos a la función `encontrarDivisoresComunes()` con los dos números ingresados por el usuario para mostrar los divisores comunes en pantalla.
8. Cada divisor común se imprime en una nueva línea en la consola para una mejor legibilidad. */