import javax.swing.*;

/**
 * Realizar un programa que calcule e imprima el promedio de cuatro calificaciones.
 */
public class PromedioCalificaciones {
    public static void main(String[] args) {

        //Declarar variables
        double cal1=0.0;
        double cal2=0.0;
        double cal3=0.0;
        double cal4=0.0;
        double prom=0.0;

        //Entrada de las calificaiones
        cal1=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa " +
                "tu primera calificaion: "));
        cal2=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa " +
                "tu segunda calificaion: "));
        cal3=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa " +
                "tu tercera calificaion: "));
        cal4=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa " +
                "tu cuarta calificaion: "));

        //Calculo del promedio
        prom=(cal1+cal3+cal3+cal4)/4;

        //Salida del programa
        JOptionPane.showMessageDialog(null, "Tu promedio es de: " + prom);
    }
}
