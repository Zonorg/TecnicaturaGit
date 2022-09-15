
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Ejercicio 3: rectángulo
        
        int a,b,q,p;
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Digite el álto del rectángulo: ");
        a = entrada.nextInt();
        System.out.print("Digite el ancho del rectángulo: ");
        b = entrada.nextInt();
        
        q = a * b;
        p = (a + b * 2);
        System.out.print("El área del rectángulo es: " + q + "\n");
        System.out.println("El perimetro del rectángulo es: " + p);

    }
    
}
