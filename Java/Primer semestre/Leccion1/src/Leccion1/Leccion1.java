
package Leccion1;

import java.util.Scanner;

public class Leccion1 {

    public static void main(String[] args) {
        
//        System.out.println("hola mundo");
//        int miVariable = 10;
//        System.out.println(miVariable);
//        miVariable = 5;
//        System.out.println(miVariable);
//        //tipo string
//        String miVariableCadena = "Bienvenutti";
//        System.out.println(miVariableCadena);
//        miVariableCadena = "Sigamos creciendo en programación";
//        System.out.println(miVariableCadena);
//
//        //Var - inferencia de tipos en Java
//        var miVariableEntera2 = 10;
//        var miVariableCadena2 = "Seguimos estudiando";
//        System.out.println("miVariableEntera2 = " + miVariableEntera2);
//        System.out.println("miVariableCadena2 = " + miVariableCadena2);
//
//        //Reglas para definir una variable en Java
//        var usuario = "Renzo";
//        var titulo = "Estudiante";
//        var union = titulo + " " + usuario;
//        System.out.println("union = " + union);
//
//        var a = 8;
//        var b = 4;
//        System.out.println(usuario + (a + b));
//        //Ejercicio: caracteres especiales con Java
//        var nombre = "Natalia";
//        System.out.println("\nNueva linea: \n" + nombre); // "\n" Hace un salto de linea
//        System.out.println("Tabulador: \t" + nombre); //"\t" Hace una tabulacion
//        System.out.println("\t\t.:MENU:.");
//        System.out.println("Comillas simples: \'" + nombre + "\'");
//        System.out.println("Comillas dobles: \"" + nombre + "\"");
//
//        //Clase Scanner 
//        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        System.out.print("Diga su nombre: ");
//        var usuario2 = sc.nextLine();
//        System.out.println("usuario2 = " + usuario2);
//        System.out.print("Escriba el titulo: ");
//        var titulo2 = sc.nextLine();
//        System.out.println("Resultado: " + titulo2 + " " + usuario2);
//        //Fin clase 3
//
//        //Clase 4
//        byte numEnteroByte = 127;
//        System.out.println("numEnteroByte = " + numEnteroByte);
//        System.out.println("Valor mínimo del Byte: " + Byte.MIN_VALUE);
//        System.out.println("Valor máximo del Byte: " + Byte.MAX_VALUE);
//
//        short numEnteroShort = 32767;
//        System.out.println("numEnteroShort = " + numEnteroShort);
//        System.out.println("Valor mínimo del Short: " + Short.MIN_VALUE);
//        System.out.println("Valor máimo del Short: " + Short.MAX_VALUE);
//
//        int numEnteroInt = 2147483647;
//        System.out.println("numEnteroInt = " + numEnteroInt);
//        System.out.println("Valor mínimo del int: " + Integer.MIN_VALUE);
//        System.out.println("Valor máximo del int: " + Integer.MAX_VALUE);
//
//        long numEnteroLong = 9223372036854775807L;
//        System.out.println("numEnteroLong = " + numEnteroLong);
//        System.out.println("Valor mínimo del long: " + Long.MIN_VALUE);
//        System.out.println("Valor máximo del long: " + Long.MAX_VALUE);
//
//        float numFloat = 3.4028235E38F;
//        System.out.println("numFloat = " + numFloat);
//        System.out.println("Valor mínimo de float: " + Float.MIN_VALUE);
//        System.out.println("Valor máximo de float: " + Float.MAX_VALUE);
//
//        double numDouble = 1.79769313148623157E308D;
//        System.out.println("numDouble = " + numDouble);
//        System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);
//        System.out.println("Valor máximo de double: " + Double.MAX_VALUE);
//
////FIN CLASE 4 -------------------
////CLASE 5 ------------
//        //Inferencia de tipos var y tipos primitivos 
//        var numEntero = 20; //Las literales sin punto automaticamente son tipo int
//        System.out.println("numEntero = " + numEntero);
//        var numFloat = 10.0F; //Automaticamente con el punto se transforma en tipo double
//        System.out.println("numFloat = " + numFloat);
//        var numDouble = 10.0; 
//        System.out.println("numDouble = " + numDouble);
//
//        //Tipos de primitivos char
//        char miVariableChar = 'a';
//        System.out.println("miVariableChar = " + miVariableChar);
//
//        char varCaracter = '\u0024'; //Indicamos a java la asisgnacion con el cógido unicode
//        System.out.println("varCaracter = " + varCaracter);
//
//        char varCaracterDecimal = 36; //Valor decimal del juego de caracteres unicode
//        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
//
//        char varCaracterSimbolo = '$'; // Un caracter especial, podemos copiar y pegar desde unicode
//        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
//
//        int varEnteroChar = '$';
//        System.out.println("varEnteroChar = " + varEnteroChar);
//
//        int caracterChar = 'b';
//        System.out.println("caracterChar = " + caracterChar);
////        Fin Clase 5 ----------------------------
////        CLASE 6 ----------------------------------------------------------------
////        Tipos primitivos booleanos 
//        boolean varBool = true;
//        System.out.println("varBool = " + varBool);
//
//        if (varBool) {
//            System.out.println("La bandera es verde");
//        } else {
//            System.out.println("La bandera es roja");
//        }
//
//        //Algoritmo es mayor de edad; 
//        var age = 30; //Literal tener presente la inferencia de tipos
//        var adulto = age >= 18; //Esta una expresión booleana
//        if (adulto) {
//            System.out.println("Eres mayor de edad");
//        } else {
//            System.out.println("Eres menor de edad");
//        }
//        //Conversion de tipos primitivos 
//        var age = Integer.parseInt("20");
//        System.out.println("edad = " + (age + 1));
//        var valorPi = Double.parseDouble("3.1416");
//        System.out.println("valorPi = " + valorPi);
//
////      Pedir un valor 
//        var sc = new Scanner(System.in).useDelimiter("\n");
//        System.out.print("Digite su edad: ");
//        age = Integer.parseInt(sc.nextLine());
//        System.out.println("edad = " + age);
//
////        conversion de tipos primitivos parte 3
//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto);
//
//        var fraseChar = "programadores".charAt(4);
//        System.out.println("fraseChar = " + fraseChar);
//
//        System.out.print("Digite un caracter: ");
//        fraseChar = sc.nextLine().charAt(0);
//
//        System.out.println("fraseChar = " + fraseChar);
//
//// Clase 7
//        int num1 = 5, num2 = 4;
//        var solucion = num1 + num2;
//        System.out.println("Solución de la suma = " + solucion);
//        
//        solucion = num1 - num2;
//        System.out.println("Solución de la resta = " + solucion);
//        
//        solucion = num1 * num2;
//        System.out.println("Solución de la multiplicación = " + solucion);
//
//        solucion = num1 / num2;
//        System.out.println("Solución de la división = " + solucion);
//        
//        solucion = num1 % num2; //Guarda el residuo o resto
//        System.out.println("Resto = " + solucion);
        
//        if (num1 % 2 == 0) //Número par o impar
//            System.out.println("Par");
//        else
//            System.out.println("Impar");
//        
//        if (num2 % 2 == 0)
//            System.out.println("Par");
//        else
//            System.out.println("Impar");


//// Operadores de asignación
//
//        int varNum1 = 1, varNum2 = 4;
//        var varNum3 = varNum1 + 6 - varNum2;
//        System.out.println("varNum3 = " + varNum3);
//        
//        varNum1 += 1;
//        System.out.println("varNum1 = " + varNum1);
//        varNum2 -= 2;
//        System.out.println("varNum2 = " + varNum2);
//        varNum1 *= 5;
//        System.out.println("varNum1 = " + varNum1);
//        varNum3 /= 4;
//        System.out.println("varNum3 = " + varNum3);
//        varNum1 &= 6;
//        System.out.println("varNum1 = " + varNum1);
//// Fin clase 7

//// Clase 8
//// Operadores unarios
//// Cambio de signo
//        var varA = 7;
//        var varB = -varA;
//        System.out.println("varA = " + varA);
//        System.out.println("varB = " + varB);
//        
//// Negación
//        var varC = true;
//        var varD = !varC; // Invierte el valor booleano
//        System.out.println("varC = " + varC);
//        System.out.println("varD = " + varD);
//        
//// Unarios de incremento       
//// Preincremento (símbolo antes de la variable)
//        var varE = 9;
//        var varF = ++varE; //Primero se incrementa la variable y luego se usa su valor
//        System.out.println("varE = " + varE);
//        System.out.println("varF = " + varF);
//     
//// Postincremento
//        var varG = 3;
//        var varH = varG++;
//        System.out.println("varG = " + varG);
//        System.out.println("varH = " + varH);
//        
//// Predecremento
//        var varI = 4;
//        var varJ = --varI;
//        System.out.println("varI = " + varI);
//        System.out.println("varJ = " + varJ);
//        
//// Postdecremento
//        var varK = 8;
//        var varL = varK--;
//        System.out.println("varK = " + varK);
//        System.out.println("varL = " + varL);
//        
//// Operadores de igualdad
//        var aNum = 5;
//        var bNum = 4;
//        var cNum = (aNum == bNum); //Compara igualdad entre números
//        System.out.println("cNum = " + cNum);
//        
//        var dNum = (aNum != bNum); //Desigualdad
//        System.out.println("dNum = " + dNum);
//        
//        var cadenaA = "Hello";
//        var cadenaB = "Bye bye";
//        var cVar = cadenaA == cadenaB; //Compara si el contenido de las var tipo char es igual
//        System.out.println("cVar = " + cVar);
//        
//        var fvar = cadenaA.equals(cadenaB);
//        System.out.println("fvar = " + fvar);
    
//// Operadores relacionales
//        var gVar = aNum != bNum; // > >= < <= == !=
//        System.out.println("gVar = " + gVar);
//        
//        //Ejercicio mayor de edad
//        var edad = 15;
//        var adulto = 18;
//        if (edad >= adulto) {
//            System.out.println("Es mayor de edad");
//        }
//        else {
//            System.out.println("Es menor de edad");
//        }
//
//// Operadores condicionales
//        //Ejercicio dentro del rango
//        var valorA = 5;
//        var valorMinimo = 0;
//        var valorMaximo = 10;
//        var respuesta = valorA >= valorMinimo && valorA <= valorMaximo;
//        
//        if (respuesta) {
//            System.out.println("Está dentro del rango");
//        }
//        else {
//            System.out.println("Está fuera del rango");
//        }
//        
//        //Ejercicio vacaciones
//        var vacaciones = false;
//        var diaLibre = true;
//        if (vacaciones || diaLibre) {
//            System.out.println("Puede ir al juego de su hijo");
//        }
//        else {
//            System.out.println("No puede ir al juego de su hijo");
//        }
//        
//// Operador ternario
//        var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
//        System.out.println("resultadoT = " + resultadoT);
//        
//        var numeroT = 5;
//        resultadoT = (numeroT % 2 == 0) ? "Par" : "Impar";
//        System.out.println("resultadoT = " + resultadoT);
//        
//// Prioridad de los operadores
//        var x = 5;
//        var y = 10;
//        var z = ++x + y--;
//        System.out.println("x = " + x); //6
//        System.out.println("y = " + y); //9
//        System.out.println("z = " + z); //16
//        
//        var solucionAritmetica = 4 + 5 * 6 / 3; //4+((5*6)/3) = 14
//        System.out.println("solucionAritmetica = " + solucionAritmetica);
//        
//        solucionAritmetica = (4+5) * 6 / 3; //((4+5)*6)/3 = 18
//        System.out.println("solucionAritmetica = " + solucionAritmetica);
//        //FIN CLASE 8

////CLASE 9: Ejercicios hechos aparte

////FIN LECCION 1
     }
    
}
