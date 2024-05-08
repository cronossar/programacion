// // Pedir el primer número
// const numero1 = prompt("Introduce el primer número:");

// // Pedir el segundo número
// const numero2 = prompt("Introduce el segundo número:");

// // Sumar los dos números y mostrar el resultado
// const suma = numero1 + numero2;
// console.log("La suma de los dos números es:", suma);

///////////////////////////////////////////////////////////////////////////////

// Utilizamos la función prompt para pedir al usuario que ingrese dos números.
// Luego, utilizamos la función parseInt para convertir los valores ingresados de texto
// a números enteros, ya que la función prompt devuelve una cadena de texto.
// Después, sumamos los dos números y guardamos el resultado en la variable resultado.
// Finalmente, utilizamos la función alert para mostrar el resultado de la suma al usuario

let primerNumero = prompt("Por favor, introduce el primer número:");
let segundoNumero = prompt("Ahora introduce el segundo número:");
let resultado = parseInt(primerNumero) + parseInt(segundoNumero);
alert("El resultado de la suma es: " + resultado);