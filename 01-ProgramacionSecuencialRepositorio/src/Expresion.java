/**
*Calcular el resultado de la expresión n = x+y/y-1
* para los valores de x y y cualesquiera
*
*/

import javax.swing.*;

public class Expresion {
    public static void main(String[] args) {

        //Declaración de variables
        double x = 0.0;
        double y = 0.0;
        double resultado = 0.0;
        String salida = "";

        //Solicitar datos de las incógnitas
        x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de y: "));

        //Calcular el resultado de la expresión
        resultado = (x+y)/(y-1);

        //Salida del progreama
        salida= "El resultado de la expresión es: " + String.format("%.3f",resultado);
        JOptionPane.showMessageDialog(null,salida);
    }
}
