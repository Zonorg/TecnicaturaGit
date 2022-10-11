/*
Ejercicio 5: realizar un juego para adivinar un n�mero, para ello generar un n�mero aleatorio entre 0-100
Luego ir pidiendo n�meros indicando si son mayores o menos al n�mero N
El proceso termina cuando el usuario acierta y mostramos el n�mero de intentos hechos
*/
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); // Esto genera un n�mero aleatorio
        do{
            System.out.println("Digite un n�mero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero < aleatorio){
                System.out.println("Digite un n�mero mayor");
            }
            else if(numero > aleatorio){
                System.out.println("Digite un n�mero menor");
            }
            else{
                System.out.println("�Felicidades! Has adivinado el n�mero");
            }
            conteo++;
        }while(numero != aleatorio);
        System.out.println("Adivinaste el n�mero en "+conteo+" intentos");
    }
    
}
