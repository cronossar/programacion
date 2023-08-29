//ejercicio 1
function saludo1(){
    var tiempo = prompt("¿Cómo esta el día de hoy?")
    alert("El día está " + tiempo);
}
//ejercicio 2
function calc_area(){
    var radio = prompt("Ingresa un valor para el radio de la circunferencia");
    var pi = 3.141516;
    let area = pi * (radio * radio);
    alert ("Para el radio dado, el área del circulo es :" + area);

    alert("Con el radio dado, calculare el perímetro");
    let peri = (2*pi) * radio;
    alert ("Para el radio dado, el perímetro del circulo es :" + peri);
}
//ejercicio 3
function edad(){
  const mayor="21";
  alert("Ingresa tu edad y te dire si eres mayor de edad");
  var edad = prompt("Ingresa un valor para la edad");
  
  if (edad >= mayor) {alert("Eres mayor de edad");
} else {alert("No tienes la edad suficiente"); 
}
}

//ejercicio4
/*Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario
ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. */

function veriletra(){
    var letra = prompt("Ingrese una letra, pero solo puede ser : S ó N");
    letra = letra.toUpperCase();
    if (letra == "S" || letra == "N" ) {
      alert("CORRECTO");
    } else {
      alert("INCORRECTO");
      
    }
}

//ejercicio5
/*Construir un programa que simule un menú de opciones para realizar las cuatro
operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
numéricos enteros. El usuario, además, debe especificar la operación con el primer
carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división*/
/*function calculadora(){
alert("HOLA, ESTA ES UNA CALCULADORA SENCILLA");

var valor1 = parseInt(prompt("Ingrese un valor"));
var valor2 = parseInt(prompt("Ingrese otro valor"));

prompt("Ingresa la primera letra de la operación a realizar")

switch (expr) {
    case 'SUMA':
      alert(El resultado de la SUMA es: ${valor1 + valor2});
      break;
    case 'RESTA':
    case 'MULTIPLICACION':
      
      break;
    case 'DIVIDIR';
      break
    default;
    
  }
}*/

//ejercicio6
/*Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”*/
function par_impar(){
  var num = prompt("Ingresa un numero entero");
    
  if (num == 0) {
    alert("No se puede procesar el numero cero"); 
  }else if (num %2 == 0){
    alert("El numero ingresado es PAR");
  }else{
    alert("El numero ingresado es IMPAR");
  }
}

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

//ejercicio8
/*Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
todos ellos*/
/*Este programa primero inicializa variables para rastrear el máximo,
mínimo, suma total y la cantidad de números ingresados. Luego, entra
en un bucle donde se lee un número entero del usuario en cada iteración.
Si el número es 0, el bucle se rompe. De lo contrario, se actualizan las
variables de máximo, mínimo, suma y cantidad. Finalmente, después de que
el bucle se complete, se calcula el promedio y se muestran los resultados.
// Inicializar variables para el máximo, mínimo y la suma total*/


/*let maximo = Number.MIN_SAFE_INTEGER;
let minimo = Number.MAX_SAFE_INTEGER;
let suma = 0;
let cantidadNumeros = 0;

// Función para leer un número entero desde el usuario
function leerNumero() {
  return parseInt(prompt("Ingresa un número entero (ingresa 0 para finalizar):"));
}

// Leer números hasta que se ingrese 0
while (true) {
  const numero = leerNumero();

  if (numero === 0) {
    break;
  }

  // Actualizar máximo y mínimo
  maximo = Math.max(maximo, numero);
  minimo = Math.min(minimo, numero);

  // Actualizar la suma y cantidad de números
  suma += numero;
  cantidadNumeros++;
}

// Calcular el promedio
const promedio = suma / cantidadNumeros;

// Mostrar resultados
alert("Máximo:"+ maximo);
alert("Mínimo:"+ minimo);
alert("Promedio:"+ promedio);

//################################################################# */ 

//ejercicio9
/*Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
funcionamiento de la función Substring().*/

function frase(){
// Solicitar al usuario que ingrese una frase
var frase = prompt("Por favor, ingresa una frase:");

// Inicializar una cadena vacía para almacenar la frase con espacios entre cada letra
var fraseConEspacios = "";

// Recorrer cada letra en la frase ingresada por el usuario
for (var i = 0; i < frase.length; i++) {
    // Agregar la letra actual a la cadena con un espacio después de ella
    fraseConEspacios += frase.substring(i, i+1) + " ";
}

// Mostrar la frase con espacios entre cada letra
console.log(fraseConEspacios);
alert(fraseConEspacios);
}

//ejercicio10
/*Escribir una función flecha que reciba una palabra y la devuelva al revés. */

function reves(){
  var palabra=prompt("ingrese una palabra");
  var palfinal="";
  for (let index = palabra.length; index >= 0 ; index--) {
    var l= palabra.substring(index,index-1);
    palfinal = palfinal + l;
      
  }
    alert(palfinal);
}

//ejercicio11
/*Escribir una función que reciba un String y devuelva la palabra más larga.
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript”*/

