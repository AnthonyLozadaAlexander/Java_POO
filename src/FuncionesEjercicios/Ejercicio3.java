package FuncionesEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static boolean esPrimo(int num){

        if (num <= 1) {
            return false;
        }
        else if(num == 2){
            return true;
        }
        else{
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Ingrese hasta que numero desea saber si es primo");
            System.out.print("-> ");

            if(!input.hasNextInt()){
                String error = input.nextLine();
                System.out.println("\nError: " + error + " no es un numero valido. Intentelo Denuevo\n");
                input.next(); // limpiar el buffer del scanner
                continue;
            }

            num = input.nextInt();
            if(num <= 1){
                System.out.println("\nError: " + num + " no es un numero valido. Intentelo Denuevo\n");
            }
            else{
                for(int i = 1; i <= num; i++){
                    System.out.println("i = " + i + " es primo? -> " + esPrimo(i));
                    break;
                }
            }
        }while(num <= 1 || !input.hasNextInt());

        System.out.println("\nFin Del Programa. Gracias Por Participar");
    }
}
