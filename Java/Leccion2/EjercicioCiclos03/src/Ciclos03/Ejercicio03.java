
package Ciclos03;

import javax.swing.JOptionPane;

public class Ejercicio03 {
   
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un n�mero: "));
        System.out.println("Digite un n�mero: ");
        while(numero != 0 ){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El n�mero ingresado "+numero+" es PAR");
            }
            else{
                JOptionPane.showMessageDialog(null, "El n�mero ingresado "+numero+" es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro n�mero: "));
        }
        JOptionPane.showMessageDialog(null, "El n�mero "+numero+" finaliza el programa");
    }
    
}
