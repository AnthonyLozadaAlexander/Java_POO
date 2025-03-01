package Circulo;

public class Circulo {
   private float radio;

   public Circulo(){
       radio = 0;
   }

   //Setters este metodo me permite asignar datos a los atributos
    public void setRadio(float radio){
       this.radio = radio;
    }

    //Getters este metodo me permite obtener datos de los atributos
    public float getRadio(){
       return radio;
    }

    public void CalcularArea(){
        System.out.println("El area del circulo es: " + (Math.PI * Math.pow(radio, 2)));
    }
}
