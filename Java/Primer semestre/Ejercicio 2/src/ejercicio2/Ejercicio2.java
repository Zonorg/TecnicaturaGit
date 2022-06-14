
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Ejercicio 2: Salario de un empleado
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");    

        int horas;
        int sueldo = 350;
        int salario;
        
        System.out.print("Ingrese la cantidad de horas que trabajó el empleado durante el mes: ");
        horas = entrada.nextInt();
        
        salario = horas * sueldo;
        System.out.println("Este mes el empleado cobró: $" + salario);
    }
    
}
