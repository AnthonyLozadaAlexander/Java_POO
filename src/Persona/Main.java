package Persona;

public class Main {
    public static void main(String[] args) {
//
       //Creacion De Objeto A Partir De La Clase Persona.Persona.java
       Persona persona1 = new Persona();
       persona1.nombre = "Anthony";
       persona1.apellidos = "Lozada";
       persona1.edad = 20;
       persona1.mostrar();

       // Nuevo Objeto A Partir De Clase La Clase Persona.Persona.java
       Persona persona2 = new Persona();
       persona2.nombre = "Carla";
       persona2.apellidos = "Rodriguez";
       persona2.edad = 19;
       persona2.mostrar();

    }
}