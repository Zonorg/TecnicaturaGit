
package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        //Ejercicio 4: mayor de dos números
        int a,b;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Digite el valor de a: ");
        a = sc.nextInt();
        System.out.println("Digite el valor de b:");
        b = sc.nextInt();
        
        var resultado = (a > b) ? "a es mayor que b" : "a es menor que b";
        System.out.println(resultado);
        
    }
    
}
