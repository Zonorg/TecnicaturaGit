
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Estaciones del a�o con clase switch
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un n�mero del mes: ");
        var mes = Integer.parseInt(sc.nextLine());
        var estacion = "estaci�n desconocida";
        switch(mes){
            case 12: case 1: case 2:
                estacion = "verano";
                break;
            case 3: case 4: case 5:
                estacion = "oto�o";
                break;
            case 6: case 7: case 8:
                estacion = "invierno";
                break;
            case 9: case 10: case 11:
                estacion = "primavera";
                break;
        }
        System.out.println("La estaci�n del a�o es: " + estacion);
    }
}
