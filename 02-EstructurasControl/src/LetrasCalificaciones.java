import javax.swing.*;

public class LetrasCalificaciones {
    public static void main(String[] args) {
        //Declaración de variables
        double calif=0.0;
        char letra=' ';
        String salida="";

        //Entrada de datos
        calif=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu calificaión: "));

        //Procesp
        if (calif>=0.0 && calif<=10.0) {
            if (calif >= 9.0) {
                letra = 'A';
            } else if (calif >= 8.0) {
                letra = 'B';
            } else if (calif >= 7.0) {
                letra = 'C';
            } else if (calif >= 6.0) {
                letra = 'D';
            } else
                letra = 'F';
                salida = "Tu calificación es: " + letra;
            }else{
                salida = "Ingresa una calificación válida";
            }
            JOptionPane.showMessageDialog(null, salida);
        }
    }

