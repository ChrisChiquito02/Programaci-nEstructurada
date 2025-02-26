import javax.swing.*;

public class CalifWhile {
    public static void main(String[] args) {
        //Declaración de variables
        double suma= 0.0;
        double numcal = 0.0;
        double calif = 0.0;
        int i=0;

        //Entrada de datos
        numcal=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el número de calificaciones: "));

        //Proceso del ciclo
        while (i<=numcal){
            calif=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificación número " + i + " : "));
            suma+=calif;
        }
        JOptionPane.showMessageDialog(null,"La suma de las calificaciones es: " + suma);
    }
}
