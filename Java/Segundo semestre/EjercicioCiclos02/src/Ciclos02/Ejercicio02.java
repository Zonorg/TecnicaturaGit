/* Ejercicio 2
Leer un n�mero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un 0.
*/
package Ciclos02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un n�mero: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero >= 0){
                System.out.println("El n�mero "+numero+" es positivo");
            }
            else{
                System.out.println("El n�mero "+numero+" es negativo");
            }
            System.out.println("Digite otro n�mero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El n�mero "+numero+" finaliza el programa");
    }
}
