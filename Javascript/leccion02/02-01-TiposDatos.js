//Tipos de datos en JavaScript
/*
La sintaxis es igual a Java
*/

var nombre = 'Renzo '; //Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre)
nmombre = 12.3;
console.log(typeof nombre)
// Tipo numérico
var numero = 3000; //Tipo Numérico
console.log(numero);

var objeto = {
    nombre : "Renzo",
    apellido : "Viscio",
    telefono : "2604474623"
}

console.log(objeto);

//Tipo de dato booleano
var bandera = true;
console.log(bandera)

//Tipo de dato function
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi símbolo");
console.log(typeof simbolo)

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);

//Tipo de dato undefined
var x;
console.log(x);

x = undefined;
console.log(typeof x);

//null: ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ['Citroen', 'Audi', 'BMW', 'Ford'];
console.log(autos);
console.log(typeof autos);

var z = '';
console.log(z);
console.log(typeof z);
