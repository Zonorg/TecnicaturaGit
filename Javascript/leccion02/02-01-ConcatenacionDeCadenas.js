var nombre = 'Jose';
var apellido = ' Montes';
var nombreCompleto = nombre+apellido;
console.log(nombreCompleto)
var nombrecompleto2 = 'Ariel'+' '+'Betancud';
console.log(nombrecompleto2);
var juntos = nombre + 219 + 20; //Sin paréntesis solo concatena los números como tipo Str
console.log(juntos)
juntos = nombre + (78 + 17); //Al colocar paréntesis generamos una suma entre enteros
console.log(juntos);
juntos = 78 + 17 + nombre; //Colocandolos al principio la consola toma los números como enteros
console.log(juntos);

nombre += apellido; //Concatenación usando el operador simplificado
console.log(nombre);

//Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Perez"; una constante no puede ser modificada
console.log(apellido2);

let x,y; //Se pueden crear varias variables dentro de una misma línea
x = 17, y = 21 //Se pueden asignar múltiples variables dentro de la misma línea
let z = x + y; //Se puede asignar el valor de la operación
console.log(z);

let _1num = 31; //No utilizar números para iniciar el nombre de una variable
let rompiendo = "rompe"; //No utilizar palabras reservadas para variables

console.log(_1num);
console.log(rompiendo);
