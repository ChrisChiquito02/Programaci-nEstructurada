import javax.swing.*;

/**
 * Hacer un programa que lea un número en pies y calcule e imprima su equivalente en yardas,
 * pulgadas, centímetros y metros, de acuerdo con las siguientes equivalencias: 1 pie = 12
 * pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm, 1 metro = 100 cm
 */
public class Conversiones {
    public static void main(String[] args) {
    //Declaracio de variables
        double numPies=0.0;
        double yardas=0.0;
        double pulgadas=0.0;
        double centimetros=0.0;
        double metros=0.0;
        String salida="";

        //Entrada de datos
        numPies=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el numero de pies: "));

        //Proceso del programa
        yardas=numPies/3.0;
        pulgadas=numPies*12.0;
        centimetros=numPies*2.54;
        metros=centimetros/100;

        //Salida del programa
        salida="Los resultados de tus conversiones de " + numPies +" pies son : " +
                "\nYardas: " + yardas +
                "\nPulgadas: " + pulgadas+
                "\nCentímetros: " + centimetros +
                "\nMetros: " + metros;

        JOptionPane.showMessageDialog(null, salida);
    }
}
