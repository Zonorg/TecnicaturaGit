package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Ejercicio 1: Tienda de libros
        Scanner sc = new Scanner(System.in).useDelimiter("\n");    
        System.out.print("Digite el nombre del libro: ");
        String name = sc.nextLine();
        System.out.print("Digite el id del libro: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Digite el precio del libro: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Confirme si el envio es gratis: ");
        boolean freeShip = Boolean.parseBoolean(sc.nextLine());
        System.out.println(name + " #" + id);
        System.out.println("Precio del libro: $" + price);
        System.out.println("El envio del libro es: " + freeShip);
        
    }
    
}
