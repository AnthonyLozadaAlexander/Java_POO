package FuncionesEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static boolean esSegura(String password){
        if(password.length() > 8){
            boolean mayuscula = false;
            boolean numero = false;
            char c;

            // bucle recorrera los caracteres de la contraseña para verificar si tiene al menos una mayuscula y un numero
            for(int i = 0; i < password.length(); i++)
            {
                c = password.charAt(i);
                if(Character.isUpperCase(c)){
                    mayuscula = true;
                }
                if(Character.isDigit(c)){
                    numero = true;
                }
            }

            if(numero == true && mayuscula == true){
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("   Ingrese una contraseña");
            System.out.print("-> ");
            if(!input.hasNextLine()){
                String error = input.nextLine();
                System.out.println("\nError: " + error + " no es una contraseña valida. Intentelo Denuevo\n");
                continue;
            }

            password = input.nextLine();

            if (esSegura(password)) {
                System.out.println("---------------------------------");
                System.out.println("\nLa contraseña es segura\n");
                System.out.println("---------------------------------");
            } else {
                System.out.println("---------------------------------");
                System.out.println("\nLa contraseña no es segura\n");
                System.out.println("---------------------------------");
            }
        }while(!esSegura(password));
    }
}
