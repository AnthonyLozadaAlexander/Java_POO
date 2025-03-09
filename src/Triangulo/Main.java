package Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Objeto Triangulo.Triangulo
        //Triangulo.Triangulo datos = new Triangulo.Triangulo();

        //datos.base = 10; (asignandole un valor al atributo base)

        float b, a;
        System.out.println("Ingrese la base del triangulo");
        System.out.print("-> ");
        b = input.nextFloat();

        System.out.println("-----------------------------");
        System.out.println("Ingresa la altura del triangulo");
        System.out.print("-> ");
        a = input.nextFloat();

        Triangulo datos = new Triangulo(b, a);
        datos.CalcularArea();
    }
}
