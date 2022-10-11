
package ejercicio05;

import javax.swing.JOptionPane;

public class Ejercicio05 {

    public static void main(String[] args) {

        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); // Esto genera un n�mero aleatorio
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un n�mero: "));
            if(numero < aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un n�mero mayor");
            }
            else if(numero > aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un n�mero menor");
            }
            else{
                JOptionPane.showMessageDialog(null, "�Felicidades! Has adivinado el n�mero");
            }
            conteo++;
        }while(numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Adivinaste el n�mero en "+conteo+" intentos");
    }
    
}
