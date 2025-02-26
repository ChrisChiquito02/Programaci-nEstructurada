import javax.swing.*;

public class CalifFor {
    public static void main(String[] args) {
        //declaracion de variables
        double numcal=0.0;
        double prom=0.0;
        double calif=0.0;
        double suma=0.0;
        //entrada de datos
        numcal=Double.parseDouble(JOptionPane.showInputDialog
                ("Ingresa el total de calificaciones: "));

        for (int i=1; i<=numcal; i++) {
            calif = Integer.parseInt(JOptionPane.showInputDialog
                    (null,"Ingresa la calificación número " + i + ": "));
            suma += calif;
        }
        prom=suma/numcal;
        JOptionPane.showMessageDialog
                (null,"La suma de las calificaciones es "
                        + suma + " y tu promedio es de: " + prom);
    }
}
