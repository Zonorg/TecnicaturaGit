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

nombre += apellido;
console.log(nombre);
