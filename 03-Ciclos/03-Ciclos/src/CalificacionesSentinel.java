import javax.swing.*;

public class CalificacionesSentinel {
    public static void main(String[] args) {
        final int SENTINEL=-1;
        double calif=0.0;
        int numAprobados=0;
        int numReprobados=0;

        JOptionPane.showMessageDialog(null, "Este programa cuenta el número de" +
                " calificaciones aprobatorias y reprobatorias." +
                "\nPara terminar introduce una calificaión con -1");

        int x=1;
        while (calif!=SENTINEL){
            calif = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificación " + x +": "));

            if (calif!=SENTINEL){
                if (calif>=7.0){
                    numAprobados++;
                }else{
                    numReprobados++;
                }
                x++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "El número de aprobados es: " + numAprobados +
                        "\nEl número de reprobados es: " +numReprobados);

    }
}
