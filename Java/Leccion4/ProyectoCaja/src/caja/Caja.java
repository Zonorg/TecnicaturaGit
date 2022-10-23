
package caja; //Package

public class Caja { //Clase publica Caja
    //Atributos(caracter�sticas)
    int ancho;
    int alto;
    int profundidad;
    //M�todos y constructores(acciones)
    public Caja() { //Constructor 1 = vac�o
    }
    //Constructor con par�metros
    public Caja(int ancho, int alto, int profundidad) { //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    public int calcularVolumen() { //M�todo para calcular
        return ancho * alto * profundidad;
    }
}
