/*
Ejercicio 6: pedir n�meros hasta que se teclee un 0, mostrar la suma de todos los n�meros introducidos
 */
package Ciclos06;

import java.util.Scanner;

public class Ciclos06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,suma = 0;
        do{
            System.out.println("Digite un n�mero");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }while(numero != 0);
        System.out.println("La suma de todos los n�meros ingresados es: "+suma);
    }
    
}
