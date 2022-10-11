/*
Ejercicio 7: pedir n�meros hasta que se introduzca uno negativo y calcular la media
*/
package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Digite un n�mero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){ //Mientras el n�mero no sea negativo
            suma += numero;
            conteo++;
            System.out.println("Digite otro n�mero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if(conteo==0){
            System.out.println("\nError, la divisi�n entre cero no existe");
        }
        else{
            promedio = (float)suma/conteo;
            System.out.println("\nEl promedio es: " + promedio);
        }
    }
    
}
