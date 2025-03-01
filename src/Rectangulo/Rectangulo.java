package Rectangulo;

public class Rectangulo {
    // Atributos
    public float base, altura;

    //Metodo constructor
    public Rectangulo(){
        base = 0;
        altura = 0;
    }

    public void mostrarArea(){

        System.out.println("---------------------------------------------");
        System.out.println("\tEl area del rectangulo es: " + (base * altura));
        System.out.println("---------------------------------------------");
    }
}
