package PerimetroCirculo;

public class Circulo {

    private float radio;
    private final double pi2 = 3.1416;

    public Circulo(){

    }

    public void calcularPerimetro(){
        System.out.println("El perimetro del circulo es: " + (2 * pi2 * radio));
    }

    public float getRadio(){
        return radio;
    }

    public void setRadio(float radio){
        this.radio = radio;
    }

    public double getPi2(){
        return pi2;
    }

}
