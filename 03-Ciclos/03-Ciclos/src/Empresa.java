import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //declaración de variables
        int numTrabajadores=0;
        int i=0;
        int numHorasTrabajadas=0;
        int numHorasExtras=0;
        double salarioTotal=0.0;
        String salida="";

        numTrabajadores=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de trabajadores: "));

        salida="Reporte de Salarios Semanales\n" +
                "Empleado:       " + "Horas Trabajadas:         "         +
                "Horas Extras:          " + "Salario Total:         \n";
        i=1;
        while (i<=numTrabajadores){
            numHorasExtras=Integer.parseInt(JOptionPane.showInputDialog("Número de horas trabajadas: "));

            numHorasExtras=0;

            if (numHorasTrabajadas<=40){
                salarioTotal=numHorasTrabajadas*20;
                salida+="Empleado: " + i + "        " + numHorasTrabajadas +
                "       " + numHorasExtras + "  " + salarioTotal +"\n";
            }else{
                numHorasExtras=numHorasTrabajadas-40;
                salarioTotal=40*20+ numHorasExtras*25;
                salida+="Empleado: " + i + "        " + numHorasTrabajadas +
                        "       " + numHorasExtras + "  " + salarioTotal + "\n";
            }
            i++;
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
