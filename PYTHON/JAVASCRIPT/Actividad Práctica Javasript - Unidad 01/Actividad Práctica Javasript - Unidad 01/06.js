// let num1 = parseFloat(prompt("Ingrese el primer número: "));
//: Solicita al usuario que ingrese un número mediante el uso de prompt.
// Luego, convierte la entrada del usuario en un número de punto flotante
// utilizando parseFloat y asigna este valor a la variable num1.

// let num2 = parseFloat(prompt("Ingrese el segundo número: "));
//: Realiza lo mismo que el paso anterior, pero para el segundo número,
// y lo almacena en la variable num2.

// if (parseInt(num1) > parseInt(num2)) { ... }
//: Compara los números ingresados por el usuario. Utiliza parseInt para 
//convertir los números en enteros antes de realizar la comparación.
// Si el valor numérico de num1 es mayor que el de num2, 
//se ejecuta el bloque de código dentro del primer if.
// alert("El primer número es mayor: " + num1);
//: Muestra una alerta en el navegador indicando que el primer número ingresado (num1) es mayor que el segundo (num2).

// else if (parseInt(num2) > parseInt(num1)) { ... }
//: Realiza una comparación similar a la anterior,
// pero esta vez verifica si el segundo número (num2) es mayor que el primero (num1).
// Si es así, ejecuta el bloque de código dentro de este else if.
// alert("El segundo número es mayor: " + num2);
//: Muestra una alerta en el navegador indicando que el segundo número (num2) es mayor que el primero (num1).

// else { ... }: Si ninguno de los casos anteriores es verdadero, 
//es decir, si num1 y num2 son iguales, se ejecuta este bloque de código.
// alert("Los dos números son iguales: " + num1);
//: Muestra una alerta en el navegador indicando que ambos números son iguales,
// utilizando el valor de num1.


let num1 = parseFloat(prompt("Ingrese el primer número: "));
let num2 = parseFloat(prompt("Ingrese el segundo número: "));
if (parseInt(num1) > parseInt(num2)) {
  alert("El primer número es mayor: " + num1);
} else if (parseInt(num2) > parseInt(num1)) {
  alert("El segundo número es mayor: " + num2);
} else {
  alert("Los dos números son iguales: " + num1);
}


//En este segundo ejemplo se imprime por consola

// let num1 = parseFloat(prompt("Ingrese el primer número: "));
// let num2 = parseFloat(prompt("Ingrese el segundo número: "));

// if (num1 > num2) {
//     console.log("El primer número es mayor:", num1);
// } else if (num2 > num1) {
//     console.log("El segundo número es mayor:", num2);
// } else {
//     console.log("Los números son iguales.");
// }
