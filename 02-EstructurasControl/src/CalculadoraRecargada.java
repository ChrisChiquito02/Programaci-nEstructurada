import javax.swing.*;

public class CalculadoraRecargada {
    public static void main(String[] args) {
        //Declaracion de variables
        String menu="";
        String opcion="", resultado="";
        double numero1=0.0, numero2=0.0;

        menu = "MENU PRINCIPAL\n" +
                "a)Sumar\nb)Restar\n" +
                "c)Multiplicar\n" +
                "d)Dividir\n" +
                "e)Módulo\n" +
                "Elegir una opción: ";

        opcion= JOptionPane.showInputDialog(menu);

        numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número 1: "));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número 2: "));

        opcion = opcion.toUpperCase();//Convierte una letra en mayúscula

        if ( numero2>0.0){
            switch (opcion){
                case "a":
                case "A":
                    //suma
                    resultado = "La suma es: " + (numero1 + numero2);
                    break;
                case "b":
                case "B":
                    //resta
                    resultado = "La resta es: " + (numero1 - numero2);
                    break;
                case "c":
                case "C":
                    //multiplicación
                    resultado = "La multiplicación es: " + (numero1 * numero2);
                    break;
                case "d":
                case "D":
                    //división
                    resultado = "La división es: " + (numero1 / numero2);
                    break;
                case "e":
                case "E":
                    //módulo
                    resultado = "El módulo es: " + (numero1 % numero2);
                    break;
                default:
                    resultado = "Caso no válido";
            }
        }else{
            JOptionPane.showMessageDialog
                    (null,"El número 2 no puede ser 0 o negativo");
        }

    }
}
