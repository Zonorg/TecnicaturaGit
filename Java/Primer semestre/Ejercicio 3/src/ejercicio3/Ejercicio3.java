
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Ejercicio 3: rect�ngulo
        
        int a,b,q,p;
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Digite el �lto del rect�ngulo: ");
        a = entrada.nextInt();
        System.out.print("Digite el ancho del rect�ngulo: ");
        b = entrada.nextInt();
        
        q = a * b;
        p = (a + b * 2);
        System.out.print("El �rea del rect�ngulo es: " + q + "\n");
        System.out.println("El perimetro del rect�ngulo es: " + p);

    }
    
}
