package Trapecio;

public class Trapecio {

    //Atributos del trapecio
    private float base_Mayor;
    private float base_Menor;
    private float altura;

    // Constructor
    public Trapecio(){

    }
    // Metodos setters: nos permiten asignar datos a los atributos
    public void setBase_Mayor(float base_Mayor){
        this.base_Mayor = base_Mayor;
    }

    public void setBase_Menor(float base_Menor){
        this.base_Menor = base_Menor;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void CalcularArea(){
        System.out.println("El area del trapecio es: " + ((base_Mayor + base_Menor) * altura) / 2 + " cm^2");
    }
}
