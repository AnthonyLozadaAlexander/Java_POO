package Triangulo;

public class Triangulo {
    // Atributos

    /* (cuando es public se puede acceder desde la clase principal)
    public float base = 0;
    public float altura = 0;
    */

    private float base = 0;
    private float altura = 0;

    // Constructor
    public Triangulo(){

    }

    public Triangulo(float base, float altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public void CalcularArea(){
        System.out.println("El area del triangulo es: " + (base*altura)/2);
    }
}
