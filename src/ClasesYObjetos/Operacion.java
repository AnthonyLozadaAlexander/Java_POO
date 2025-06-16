package ClasesYObjetos;

import javax.swing.*;

public class Operacion {
    // Atributos
    int num1,
        num2,
        suma,
        resta,
        multiplicacion,
        division;

    //Metodos
    //Metodo para pedirle al usuario que ingrese dos numeros
    public void leerNumeros(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        if(num1 < 0){
            JOptionPane.showMessageDialog(null, "El primer numero ingresado debe ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            JOptionPane.showMessageDialog(null, "El primer numero ingresado es: " + num1 , "Informacion", JOptionPane.INFORMATION_MESSAGE);
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
            if(num2 < 0){
                JOptionPane.showMessageDialog(null, "El primer numero ingresado debe ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }else {
                JOptionPane.showMessageDialog(null, "El primer numero ingresado es: " + num2, "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    //Metodo para sumar los dos numeros
    public void sumar(){
        suma = num1 + num2;
    }




}
