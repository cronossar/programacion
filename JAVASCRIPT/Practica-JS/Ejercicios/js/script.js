/*ejercicio 1
function saludo1(){
    var tiempo = prompt("¿Cómo esta el día de hoy?")
    alert("El día está " + tiempo);
};
//ejercicio 2
function calc_area(){
    var radio = prompt("Ingresa un valor para el radio de la circunferencia");
    var pi = 3.141516;
    let area = pi * (radio * radio);
    alert ("Para el radio dado, el área del circulo es :" + area);

    alert("Con el radio dado, calculare el perímetro");
    let peri = (2*pi) * radio;
    alert ("Para el radio dado, el perímetro del circulo es :" + peri);
}*/
//ejercicio 3
/*function edad(){
  const mayor="21";
  alert("Ingresa tu edad y te dire si eres mayor de edad");
  var edad = prompt("Ingresa un valor para la edad");
  
  if (edad >= mayor) {alert("Eres mayor de edad");
} else {alert("No tienes la edad suficiente"); 
}
}*/

//ejercicio4
/*function veriletra(){
    var letra = prompt("Ingrese una letra, pero solo puede ser : S ó N);
    var veri = "S";
}
var letra = */


//ejercicio6
/*Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”*/
/*function par_impar(){
  var num = prompt("Ingresa un numero entero");
    
  if (num == 0) {
    alert("No se puede procesar el numero cero"); 
  }else if (num %2 == 0){
    alert("El numero ingresado es PAR");
  }else{
    alert("El numero ingresado es IMPAR");
  }
}*/

//ejercicio7
/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial*/
function num_limite(){
  var limite = parseInt(prompt("Ingrese un numero entero positivo de REFERENCIA"));
  var cont = 0;
  do {
    var num = parseInt(prompt("Ingrese numeros enteros positivos"));
    cont = cont + num;
  } while (cont <= limite);

  alert("Yata")
}

  






/*switch (expr) {
    case 'Naranjas':
      console.log('El kilogramo de naranjas cuesta $0.59.');
      break;
    case 'Mangos':
    case 'Papayas':
      console.log('El kilogramo de mangos y papayas cuesta $2.79.');
      break;
    default:
      console.log('Lo lamentamos, por el momento no disponemos de ' + expr +
  '.');
  } */
