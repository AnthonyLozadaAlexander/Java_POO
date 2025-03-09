package Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float r;

        System.out.println("-----------------");
        System.out.println("Ingrese el radio del circulo");
        r = input.nextFloat();

        Circulo datos = new Circulo();
        // datos.radio = 10;
        datos.setRadio(r);

        System.out.println("El radio del circulo es: " + datos.getRadio());
        datos.CalcularArea();

    }
}
