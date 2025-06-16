package PerimetroCirculo;

public class Main {
    public static void main(String[] args) {

        Circulo datosCirculo = new Circulo();
        datosCirculo.setRadio(3);
        datosCirculo.calcularPerimetro(); // Usando el valor de pi2 a 3.14
        System.out.println("-------------------------------------");
        // datosCirculo.calcularPerimetro();  Usando el valor de pi2 = 3.14
    }
}
