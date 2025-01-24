import javax.swing.*;

public class ConversionLibras2 {
    public static void main(String[] args) {

        //Declaracion de constante
        final double FACTOR_CONVERSION = 0.454;
        //Declaración de varuables de tres número dobles a convertir

        double numero1 = 10.0;
        double numero2 = 50.0;
        double numero3 = 100.0;
        double c1 = 0.0;
        double c2 = 0.0;
        double c3 = 0.0;
        String salida = "";

        //Solicitar los tres números a calcular

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1: "));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2: "));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 3: "));

        //Salida o resultados de las operaciones
        salida =  numero1 + " kg" + " en libras es: " + String.format("%.3f",numero1 / FACTOR_CONVERSION) +
                "\n" + numero2 + " kg" + " en libras es: " + String.format("%.3f",numero2 / FACTOR_CONVERSION) +
                "\n" + numero3 + " kg" + " en libras es: " + String.format("%.3f",numero3 / FACTOR_CONVERSION);

        JOptionPane.showMessageDialog(null, salida);
    }
}
