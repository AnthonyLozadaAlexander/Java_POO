package Persona;

public class Persona {
    //Atributos
    String nombre;
    String apellidos;
    byte edad;

    //Constructor
    Persona(){
        System.out.println("\nMi primer POO"); //
    }

    //Comportamientos o Metodos
    public void mostrar(){
        System.out.println(nombre + " " + apellidos + " Buenos Dias"); //
    }
}