function split(){
let frase = prompt("Ingresa una frase:");
  const palabras = frase.split(' ');
  let palabraLarga = '';

  for (let i = 0; i < palabras.length; i++) {
    if (palabras[i].length > palabraLarga.length) {
      palabraLarga = palabras[i];
    }
  }

alert(palabraLarga);
}

//ejercicio12
/*Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de
dato.*/
function dato(){
  let valor = true;
  const obtenerTipoDeDato = (valor) => {
    return typeof valor;
  };
  
  // Ejemplos de uso
  alert(typeof(valor));
}

//ejercicio13
/*Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer,
'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript.*/

/* var persona = new Object();

persona.nombre = 'Paula';
persona.edad = 40;
persona.sexo = 'M';
persona.peso = 60;
persona.altura = 1.63;

var persona1 = {
nombre: 'Dani',
edad: 40,
sexo: 'M',
peso: 70,
altura: 1.75

}

function persona2 (nombre,edad,sexo,peso,altura){

    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;

}

var pPersona1 = new persona2 ('Juan',42,'M',68,1.73);

console.log(pPersona1);
console.log(persona);
alert(`${pPersona1.nombre}, ${pPersona1.edad}`); */



//ejercicio14
/*Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas*/

function biblio(){

function Libro(ISBN, Titulo, Autor, NumeroDePaginas) {

  this.ISBN = ISBN;
  this.Titulo = Titulo;
  this.Autor = Autor;
  this.NumeroDePaginas = NumeroDePaginas;

}


var Libro1 = new Libro();

Libro1.ISBN = prompt("Ingrese el ISBN");
Libro1.Titulo = prompt("Ingrese el titulo");
Libro1.Autor = prompt("Ingrese el Auto");
Libro1.NumeroDePaginas = prompt("Ingrese el numero de paginas");

alert(`El isbn es: ${Libro1.ISBN} 
el titulo es: ${Libro1.Titulo} 
el Autor ${Libro1.Autor} 
el numero de paginas es ${Libro1.NumeroDePaginas}`);

console.log(Libro1);
}
//ejercicio15
function areayperi(){
  
  // Definir la clase Circulo
class Circulo {
  constructor(radio) {
    this.radio = radio;
  }

  // Método para calcular el área del círculo
  calcularArea() {
    return Math.PI * this.radio * this.radio;
  }

  // Método para calcular el perímetro del círculo
  calcularPerimetro() {
    return 2 * Math.PI * this.radio;
  }
}

// Pedir al usuario que ingrese el radio del círculo
const radioUsuario = parseFloat(prompt("Ingresa el radio del círculo:"));

// Crear una instancia de la clase Circulo
const circulo = new Circulo(radioUsuario);

// Calcular y mostrar el área y el perímetro del círculo
const area = circulo.calcularArea();
const perimetro = circulo.calcularPerimetro();

console.log(`El área del círculo es: ${area.toFixed(2)}`);
console.log(`El perímetro del círculo es: ${perimetro.toFixed(2)}`);
}



<<<<<<< HEAD
//ejercicio23
=======
//Ejercicio23
>>>>>>> c912cdc5dece1f4a72687f11516db41eb8cd8890
function resaltar_amarillo(){

  
    let pes = document.getElementById("parrafo");
    let palabras = pes.textContent.split(" ");

    for (let i = 0; i < palabras.length; i++) {
        if (palabras[i].length > 8) {
            palabras[i] = `<span class="highlight">${palabras[i]}</span>`;
        }
    } 

    pes.innerHTML = palabras.join(" ");

}

<<<<<<< HEAD
//ejercicio24
function calc_area2(){
  
  var radio = prompt("Ingresa un valor para el radio de la circunferencia");
  var pi = 3.141516;
  let area = pi * (radio * radio);
  alert ("Para el radio dado, el área del circulo es :" + area);

  alert("Con el radio dado, calculare el perímetro");
  let peri = (2*pi) * radio;
  alert ("Para el radio dado, el perímetro del circulo es :" + peri);
}

=======
//Ejercicio24

//var formulario= document.getElementById("form");

 function area(){
    //let radio=formulario.value;
    let radio=document.getElementById("form").radio.value;
    let area= Math.PI * radio**2;
    console.log(area.toFixed(2));
    document.getElementById("rarea").innerHTML=`El resultado del area es: ${area.toFixed(2)}`;
   
 }   
    
function perimetro(){
   
    //let radio=formulario[0].value;
    let radio=document.getElementById("form").radio.value;
    let perimetro= 2 * Math.PI * radio;
    console.log(perimetro.toFixed(2));
    document.getElementById("rperimetro").innerHTML=`El resultado del perimetro es: ${perimetro.toFixed(2)}`;
}

//Ejercicio25

function getFormValores(){
  event.preventDefault();
    const nombre = document.getElementById("form1").nombre.value;
    const apellido = document.getElementById("form1").apellido.value;

    console.log("Nombre:", nombre);
    console.log("Apellido:", apellido);

    document.getElementById("p").innerHTML = "Nombre: " + nombre + "<br>Apellido: " + apellido;
    confirm("Seguro que su nombre es: " + nombre + " , " + apellido + " ?");

}
>>>>>>> c912cdc5dece1f4a72687f11516db41eb8cd8890
