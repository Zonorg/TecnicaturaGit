
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        //Sistema de calificaciones con if else
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un número del 1 al 10: ");
        var calificacion = Integer.parseInt(sc.nextLine());
        if(calificacion >= 9 && calificacion <= 10){
            System.out.println("A");
        }
        else if(calificacion >= 8 && calificacion < 9){
            System.out.println("B");
        }
        else if(calificacion >= 7 && calificacion < 8){
            System.out.println("C");
        }
        else if(calificacion >= 6 && calificacion < 7){
            System.out.println("D");
        }
        else if(calificacion >= 4 && calificacion < 6){
            System.out.println("E");
        }
        else if(calificacion > 0 && calificacion < 5){
            System.out.println("F");
        }
        else{
            System.out.println("Fuera de rango");
        }
    }
}
