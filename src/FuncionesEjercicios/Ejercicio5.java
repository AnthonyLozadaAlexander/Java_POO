package FuncionesEjercicios;
import java.util.Scanner;

public class Ejercicio5 {
    public static float calcularSuma(float a, float b){
        return a + b;
    }
    public static float calcularMultiplicacion(float a, float b){
        return a * b;
    }
    public static float calcularResta(float a, float b){
        return a - b;
    }
    public static float calcularDivision(float a, float b){
        return a / b;
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float n1, n2;
    int opc=0;
    String respuesta="";

        System.out.println("------------BIENVENIDO-----------");
    do{
        n1 = 0; n2=0;

            System.out.println("\n-----------------------------");
            System.out.print("Ingrese el primer número -> ");
            n1 = input.nextFloat();
            System.out.print("Ingrese el segundo número -> ");
            n2 = input.nextFloat();
            System.out.println("--------------------------------");

        System.out.println("--------------------------------");
        System.out.println("       1. Sumar");
        System.out.println("       2. Restar");
        System.out.println("       3. Multiplicar");
        System.out.println("       4. Dividir");
        System.out.println("------------------------------\n");

        System.out.print("Ingrese una opción -> ");
        if(!input.hasNextInt()){
            System.out.println("\nError: Ingrese un número válido\n");
            input.next(); // Limpiar buffer
            continue;
        }
        opc = input.nextInt();

        if(opc == 1){
            System.out.println("\n----------------------------------");
            System.out.println("La suma es: " + calcularSuma(n1, n2));
            System.out.println("-----------------------------------\n");
        }
        else if(opc == 2){
            System.out.println("\n----------------------------------");
            System.out.println("La resta es: " + calcularResta(n1, n2));
            System.out.println("-----------------------------------\n");
        }
        else if(opc == 3){
            System.out.println("\n------------------------------------");
            System.out.println("La multiplicacion es: " + calcularMultiplicacion(n1, n2));
            System.out.println("-------------------------------------\n");
        }
        else if(opc == 4){
            System.out.println("\n----------------------------------");
            System.out.println("La division es: " + calcularDivision(n1, n2));
            System.out.println("-----------------------------------\n");
        }
        else{
            System.out.println("\nError: Opcion Incorrecta\n");
        }

            input = new Scanner(System.in); // Limpiar buffer
            do {
                System.out.println("\n¿Desea continuar? (s/n)");
                System.out.print("-> ");
                respuesta = input.nextLine();

                // Verificar si la entrada es un número
                if(respuesta.matches("\\d+")) {
                    System.out.println("\nError: Ha ingresado un número. Por favor, ingrese 's' o 'n'.\n");
                    continue;
                }

                // Verificar si la respuesta es válida
                if(respuesta.equalsIgnoreCase("s")) {
                    break; // Sale del bucle interno para continuar con el programa
                }
                else if(respuesta.equalsIgnoreCase("n")) {
                    System.out.println("\nGracias Por Usar El Programa\n");
                    return; // Finaliza el programa
                }
                else {
                    System.out.println("\nError: Opción Incorrecta. Debe ingresar 's' o 'n'.\n");
                }
            } while(true);

        }while(true);
    }
}
