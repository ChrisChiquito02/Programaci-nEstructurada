import javax.swing.*;

/**
 * Realizar un programa que calcule e imprima el área de un triangulo
 */
public class AreaTriangulo {
    public static void main(String[] args) {
        //Declaracion de variables
        double base = 0.0;
        double altura = 0.0;
        double area = 0.0;
        String salida = "";

        //Solicitar valores de las medidas
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura: "));

        //Calculo del area del triangulo
        area=(base*altura)/2;

        //Salida del calculo
        salida="El área de tu triángulo es de: " + String.format("%.2f",area);
        JOptionPane.showMessageDialog(null, salida);
    }
}
