
package ciclos10;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero, suma = 0;
        for(int i = 1; i <= 10; i ++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un n�mero: "));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los n�meros es: "+suma);
    }
}
