import javax.swing.*;

public class Calificaciones {
    public static void main(String[] args) {
        //Declaración de variables
        double calif = 0.0;
        String salida = "";

        //Entrada de datos
        calif = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu calificaión: "));

        //Procesamiento de la calificaion9
            if (calif >= 7.0 && calif <= 10.0) {
                System.out.println("Estas aprobado :)");
            }
            System.out.println("Estas reprobado :(");
        }

}
