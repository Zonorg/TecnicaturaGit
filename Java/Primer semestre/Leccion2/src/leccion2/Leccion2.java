
package leccion2;

import java.util.Scanner;

public class Leccion2 {

    public static void main(String[] args) {
//        //CLASE 10
//        //Sentencias de control if else
//        var condicion = false;
//        if(condicion){
//            System.out.println("Condición verdadera"); //Condicional simple
//        }
//        else{
//            System.out.println("Condición falsa"); //Condicional doble
//        }
//        
//        //Ejercicio con la condicion if else
//        var num = 5;
//        var numText = "Número desconocido";
//        if (num == 1){
//            numText = "Número uno";
//        }
//        else if (num == 2){
//            numText = "Número dos";
//        }
//        else if (num == 3){
//            numText = "Número tres";
//        }
//        else if (num == 4){
//            numText = "Número cuatro";
//        }
//        else{
//            numText = "Número no encontrado";
//        }
//        System.out.println("numText = " + numText);
//        
//        
//        //Sentencia de control switch
//        //Ejemplo 1
//        var num = 10;
//        var numText = "Valor desconocido";
//        switch(num){
//            case 1:
//                numText = "Número uno";
//                break;
//            case 2:
//                numText = "Número dos";
//                break;
//            case 3:
//                numText = "Número tres";
//                break;
//            case 4:
//                numText = "Número cuatro";
//                break;
//            default:
//                numText = "Caso no encontrado";
//        }
//        System.out.println("Número: " + numText);
//        
        //Ejemplo 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un número del 1 al 4: ");
        var num = Integer.parseInt(sc.nextLine());
        var numText = "Valor desconocido";
        switch(num){
            case 1:
                numText = "Número uno";
                break;
            case 2:
                numText = "Número dos";
                break;
            case 3:
                numText = "Número tres";
                break;
            case 4:
                numText = "Número cuatro";
                break;
            default:
                numText = "Número no encontrado";
        }
        System.out.println("Número: " + numText);
    }
    
}
