/* Ejercicio 2
Leer un n�mero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un 0.
*/
package Ciclos02;

import javax.swing.JOptionPane;

public class Ciclos02 {
    public static void main(String[] args) {
        
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un n�mero: "));
        System.out.println("Digite un n�mero: ");
        while(numero != 0){
            if(numero >= 0){
                JOptionPane.showMessageDialog(null, "El n�mero "+numero+" es positivo");
            }
            else{
                JOptionPane.showMessageDialog(null, "El n�mero " +numero+" es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro n�mero: "));
        }
        JOptionPane.showMessageDialog(null, "El n�mero "+numero+" finaliza el programa");
    }
}