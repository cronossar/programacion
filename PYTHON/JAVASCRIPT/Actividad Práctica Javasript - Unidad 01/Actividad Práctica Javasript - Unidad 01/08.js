// Utilizamos la función parseInt y prompt para solicitar al usuario que ingrese un número y convertir el valor ingresado de texto a un número entero.
// Luego, utilizamos el operador de módulo % 
//para obtener el resto de la división del número entre 2.

// Si el resto es igual a 0, significa que el número es divisible por 2,
// por lo que se muestra un mensaje indicando que es divisible.

// Si el resto no es igual a 0, se muestra un mensaje indicando que no es divisible por 2.

let numero = parseInt(prompt("Por favor, ingresa un número:"));

if (numero % 2 === 0) {
    document.write("El número " + numero + " es divisible por 2");
} else {
    document.write("El número " + numero + " no es divisible por 2");
}