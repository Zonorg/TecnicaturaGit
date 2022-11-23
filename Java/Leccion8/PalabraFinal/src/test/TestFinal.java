/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo donde se aplique:
variables: evita cambiar el valor que almacena la variable
métodos: evita que se modifique la definición o el comportamiento de un método desde una subclase
clase: evita que se creen clases hijas
*/
package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        final int miDni = 40688873;
        System.out.println("miDni = " + miDni);
        //miDni = 203821; En este caso no permite que se almacene otra variable nueva
        //Persona.CONSTANTE_AQUI = 9; //No se modifica
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona();  No se puede asignar una nueva referencia
        persona1.setNombre("Ariel Betancud");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Liliana");
        System.out.println("persona1: nombre: " + persona1.getNombre());
    }
    
}
