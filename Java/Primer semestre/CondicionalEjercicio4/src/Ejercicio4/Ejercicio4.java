
package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un número del 1 al 10: ");
        var num = Integer.parseInt(sc.nextLine());
        var calificacion = "fuera de rango";
        switch(num){
            case 1: case 2: case 3:
                calificacion = "F";
                break;
            case 4: case 5:
                calificacion = "E";
                break;
            case 6:
                calificacion = "D";
                break;
            case 7:
                calificacion = "C";
                break;
            case 8:
                calificacion = "B";
                break;
            case 9: case 10:
                calificacion = "A";
                break;
        }
        System.out.println("La calificación es: " + calificacion);
    }
    
}
