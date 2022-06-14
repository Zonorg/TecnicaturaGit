
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //CLASE 10
        //Estaciones del año
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un mes del año: ");
        var mes = Integer.parseInt(sc.nextLine());
        var estacion = "digite un mes del 1 al 12";
        if (mes == 12 || mes == 1 || mes == 2){
            estacion = "Verano";
        }
        else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Otoño";
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Invinierno";
        }
        else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Primavera";
        }
        System.out.println("Estación: " + estacion);
    }
}
