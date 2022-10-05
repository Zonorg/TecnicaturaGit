
package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Ejercicio 5: suma de tres calificaciones
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        float nota1,nota2,nota3,suma;
        
        System.out.println("Digite las tres calificaciones: ");
        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();
        
        suma = nota1 + nota2 + nota3;
        System.out.println("La suma es: " + suma);
        
                
    }
    
}
