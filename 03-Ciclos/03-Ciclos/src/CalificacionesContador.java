import javax.swing.*;

public class CalificacionesContador {
    public static void main(String[] args) {
        //declaracion de variables
        int numAprobados=0;
        int numReprobados=0;
        int numCalif=0;
        double calif=0.0;

        numCalif=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de calificaiones a evaluar: "));

        for (int i=1; i<=numCalif; i++) {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificaciín número " + i + ": "));

            if (calif >= 7.0) {
                //Contador de numero de Aprobados
                numAprobados++;
            } else {
                numReprobados++;
            }
        }
        //Cierra ciclo For
            JOptionPane.showMessageDialog(null,
                    "El número de aprobados es: " + numAprobados +
                    "\nEl número de reprobados es: " +numReprobados);




        int i=1;
        numReprobados=0;
        numAprobados=0;
        while (i<=numCalif){
            calif = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificaciín número " + i + ": "));
            if (calif>=7){
                numAprobados++;
            }else{
                numReprobados++;
            }
            i++;
            }



        numReprobados=0;
        numAprobados=0;
        do {
            calif = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificaciín número " + i + ": "));
            if (calif >= 7.0) {
                numAprobados++;
            }else{
                numReprobados++;
            }
            i++;
        }while (i<=numCalif);
        JOptionPane.showMessageDialog(null,
                "El número de aprobados es: " + numAprobados +
                        "\nEl número de reprobados es: " +numReprobados);
        }
    }

