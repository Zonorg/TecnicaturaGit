/*
Ejercicio 9: pedir el d�a, mes y a�o de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 d�as
 */
package Ciclos09;

import java.util.Scanner;

public class Ciclos09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, a�o;
        System.out.println("Digite el d�a: ");
        dia = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el mes: ");
        mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el a�o: ");
        a�o = Integer.parseInt(entrada.nextLine());
        if((dia != 0) &&(dia <= 30)){
            if((mes != 0) &&(mes <= 12)){
                if((a�o != 0) && (a�o <= 2022)){
                    System.out.println("La fecha ingresada es: "+dia+"/"+mes+"/"+a�o);
                }
                else{
                    System.out.println("Fecha incoreccta, a�o incorrecto");
                }
            }
            else{
                System.out.println("Fecha incorrecta, mes incorrecto");
            }
        }
        else{
            System.out.println("Fecha incorrecta, d�a incorrecto");
        }
    }
    
}
