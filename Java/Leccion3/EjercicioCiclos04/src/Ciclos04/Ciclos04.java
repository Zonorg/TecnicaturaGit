/* 
Ejercicio 4: pedir n�meros hasta que se teclee uno negativo y mostrar 
cu�ntos n�meros se han introducido.
Lo hacemos primero con la clase Scanner y luego con JOptionPane
*/
package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Digite un n�mero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("El n�mero "+numero+ " es POSITIVO");
            conteo++;
            System.out.println("Digite otro n�mero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ha ingresado "+conteo+" n�meros que no son negativos");
    }
    
}
