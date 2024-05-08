// Se utilizan las funciones parseFloat y prompt para solicitar al usuario que ingrese 
//tres números y convertir los valores ingresados de texto a números de punto flotante.
// Luego, se utiliza una estructura condicional if-else para comparar los tres números
// y determinar cuál es el mayor.
// Dependiendo del resultado de la comparación, 
//se escribe en el documento HTML el mensaje correspondiente indicando 
//cuál es el mayor de los tres números.

let n1 = parseFloat(prompt("Ingrese el primer número: "));
let n2 = parseFloat(prompt("Ingrese el segundo número: "));
let n3 = parseFloat(prompt("Ingrese el tercer número: "));

if (n1 >= n2 && n1 >= n3) {
    document.write("El primer número es el mayor: " + n1);
} else if (n2 >= n1 && n2 >= n3) {
    document.write("El segundo número es el mayor: " + n2);
} else {
    document.write("El tercer número es el mayor: " + n3);
}