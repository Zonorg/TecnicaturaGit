/*
Proyecto caja:
Ejercicio 1: crear un proyecto seg�n las especificaciones mostradas a continuaci�n.
F�rmula: volumen = alto * ancho * profundidad
 */
package caja;

public class PruebaCaja {

    public static void main(String[] args) { //M�todo main
     //Variables locales
     int medidaAncho = 3; //Valores ingresados en c�digo duro
     int medidaAlto = 2;
     int medidaProf = 6;
     
     Caja caja1 = new Caja(); //Instanciamos el objeto, constructor vac�o
     caja1.ancho = medidaAncho;
     caja1.alto = medidaAlto;
     caja1.profundidad = medidaProf;
     int resultado = caja1.calcularVolumen(); //Llamamos al m�todo
     //Primer resultado
     System.out.println("El volumen de caja 1 es: " + resultado);
        
     Caja caja2 = new Caja(2, 4, 6); //Llamamos al constructor 2 con nuevos argumentos
     //Lllamamos con el nuevo objeto al m�todo para un nuevo c�lculo
     System.out.println("El volumen de caja 2 es: " + caja2.calcularVolumen());
    }
    
}
