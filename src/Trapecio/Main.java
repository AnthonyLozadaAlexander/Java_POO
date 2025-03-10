package Trapecio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float baseMayor, baseMenor, altura;

        System.out.print("Ingrese la base mayor -> ");
        baseMayor = input.nextFloat();
        System.out.print("Ingrese la base menor -> ");
        baseMenor = input.nextFloat();
        System.out.print("Ingrese la altura -> ");
        altura = input.nextFloat();

        Trapecio datosTrapecio = new Trapecio(); // Instancia de la clase Trapecio y creacion de un objeto de la clase Trapecio

        // Asignamiento de valores a los atributos de la clase Trapecio
        datosTrapecio.setBase_Mayor(baseMayor);
        datosTrapecio.setBase_Menor(baseMenor);
        datosTrapecio.setAltura(altura);
        datosTrapecio.CalcularArea();
    }
}

