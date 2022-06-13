
package clases;

import java.util.Scanner;

public class Clases {

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

//FIN CLASE 4 -------------------
//CLASE 5 ------------
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
        //Fin Clase 5 ----------------------------
        //CLASE 6 ----------------------------------------------------------------
        //Tipos primitivos booleanos 
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

        //Pedir un valor 
        var sc = new Scanner(System.in).useDelimiter("\n");
//        System.out.print("Digite su edad: ");
//        age = Integer.parseInt(sc.nextLine());
//        System.out.println("edad = " + age);

        //conversion de tipos primitivos parte
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var fraseChar = "programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);

        System.out.print("Digite un caracter: ");
        fraseChar = sc.nextLine().charAt(0);

        System.out.println("fraseChar = " + fraseChar);

    }
    
}
