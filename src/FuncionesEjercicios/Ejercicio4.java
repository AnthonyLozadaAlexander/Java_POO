package FuncionesEjercicios;
import java.util.Scanner;

public class Ejercicio4 {

    public static float calcularIncremento(float salario, float x){
        float nuevoSalario = salario + (salario * (x / 100));
        return nuevoSalario;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salario=0, x=0, nuevoSalario=0;
        System.out.println("------------------------------------");
        do {
            System.out.println("Ingrese el salario actual del trabajador");
            System.out.print("-> ");

            if (!input.hasNextFloat()) {
                System.out.println("\nError: Debe Ingresar Un Numero\n");
                input.next();
                continue;
            }
            salario = input.nextFloat();
            if(salario <= 0){
                System.out.println("\nError: El Salario Debe Ser Mayor a 0\n");
                continue;
            }
            else{
                System.out.println("Ingrese el porcentaje del aumento que tendra el trabajador");
                System.out.print("-> ");

                if(!input.hasNextFloat()){
                    System.out.println("\nError: Debe Ingresar Un Numero Decimal\n");
                    input.next();
                    continue;
                }
                x = input.nextFloat();
                if(x <= 0){
                    System.out.println("\nError: El Porcentaje Debe Ser Mayor a 0\n");
                    continue;
                }
                else{

                    nuevoSalario = calcularIncremento(salario, x);
                    System.out.println("------------------------------------");
                    System.out.println("Salario Actual: " + salario);
                    System.out.println("Porcentaje De Aumento: " + x + "%");
                    System.out.println("Nuevo Salario: " + nuevoSalario);
                    System.out.println("------------------------------------\n");
                    break;
                }
            }

        }while(salario <= 0 || !input.hasNextFloat());

        System.out.println("Gracias Por Usar El Programa");

    }
}
