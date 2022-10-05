//Ejercicio 1: Leer un n�mero y mostrar su cuadrado, 
//repetir el proceso hasta que se introduzca un n�mero negativo
package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un n�mero: "));
        while(numero >= 0){ //Mientras el n�mero sea igual a 0 o positivo
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El n�mero "+numero+" elevado al cuadrado es: "+cuadrado);
            System.out.println("Digite otro n�mero: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro n�mero: "));
        }
        System.out.println("El programa ha finalizado por n�mero negativo");
    }
}
