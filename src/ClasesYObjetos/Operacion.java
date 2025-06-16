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
        }
    }

}
