
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int salario = 1000;
        int comision = 150,venta;
        float salarioMensual, ventaCarro, porcVenta, totalPrecio;
        
        System.out.print("Digite la cantidad de carros vendidos: ");
        venta = sc.nextInt();
        System.out.print("Digite el precio del carro: ");
        ventaCarro = sc.nextFloat();
        
        comision *= venta;
        totalPrecio = ventaCarro * venta;
        porcVenta = totalPrecio * 0.05f;
        salarioMensual = salario + comision + porcVenta;
        System.out.println("El salario mensual es: " + salarioMensual);
    }
    
}
