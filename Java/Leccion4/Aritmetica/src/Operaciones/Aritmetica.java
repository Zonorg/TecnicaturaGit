
package Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    
    //El constructor es un m�todo especial
    public Aritmetica() { //Constructor 1 vac�o
        System.out.println("Se est� ejecutando el constructor n�mero uno");
}
    
    public Aritmetica(int a, int b) { //Constructor 2, sobrecarga de constructores
        this.a = a;
        this.b = b;
        System.out.println("Se est� ejecutando el constructor n�mero dos");
    }
    //M�todo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1; //El argumento a se asigna al atributo this.a
        this.b = arg2;
        //return a + b;
        return this.sumarConRetorno();
    }
    
}
