
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float guillermo,luis,juan,total;
        System.out.println("Digite la cantidad de dinero de Guillermo: ");
        guillermo = sc.nextFloat();
        
        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        total = luis + guillermo + juan;
        System.out.println("El dinero de Luis: US$" +luis);
        System.out.println("El dinero de Juan es: US$" +juan);
        System.out.println("El total de dinero entre los tres es: US$" +total);
    }
    
}
