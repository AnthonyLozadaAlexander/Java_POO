package PersonaMayorOMenor;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Ingrese el nombre de la persona: ");
        name = input.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        age = input.nextInt();

        Persona datos = new Persona(); // Instanciando la clase Persona
        datos.setNombre(name);
        datos.setEdad(age);

        datos.validar();
    }
}
