import javax.swing.*;

public class CalculadoraSencilla {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        int opcion=0;
        double resultado=0.0, numero1=0.0, numero2=0.0;

        menu = "MENU PRINCIPAL\n" +
                "1)Sumar\n2)Restar\n" +
                "3)Multiplicar\n" +
                "4)Dividir\n" +
                "5)Módulo\n" +
                "Elegir una opción: ";

        opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
        numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número 1: "));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número 2: "));

        if ( numero2>0.0){
            switch (opcion){
                case 1:
                    //suma
                    resultado = numero1 + numero2;
                    JOptionPane.showMessageDialog
                            (null, "La suma es: " + resultado);
                    break;
                case 2:
                    //resta
                    resultado = numero1 - numero2;
                    JOptionPane.showMessageDialog
                            (null, "La resta es: " + resultado);
                    break;
                case 3:
                    //multiplicación
                    resultado = numero1 * numero2;
                    JOptionPane.showMessageDialog
                            (null, "La multiplicacion es: " + resultado);
                    break;
                case 4:
                    //división
                    resultado = numero1 / numero2;
                    JOptionPane.showMessageDialog
                            (null, "La división es: " + resultado);
                    break;
                case 5:
                    //módulo
                    resultado = numero1 % numero2;
                    JOptionPane.showMessageDialog
                            (null, "El módulo es: " + resultado);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Caso no válido");
            }
        }else{
            JOptionPane.showMessageDialog(null,"El número 2 no puede ser 0 o negativo");
        }
    }
}
