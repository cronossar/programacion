// Itera sobre los números del 1 al 500
for (var i = 1; i <= 500; i++) {
    // Imprime el número actual
    console.log(i);
    
    // Comprueba si el número actual es múltiplo de 4
    if (i % 4 === 0) {
        // Si es múltiplo de 4, imprime el número y señala que es múltiplo de 4
        console.log(i + " (Múltiplo de 4)");
    }
    
    // Comprueba si el número actual es múltiplo de 9
    if (i % 9 === 0) {
        // Si es múltiplo de 9, imprime el número y señala que es múltiplo de 9
        console.log(i + " (Múltiplo de 9)");
    }
    
    // Comprueba si el número actual es divisible por 5 para imprimir una línea horizontal cada 5 líneas
    if (i % 5 === 0) {
        console.log("————————————————————");
    }
}