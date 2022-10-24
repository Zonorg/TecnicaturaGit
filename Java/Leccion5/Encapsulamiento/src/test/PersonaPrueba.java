
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000, false);
        System.out.println("persona1 su nombre es: " + persona1.getNombre());
        System.out.println("persona1 = " + persona1); //Llamando al método toString
        //Modificar a través de los métodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; Ya no se puede utilizar
        //System.out.println("Nombre: " + persona1.nombre); Tampoco se puede utilizar
        System.out.println("persona1 con su nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());
        
        Persona persona2= new Persona("Renzo", 200000, true);
        System.out.println("persona2 nombre: " + persona2.getNombre());
        System.out.println("persona2 sueldo:" + persona2.getSueldo());
        persona2.setNombre("Renzo Viscio");
        persona2.setSueldo(500000);
        System.out.println("persona2 nombre modificado: " + persona2.getNombre());
        System.out.println("persona2 sueldo modificado: " + persona2.getSueldo());
        
        
    }
    
}
