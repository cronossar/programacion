/* 23. Realiza un script que escriba una pirámide del 1 al 30 de la siguiente forma :
1
22
333
4444
55555
666666 */

for (let i = 1; i <= 6; i++) {
  let lineaP = '';
  for (let j = 1; j <= i; j++) {
    lineaP += i;
  }
  console.log(lineaP);
}

/* En este script, se utiliza un bucle `for` para iterar a través de los números
 del 1 al 6, que representan el número de líneas en la pirámide.
 Para cada número, se construye una cadena que contiene el número repetido
  el mismo número de veces que su valor (por ejemplo, para el número 3,
 se concatenan tres veces el número 3). Luego, se imprime cada línea en la consola. */

 /**************************************************************************************** */

// Variable para almacenar el resultado
let piramide = '';

// Bucle para generar cada fila de la pirámide
for (let i = 1; i <= 30; i++) {
  // Concatenar el número actual repetido i veces
  piramide += `${i}`.repeat(i) + '\n';
}

// Mostrar la pirámide en la consola
console.log(piramide);


/* Este script utiliza un bucle `for` que se ejecuta desde 1 hasta 30.
En cada iteración del bucle, se genera una fila de la pirámide concatenando
 el número actual (`i`) repetido `i` veces.
  Luego se agrega un salto de línea para pasar a la siguiente fila.

Finalmente, la pirámide resultante se muestra en la consola. 

Este patrón se logra utilizando el método `repeat()` de las cadenas de JavaScript,
 que crea y devuelve una nueva cadena con un determinado número de copias concatenadas
 de la cadena original. */

