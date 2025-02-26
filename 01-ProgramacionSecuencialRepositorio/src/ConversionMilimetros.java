import javax.swing.*;

/**
 * Escribir un programa que convierte los 2, 5 y 10 pulgadas a milímetros (1 pulgada = 25,4 mm).
 */
public class ConversionMilimetros {
    public static void main(String[] args) {
        //Declaración de variables
        double a=2.0, b=5.0, c=10.0, in=25.4;
        double mil1=0.0, mil2=0.0, mil3=0.0;

        //Conversion de medidas
        mil1=a*in;
        mil2=b*in;
        mil3=c*in;

        //Salida del programa
        JOptionPane.showMessageDialog(null,"2 pulagas son igual a " +mil1+ " milimetros"+
                "\n5 pulgadas son igual a " + mil2 + " milimetros" +
                "\n10 pulgadas son igual a " +mil3 + " milimetros");
    }
}
