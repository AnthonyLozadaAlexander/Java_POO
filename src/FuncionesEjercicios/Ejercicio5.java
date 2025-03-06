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

        System.out.println("------------BIENVENIDO-----------");
    do{
        n1 = 0; n2=0;

            System.out.println("-----------------------------");
            System.out.print("Ingrese el primer número -> ");
            n1 = input.nextFloat();
            System.out.print("Ingrese el segundo número -> ");
            n2 = input.nextFloat();

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

    }while(true);
    }
}
