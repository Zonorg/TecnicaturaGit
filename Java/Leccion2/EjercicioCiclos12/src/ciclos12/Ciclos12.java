/*
Ejercicio 12: pedir un n�mero y calcular su factorial, hacerlo con Scanner y JOptionPane
 */
package ciclos12;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        //System.out.println("Digite un n�mero");
        //int numero = Integer.parseInt(entrada.nextLine());
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un n�mero"));
        for(int i=1; i<=numero;i++){
            factorial *= i;
            
        }
        //System.out.println("\nEl factorial del n�mero ingresado es: " + factorial);
        JOptionPane.showMessageDialog(null, "El factorial del n�mero ingresado es: " + factorial);
    }
    
}
