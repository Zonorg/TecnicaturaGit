
package Ciclos09;

import javax.swing.JOptionPane;

public class Ejercicio09 {

    public static void main(String[] args) {
        int dia, mes, a�o;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el d�a: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        a�o = Integer.parseInt(JOptionPane.showInputDialog("Digite el a�o: "));
        if((dia != 0) &&(dia <= 30)){
            if((mes != 0) &&(mes <= 12)){
                if((a�o != 0) && (a�o <= 2022)){
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es: "+dia+"/"+mes+"/"+a�o);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, a�o incorrecto");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, d�a incorrecto");
        }
    }
    
}
