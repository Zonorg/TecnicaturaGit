
package leccion2;

import java.util.Scanner;

public class Leccion2 {

    public static void main(String[] args) {
//        //CLASE 10
//        //Sentencias de control if else
//        var condicion = false;
//        if(condicion){
//            System.out.println("Condici�n verdadera"); //Condicional simple
//        }
//        else{
//            System.out.println("Condici�n falsa"); //Condicional doble
//        }
//        
//        //Ejercicio con la condicion if else
//        var num = 5;
//        var numText = "N�mero desconocido";
//        if (num == 1){
//            numText = "N�mero uno";
//        }
//        else if (num == 2){
//            numText = "N�mero dos";
//        }
//        else if (num == 3){
//            numText = "N�mero tres";
//        }
//        else if (num == 4){
//            numText = "N�mero cuatro";
//        }
//        else{
//            numText = "N�mero no encontrado";
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
//                numText = "N�mero uno";
//                break;
//            case 2:
//                numText = "N�mero dos";
//                break;
//            case 3:
//                numText = "N�mero tres";
//                break;
//            case 4:
//                numText = "N�mero cuatro";
//                break;
//            default:
//                numText = "Caso no encontrado";
//        }
//        System.out.println("N�mero: " + numText);
//        
        //Ejemplo 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un n�mero del 1 al 4: ");
        var num = Integer.parseInt(sc.nextLine());
        var numText = "Valor desconocido";
        switch(num){
            case 1:
                numText = "N�mero uno";
                break;
            case 2:
                numText = "N�mero dos";
                break;
            case 3:
                numText = "N�mero tres";
                break;
            case 4:
                numText = "N�mero cuatro";
                break;
            default:
                numText = "N�mero no encontrado";
        }
        System.out.println("N�mero: " + numText);
    }
    
}
