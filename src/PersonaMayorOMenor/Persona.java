package PersonaMayorOMenor;

public class Persona {

    private String name;
    private int age;

    public Persona(){ //Metodo Constructor

    }

    public void setNombre(String name){
        this.name = name;
    }

    public void setEdad(int age){
        this.age = age;
    }

    public void validar(){
        if(age >= 18){
            System.out.println("La persona " + name + " es mayor de edad");
        }else{
            System.out.println(name + " eres menor de edad");
        }
    }
}
