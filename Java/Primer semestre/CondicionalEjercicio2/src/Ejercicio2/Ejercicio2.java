
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Estaciones del año con clase switch
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un número del mes: ");
        var mes = Integer.parseInt(sc.nextLine());
        var estacion = "estación desconocida";
        switch(mes){
            case 12: case 1: case 2:
                estacion = "verano";
                break;
            case 3: case 4: case 5:
                estacion = "otoño";
                break;
            case 6: case 7: case 8:
                estacion = "invierno";
                break;
            case 9: case 10: case 11:
                estacion = "primavera";
                break;
        }
        System.out.println("La estación del año es: " + estacion);
    }
}
