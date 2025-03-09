package Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creacion Del Objeto e Instancia
        Rectangulo datos = new Rectangulo();

        // Ingreso De Datos A Los Atributos Del Objeto
        System.out.println("---------------------------------------------");
        System.out.print("\tIngrese la base del rectangulo: ");
        datos.base = input.nextFloat();
        System.out.print("\tIngrese la altura del rectangulo: ");
        datos.altura = input.nextFloat();
        System.out.println("---------------------------------------------");

        datos.mostrarArea();

    }
}
