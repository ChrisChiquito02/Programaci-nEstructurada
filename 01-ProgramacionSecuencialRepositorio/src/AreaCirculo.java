import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        //Declaración de variables
        double pi=3.1416;
        double rad=0.0;
        double area=0.0;
        String res="";

        rad = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio: "));

        area=pi*Math.pow(rad,2);

        res = "El área del circulo con radio " + rad + " es " + area ;

        JOptionPane.showMessageDialog(null, res);
    }
}
