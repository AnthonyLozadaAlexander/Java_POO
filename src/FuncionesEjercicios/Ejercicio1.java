package FuncionesEjercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static String multiplicar(int n, int i){
        return n + " x " + i + " = " + (n * i);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Ingrese un numero entero para mostrar su tabla de multiplicar: ");
            System.out.print("-> ");

            if (!input.hasNextInt()) {
                String error = input.nextLine();
                System.out.println("\nError: " + error + " no es un numero entero. Intentelo Denuevo\n");
                continue;
            }
            n = input.nextInt();

            if(n <= 0){
                System.out.println("\nError: El numero debe ser mayor a 0. Intentelo Denuevo\n");
            }
            else{
                for(int i = 0; i <= 12; i++){
                    System.out.println(multiplicar(n, i));
                }
            }

        }while(n <= 0);
    }
}
