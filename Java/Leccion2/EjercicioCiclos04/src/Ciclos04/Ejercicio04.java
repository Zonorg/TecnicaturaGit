
package Ciclos04;

import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un n�mero: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El n�mero "+numero+" es positivo");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro n�mero: "));
        }
        JOptionPane.showMessageDialog(null, "Ha ingresado "+conteo+" n�meros que no son negativos");
    }

}
